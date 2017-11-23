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
        when(mockCursor.getParent()).thenReturn(null);

        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createCursorCode(sb, mockCursor);
        System.out.println(sb);

        checkAst(mockCursor);
    }

    // tag::generated-code[]
    public void checkAst(Cursor astCursor) {
        Cursor a1 = astCursor;
        assertThat(a1).isEqualTo("TODO");
    }
    // end::generated-code[]
}
