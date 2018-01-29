package fr.jmini.sciid.converter.simple;

import java.util.Collections;

import org.asciidoctor.ast.PhraseNode;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.sciid.SPhraseNode;
import fr.jmini.sciid.SciidFactory;
import fr.jmini.sciid.converter.SciidCodeGenerator;

public class SciidCodeGeneratorPhraseNodeTest {

    @Test
    public void testPhraseNode() throws Exception {
        PhraseNode phraseNode = createSciidObject();

        SciidCodeGenerator generator = new SciidCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createPhraseNodeCode(sb, phraseNode);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public SPhraseNode createSciidObject() {
        SPhraseNode sPhraseNode1 = SciidFactory.eINSTANCE.createSPhraseNode();
        sPhraseNode1.setId(null);
        sPhraseNode1.setNodeName(null);
        sPhraseNode1.setParent(null);
        sPhraseNode1.setContext(null);
        sPhraseNode1.setDocument(null);
        sPhraseNode1.setInline(false);
        sPhraseNode1.setBlock(false);
        sPhraseNode1.setAttributes(Collections.emptyMap());
        sPhraseNode1.setRoles(Collections.emptyList());
        sPhraseNode1.setReftext(null);
        sPhraseNode1.setType("type");
        sPhraseNode1.setText("text");
        sPhraseNode1.setTarget("targ");
        return sPhraseNode1;
    }
    // end::generated-code[]
}
