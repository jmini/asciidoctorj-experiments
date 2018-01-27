package fr.jmini.asciidoctorj.converter.html;

import java.util.Map;

import org.asciidoctor.ast.Document;

import fr.jmini.asciidoctorj.converter.html.testing.AbstractSidebarTesting;

/**
 * Test for {@link fr.jmini.asciidoctorj.testcases.SidebarTestCase} (mocked AST, java html backend) .
 */
public class SidebarTest extends AbstractSidebarTesting {

    @Override
    protected Document createAstDocument(String asciiDoc, Map<String, Object> options) {
        Document mock = testCase.createMock();
        return mock;
    }

    @Override
    protected String convertToHtml(Document astDocument) {
        return HtmlConverterTestUtility.convertToHtml(astDocument);
    }
}
