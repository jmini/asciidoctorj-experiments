package fr.jmini.asciidoctorj.converter.assertcode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.Cursor;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.assertcode.AssertCodeConverter;
import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class AssertCodeConverterCursorTest {

    @Test
    public void testCursor() throws Exception {
        Cursor mockCursor = mock(Cursor.class);
        when(mockCursor.getLineNumber()).thenReturn(234);
        when(mockCursor.getPath()).thenReturn("path");
        when(mockCursor.getDir()).thenReturn("dir");
        when(mockCursor.getFile()).thenReturn("file.txt");

        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createCursorCode(sb, mockCursor);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());

        checkAst(mockCursor);
    }

    // tag::generated-code[]
    public void checkAst(Cursor astCursor) {
        Cursor cursor1 = astCursor;
        assertThat(cursor1.getLineNumber()).isEqualTo(234);
        assertThat(cursor1.getPath()).isEqualTo("path");
        assertThat(cursor1.getDir()).isEqualTo("dir");
        assertThat(cursor1.getFile()).isEqualTo("file.txt");
    }
    // end::generated-code[]
}
