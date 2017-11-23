package fr.jmini.asciidoctorj.code.converter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.StructuralNode;
import org.junit.Test;

public class AssertCodeConverterStructuralNodeTest {

    @Test
    public void testStructuralNode() throws Exception {
        StructuralNode mockStructuralNode = mock(StructuralNode.class);
        when(mockStructuralNode.getParent()).thenReturn(null);

        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createStructuralNodeCode(sb, mockStructuralNode);
        System.out.println(sb);

        checkAst(mockStructuralNode);
    }

    // tag::generated-code[]
    public void checkAst(StructuralNode astStructuralNode) {
        StructuralNode a1 = astStructuralNode;
        assertThat(a1).isEqualTo("TODO");
    }
    // end::generated-code[]
}
