package fr.jmini.asciidoctorj.code.converter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.asciidoctor.ast.StructuralNode;
import org.junit.Test;

public class AssertCodeConverterStructuralNodeTest {

    @Test
    public void testStructuralNode() throws Exception {
        StructuralNode mockStructuralNode = mock(StructuralNode.class);
        when(mockStructuralNode.getId()).thenReturn("my-id");
        when(mockStructuralNode.getNodeName()).thenReturn(null);
        when(mockStructuralNode.getParent()).thenReturn(null);
        when(mockStructuralNode.getContext()).thenReturn("context");
        when(mockStructuralNode.getDocument()).thenReturn(null);
        when(mockStructuralNode.isInline()).thenReturn(true);
        when(mockStructuralNode.isBlock()).thenReturn(false);
        when(mockStructuralNode.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockStructuralNode.getRoles()).thenReturn(Collections.emptyList());
        when(mockStructuralNode.isReftext()).thenReturn(false);
        when(mockStructuralNode.getTitle()).thenReturn("my-title");
        when(mockStructuralNode.getStyle()).thenReturn("my-style");
        when(mockStructuralNode.getBlocks()).thenReturn(Collections.emptyList());
        when(mockStructuralNode.getContent()).thenReturn("my-content");
        when(mockStructuralNode.getLevel()).thenReturn(2);
        when(mockStructuralNode.getContentModel()).thenReturn("my-content-model");
        when(mockStructuralNode.getSourceLocation()).thenReturn(null);
        when(mockStructuralNode.getSubstitutions()).thenReturn(Collections.emptyList());

        // TODO replace System.out.println with a check:
        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createStructuralNodeCode(sb, mockStructuralNode);
        System.out.println(sb);

        checkAst(mockStructuralNode);
    }

    // tag::generated-code[]
    public void checkAst(StructuralNode astStructuralNode) {
        StructuralNode n1 = astStructuralNode;
        assertThat(n1.getId()).isEqualTo("my-id");
        assertThat(n1.getNodeName()).isNull();
        assertThat(n1.getNodeName()).isNull();
        assertThat(n1.getContext()).isEqualTo("context");
        assertThat(n1.getDocument()).isNull();
        assertThat(n1.isInline()).isTrue();
        assertThat(n1.isBlock()).isFalse();
        assertThat(n1.getAttributes()).isEmpty();
        assertThat(n1.getRoles()).isEmpty();
        assertThat(n1.isReftext()).isFalse();
        assertThat(n1.getTitle()).isEqualTo("my-title");
        assertThat(n1.getStyle()).isEqualTo("my-style");
        assertThat(n1.getLevel()).isEqualTo(2);
        assertThat(n1.getSourceLocation()).isNull();
        assertThat(n1.getSubstitutions()).isEmpty();
        assertThat(n1.getBlocks()).isEmpty();
    }
    // end::generated-code[]
}
