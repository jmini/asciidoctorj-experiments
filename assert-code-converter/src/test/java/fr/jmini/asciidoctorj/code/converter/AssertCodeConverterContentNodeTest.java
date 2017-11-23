package fr.jmini.asciidoctorj.code.converter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.ContentNode;
import org.junit.Test;

public class AssertCodeConverterContentNodeTest {

    @Test
    public void testContentNode() throws Exception {
        ContentNode mockContentNode = mock(ContentNode.class);
        when(mockContentNode.getParent()).thenReturn(null);

        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createContentNodeCode(sb, mockContentNode);
        System.out.println(sb);

        checkAst(mockContentNode);
    }

    // tag::generated-code[]
    public void checkAst(ContentNode astContentNode) {
        ContentNode a1 = astContentNode;
        assertThat(a1).isEqualTo("TODO");
    }
    // end::generated-code[]
}
