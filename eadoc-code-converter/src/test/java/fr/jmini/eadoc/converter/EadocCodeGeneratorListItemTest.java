package fr.jmini.eadoc.converter;

import java.util.Collections;

import org.asciidoctor.ast.ListItem;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.eadoc.EListItem;
import fr.jmini.eadoc.EadocFactory;

public class EadocCodeGeneratorListItemTest {

    @Test
    public void testListItem() throws Exception {
        ListItem eListItem = createEadoc();

        EadocCodeGenerator generator = new EadocCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createListItemCode(sb, eListItem);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public EListItem createEadoc() {
        EListItem eListItem1 = EadocFactory.eINSTANCE.createEListItem();
        eListItem1.setId("id");
        eListItem1.setNodeName("node-name");
        eListItem1.setParent(null);
        eListItem1.setContext(null);
        eListItem1.setDocument(null);
        eListItem1.setAttributes(Collections.emptyMap());
        eListItem1.setRoles(Collections.emptyList());
        eListItem1.setTitle("T");
        eListItem1.setStyle("S");
        eListItem1.setLevel(2);
        eListItem1.setSourceLocation(null);
        eListItem1.setMarker("m");
        eListItem1.setText("t");
        eListItem1.setSource("s");
        return eListItem1;
    }
    // end::generated-code[]
}
