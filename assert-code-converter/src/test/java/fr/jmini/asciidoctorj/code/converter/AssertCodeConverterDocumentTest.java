package fr.jmini.asciidoctorj.code.converter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.Document;
import org.junit.Test;

public class AssertCodeConverterDocumentTest {

    @Test
    public void testDocument() throws Exception {
        Document mockDocument = mock(Document.class);
        when(mockDocument.getParent()).thenReturn(null);

        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createDocumentCode(sb, mockDocument);
        System.out.println(sb);

        checkAst(mockDocument);
    }

    // tag::generated-code[]
    public void checkAst(Document astDocument) {
        Document a1 = astDocument;
        assertThat(a1).isEqualTo("TODO");
    }
    // end::generated-code[]
}
