package fr.jmini.asciidoctorj.code.converter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.PhraseNode;
import org.junit.Test;

public class AssertCodeConverterPhraseNodeTest {

    @Test
    public void testPhraseNode() throws Exception {
        PhraseNode mockPhraseNode = mock(PhraseNode.class);
        when(mockPhraseNode.getType()).thenReturn("type");
        when(mockPhraseNode.getText()).thenReturn("text");
        when(mockPhraseNode.getTarget()).thenReturn("targ");

        // TODO replace System.out.println with a check:
        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createPhraseNodeCode(sb, mockPhraseNode);
        System.out.println(sb);

        checkAst(mockPhraseNode);
    }

    // tag::generated-code[]
    public void checkAst(PhraseNode astPhraseNode) {
        PhraseNode n1 = astPhraseNode;
        assertThat(n1.getId()).isNull();
        assertThat(n1.getNodeName()).isNull();
        assertThat(n1.getParent()).isNull();
        assertThat(n1.getContext()).isNull();
        assertThat(n1.getDocument()).isNull();
        assertThat(n1.isInline()).isFalse();
        assertThat(n1.isBlock()).isFalse();
        assertThat(n1.getAttributes()).isEmpty();
        assertThat(n1.getRoles()).isEmpty();
        assertThat(n1.isReftext()).isFalse();
        assertThat(n1.getType()).isEqualTo("type");
        assertThat(n1.getText()).isEqualTo("text");
        assertThat(n1.getTarget()).isEqualTo("targ");
    }

    // end::generated-code[]
}
