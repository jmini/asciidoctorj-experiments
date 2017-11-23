package fr.jmini.asciidoctorj.code.converter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.Author;
import org.junit.Test;

public class AssertCodeConverterAuthorTest {

    @Test
    public void testAuthor() throws Exception {
        Author author = mock(Author.class);
        when(author.getEmail()).thenReturn("doc.writer@asciidoc.org");
        when(author.getFullName()).thenReturn("Doc Writer");
        when(author.getFirstName()).thenReturn("Doc");
        when(author.getLastName()).thenReturn("Writer");
        when(author.getMiddleName()).thenReturn(null);
        when(author.getInitials()).thenReturn("DW");

        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createAuthorCode(sb, author);
        System.out.println(sb);

        checkAst(author);
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
