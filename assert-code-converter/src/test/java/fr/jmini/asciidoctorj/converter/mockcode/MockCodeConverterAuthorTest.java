package fr.jmini.asciidoctorj.converter.mockcode;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.Author;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class MockCodeConverterAuthorTest {

    @Test
    public void testAuthor() throws Exception {
        Author mockAuthor = createMock();

        MockCodeConverter converter = new MockCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createAuthorCode(sb, mockAuthor);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public Author createMock() {
        Author mockAuthor1 = mock(Author.class);
        when(mockAuthor1.getEmail()).thenReturn("doc.writer@asciidoc.org");
        when(mockAuthor1.getFullName()).thenReturn("Doc Writer");
        when(mockAuthor1.getFirstName()).thenReturn("Doc");
        when(mockAuthor1.getLastName()).thenReturn("Writer");
        when(mockAuthor1.getMiddleName()).thenReturn(null);
        when(mockAuthor1.getInitials()).thenReturn("DW");
        return mockAuthor1;
    }
    // end::generated-code[]
}
