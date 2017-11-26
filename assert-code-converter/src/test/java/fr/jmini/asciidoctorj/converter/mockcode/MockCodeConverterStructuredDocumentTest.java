package fr.jmini.asciidoctorj.converter.mockcode;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.asciidoctor.ast.StructuredDocument;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class MockCodeConverterStructuredDocumentTest {

    @Test
    public void testStructuredDocument() throws Exception {
        StructuredDocument mockStructuredDocument = createMock();

        MockCodeConverter converter = new MockCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createStructuredDocumentCode(sb, mockStructuredDocument);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public StructuredDocument createMock() {
        StructuredDocument mockStructuredDocument1 = mock(StructuredDocument.class);
        when(mockStructuredDocument1.getParts()).thenReturn(Collections.emptyList());
        when(mockStructuredDocument1.getHeader()).thenReturn(null);
        return mockStructuredDocument1;
    }
    // end::generated-code[]
}
