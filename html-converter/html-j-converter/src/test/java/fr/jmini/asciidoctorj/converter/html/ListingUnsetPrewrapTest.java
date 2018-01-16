package fr.jmini.asciidoctorj.converter.html;

import java.util.Map;

import org.asciidoctor.ast.Document;

import fr.jmini.asciidoctorj.converter.html.testing.AbstractListingUnsetPrewrapTesting;

/**
 * Test for {@link fr.jmini.asciidoctorj.testcases.ListingUnsetPrewrapTestCase} (mocked AST, java html backend) .
 */
public class ListingUnsetPrewrapTest extends AbstractListingUnsetPrewrapTesting {

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
