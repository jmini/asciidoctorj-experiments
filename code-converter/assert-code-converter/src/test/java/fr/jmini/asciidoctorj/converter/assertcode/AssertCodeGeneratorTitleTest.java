package fr.jmini.asciidoctorj.converter.assertcode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.Title;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class AssertCodeGeneratorTitleTest {

    @Test
    public void testTitle() throws Exception {
        Title mockTitle = mock(Title.class);
        when(mockTitle.getMain()).thenReturn("main");
        when(mockTitle.getSubtitle()).thenReturn("subt");
        when(mockTitle.getCombined()).thenReturn("comb");
        when(mockTitle.isSanitized()).thenReturn(true);

        AssertCodeGenerator generator = new AssertCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createTitleCode(sb, mockTitle);
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
