package fr.jmini.asciidoctorj.converter.html.integration;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map;

import org.asciidoctor.Asciidoctor;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.impl.DocumentImpl;

import fr.jmini.asciidoctorj.converter.html.HtmlConverter;
import fr.jmini.asciidoctorj.converter.html.testing.AbstractAdmonitionBlockNoteTesting;
import fr.jmini.asciidoctorj.testcases.HtmlUtility;

/**
 * Integration test for {@link fr.jmini.asciidoctorj.testcases.AdmonitionBlockNoteTestCase} (ruby engine with the java html backend) .
 */
public class AdmonitionBlockNoteIntegrationTest extends AbstractAdmonitionBlockNoteTesting {

    @Override
    protected Document createAstDocument(String asciiDoc, Map<String, Object> options) {
        Asciidoctor asciidoctor = org.asciidoctor.Asciidoctor.Factory.create();
        asciidoctor.javaConverterRegistry()
                .register(HtmlConverter.class);
        options.put(org.asciidoctor.Options.BACKEND, HtmlConverter.ID);
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
