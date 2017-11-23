package fr.jmini.asciidoctorj.code.converter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.DocumentHeader;
import org.junit.Test;

import com.google.common.collect.ImmutableMap;

public class AssertCodeConverterDocumentHeaderTest {

    @Test
    public void testDocumentHeader() throws Exception {
        DocumentHeader mockDocumentHeader = mock(DocumentHeader.class);
        when(mockDocumentHeader.getAuthors()).thenReturn(null);
        when(mockDocumentHeader.getDocumentTitle()).thenReturn(null);
        when(mockDocumentHeader.getPageTitle()).thenReturn(null);
        when(mockDocumentHeader.getAuthor()).thenReturn(null);
        when(mockDocumentHeader.getRevisionInfo()).thenReturn(null);
        ImmutableMap<String, Object> attributes = ImmutableMap.<String, Object>builder()
                .put("one", 1)
                .put("two", 2)
                .put("three", 3)
                .build();
        when(mockDocumentHeader.getAttributes()).thenReturn(attributes);

        // TODO replace System.out.println with a check:
        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createDocumentHeaderCode(sb, mockDocumentHeader);
        System.out.println(sb);

        checkAst(mockDocumentHeader);
    }

    // tag::generated-code[]
    public void checkAst(DocumentHeader astDocumentHeader) {
        DocumentHeader h1 = astDocumentHeader;
        assertThat(h1.getAuthors()).isNull();
        assertThat(h1.getDocumentTitle()).isNull();
        assertThat(h1.getPageTitle()).isNull();
        assertThat(h1.getAuthor()).isNull();
        assertThat(h1.getRevisionInfo()).isNull();
        assertThat(h1.getPageTitle()).isNull();
        assertThat(h1.getAttributes()).containsEntry("one", 1)
                .containsEntry("two", 2)
                .containsEntry("three", 3);
    }
    // end::generated-code[]
}
