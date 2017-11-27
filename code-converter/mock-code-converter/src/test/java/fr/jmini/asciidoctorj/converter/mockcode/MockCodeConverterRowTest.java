package fr.jmini.asciidoctorj.converter.mockcode;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.asciidoctor.ast.Row;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class MockCodeConverterRowTest {

    @Test
    public void testRow() throws Exception {
        Row mockRow = createMock();

        MockCodeConverter converter = new MockCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createRowCode(sb, mockRow);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public Row createMock() {
        Row mockRow1 = mock(Row.class);
        when(mockRow1.getCells()).thenReturn(Collections.emptyList());
        return mockRow1;
    }
    // end::generated-code[]
}
