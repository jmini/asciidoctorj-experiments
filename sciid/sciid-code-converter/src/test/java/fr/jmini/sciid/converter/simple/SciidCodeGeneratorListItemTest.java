package fr.jmini.sciid.converter.simple;

import java.util.Collections;

import org.asciidoctor.ast.ListItem;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.sciid.SListItem;
import fr.jmini.sciid.SciidFactory;
import fr.jmini.sciid.converter.SciidCodeGenerator;

public class SciidCodeGeneratorListItemTest {

    @Test
    public void testListItem() throws Exception {
        ListItem listItem = createSciidObject();

        SciidCodeGenerator generator = new SciidCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createListItemCode(sb, listItem);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public SListItem createSciidObject() {
        SListItem sListItem1 = SciidFactory.eINSTANCE.createSListItem();
        sListItem1.setId("id");
        sListItem1.setNodeName("node-name");
        sListItem1.setParent(null);
        sListItem1.setContext(null);
        sListItem1.setDocument(null);
        sListItem1.setInline(false);
        sListItem1.setBlock(false);
        sListItem1.setAttributes(Collections.emptyMap());
        sListItem1.setRoles(Collections.emptyList());
        sListItem1.setReftext(null);
        sListItem1.setCaption("C");
        sListItem1.setTitle("T");
        sListItem1.setStyle("S");
        sListItem1.setLevel(2);
        sListItem1.setContentModel(null);
        sListItem1.setSourceLocation(null);
        sListItem1.setMarker("m");
        sListItem1.setText("t");
        sListItem1.setSource("s");
        return sListItem1;
    }
    // end::generated-code[]
}
