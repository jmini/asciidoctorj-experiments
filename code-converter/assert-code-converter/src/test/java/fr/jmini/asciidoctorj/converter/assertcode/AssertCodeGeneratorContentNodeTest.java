package fr.jmini.asciidoctorj.converter.assertcode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.asciidoctor.ast.ContentNode;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class AssertCodeGeneratorContentNodeTest {

    @Test
    public void testContentNode() throws Exception {
        ContentNode mockContentNode = mock(ContentNode.class);
        when(mockContentNode.getId()).thenReturn("id");
        when(mockContentNode.getNodeName()).thenReturn("node-name");
        when(mockContentNode.getParent()).thenReturn(null);
        when(mockContentNode.getContext()).thenReturn("context");
        when(mockContentNode.getDocument()).thenReturn(null);
        when(mockContentNode.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockContentNode.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockContentNode.getAttributes()).thenReturn(Collections.singletonMap("attr-key", "same-value"));
        when(mockContentNode.getRoles()).thenReturn(Collections.singletonList("some-role"));
        when(mockContentNode.isReftext()).thenReturn(true);
        when(mockContentNode.getReftext()).thenReturn("bla");

        AssertCodeGenerator generator = new AssertCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createContentNodeCode(sb, mockContentNode);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());

        checkAst(mockContentNode);
    }

    // tag::generated-code[]
    public void checkAst(ContentNode astContentNode) {
        ContentNode contentNode1 = astContentNode;
        assertThat(contentNode1.getId()).isEqualTo("id");
        assertThat(contentNode1.getNodeName()).isEqualTo("node-name");
        assertThat(contentNode1.getParent()).isNull();
        assertThat(contentNode1.getContext()).isEqualTo("context");
        assertThat(contentNode1.getDocument()).isNull();
        assertThatThrownBy(() -> {
            contentNode1.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            contentNode1.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(contentNode1.getAttributes()).containsEntry("attr-key", "same-value");
        assertThat(contentNode1.getRoles()).containsExactly("some-role");
        assertThat(contentNode1.isReftext()).isTrue();
        assertThat(contentNode1.getReftext()).isEqualTo("bla");
    }
    // end::generated-code[]
}
