package fr.jmini.asciidoctorj.converter.mockcode;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.asciidoctor.ast.ContentNode;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class MockCodeGeneratorContentNodeTest {

    @Test
    public void testContentNode() throws Exception {
        ContentNode mockContentNode = createMock();

        MockCodeGenerator generator = new MockCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createContentNodeCode(sb, mockContentNode);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public ContentNode createMock() {
        ContentNode mockContentNode1 = mock(ContentNode.class);
        when(mockContentNode1.getId()).thenReturn("id");
        when(mockContentNode1.getNodeName()).thenReturn("node-name");
        when(mockContentNode1.getParent()).thenReturn(null);
        when(mockContentNode1.getContext()).thenReturn("context");
        when(mockContentNode1.getDocument()).thenReturn(null);
        when(mockContentNode1.getAttributes()).thenReturn(Collections.singletonMap("attr-key", "same-value"));
        when(mockContentNode1.getRoles()).thenReturn(Collections.singletonList("some-role"));
        when(mockContentNode1.isReftext()).thenReturn(false);
        return mockContentNode1;
    }
    // end::generated-code[]
}
