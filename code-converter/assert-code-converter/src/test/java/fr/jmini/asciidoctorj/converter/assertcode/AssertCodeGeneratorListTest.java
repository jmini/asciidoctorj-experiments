package fr.jmini.asciidoctorj.converter.assertcode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.asciidoctor.ast.List;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class AssertCodeGeneratorListTest {

    @Test
    public void testList() throws Exception {
        List mockList = mock(List.class);
        when(mockList.getItems()).thenReturn(Collections.emptyList());
        when(mockList.hasItems()).thenReturn(false);

        AssertCodeGenerator generator = new AssertCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createListCode(sb, mockList);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());

        checkAst(mockList);
    }

    // tag::generated-code[]
    public void checkAst(List astList) {
        List list1 = astList;
        assertThat(list1.getId()).isNull();
        assertThat(list1.getNodeName()).isNull();
        assertThat(list1.getContext()).isNull();
        assertThat(list1.getDocument()).isNull();
        assertThat(list1.isInline()).isFalse();
        assertThat(list1.isBlock()).isFalse();
        assertThat(list1.getAttributes()).isEmpty();
        assertThat(list1.getRoles()).isEmpty();
        assertThat(list1.isReftext()).isFalse();
        assertThat(list1.getTitle()).isNull();
        assertThat(list1.getStyle()).isNull();
        assertThat(list1.getLevel()).isEqualTo(0);
        assertThat(list1.getContentModel()).isNull();
        assertThat(list1.getSourceLocation()).isNull();
        assertThat(list1.getSubstitutions()).isEmpty();
        assertThat(list1.getBlocks()).isEmpty();
        assertThat(list1.getItems()).isEmpty();
        assertThat(list1.hasItems()).isFalse();
    }
    // end::generated-code[]
}
