package fr.jmini.asciidoctorj.code.converter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.Author;
import org.junit.Test;

public class AssertCodeConverterAuthorTest {

    @Test
    public void testAuthor() throws Exception {
        Author mockAuthor = mock(Author.class);
        when(mockAuthor.getEmail()).thenReturn("doc.writer@asciidoc.org");
        when(mockAuthor.getFullName()).thenReturn("Doc Writer");
        when(mockAuthor.getFirstName()).thenReturn("Doc");
        when(mockAuthor.getLastName()).thenReturn("Writer");
        when(mockAuthor.getMiddleName()).thenReturn(null);
        when(mockAuthor.getInitials()).thenReturn("DW");

        // TODO replace System.out.println with a check:
        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createAuthorCode(sb, mockAuthor);
        System.out.println(sb);

        checkAst(mockAuthor);
    }

    // tag::generated-code[]
    public void checkAst(Author astAuthor) {
        Author a1 = astAuthor;
        assertThat(a1.getEmail()).isEqualTo("doc.writer@asciidoc.org");
        assertThat(a1.getFullName()).isEqualTo("Doc Writer");
        assertThat(a1.getFirstName()).isEqualTo("Doc");
        assertThat(a1.getLastName()).isEqualTo("Writer");
        assertThat(a1.getMiddleName()).isNull();
        assertThat(a1.getInitials()).isEqualTo("DW");
    }
    // end::generated-code[]
}
