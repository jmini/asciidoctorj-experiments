package fr.jmini.asciidoctorj.code.converter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.asciidoctor.ast.ContentNode;
import org.junit.Test;

public class AssertCodeConverterContentNodeTest {

    @Test
    public void testContentNode() throws Exception {
        ContentNode mockContentNode = mock(ContentNode.class);
        when(mockContentNode.getId()).thenReturn("id");
        when(mockContentNode.getNodeName()).thenReturn("node-name");
        when(mockContentNode.getParent()).thenReturn(null);
        when(mockContentNode.getContext()).thenReturn("context");
        when(mockContentNode.getDocument()).thenReturn(null);
        when(mockContentNode.isInline()).thenReturn(true);
        when(mockContentNode.isBlock()).thenReturn(false);
        when(mockContentNode.getAttributes()).thenReturn(Collections.singletonMap("attr-key", "same-value"));
        when(mockContentNode.getRoles()).thenReturn(Collections.singletonList("some-role"));
        when(mockContentNode.isReftext()).thenReturn(false);

        // TODO replace System.out.println with a check:
        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createContentNodeCode(sb, mockContentNode);
        System.out.println(sb);

        checkAst(mockContentNode);
    }

    // tag::generated-code[]
    public void checkAst(ContentNode astContentNode) {
        ContentNode n1 = astContentNode;
        assertThat(n1.getId()).isEqualTo("id");
        assertThat(n1.getNodeName()).isEqualTo("node-name");
        assertThat(n1.getParent()).isNull();
        assertThat(n1.getContext()).isEqualTo("context");
        assertThat(n1.getDocument()).isNull();
        assertThat(n1.isInline()).isTrue();
        assertThat(n1.isBlock()).isFalse();
        assertThat(n1.getAttributes()).containsEntry("attr-key", "same-value");
        assertThat(n1.getRoles()).containsExactly("some-role");
        assertThat(n1.isReftext()).isFalse();
    }
    // end::generated-code[]
}
