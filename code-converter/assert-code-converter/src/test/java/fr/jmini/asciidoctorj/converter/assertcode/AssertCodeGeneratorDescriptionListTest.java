package fr.jmini.asciidoctorj.converter.assertcode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.asciidoctor.ast.DescriptionList;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class AssertCodeGeneratorDescriptionListTest {

    @Test
    public void testDescriptionList() throws Exception {
        DescriptionList mockDescriptionList = mock(DescriptionList.class);
        when(mockDescriptionList.getItems()).thenReturn(Collections.emptyList());

        AssertCodeGenerator generator = new AssertCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createDescriptionListCode(sb, mockDescriptionList);
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
        assertThat(descriptionList1.getAttributes()).isNullOrEmpty();
        assertThat(descriptionList1.getRoles()).isNullOrEmpty();
        assertThat(descriptionList1.isReftext()).isFalse();
        assertThat(descriptionList1.getReftext()).isNull();
        assertThat(descriptionList1.getTitle()).isNull();
        assertThat(descriptionList1.getStyle()).isNull();
        assertThat(descriptionList1.getLevel()).isEqualTo(0);
        assertThat(descriptionList1.getContentModel()).isNull();
        assertThat(descriptionList1.getSourceLocation()).isNull();
        assertThat(descriptionList1.getSubstitutions()).isNullOrEmpty();
        assertThat(descriptionList1.getBlocks()).isNullOrEmpty();
        assertThat(descriptionList1.getItems()).isNullOrEmpty();
    }
    // end::generated-code[]
}
