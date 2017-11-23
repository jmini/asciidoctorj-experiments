package fr.jmini.eadoc.converter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

import org.asciidoctor.OptionsBuilder;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

public class EadocConverterMain {

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
      asciidoctor.javaConverterRegistry().register(EadocCodeConverter.class);
      OptionsBuilder options = OptionsBuilder.options().backend("eadoc-code");
      String out = asciidoctor.convert(content, options, String.class);
      //end::adoc-convert[]

      File outputFile = new File(folder, Files.getNameWithoutExtension(adocFile.getName()) + ".java");
      Files.write(out, outputFile, Charsets.UTF_8);
      System.out.println("Wrote JSON file : " + outputFile.getAbsolutePath());
    }
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
