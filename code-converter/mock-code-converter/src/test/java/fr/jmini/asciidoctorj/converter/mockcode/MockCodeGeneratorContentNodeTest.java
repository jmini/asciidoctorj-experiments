package fr.jmini.asciidoctorj.converter.mockcode;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

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
        when(mockContentNode1.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockContentNode1.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map1 = new HashMap<>();
        map1.put("attr-key", "same-value");
        when(mockContentNode1.getAttributes()).thenReturn(map1);
        when(mockContentNode1.getRoles()).thenReturn(Collections.singletonList("some-role"));
        when(mockContentNode1.isReftext()).thenReturn(true);
        when(mockContentNode1.getReftext()).thenReturn("bla");
        return mockContentNode1;
    }
    // end::generated-code[]
}
