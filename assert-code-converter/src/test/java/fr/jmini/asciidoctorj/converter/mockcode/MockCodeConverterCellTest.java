package fr.jmini.asciidoctorj.converter.mockcode;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.asciidoctor.ast.Cell;
import org.asciidoctor.ast.Table;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class MockCodeConverterCellTest {

    @Test
    public void testCell() throws Exception {
        Cell mockCell = createMock();

        MockCodeConverter converter = new MockCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createCellCode(sb, mockCell);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public Cell createMock() {
        Cell mockCell1 = mock(Cell.class);
        when(mockCell1.getId()).thenReturn(null);
        when(mockCell1.getNodeName()).thenReturn(null);
        when(mockCell1.getParent()).thenReturn(null);
        when(mockCell1.getContext()).thenReturn(null);
        when(mockCell1.getDocument()).thenReturn(null);
        when(mockCell1.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockCell1.getRoles()).thenReturn(Collections.emptyList());
        when(mockCell1.isReftext()).thenReturn(false);
        when(mockCell1.getColumn()).thenReturn(null);
        when(mockCell1.getColspan()).thenReturn(1);
        when(mockCell1.getRowspan()).thenReturn(2);
        when(mockCell1.getText()).thenReturn("txt");
        when(mockCell1.getSource()).thenReturn("src");
        when(mockCell1.getStyle()).thenReturn("stl");
        when(mockCell1.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockCell1.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.BOTTOM);
        when(mockCell1.getInnerDocument()).thenReturn(null);
        return mockCell1;
    }
    // end::generated-code[]
}
