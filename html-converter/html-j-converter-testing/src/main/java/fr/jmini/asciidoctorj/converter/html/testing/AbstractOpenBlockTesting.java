package fr.jmini.asciidoctorj.converter.html.testing;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map;

import org.asciidoctor.ast.Document;
import org.junit.Test;

import fr.jmini.asciidoctorj.testcases.AdocTestCase;
import fr.jmini.asciidoctorj.testcases.OpenBlockTestCase;

public abstract class AbstractOpenBlockTesting {

    protected AdocTestCase testCase = new OpenBlockTestCase();

    @Test
    public void test() throws Exception {
        Document astDocument = createAstDocument(testCase.getAdocInput(), testCase.getInputOptions());
        testCase.checkAst(astDocument);
        String html = convertToHtml(astDocument);
        assertThat("<htmlRoot>\n" + html + "\n</htmlRoot>")
                .as(testCase.getClass()
                        .getSimpleName())
                .isXmlEqualTo("<htmlRoot>\n" + testCase.getHtmlOutput() + "\n</htmlRoot>");
    }

    protected abstract Document createAstDocument(String asciiDoc, Map<String, Object> options);

    protected abstract String convertToHtml(Document astDocument);

}
