package fr.jmini.asciidoctorj.converter.assertcode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.asciidoctor.ast.Document;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class AssertCodeGeneratorDocumentTest {

    @Test
    public void testDocument() throws Exception {
        Document mockDocument = mock(Document.class);
        when(mockDocument.getStructuredDoctitle()).thenReturn(null);
        when(mockDocument.getDoctitle()).thenReturn("this is a doc title");
        when(mockDocument.getOptions()).thenReturn(Collections.singletonMap("one", true));

        AssertCodeGenerator generator = new AssertCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createDocumentCode(sb, mockDocument);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());

        checkAst(mockDocument);
    }

    // tag::generated-code[]
    public void checkAst(Document astDocument) {
        Document document1 = astDocument;
        assertThat(document1.getId()).isNull();
        assertThat(document1.getNodeName()).isNull();
        assertThat(document1.getContext()).isNull();
        assertThat(document1.getDocument()).isNull();
        assertThat(document1.isInline()).isFalse();
        assertThat(document1.isBlock()).isFalse();
        assertThat(document1.getAttributes()).isNullOrEmpty();
        assertThat(document1.getRoles()).isNullOrEmpty();
        assertThat(document1.isReftext()).isFalse();
        assertThat(document1.getTitle()).isNull();
        assertThat(document1.getStyle()).isNull();
        assertThat(document1.getLevel()).isEqualTo(0);
        assertThat(document1.getContentModel()).isNull();
        assertThat(document1.getSourceLocation()).isNull();
        assertThat(document1.getSubstitutions()).isNullOrEmpty();
        assertThat(document1.getBlocks()).isNullOrEmpty();
        assertThat(document1.getStructuredDoctitle()).isNull();
        assertThat(document1.getDoctitle()).isEqualTo("this is a doc title");
        assertThat(document1.getOptions()).containsEntry("one", true);
    }
    // end::generated-code[]
}
