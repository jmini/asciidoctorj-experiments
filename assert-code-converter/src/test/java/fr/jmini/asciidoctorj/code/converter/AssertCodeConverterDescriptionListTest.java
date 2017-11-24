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

        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createDescriptionListCode(sb, mockDescriptionList);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());

        checkAst(mockDescriptionList);
    }

    // tag::generated-code[]
    public void checkAst(DescriptionList astDescriptionList) {
        DescriptionList descriptionList1 = astDescriptionList;
        assertThat(descriptionList1.getId()).isNull();
        assertThat(descriptionList1.getNodeName()).isNull();
        assertThat(descriptionList1.getContext()).isNull();
        assertThat(descriptionList1.getDocument()).isNull();
        assertThat(descriptionList1.isInline()).isFalse();
        assertThat(descriptionList1.isBlock()).isFalse();
        assertThat(descriptionList1.getAttributes()).isEmpty();
        assertThat(descriptionList1.getRoles()).isEmpty();
        assertThat(descriptionList1.isReftext()).isFalse();
        assertThat(descriptionList1.getTitle()).isNull();
        assertThat(descriptionList1.getStyle()).isNull();
        assertThat(descriptionList1.getLevel()).isEqualTo(0);
        assertThat(descriptionList1.getContentModel()).isNull();
        assertThat(descriptionList1.getSourceLocation()).isNull();
        assertThat(descriptionList1.getSubstitutions()).isEmpty();
        assertThat(descriptionList1.getBlocks()).isEmpty();
        assertThat(descriptionList1.getItems()).isEmpty();
    }
    // end::generated-code[]
}
