package fr.jmini.asciidoctorj.converter.mockcode;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.asciidoctor.ast.PhraseNode;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class MockCodeConverterPhraseNodeTest {

    @Test
    public void testPhraseNode() throws Exception {
        PhraseNode mockPhraseNode = createMock();

        MockCodeConverter converter = new MockCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createPhraseNodeCode(sb, mockPhraseNode);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public PhraseNode createMock() {
        PhraseNode mockPhraseNode1 = mock(PhraseNode.class);
        when(mockPhraseNode1.getId()).thenReturn(null);
        when(mockPhraseNode1.getNodeName()).thenReturn(null);
        when(mockPhraseNode1.getParent()).thenReturn(null);
        when(mockPhraseNode1.getContext()).thenReturn(null);
        when(mockPhraseNode1.getDocument()).thenReturn(null);
        when(mockPhraseNode1.isInline()).thenReturn(false);
        when(mockPhraseNode1.isBlock()).thenReturn(false);
        when(mockPhraseNode1.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockPhraseNode1.getRoles()).thenReturn(Collections.emptyList());
        when(mockPhraseNode1.isReftext()).thenReturn(false);
        when(mockPhraseNode1.getType()).thenReturn("type");
        when(mockPhraseNode1.getText()).thenReturn("text");
        when(mockPhraseNode1.getTarget()).thenReturn("targ");
        return mockPhraseNode1;
    }
    // end::generated-code[]
}
