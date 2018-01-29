package fr.jmini.sciid.converter.simple;

import java.util.Collections;

import org.asciidoctor.ast.StructuralNode;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.sciid.SStructuralNode;
import fr.jmini.sciid.SciidFactory;
import fr.jmini.sciid.converter.SciidCodeGenerator;

public class SciidCodeGeneratorStructuralNodeTest {

    @Test
    public void testStructuralNode() throws Exception {
        StructuralNode structuralNode = createSciidObject();

        SciidCodeGenerator generator = new SciidCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createStructuralNodeCode(sb, structuralNode);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public SStructuralNode createSciidObject() {
        SStructuralNode sStructuralNode1 = SciidFactory.eINSTANCE.createSStructuralNode();
        sStructuralNode1.setId("my-id");
        sStructuralNode1.setNodeName(null);
        sStructuralNode1.setParent(null);
        sStructuralNode1.setContext("context");
        sStructuralNode1.setDocument(null);
        sStructuralNode1.setInline(false);
        sStructuralNode1.setBlock(false);
        sStructuralNode1.setAttributes(Collections.emptyMap());
        sStructuralNode1.setRoles(Collections.emptyList());
        sStructuralNode1.setReftext(null);
        sStructuralNode1.setCaption("my-caption");
        sStructuralNode1.setTitle("my-title");
        sStructuralNode1.setStyle("my-style");
        sStructuralNode1.setLevel(2);
        sStructuralNode1.setContentModel("simple");
        sStructuralNode1.setSourceLocation(null);
        return sStructuralNode1;
    }
    // end::generated-code[]
}
