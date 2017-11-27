package fr.jmini.asciidoctorj.converter.mockcode;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;

import org.asciidoctor.ast.Column;
import org.asciidoctor.ast.Table;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class MockCodeConverterColumnTest {

    @Test
    public void testColumn() throws Exception {
        Column mockColumn = createMock();
        mock(Column.class);
        when(mockColumn.getStyle()).thenReturn("STYLE");
        when(mockColumn.getTable()).thenReturn(null);
        when(mockColumn.getColumnNumber()).thenReturn(2);
        when(mockColumn.getWidth()).thenReturn(550);
        when(mockColumn.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.CENTER);
        when(mockColumn.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.MIDDLE);

        MockCodeConverter converter = new MockCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createColumnCode(sb, mockColumn);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public Column createMock() {
        Column mockColumn1 = mock(Column.class);
        when(mockColumn1.getId()).thenReturn(null);
        when(mockColumn1.getNodeName()).thenReturn(null);
        when(mockColumn1.getParent()).thenReturn(null);
        when(mockColumn1.getContext()).thenReturn(null);
        when(mockColumn1.getDocument()).thenReturn(null);
        when(mockColumn1.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockColumn1.getRoles()).thenReturn(Arrays.asList("r1", "r2", "r3"));
        when(mockColumn1.isReftext()).thenReturn(false);
        when(mockColumn1.getStyle()).thenReturn("STYLE");
        when(mockColumn1.getTable()).thenReturn(null);
        when(mockColumn1.getColumnNumber()).thenReturn(2);
        when(mockColumn1.getWidth()).thenReturn(550);
        when(mockColumn1.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.CENTER);
        when(mockColumn1.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.MIDDLE);
        return mockColumn1;
    }
    // end::generated-code[]
}
