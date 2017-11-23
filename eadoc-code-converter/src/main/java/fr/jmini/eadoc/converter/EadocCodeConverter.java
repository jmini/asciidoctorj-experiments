package fr.jmini.eadoc.converter;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Map;

import org.asciidoctor.ast.ContentNode;
import org.asciidoctor.converter.AbstractConverter;
import org.asciidoctor.converter.ConverterFor;

import fr.jmini.eadoc.EadocCodeCreator;

@ConverterFor("eadoc-code")
public class EadocCodeConverter extends AbstractConverter<String> {

  private String LINE_SEPARATOR = "\n";

  public EadocCodeConverter(String backend, Map<String, Object> opts) {
    super(backend, opts);
  }

  @Override
  public String convert(ContentNode node, String transform, Map<Object, Object> o) {
    StringBuilder sb = new StringBuilder();
    EadocCodeCreator.createContentNodeCode(sb, node);
    return sb.toString();
  }

  @Override
  public void write(String content, OutputStream out) throws IOException {
    if (content != null) {
      try (PrintWriter p = new PrintWriter(out)) {
        p.println("content");
      }
    }
  }

}
