package fr.jmini.asciidoctorj.converter.assertcode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.asciidoctor.ast.StructuralNode;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class AssertCodeGeneratorStructuralNodeTest {

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

        AssertCodeGenerator generator = new AssertCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createStructuralNodeCode(sb, mockStructuralNode);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());

        checkAst(mockStructuralNode);
    }

    // tag::generated-code[]
    public void checkAst(StructuralNode astStructuralNode) {
        StructuralNode structuralNode1 = astStructuralNode;
        assertThat(structuralNode1.getId()).isEqualTo("my-id");
        assertThat(structuralNode1.getNodeName()).isNull();
        assertThat(structuralNode1.getParent()).isNull();
        assertThat(structuralNode1.getContext()).isEqualTo("context");
        assertThat(structuralNode1.getDocument()).isNull();
        assertThat(structuralNode1.isInline()).isTrue();
        assertThat(structuralNode1.isBlock()).isFalse();
        assertThat(structuralNode1.getAttributes()).isNullOrEmpty();
        assertThat(structuralNode1.getRoles()).isNullOrEmpty();
        assertThat(structuralNode1.isReftext()).isFalse();
        assertThat(structuralNode1.getReftext()).isNull();
        assertThat(structuralNode1.getTitle()).isEqualTo("my-title");
        assertThat(structuralNode1.getStyle()).isEqualTo("my-style");
        assertThat(structuralNode1.getLevel()).isEqualTo(2);
        assertThat(structuralNode1.getContentModel()).isEqualTo("my-content-model");
        assertThat(structuralNode1.getSourceLocation()).isNull();
        assertThat(structuralNode1.getSubstitutions()).isNullOrEmpty();
        assertThat(structuralNode1.getBlocks()).isNullOrEmpty();
    }
    // end::generated-code[]
}
