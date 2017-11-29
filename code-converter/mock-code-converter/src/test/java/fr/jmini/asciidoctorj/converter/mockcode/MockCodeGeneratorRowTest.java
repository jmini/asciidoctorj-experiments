package fr.jmini.asciidoctorj.converter.mockcode;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.asciidoctor.ast.Row;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class MockCodeGeneratorRowTest {

    @Test
    public void testRow() throws Exception {
        Row mockRow = createMock();

        MockCodeGenerator generator = new MockCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createRowCode(sb, mockRow);
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
