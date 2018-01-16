package fr.jmini.asciidoctorj.converter.html;

import java.util.Map;

import org.asciidoctor.ast.Document;

import fr.jmini.asciidoctorj.converter.html.testing.AbstractQuoteWithIdAndRoleTesting;

/**
 * Test for {@link fr.jmini.asciidoctorj.testcases.QuoteWithIdAndRoleTestCase} (mocked AST, java html backend) .
 */
public class QuoteWithIdAndRoleTest extends AbstractQuoteWithIdAndRoleTesting {

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
