package fr.jmini.asciidoctorj.converter.assertcode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.asciidoctor.ast.Row;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class AssertCodeGeneratorRowTest {

    @Test
    public void testRow() throws Exception {
        Row mockRow = mock(Row.class);
        when(mockRow.getCells()).thenReturn(Collections.emptyList());

        AssertCodeGenerator generator = new AssertCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createRowCode(sb, mockRow);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());

        checkAst(mockRow);
    }

    // tag::generated-code[]
    public void checkAst(Row astRow) {
        Row row1 = astRow;
        assertThat(row1.getCells()).isNullOrEmpty();
    }
    // end::generated-code[]
}
