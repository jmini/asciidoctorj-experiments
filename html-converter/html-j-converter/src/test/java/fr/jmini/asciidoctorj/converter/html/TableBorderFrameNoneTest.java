package fr.jmini.asciidoctorj.converter.html;

import java.util.Map;

import org.asciidoctor.ast.Document;

import fr.jmini.asciidoctorj.converter.html.testing.AbstractTableBorderFrameNoneTesting;

/**
 * Test for {@link fr.jmini.asciidoctorj.testcases.TableBorderFrameNoneTestCase} (mocked AST, java html backend) .
 */
public class TableBorderFrameNoneTest extends AbstractTableBorderFrameNoneTesting {

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
