package fr.jmini.asciidoctorj.converter.assertcode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.PhraseNode;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class AssertCodeGeneratorPhraseNodeTest {

    @Test
    public void testPhraseNode() throws Exception {
        PhraseNode mockPhraseNode = mock(PhraseNode.class);
        when(mockPhraseNode.getType()).thenReturn("type");
        when(mockPhraseNode.getText()).thenReturn("text");
        when(mockPhraseNode.getTarget()).thenReturn("targ");

        AssertCodeGenerator generator = new AssertCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createPhraseNodeCode(sb, mockPhraseNode);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());

        checkAst(mockPhraseNode);
    }

    // tag::generated-code[]
    public void checkAst(PhraseNode astPhraseNode) {
        PhraseNode phraseNode1 = astPhraseNode;
        assertThat(phraseNode1.getId()).isNull();
        assertThat(phraseNode1.getNodeName()).isNull();
        assertThat(phraseNode1.getParent()).isNull();
        assertThat(phraseNode1.getContext()).isNull();
        assertThat(phraseNode1.getDocument()).isNull();
        assertThat(phraseNode1.isInline()).isFalse();
        assertThat(phraseNode1.isBlock()).isFalse();
        assertThat(phraseNode1.getAttributes()).isEmpty();
        assertThat(phraseNode1.getRoles()).isEmpty();
        assertThat(phraseNode1.isReftext()).isFalse();
        assertThat(phraseNode1.getType()).isEqualTo("type");
        assertThat(phraseNode1.getText()).isEqualTo("text");
        assertThat(phraseNode1.getTarget()).isEqualTo("targ");
    }
    // end::generated-code[]
}
