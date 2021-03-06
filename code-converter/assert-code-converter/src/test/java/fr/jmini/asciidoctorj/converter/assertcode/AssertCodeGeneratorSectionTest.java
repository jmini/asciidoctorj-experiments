package fr.jmini.asciidoctorj.converter.assertcode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.Section;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class AssertCodeGeneratorSectionTest {

    @Test
    public void testSection() throws Exception {
        Section mockSection = mock(Section.class);
        when(mockSection.getIndex()).thenReturn(2);
        when(mockSection.getNumber()).thenReturn(10);
        when(mockSection.getSectionName()).thenReturn("nnn");
        when(mockSection.isSpecial()).thenReturn(false);
        when(mockSection.isNumbered()).thenReturn(true);

        AssertCodeGenerator generator = new AssertCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createSectionCode(sb, mockSection);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());

        checkAst(mockSection);
    }

    // tag::generated-code[]
    public void checkAst(Section astSection) {
        Section section1 = astSection;
        assertThat(section1.getId()).isNull();
        assertThat(section1.getNodeName()).isNull();
        assertThat(section1.getParent()).isNull();
        assertThat(section1.getContext()).isNull();
        assertThat(section1.getDocument()).isNull();
        assertThat(section1.isInline()).isFalse();
        assertThat(section1.isBlock()).isFalse();
        assertThat(section1.getAttributes()).isNullOrEmpty();
        assertThat(section1.getRoles()).isNullOrEmpty();
        assertThat(section1.isReftext()).isFalse();
        assertThat(section1.getReftext()).isNull();
        assertThat(section1.getCaption()).isNull();
        assertThat(section1.getTitle()).isNull();
        assertThat(section1.getStyle()).isNull();
        assertThat(section1.getLevel()).isEqualTo(0);
        assertThat(section1.getContentModel()).isNull();
        assertThat(section1.getSourceLocation()).isNull();
        assertThat(section1.getSubstitutions()).isNullOrEmpty();
        assertThat(section1.getBlocks()).isNullOrEmpty();
        assertThat(section1.getIndex()).isEqualTo(2);
        assertThat(section1.getNumber()).isEqualTo(10);
        assertThat(section1.getSectionName()).isEqualTo("nnn");
        assertThat(section1.isSpecial()).isFalse();
        assertThat(section1.isNumbered()).isTrue();
    }
    // end::generated-code[]
}
