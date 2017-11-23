package fr.jmini.asciidoctorj.code.converter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.asciidoctor.ast.Row;
import org.junit.Test;

public class AssertCodeConverterRowTest {

    @Test
    public void testRow() throws Exception {
        Row mockRow = mock(Row.class);
        when(mockRow.getCells()).thenReturn(Collections.emptyList());

        // TODO replace System.out.println with a check:
        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createRowCode(sb, mockRow);
        System.out.println(sb);

        checkAst(mockRow);
    }

    // tag::generated-code[]
    public void checkAst(Row astRow) {
        Row r1 = astRow;
        assertThat(r1.getCells()).isEmpty();
    }
    // end::generated-code[]
}
