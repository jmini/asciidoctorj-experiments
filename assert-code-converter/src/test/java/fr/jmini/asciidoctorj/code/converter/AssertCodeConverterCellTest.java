package fr.jmini.asciidoctorj.code.converter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.Cell;
import org.junit.Test;

public class AssertCodeConverterCellTest {

    @Test
    public void testCell() throws Exception {
        Cell mockCell = mock(Cell.class);
        when(mockCell.getParent()).thenReturn(null);

        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createCellCode(sb, mockCell);
        System.out.println(sb);

        checkAst(mockCell);
    }

    // tag::generated-code[]
    public void checkAst(Cell astCell) {
        Cell a1 = astCell;
        assertThat(a1).isEqualTo("TODO");
    }
    // end::generated-code[]
}
