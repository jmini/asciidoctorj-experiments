package fr.jmini.asciidoctorj.converter.assertcode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.asciidoctor.ast.Table;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.assertcode.AssertCodeConverter;
import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

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

        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createTableCode(sb, mockTable);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());

        checkAst(mockTable);
    }

    // tag::generated-code[]
    public void checkAst(Table astTable) {
        Table table1 = astTable;
        assertThat(table1.getId()).isNull();
        assertThat(table1.getNodeName()).isNull();
        assertThat(table1.getContext()).isNull();
        assertThat(table1.getDocument()).isNull();
        assertThat(table1.isInline()).isFalse();
        assertThat(table1.isBlock()).isFalse();
        assertThat(table1.getAttributes()).isEmpty();
        assertThat(table1.getRoles()).isEmpty();
        assertThat(table1.isReftext()).isFalse();
        assertThat(table1.getTitle()).isNull();
        assertThat(table1.getStyle()).isNull();
        assertThat(table1.getLevel()).isEqualTo(0);
        assertThat(table1.getContentModel()).isNull();
        assertThat(table1.getSourceLocation()).isNull();
        assertThat(table1.getSubstitutions()).isEmpty();
        assertThat(table1.getBlocks()).isEmpty();
        assertThat(table1.hasHeaderOption()).isTrue();
        assertThat(table1.getColumns()).isEmpty();
        assertThat(table1.getHeader()).isEmpty();
        assertThat(table1.getFooter()).isEmpty();
        assertThat(table1.getBody()).isEmpty();
        assertThat(table1.getFrame()).isEqualTo("my-frame");
        assertThat(table1.getGrid()).isEqualTo("my-grid");
    }
    // end::generated-code[]
}
