package fr.jmini.asciidoctorj.code.converter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.DocumentHeader;
import org.junit.Test;

public class AssertCodeConverterDocumentHeaderTest {

    @Test
    public void testDocumentHeader() throws Exception {
        DocumentHeader mockDocumentHeader = mock(DocumentHeader.class);
        when(mockDocumentHeader.getParent()).thenReturn(null);

        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createDocumentHeaderCode(sb, mockDocumentHeader);
        System.out.println(sb);

        checkAst(mockDocumentHeader);
    }

    // tag::generated-code[]
    public void checkAst(DocumentHeader astDocumentHeader) {
        DocumentHeader a1 = astDocumentHeader;
        assertThat(a1).isEqualTo("TODO");
    }
    // end::generated-code[]
}
