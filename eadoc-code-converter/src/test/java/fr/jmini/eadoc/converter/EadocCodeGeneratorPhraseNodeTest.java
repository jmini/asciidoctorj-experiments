package fr.jmini.eadoc.converter;

import java.util.Collections;

import org.asciidoctor.ast.PhraseNode;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.eadoc.EPhraseNode;
import fr.jmini.eadoc.EadocFactory;

public class EadocCodeGeneratorPhraseNodeTest {

    @Test
    public void testPhraseNode() throws Exception {
        PhraseNode ePhraseNode = createEadoc();

        EadocCodeGenerator generator = new EadocCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createPhraseNodeCode(sb, ePhraseNode);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public EPhraseNode createEadoc() {
        EPhraseNode ePhraseNode1 = EadocFactory.eINSTANCE.createEPhraseNode();
        ePhraseNode1.setId(null);
        ePhraseNode1.setNodeName(null);
        ePhraseNode1.setParent(null);
        ePhraseNode1.setContext(null);
        ePhraseNode1.setDocument(null);
        ePhraseNode1.setInline(false);
        ePhraseNode1.setBlock(false);
        ePhraseNode1.setAttributes(Collections.emptyMap());
        ePhraseNode1.setRoles(Collections.emptyList());
        ePhraseNode1.setReftext(null);
        ePhraseNode1.setType("type");
        ePhraseNode1.setText("text");
        ePhraseNode1.setTarget("targ");
        return ePhraseNode1;
    }
    // end::generated-code[]
}
