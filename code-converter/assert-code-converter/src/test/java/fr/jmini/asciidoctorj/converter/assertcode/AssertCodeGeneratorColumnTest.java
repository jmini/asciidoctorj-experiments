package fr.jmini.asciidoctorj.converter.assertcode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.Column;
import org.asciidoctor.ast.Table;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class AssertCodeGeneratorColumnTest {

    @Test
    public void testColumn() throws Exception {
        Column mockColumn = mock(Column.class);
        when(mockColumn.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockColumn.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockColumn.getStyle()).thenReturn("STYLE");
        when(mockColumn.getTable()).thenReturn(null);
        when(mockColumn.getColumnNumber()).thenReturn(2);
        when(mockColumn.getWidth()).thenReturn(550);
        when(mockColumn.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.CENTER);
        when(mockColumn.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.MIDDLE);

        AssertCodeGenerator generator = new AssertCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createColumnCode(sb, mockColumn);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());

        checkAst(mockColumn);
    }

    // tag::generated-code[]
    public void checkAst(Column astColumn) {
        Column column1 = astColumn;
        assertThat(column1.getId()).isNull();
        assertThat(column1.getNodeName()).isNull();
        assertThat(column1.getParent()).isNull();
        assertThat(column1.getContext()).isNull();
        assertThat(column1.getDocument()).isNull();
        assertThatThrownBy(() -> {
            column1.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            column1.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(column1.getAttributes()).isNullOrEmpty();
        assertThat(column1.getRoles()).isNullOrEmpty();
        assertThat(column1.isReftext()).isFalse();
        assertThat(column1.getReftext()).isNull();
        assertThat(column1.getStyle()).isEqualTo("STYLE");
        assertThat(column1.getTable()).isNull();
        assertThat(column1.getColumnNumber()).isEqualTo(2);
        assertThat(column1.getWidth()).isEqualTo(550);
        assertThat(column1.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.CENTER);
        assertThat(column1.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.MIDDLE);
    }
    // end::generated-code[]
}
