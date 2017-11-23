package fr.jmini.asciidoctorj.code.converter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.Title;
import org.junit.Test;

public class AssertCodeConverterTitleTest {

    @Test
    public void testTitle() throws Exception {
        Title mockTitle = mock(Title.class);
        when(mockTitle.getParent()).thenReturn(null);

        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createTitleCode(sb, mockTitle);
        System.out.println(sb);

        checkAst(mockTitle);
    }

    // tag::generated-code[]
    public void checkAst(Title astTitle) {
        Title a1 = astTitle;
        assertThat(a1).isEqualTo("TODO");
    }
    // end::generated-code[]
}
