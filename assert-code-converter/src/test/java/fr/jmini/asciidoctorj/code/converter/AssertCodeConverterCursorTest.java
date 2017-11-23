package fr.jmini.asciidoctorj.code.converter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.Cursor;
import org.junit.Test;

public class AssertCodeConverterCursorTest {

    @Test
    public void testCursor() throws Exception {
        Cursor mockCursor = mock(Cursor.class);
        when(mockCursor.getLineNumber()).thenReturn(234);
        when(mockCursor.getPath()).thenReturn("path");
        when(mockCursor.getDir()).thenReturn("dir");
        when(mockCursor.getFile()).thenReturn("file.txt");

        // TODO replace System.out.println with a check:
        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createCursorCode(sb, mockCursor);
        System.out.println(sb);

        checkAst(mockCursor);
    }

    // tag::generated-code[]
    public void checkAst(Cursor astCursor) {
        Cursor c1 = astCursor;
        assertThat(c1.getLineNumber()).isEqualTo(234);
        assertThat(c1.getPath()).isEqualTo("path");
        assertThat(c1.getDir()).isEqualTo("dir");
        assertThat(c1.getFile()).isEqualTo("file.txt");
    }
    // end::generated-code[]
}
