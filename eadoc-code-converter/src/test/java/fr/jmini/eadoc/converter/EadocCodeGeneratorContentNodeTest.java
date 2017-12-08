package fr.jmini.eadoc.converter;

import java.util.Collections;

import org.asciidoctor.ast.ContentNode;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.eadoc.EContentNode;
import fr.jmini.eadoc.EadocFactory;

public class EadocCodeGeneratorContentNodeTest {

    @Test
    public void testContentNode() throws Exception {
        ContentNode eContentNode = createEadoc();

        EadocCodeGenerator generator = new EadocCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createContentNodeCode(sb, eContentNode);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public EContentNode createEadoc() {
        EContentNode eContentNode1 = EadocFactory.eINSTANCE.createEContentNode();
        eContentNode1.setId("id");
        eContentNode1.setNodeName("node-name");
        eContentNode1.setParent(null);
        eContentNode1.setContext("context");
        eContentNode1.setDocument(null);
        eContentNode1.setInline(false);
        eContentNode1.setBlock(false);
        eContentNode1.setAttributes(Collections.singletonMap("attr-key", "same-value"));
        eContentNode1.setRoles(Collections.singletonList("some-role"));
        eContentNode1.setReftext("some-reftext");
        return eContentNode1;
    }
    // end::generated-code[]
}
