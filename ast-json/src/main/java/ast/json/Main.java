package ast.json;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import java.util.Map;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonStructure;
import javax.json.JsonWriter;
import javax.json.JsonWriterFactory;
import javax.json.stream.JsonGenerator;

import org.asciidoctor.OptionsBuilder;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

public class Main {

  public static void main(String[] args) throws IOException {
    convertAllExamples();

//    convertExample(new File("./examples/01"));
//    convertExample(new File("./examples/02"));
//    convertExample(new File("./examples/03"));
//    convertExample(new File("./examples/04"));
//    convertExample(new File("./examples/05"));
//    convertExample(new File("./examples/06"));
  }

  private static void convertAllExamples() throws IOException {
    File root = new File("./examples");
    System.out.println("Processing examples in: " + root.getAbsolutePath());

    File[] folders = root.listFiles(DIRECTORY_FILEFILTER);
    for (File folder : folders) {
      convertExample(folder);
    }
  }

  private static void convertExample(File folder) throws IOException {
    File adocFile = findAdocFile(folder);
    if (adocFile == null) {
      System.out.println("No AsciiDoc File found in folder : " + folder.getAbsolutePath());
    }
    else {
      System.out.println("Reading file : " + adocFile.getAbsolutePath());
      String content = Files.toString(adocFile, Charsets.UTF_8);

      //tag::adoc-convert[]
      org.asciidoctor.Asciidoctor asciidoctor = org.asciidoctor.Asciidoctor.Factory.create();
      asciidoctor.javaConverterRegistry().register(AstJsonConverter.class);
      OptionsBuilder options = OptionsBuilder.options().backend("ast-json");
      JsonObject obj = asciidoctor.convert(content, options, JsonObject.class);
      //end::adoc-convert[]

      File outputFile = new File(folder, Files.getNameWithoutExtension(adocFile.getName()) + ".json");
      Files.write(jsonFormat(obj), outputFile, Charsets.UTF_8);
      System.out.println("Wrote JSON file : " + outputFile.getAbsolutePath());
    }
  }

  public static String jsonFormat(JsonStructure json) {
    StringWriter stringWriter = new StringWriter();
    Map<String, Boolean> config = Collections.singletonMap(JsonGenerator.PRETTY_PRINTING, Boolean.TRUE);
    JsonWriterFactory writerFactory = Json.createWriterFactory(config);
    JsonWriter jsonWriter = writerFactory.createWriter(stringWriter);

    jsonWriter.write(json);
    jsonWriter.close();

    return stringWriter.toString();
  }

  private static File findAdocFile(File folder) {
    File[] files = folder.listFiles(new FilenameFilter() {
      @Override
      public boolean accept(File dir, String name) {
        return name.endsWith("adoc");
      }
    });
    if (files.length == 1) {
      return files[0];
    }
    else {
      return null;
    }
  }

  private static final FileFilter DIRECTORY_FILEFILTER = new FileFilter() {
    @Override
    public boolean accept(File f) {
      return f.isDirectory();
    }
  };
}
