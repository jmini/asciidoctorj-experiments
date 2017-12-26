package fr.jmini.asciidoctorj.converter.html.reference;

import static org.assertj.core.api.Assertions.assertThat;

import org.asciidoctor.Asciidoctor;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.impl.DocumentImpl;

import fr.jmini.asciidoctorj.converter.html.testing.AbstractMultiDivTesting;
import fr.jmini.asciidoctorj.converter.html.testing.HtmlConverterTestingUtility;

public class MultiDivReferenceTest extends AbstractMultiDivTesting {

    @Override
    protected Document createAstDocument(String asciiDoc) {
        Asciidoctor asciidoctor = org.asciidoctor.Asciidoctor.Factory.create();
        return asciidoctor.load(asciiDoc, new java.util.HashMap<String, Object>());
    }

    @Override
    public void checkAst(Document astDocument) {
        assertThat(astDocument).isInstanceOf(DocumentImpl.class);
        super.checkAst(astDocument);
    }

    @Override
    protected String convertToHtml(Document astDocument) {
        String html = astDocument.convert();
        html = HtmlConverterTestingUtility.normalizeHtml(html);
        return html;
    }

}
