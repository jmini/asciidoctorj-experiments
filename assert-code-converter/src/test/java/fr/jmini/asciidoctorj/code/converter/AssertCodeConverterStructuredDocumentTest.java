package fr.jmini.asciidoctorj.code.converter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.asciidoctor.ast.StructuredDocument;
import org.junit.Test;

public class AssertCodeConverterStructuredDocumentTest {

    @Test
    public void testStructuredDocument() throws Exception {
        StructuredDocument mockStructuredDocument = mock(StructuredDocument.class);
        when(mockStructuredDocument.getParts()).thenReturn(Collections.emptyList());
        when(mockStructuredDocument.getHeader()).thenReturn(null);

        // TODO replace System.out.println with a check:
        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createStructuredDocumentCode(sb, mockStructuredDocument);
        System.out.println(sb);

        checkAst(mockStructuredDocument);
    }

    // tag::generated-code[]
    public void checkAst(StructuredDocument astStructuredDocument) {
        StructuredDocument d1 = astStructuredDocument;
        assertThat(d1.getParts()).isEmpty();
        assertThat(d1.getHeader()).isNull();
    }
    // end::generated-code[]
}
