package fr.jmini.asciidoctorj.converter.mockcode;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.Cursor;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class MockCodeGeneratorCursorTest {

    @Test
    public void testCursor() throws Exception {
        Cursor mockCursor = createMock();

        MockCodeGenerator generator = new MockCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createCursorCode(sb, mockCursor);
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
