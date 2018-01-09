package fr.jmini.asciidoctorj.converter.mockcode;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.asciidoctor.ast.Section;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class MockCodeGeneratorSectionTest {

    @Test
    public void testSection() throws Exception {
        Section mockSection = createMock();

        MockCodeGenerator generator = new MockCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createSectionCode(sb, mockSection);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public Section createMock() {
        Section mockSection1 = mock(Section.class);
        when(mockSection1.getId()).thenReturn(null);
        when(mockSection1.getNodeName()).thenReturn(null);
        when(mockSection1.getParent()).thenReturn(null);
        when(mockSection1.getContext()).thenReturn(null);
        when(mockSection1.getDocument()).thenReturn(null);
        when(mockSection1.isInline()).thenReturn(false);
        when(mockSection1.isBlock()).thenReturn(false);
        when(mockSection1.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockSection1.getRoles()).thenReturn(Collections.emptyList());
        when(mockSection1.isReftext()).thenReturn(false);
        when(mockSection1.getReftext()).thenReturn(null);
        when(mockSection1.getTitle()).thenReturn(null);
        when(mockSection1.getStyle()).thenReturn(null);
        when(mockSection1.getLevel()).thenReturn(0);
        when(mockSection1.getContentModel()).thenReturn(null);
        when(mockSection1.getSourceLocation()).thenReturn(null);
        when(mockSection1.getSubstitutions()).thenReturn(Collections.emptyList());
        when(mockSection1.getBlocks()).thenReturn(Collections.emptyList());
        when(mockSection1.getIndex()).thenReturn(2);
        when(mockSection1.getNumber()).thenReturn(10);
        when(mockSection1.getSectionName()).thenReturn("nnn");
        when(mockSection1.isSpecial()).thenReturn(false);
        when(mockSection1.isNumbered()).thenReturn(true);
        return mockSection1;
    }
    // end::generated-code[]
}
