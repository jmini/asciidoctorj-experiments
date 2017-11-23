package fr.jmini.asciidoctorj.code.converter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.Column;
import org.junit.Test;

public class AssertCodeConverterColumnTest {

    @Test
    public void testColumn() throws Exception {
        Column mockColumn = mock(Column.class);
        when(mockColumn.getParent()).thenReturn(null);

        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createColumnCode(sb, mockColumn);
        System.out.println(sb);

        checkAst(mockColumn);
    }

    // tag::generated-code[]
    public void checkAst(Column astColumn) {
        Column a1 = astColumn;
        assertThat(a1).isEqualTo("TODO");
    }
    // end::generated-code[]
}
