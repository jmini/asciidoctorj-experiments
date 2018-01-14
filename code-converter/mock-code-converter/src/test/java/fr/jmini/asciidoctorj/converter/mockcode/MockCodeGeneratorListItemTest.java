package fr.jmini.asciidoctorj.converter.mockcode;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.asciidoctor.ast.ListItem;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class MockCodeGeneratorListItemTest {

    @Test
    public void testListItem() throws Exception {
        ListItem mockListItem = createMock();

        MockCodeGenerator generator = new MockCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createListItemCode(sb, mockListItem);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public ListItem createMock() {
        ListItem mockListItem1 = mock(ListItem.class);
        when(mockListItem1.getId()).thenReturn("id");
        when(mockListItem1.getNodeName()).thenReturn("node-name");
        when(mockListItem1.getParent()).thenReturn(null);
        when(mockListItem1.getContext()).thenReturn(null);
        when(mockListItem1.getDocument()).thenReturn(null);
        when(mockListItem1.isInline()).thenReturn(false);
        when(mockListItem1.isBlock()).thenReturn(false);
        when(mockListItem1.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockListItem1.getRoles()).thenReturn(Collections.emptyList());
        when(mockListItem1.isReftext()).thenReturn(false);
        when(mockListItem1.getReftext()).thenReturn(null);
        when(mockListItem1.getCaption()).thenReturn(null);
        when(mockListItem1.getTitle()).thenReturn("T");
        when(mockListItem1.getStyle()).thenReturn("S");
        when(mockListItem1.getLevel()).thenReturn(2);
        when(mockListItem1.getContentModel()).thenReturn(null);
        when(mockListItem1.getSourceLocation()).thenReturn(null);
        when(mockListItem1.getSubstitutions()).thenReturn(Collections.emptyList());
        when(mockListItem1.getBlocks()).thenReturn(Collections.emptyList());
        when(mockListItem1.getMarker()).thenReturn("m");
        when(mockListItem1.getText()).thenReturn("t");
        when(mockListItem1.getSource()).thenReturn("s");
        when(mockListItem1.hasText()).thenReturn(true);
        return mockListItem1;
    }
    // end::generated-code[]
}
