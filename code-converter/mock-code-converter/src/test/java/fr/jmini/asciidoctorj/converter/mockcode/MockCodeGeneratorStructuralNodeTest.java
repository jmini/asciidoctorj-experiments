package fr.jmini.asciidoctorj.converter.mockcode;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.asciidoctor.ast.StructuralNode;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class MockCodeGeneratorStructuralNodeTest {

    @Test
    public void testStructuralNode() throws Exception {
        StructuralNode mockStructuralNode = createMock();

        MockCodeGenerator generator = new MockCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createStructuralNodeCode(sb, mockStructuralNode);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public StructuralNode createMock() {
        StructuralNode mockStructuralNode1 = mock(StructuralNode.class);
        when(mockStructuralNode1.getId()).thenReturn("my-id");
        when(mockStructuralNode1.getNodeName()).thenReturn(null);
        when(mockStructuralNode1.getParent()).thenReturn(null);
        when(mockStructuralNode1.getContext()).thenReturn("context");
        when(mockStructuralNode1.getDocument()).thenReturn(null);
        when(mockStructuralNode1.isInline()).thenReturn(false);
        when(mockStructuralNode1.isBlock()).thenReturn(false);
        when(mockStructuralNode1.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockStructuralNode1.getRoles()).thenReturn(Collections.emptyList());
        when(mockStructuralNode1.isReftext()).thenReturn(false);
        when(mockStructuralNode1.getReftext()).thenReturn(null);
        when(mockStructuralNode1.getTitle()).thenReturn("my-title");
        when(mockStructuralNode1.getStyle()).thenReturn("my-style");
        when(mockStructuralNode1.getLevel()).thenReturn(2);
        when(mockStructuralNode1.getContentModel()).thenReturn("my-content-model");
        when(mockStructuralNode1.getSourceLocation()).thenReturn(null);
        when(mockStructuralNode1.getSubstitutions()).thenReturn(Collections.emptyList());
        when(mockStructuralNode1.getBlocks()).thenReturn(Collections.emptyList());
        return mockStructuralNode1;
    }
    // end::generated-code[]
}
