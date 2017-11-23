package fr.jmini.asciidoctorj.code.converter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.List;
import org.junit.Test;

public class AssertCodeConverterListTest {

    @Test
    public void testList() throws Exception {
        List mockList = mock(List.class);
        when(mockList.getParent()).thenReturn(null);

        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createListCode(sb, mockList);
        System.out.println(sb);

        checkAst(mockList);
    }

    // tag::generated-code[]
    public void checkAst(List astList) {
        List a1 = astList;
        assertThat(a1).isEqualTo("TODO");
    }
    // end::generated-code[]
}
