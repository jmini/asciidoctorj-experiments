package fr.jmini.sciid.converter.simple;

import java.util.Collections;

import org.asciidoctor.ast.ContentNode;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.sciid.SContentNode;
import fr.jmini.sciid.SciidFactory;
import fr.jmini.sciid.converter.SciidCodeGenerator;

public class SciidCodeGeneratorContentNodeTest {

    @Test
    public void testContentNode() throws Exception {
        ContentNode contentNode = createSciidObject();

        SciidCodeGenerator generator = new SciidCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createContentNodeCode(sb, contentNode);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public SContentNode createSciidObject() {
        SContentNode sContentNode1 = SciidFactory.eINSTANCE.createSContentNode();
        sContentNode1.setId("id");
        sContentNode1.setNodeName("node-name");
        sContentNode1.setParent(null);
        sContentNode1.setContext("context");
        sContentNode1.setDocument(null);
        sContentNode1.setInline(false);
        sContentNode1.setBlock(false);
        sContentNode1.setAttributes(Collections.singletonMap("attr-key", "same-value"));
        sContentNode1.setRoles(Collections.singletonList("some-role"));
        sContentNode1.setReftext("some-reftext");
        return sContentNode1;
    }
    // end::generated-code[]
}
