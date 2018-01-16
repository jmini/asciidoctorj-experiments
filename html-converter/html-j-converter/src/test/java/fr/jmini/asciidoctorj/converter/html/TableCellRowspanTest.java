package fr.jmini.asciidoctorj.converter.html;

import java.util.Map;

import org.asciidoctor.ast.Document;

import fr.jmini.asciidoctorj.converter.html.testing.AbstractTableCellRowspanTesting;

/**
 * Test for {@link fr.jmini.asciidoctorj.testcases.TableCellRowspanTestCase} (mocked AST, java html backend) .
 */
public class TableCellRowspanTest extends AbstractTableCellRowspanTesting {

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
