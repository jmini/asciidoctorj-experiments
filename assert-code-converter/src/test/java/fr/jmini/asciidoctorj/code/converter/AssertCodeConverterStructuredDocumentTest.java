package fr.jmini.asciidoctorj.code.converter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.StructuredDocument;
import org.junit.Test;

public class AssertCodeConverterStructuredDocumentTest {

    @Test
    public void testStructuredDocument() throws Exception {
        StructuredDocument mockStructuredDocument = mock(StructuredDocument.class);
        when(mockStructuredDocument.getParent()).thenReturn(null);

        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createStructuredDocumentCode(sb, mockStructuredDocument);
        System.out.println(sb);

        checkAst(mockStructuredDocument);
    }

    // tag::generated-code[]
    public void checkAst(StructuredDocument astStructuredDocument) {
        StructuredDocument a1 = astStructuredDocument;
        assertThat(a1).isEqualTo("TODO");
    }
    // end::generated-code[]
}
