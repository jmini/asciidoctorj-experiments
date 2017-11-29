package fr.jmini.asciidoctorj.converter.assertcode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.DocumentHeader;
import org.junit.Test;

import com.google.common.collect.ImmutableMap;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class AssertCodeGeneratorDocumentHeaderTest {

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

        AssertCodeGenerator generator = new AssertCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createDocumentHeaderCode(sb, mockDocumentHeader);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());

        checkAst(mockDocumentHeader);
    }

    // tag::generated-code[]
    public void checkAst(DocumentHeader astDocumentHeader) {
        DocumentHeader documentHeader1 = astDocumentHeader;
        assertThat(documentHeader1.getAuthors()).isNull();
        assertThat(documentHeader1.getDocumentTitle()).isNull();
        assertThat(documentHeader1.getPageTitle()).isNull();
        assertThat(documentHeader1.getAuthor()).isNull();
        assertThat(documentHeader1.getRevisionInfo()).isNull();
        assertThat(documentHeader1.getPageTitle()).isNull();
        assertThat(documentHeader1.getAttributes()).containsEntry("one", 1)
                .containsEntry("two", 2)
                .containsEntry("three", 3);
    }
    // end::generated-code[]
}
