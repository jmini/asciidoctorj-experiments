package fr.jmini.asciidoctorj.converter.html;

import java.util.Map;

import org.asciidoctor.ast.Document;

import fr.jmini.asciidoctorj.converter.html.testing.AbstractImageCaptionCustomCounterTesting;

/**
 * Test for {@link fr.jmini.asciidoctorj.testcases.ImageCaptionCustomCounterTestCase} (mocked AST, java html backend) .
 */
public class ImageCaptionCustomCounterTest extends AbstractImageCaptionCustomCounterTesting {

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
