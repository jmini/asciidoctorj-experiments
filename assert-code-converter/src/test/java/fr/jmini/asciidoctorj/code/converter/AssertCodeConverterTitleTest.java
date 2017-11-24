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

        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createTitleCode(sb, mockTitle);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());

        checkAst(mockTitle);
    }

    // tag::generated-code[]
    public void checkAst(Title astTitle) {
        Title title1 = astTitle;
        assertThat(title1.getMain()).isEqualTo("main");
        assertThat(title1.getSubtitle()).isEqualTo("subt");
        assertThat(title1.getCombined()).isEqualTo("comb");
        assertThat(title1.isSanitized()).isTrue();
    }
    // end::generated-code[]
}
