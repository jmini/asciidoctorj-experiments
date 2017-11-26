package fr.jmini.asciidoctorj.converter.mockcode;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.DocumentHeader;
import org.junit.Test;

import com.google.common.collect.ImmutableMap;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class MockCodeConverterDocumentHeaderTest {

    @Test
    public void testDocumentHeader() throws Exception {
        DocumentHeader mockDocumentHeader = createMock();

        MockCodeConverter converter = new MockCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createDocumentHeaderCode(sb, mockDocumentHeader);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public DocumentHeader createMock() {
        DocumentHeader mockDocumentHeader1 = mock(DocumentHeader.class);
        when(mockDocumentHeader1.getAuthors()).thenReturn(null);
        when(mockDocumentHeader1.getDocumentTitle()).thenReturn(null);
        when(mockDocumentHeader1.getPageTitle()).thenReturn(null);
        when(mockDocumentHeader1.getAuthor()).thenReturn(null);
        when(mockDocumentHeader1.getRevisionInfo()).thenReturn(null);
        when(mockDocumentHeader1.getPageTitle()).thenReturn(null);
        ImmutableMap<String, Object> map1 = ImmutableMap.<String, Object>builder()
                .put("one", 1)
                .put("two", 2)
                .build();
        when(mockDocumentHeader1.getAttributes()).thenReturn(map1);
        return mockDocumentHeader1;
    }
    // end::generated-code[]
}
