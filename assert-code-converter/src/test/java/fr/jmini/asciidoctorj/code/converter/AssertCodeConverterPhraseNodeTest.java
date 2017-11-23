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
        when(mockPhraseNode.getParent()).thenReturn(null);

        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createPhraseNodeCode(sb, mockPhraseNode);
        System.out.println(sb);

        checkAst(mockPhraseNode);
    }

    // tag::generated-code[]
    public void checkAst(PhraseNode astPhraseNode) {
        PhraseNode a1 = astPhraseNode;
        assertThat(a1).isEqualTo("TODO");
    }
    // end::generated-code[]
}
