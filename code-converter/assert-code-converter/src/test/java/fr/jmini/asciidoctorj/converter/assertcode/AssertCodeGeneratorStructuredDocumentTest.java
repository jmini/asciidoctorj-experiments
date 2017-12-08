package fr.jmini.asciidoctorj.converter.assertcode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.asciidoctor.ast.StructuredDocument;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class AssertCodeGeneratorStructuredDocumentTest {

    @Test
    public void testStructuredDocument() throws Exception {
        StructuredDocument mockStructuredDocument = mock(StructuredDocument.class);
        when(mockStructuredDocument.getParts()).thenReturn(Collections.emptyList());
        when(mockStructuredDocument.getHeader()).thenReturn(null);

        AssertCodeGenerator generator = new AssertCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createStructuredDocumentCode(sb, mockStructuredDocument);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());

        checkAst(mockStructuredDocument);
    }

    // tag::generated-code[]
    public void checkAst(StructuredDocument astStructuredDocument) {
        StructuredDocument structuredDocument1 = astStructuredDocument;
        assertThat(structuredDocument1.getParts()).isNullOrEmpty();
        assertThat(structuredDocument1.getHeader()).isNull();
    }
    // end::generated-code[]
}
