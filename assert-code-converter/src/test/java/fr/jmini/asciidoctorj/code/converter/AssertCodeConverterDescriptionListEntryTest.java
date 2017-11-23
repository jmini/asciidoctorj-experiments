package fr.jmini.asciidoctorj.code.converter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.DescriptionList;
import org.junit.Test;

public class AssertCodeConverterDescriptionListEntryTest {

    @Test
    public void testDescriptionList() throws Exception {
        DescriptionList mockDescriptionList = mock(DescriptionList.class);
        when(mockDescriptionList.getParent()).thenReturn(null);

        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createDescriptionListCode(sb, mockDescriptionList);
        System.out.println(sb);

        checkAst(mockDescriptionList);
    }

    // tag::generated-code[]
    public void checkAst(DescriptionList astDescriptionList) {
        DescriptionList a1 = astDescriptionList;
        assertThat(a1).isEqualTo("TODO");
    }
    // end::generated-code[]
}
