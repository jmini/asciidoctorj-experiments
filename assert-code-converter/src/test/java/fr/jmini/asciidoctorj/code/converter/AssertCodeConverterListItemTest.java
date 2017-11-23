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
        when(mockListItem.getParent()).thenReturn(null);

        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createListItemCode(sb, mockListItem);
        System.out.println(sb);

        checkAst(mockListItem);
    }

    // tag::generated-code[]
    public void checkAst(ListItem astListItem) {
        ListItem a1 = astListItem;
        assertThat(a1).isEqualTo("TODO");
    }
    // end::generated-code[]
}
