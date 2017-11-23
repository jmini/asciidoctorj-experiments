package fr.jmini.asciidoctorj.code.converter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.Cell;
import org.asciidoctor.ast.Table;
import org.asciidoctor.ast.Table.HorizontalAlignment;
import org.asciidoctor.ast.Table.VerticalAlignment;
import org.junit.Test;

public class AssertCodeConverterCellTest {

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

        // TODO replace System.out.println with a check:
        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createCellCode(sb, mockCell);
        System.out.println(sb);

        checkAst(mockCell);
    }

    // tag::generated-code[]
    public void checkAst(Cell astCell) {
        Cell c1 = astCell;
        assertThat(c1.getId()).isNull();
        assertThat(c1.getNodeName()).isNull();
        assertThat(c1.getParent()).isNull();
        assertThat(c1.getContext()).isNull();
        assertThat(c1.getDocument()).isNull();
        assertThat(c1.isInline()).isFalse();
        assertThat(c1.isBlock()).isFalse();
        assertThat(c1.getAttributes()).isEmpty();
        assertThat(c1.getRoles()).isEmpty();
        assertThat(c1.isReftext()).isFalse();
        assertThat(c1.getColumn()).isNull();
        assertThat(c1.getColspan()).isEqualTo(1);
        assertThat(c1.getRowspan()).isEqualTo(2);
        assertThat(c1.getSource()).isEqualTo("src");
        assertThat(c1.getStyle()).isEqualTo("stl");
        assertThat(c1.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(c1.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.BOTTOM);
        assertThat(c1.getInnerDocument()).isNull();
    }
    // end::generated-code[]
}
