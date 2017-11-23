package fr.jmini.asciidoctorj.code.converter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.asciidoctor.ast.List;
import org.junit.Test;

public class AssertCodeConverterListTest {

    @Test
    public void testList() throws Exception {
        List mockList = mock(List.class);
        when(mockList.getItems()).thenReturn(Collections.emptyList());
        when(mockList.hasItems()).thenReturn(false);

        // TODO replace System.out.println with a check:
        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createListCode(sb, mockList);
        System.out.println(sb);

        checkAst(mockList);
    }

    // tag::generated-code[]
    public void checkAst(List astList) {
        List l1 = astList;
        assertThat(l1.getId()).isNull();
        assertThat(l1.getNodeName()).isNull();
        assertThat(l1.getParent()).isNull();
        assertThat(l1.getContext()).isNull();
        assertThat(l1.getDocument()).isNull();
        assertThat(l1.isInline()).isFalse();
        assertThat(l1.isBlock()).isFalse();
        assertThat(l1.getAttributes()).isEmpty();
        assertThat(l1.getRoles()).isEmpty();
        assertThat(l1.isReftext()).isFalse();
        assertThat(l1.getTitle()).isNull();
        assertThat(l1.getStyle()).isNull();
        assertThat(l1.getLevel()).isEqualTo(0);
        assertThat(l1.getSourceLocation()).isNull();
        assertThat(l1.getSubstitutions()).isEmpty();
        assertThat(l1.getBlocks()).isEmpty();
        assertThat(l1.getItems()).isEmpty();
        assertThat(l1.hasItems()).isFalse();
    }
    // end::generated-code[]
}
