package fr.jmini.asciidoctorj.converter.assertcode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.ListItem;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class AssertCodeGeneratorListItemWithoutTextTest {

    @Test
    public void testListItem() throws Exception {
        ListItem mockListItem = mock(ListItem.class);
        when(mockListItem.getMarker()).thenReturn(null);
        when(mockListItem.getText()).thenThrow(new UnsupportedOperationException("NoMethodError"));
        when(mockListItem.getSource()).thenReturn(null);
        when(mockListItem.hasText()).thenReturn(false);

        AssertCodeGenerator generator = new AssertCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createListItemCode(sb, mockListItem);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());

        checkAst(mockListItem);
    }

    // tag::generated-code[]
    public void checkAst(ListItem astListItem) {
        ListItem listItem1 = astListItem;
        assertThat(listItem1.getId()).isNull();
        assertThat(listItem1.getNodeName()).isNull();
        assertThat(listItem1.getParent()).isNull();
        assertThat(listItem1.getContext()).isNull();
        assertThat(listItem1.getDocument()).isNull();
        assertThat(listItem1.isInline()).isFalse();
        assertThat(listItem1.isBlock()).isFalse();
        assertThat(listItem1.getAttributes()).isNullOrEmpty();
        assertThat(listItem1.getRoles()).isNullOrEmpty();
        assertThat(listItem1.isReftext()).isFalse();
        assertThat(listItem1.getReftext()).isNull();
        assertThat(listItem1.getCaption()).isNull();
        assertThat(listItem1.getTitle()).isNull();
        assertThat(listItem1.getStyle()).isNull();
        assertThat(listItem1.getLevel()).isEqualTo(0);
        assertThat(listItem1.getContentModel()).isNull();
        assertThat(listItem1.getSourceLocation()).isNull();
        assertThat(listItem1.getSubstitutions()).isNullOrEmpty();
        assertThat(listItem1.getBlocks()).isNullOrEmpty();
        assertThat(listItem1.getMarker()).isNull();
        assertThat(listItem1.getSource()).isNull();
        assertThat(listItem1.hasText()).isFalse();
    }
    // end::generated-code[]
}
