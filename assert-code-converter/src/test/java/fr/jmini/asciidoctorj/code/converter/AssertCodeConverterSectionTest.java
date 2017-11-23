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
        when(mockSection.getIndex()).thenReturn(2);
        when(mockSection.getNumber()).thenReturn(10);
        when(mockSection.getSectionName()).thenReturn("nnn");
        when(mockSection.isSpecial()).thenReturn(false);
        when(mockSection.isNumbered()).thenReturn(true);

        // TODO replace System.out.println with a check:
        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createSectionCode(sb, mockSection);
        System.out.println(sb);

        checkAst(mockSection);
    }

    // tag::generated-code[]
    public void checkAst(Section astSection) {
        Section s1 = astSection;
        assertThat(s1.getId()).isNull();
        assertThat(s1.getNodeName()).isNull();
        assertThat(s1.getParent()).isNull();
        assertThat(s1.getContext()).isNull();
        assertThat(s1.getDocument()).isNull();
        assertThat(s1.isInline()).isFalse();
        assertThat(s1.isBlock()).isFalse();
        assertThat(s1.getAttributes()).isEmpty();
        assertThat(s1.getRoles()).isEmpty();
        assertThat(s1.isReftext()).isFalse();
        assertThat(s1.getTitle()).isNull();
        assertThat(s1.getStyle()).isNull();
        assertThat(s1.getLevel()).isEqualTo(0);
        assertThat(s1.getSourceLocation()).isNull();
        assertThat(s1.getSubstitutions()).isEmpty();
        assertThat(s1.getBlocks()).isEmpty();
        assertThat(s1.getIndex()).isEqualTo(2);
        assertThat(s1.getNumber()).isEqualTo(10);
        assertThat(s1.getSectionName()).isEqualTo("nnn");
        assertThat(s1.isSpecial()).isFalse();
        assertThat(s1.isNumbered()).isTrue();
    }
    // end::generated-code[]
}
