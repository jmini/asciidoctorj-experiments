package fr.jmini.asciidoctorj.converter.assertcode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.Cell;
import org.asciidoctor.ast.Table;
import org.asciidoctor.ast.Table.HorizontalAlignment;
import org.asciidoctor.ast.Table.VerticalAlignment;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class AssertCodeGeneratorCellTest {

    @Test
    public void testCell() throws Exception {
        Cell mockCell = mock(Cell.class);
        when(mockCell.getColumn()).thenReturn(null);
        when(mockCell.getColspan()).thenReturn(1);
        when(mockCell.getRowspan()).thenReturn(2);
        when(mockCell.getText()).thenReturn("txt");
        when(mockCell.getSource()).thenReturn("src");
        when(mockCell.getContent()).thenReturn("ctn");
        when(mockCell.getStyle()).thenReturn("stl");
        when(mockCell.getHorizontalAlignment()).thenReturn(HorizontalAlignment.LEFT);
        when(mockCell.getVerticalAlignment()).thenReturn(VerticalAlignment.BOTTOM);
        when(mockCell.getInnerDocument()).thenReturn(null);

        AssertCodeGenerator generator = new AssertCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createCellCode(sb, mockCell);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());

        checkAst(mockCell);
    }

    // tag::generated-code[]
    public void checkAst(Cell astCell) {
        Cell cell1 = astCell;
        assertThat(cell1.getId()).isNull();
        assertThat(cell1.getNodeName()).isNull();
        assertThat(cell1.getParent()).isNull();
        assertThat(cell1.getContext()).isNull();
        assertThat(cell1.getDocument()).isNull();
        assertThat(cell1.getAttributes()).isEmpty();
        assertThat(cell1.getRoles()).isEmpty();
        assertThat(cell1.isReftext()).isFalse();
        assertThat(cell1.getColumn()).isNull();
        assertThat(cell1.getColspan()).isEqualTo(1);
        assertThat(cell1.getRowspan()).isEqualTo(2);
        assertThat(cell1.getText()).isEqualTo("txt");
        assertThat(cell1.getSource()).isEqualTo("src");
        assertThat(cell1.getStyle()).isEqualTo("stl");
        assertThat(cell1.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(cell1.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.BOTTOM);
        assertThat(cell1.getInnerDocument()).isNull();
    }
    // end::generated-code[]
}
