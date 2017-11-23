package fr.jmini.asciidoctorj.code.converter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.Table;
import org.junit.Test;

public class AssertCodeConverterTableTest {

    @Test
    public void testTable() throws Exception {
        Table mockTable = mock(Table.class);
        when(mockTable.getParent()).thenReturn(null);

        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createTableCode(sb, mockTable);
        System.out.println(sb);

        checkAst(mockTable);
    }

    // tag::generated-code[]
    public void checkAst(Table astTable) {
        Table a1 = astTable;
        assertThat(a1).isEqualTo("TODO");
    }
    // end::generated-code[]
}
