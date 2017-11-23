package fr.jmini.asciidoctorj.code.converter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.asciidoctor.ast.Document;
import org.junit.Test;

public class AssertCodeConverterDocumentTest {

    @Test
    public void testDocument() throws Exception {
        Document mockDocument = mock(Document.class);
        when(mockDocument.getStructuredDoctitle()).thenReturn(null);
        when(mockDocument.getDoctitle()).thenReturn("this is a doc title");
        when(mockDocument.getOptions()).thenReturn(Collections.singletonMap("one", true));

        // TODO replace System.out.println with a check:
        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createDocumentCode(sb, mockDocument);
        System.out.println(sb);

        checkAst(mockDocument);
    }

    // tag::generated-code[]
    public void checkAst(Document astDocument) {
        Document d1 = astDocument;
        assertThat(d1.getId()).isNull();
        assertThat(d1.getNodeName()).isNull();
        assertThat(d1.getParent()).isNull();
        assertThat(d1.getContext()).isNull();
        assertThat(d1.getDocument()).isNull();
        assertThat(d1.isInline()).isFalse();
        assertThat(d1.isBlock()).isFalse();
        assertThat(d1.getAttributes()).isEmpty();
        assertThat(d1.getRoles()).isEmpty();
        assertThat(d1.isReftext()).isFalse();
        assertThat(d1.getTitle()).isNull();
        assertThat(d1.getStyle()).isNull();
        assertThat(d1.getLevel()).isEqualTo(0);
        assertThat(d1.getSourceLocation()).isNull();
        assertThat(d1.getSubstitutions()).isEmpty();
        assertThat(d1.getBlocks()).isEmpty();
        assertThat(d1.getStructuredDoctitle()).isNull();
        assertThat(d1.getDoctitle()).isEqualTo("this is a doc title");
        assertThat(d1.getOptions()).containsEntry("one", true);
    }
    // end::generated-code[]
}
