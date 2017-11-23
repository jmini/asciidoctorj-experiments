package fr.jmini.asciidoctorj.code.converter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.Column;
import org.asciidoctor.ast.Table;
import org.junit.Test;

public class AssertCodeConverterColumnTest {

    @Test
    public void testColumn() throws Exception {
        Column mockColumn = mock(Column.class);
        when(mockColumn.getStyle()).thenReturn("STYLE");
        when(mockColumn.getTable()).thenReturn(null);
        when(mockColumn.getColumnNumber()).thenReturn(2);
        when(mockColumn.getWidth()).thenReturn(550);
        when(mockColumn.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.CENTER);
        when(mockColumn.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.MIDDLE);

        // TODO replace System.out.println with a check:
        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createColumnCode(sb, mockColumn);
        System.out.println(sb);

        checkAst(mockColumn);
    }

    // tag::generated-code[]
    public void checkAst(Column astColumn) {
        Column c1 = astColumn;
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
        assertThat(c1.getStyle()).isEqualTo("STYLE");
        assertThat(c1.getTable()).isNull();
        assertThat(c1.getColumnNumber()).isEqualTo(2);
        assertThat(c1.getWidth()).isEqualTo(550);
        assertThat(c1.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.CENTER);
        assertThat(c1.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.MIDDLE);
    }
    // end::generated-code[]
}
