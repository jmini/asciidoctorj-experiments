package fr.jmini.asciidoctorj.converter.assertcode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.ListItem;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class AssertCodeGeneratorListItemTest {

    @Test
    public void testListItem() throws Exception {
        ListItem mockListItem = mock(ListItem.class);
        when(mockListItem.getMarker()).thenReturn("m");
        when(mockListItem.getText()).thenReturn("t");
        when(mockListItem.getSource()).thenReturn("s");
        when(mockListItem.hasText()).thenReturn(true);

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
        assertThat(listItem1.getContext()).isNull();
        assertThat(listItem1.getDocument()).isNull();
        assertThat(listItem1.getAttributes()).isEmpty();
        assertThat(listItem1.getRoles()).isEmpty();
        assertThat(listItem1.isReftext()).isFalse();
        assertThat(listItem1.getTitle()).isNull();
        assertThat(listItem1.getStyle()).isNull();
        assertThat(listItem1.getLevel()).isEqualTo(0);
        assertThat(listItem1.getContentModel()).isNull();
        assertThat(listItem1.getSourceLocation()).isNull();
        assertThat(listItem1.getSubstitutions()).isEmpty();
        assertThat(listItem1.getBlocks()).isEmpty();
        assertThat(listItem1.getMarker()).isEqualTo("m");
        assertThat(listItem1.getText()).isEqualTo("t");
        assertThat(listItem1.getSource()).isEqualTo("s");
        assertThat(listItem1.hasText()).isTrue();
    }
    // end::generated-code[]
}
