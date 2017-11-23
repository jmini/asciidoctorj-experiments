package fr.jmini.asciidoctorj.code.converter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.asciidoctor.ast.DescriptionList;
import org.junit.Test;

public class AssertCodeConverterDescriptionListTest {

    @Test
    public void testDescriptionList() throws Exception {
        DescriptionList mockDescriptionList = mock(DescriptionList.class);
        when(mockDescriptionList.getItems()).thenReturn(Collections.emptyList());

        // TODO replace System.out.println with a check:
        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createDescriptionListCode(sb, mockDescriptionList);
        System.out.println(sb);

        checkAst(mockDescriptionList);
    }

    // tag::generated-code[]
    public void checkAst(DescriptionList astDescriptionList) {
        DescriptionList l1 = astDescriptionList;
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
    }
    // end::generated-code[]
}
