package fr.jmini.asciidoctorj.code.converter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.asciidoctor.ast.Table;
import org.junit.Test;

public class AssertCodeConverterTableTest {

    @Test
    public void testTable() throws Exception {
        Table mockTable = mock(Table.class);
        when(mockTable.hasHeaderOption()).thenReturn(true);
        when(mockTable.getColumns()).thenReturn(Collections.emptyList());
        when(mockTable.getHeader()).thenReturn(Collections.emptyList());
        when(mockTable.getFooter()).thenReturn(Collections.emptyList());
        when(mockTable.getBody()).thenReturn(Collections.emptyList());
        when(mockTable.getFrame()).thenReturn("my-frame");
        when(mockTable.getGrid()).thenReturn("my-grid");

        // TODO replace System.out.println with a check:
        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createTableCode(sb, mockTable);
        System.out.println(sb);

        checkAst(mockTable);
    }

    // tag::generated-code[]
    public void checkAst(Table astTable) {
        Table t1 = astTable;
        assertThat(t1.getId()).isNull();
        assertThat(t1.getNodeName()).isNull();
        assertThat(t1.getParent()).isNull();
        assertThat(t1.getContext()).isNull();
        assertThat(t1.getDocument()).isNull();
        assertThat(t1.isInline()).isFalse();
        assertThat(t1.isBlock()).isFalse();
        assertThat(t1.getAttributes()).isEmpty();
        assertThat(t1.getRoles()).isEmpty();
        assertThat(t1.isReftext()).isFalse();
        assertThat(t1.getTitle()).isNull();
        assertThat(t1.getStyle()).isNull();
        assertThat(t1.getLevel()).isEqualTo(0);
        assertThat(t1.getSourceLocation()).isNull();
        assertThat(t1.getSubstitutions()).isEmpty();
        assertThat(t1.getBlocks()).isEmpty();
        assertThat(t1.hasHeaderOption()).isTrue();
        assertThat(t1.getColumns()).isEmpty();
        assertThat(t1.getHeader()).isEmpty();
        assertThat(t1.getFooter()).isEmpty();
        assertThat(t1.getBody()).isEmpty();
        assertThat(t1.getFrame()).isEqualTo("my-frame");
        assertThat(t1.getGrid()).isEqualTo("my-grid");
    }
    // end::generated-code[]
}
