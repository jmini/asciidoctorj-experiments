package fr.jmini.asciidoctorj.converter.html.reference;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map;

import org.asciidoctor.Asciidoctor;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.impl.DocumentImpl;

import fr.jmini.asciidoctorj.converter.html.testing.AbstractImageCaptionEmptyTesting;
import fr.jmini.asciidoctorj.testcases.HtmlUtility;

public class ImageCaptionEmptyReferenceTest extends AbstractImageCaptionEmptyTesting {

    @Override
    protected Document createAstDocument(String asciiDoc, Map<String, Object> options) {
        Asciidoctor asciidoctor = org.asciidoctor.Asciidoctor.Factory.create();
        Document document = asciidoctor.load(asciiDoc, options);
        assertThat(document).isInstanceOf(DocumentImpl.class);
        return document;
    }

    @Override
    protected String convertToHtml(Document astDocument) {
        String html = astDocument.convert();
        return HtmlUtility.normalizeHtml(html);
    }

}
