package fr.jmini.asciidoctorj.code.converter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.ListItem;
import org.junit.Test;

public class AssertCodeConverterListItemTest {

    @Test
    public void testListItem() throws Exception {
        ListItem mockListItem = mock(ListItem.class);
        when(mockListItem.getMarker()).thenReturn("m");
        when(mockListItem.getText()).thenReturn("t");
        when(mockListItem.getSource()).thenReturn("s");
        when(mockListItem.hasText()).thenReturn(true);

        // TODO replace System.out.println with a check:
        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createListItemCode(sb, mockListItem);
        System.out.println(sb);

        checkAst(mockListItem);
    }

    // tag::generated-code[]
    public void checkAst(ListItem astListItem) {
        ListItem i1 = astListItem;
        assertThat(i1.getId()).isNull();
        assertThat(i1.getNodeName()).isNull();
        assertThat(i1.getParent()).isNull();
        assertThat(i1.getContext()).isNull();
        assertThat(i1.getDocument()).isNull();
        assertThat(i1.isInline()).isFalse();
        assertThat(i1.isBlock()).isFalse();
        assertThat(i1.getAttributes()).isEmpty();
        assertThat(i1.getRoles()).isEmpty();
        assertThat(i1.isReftext()).isFalse();
        assertThat(i1.getTitle()).isNull();
        assertThat(i1.getStyle()).isNull();
        assertThat(i1.getLevel()).isEqualTo(0);
        assertThat(i1.getSourceLocation()).isNull();
        assertThat(i1.getSubstitutions()).isEmpty();
        assertThat(i1.getBlocks()).isEmpty();
        assertThat(i1.getMarker()).isEqualTo("m");
        assertThat(i1.getText()).isEqualTo("t");
        assertThat(i1.getSource()).isEqualTo("s");
        assertThat(i1.hasText()).isTrue();
    }
    // end::generated-code[]
}
