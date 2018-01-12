package fr.jmini.asciidoctorj.testcases;

import java.util.Map;

import org.asciidoctor.ast.Document;

public interface AdocTestCase {

    String getAdocInput();

    Map<String, Object> getInputOptions();

    String getHtmlOutput();

    void checkAst(Document astDocument);

    Document createMock();
}
