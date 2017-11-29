package fr.jmini.eadoc.converter;

import java.util.Collections;

import org.asciidoctor.ast.StructuralNode;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.eadoc.EStructuralNode;
import fr.jmini.eadoc.EadocFactory;

public class EadocCodeGeneratorStructuralNodeTest {

    @Test
    public void testStructuralNode() throws Exception {
        StructuralNode eStructuralNode = createEadoc();

        EadocCodeGenerator generator = new EadocCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createStructuralNodeCode(sb, eStructuralNode);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public EStructuralNode createEadoc() {
        EStructuralNode eStructuralNode1 = EadocFactory.eINSTANCE.createEStructuralNode();
        eStructuralNode1.setId("my-id");
        eStructuralNode1.setNodeName(null);
        eStructuralNode1.setParent(null);
        eStructuralNode1.setContext("context");
        eStructuralNode1.setDocument(null);
        eStructuralNode1.setAttributes(Collections.emptyMap());
        eStructuralNode1.setRoles(Collections.emptyList());
        eStructuralNode1.setTitle("my-title");
        eStructuralNode1.setStyle("my-style");
        eStructuralNode1.setLevel(2);
        eStructuralNode1.setSourceLocation(null);
        return eStructuralNode1;
    }
    // end::generated-code[]
}
