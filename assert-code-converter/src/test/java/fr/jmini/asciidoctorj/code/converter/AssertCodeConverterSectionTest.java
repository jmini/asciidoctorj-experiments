package fr.jmini.asciidoctorj.code.converter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.Section;
import org.junit.Test;

public class AssertCodeConverterSectionTest {

    @Test
    public void testSection() throws Exception {
        Section mockSection = mock(Section.class);
        when(mockSection.getParent()).thenReturn(null);

        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createSectionCode(sb, mockSection);
        System.out.println(sb);

        checkAst(mockSection);
    }

    // tag::generated-code[]
    public void checkAst(Section astSection) {
        Section a1 = astSection;
        assertThat(a1).isEqualTo("TODO");
    }
    // end::generated-code[]
}
