package fr.jmini.asciidoctorj.converter.mockcode;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.Cursor;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class MockCodeConverterCursorTest {

    @Test
    public void testCursor() throws Exception {
        Cursor mockCursor = createMock();

        MockCodeConverter converter = new MockCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createCursorCode(sb, mockCursor);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public Cursor createMock() {
        Cursor mockCursor1 = mock(Cursor.class);
        when(mockCursor1.getLineNumber()).thenReturn(234);
        when(mockCursor1.getPath()).thenReturn("path");
        when(mockCursor1.getDir()).thenReturn("dir");
        when(mockCursor1.getFile()).thenReturn("file.txt");
        return mockCursor1;
    }
    // end::generated-code[]
}
