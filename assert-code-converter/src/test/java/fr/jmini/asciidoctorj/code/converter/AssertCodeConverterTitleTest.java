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
        when(mockTitle.getMain()).thenReturn("main");
        when(mockTitle.getSubtitle()).thenReturn("subt");
        when(mockTitle.getCombined()).thenReturn("comb");
        when(mockTitle.isSanitized()).thenReturn(true);

        // TODO replace System.out.println with a check:
        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createTitleCode(sb, mockTitle);
        System.out.println(sb);

        checkAst(mockTitle);
    }

    // tag::generated-code[]
    public void checkAst(Title astTitle) {
        Title t1 = astTitle;
        assertThat(t1.getMain()).isEqualTo("main");
        assertThat(t1.getSubtitle()).isEqualTo("subt");
        assertThat(t1.getCombined()).isEqualTo("comb");
        assertThat(t1.isSanitized()).isTrue();
    }
    // end::generated-code[]
}
