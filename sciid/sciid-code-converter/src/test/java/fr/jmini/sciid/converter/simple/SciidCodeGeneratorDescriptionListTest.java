package fr.jmini.sciid.converter.simple;

import java.util.Collections;

import org.asciidoctor.ast.DescriptionList;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.sciid.SDescriptionList;
import fr.jmini.sciid.SciidFactory;
import fr.jmini.sciid.converter.SciidCodeGenerator;

public class SciidCodeGeneratorDescriptionListTest {

    @Test
    public void testDescriptionList() throws Exception {
        DescriptionList descriptionList = createSciidObject();

        SciidCodeGenerator generator = new SciidCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createDescriptionListCode(sb, descriptionList);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public SDescriptionList createSciidObject() {
        SDescriptionList sDescriptionList1 = SciidFactory.eINSTANCE.createSDescriptionList();
        sDescriptionList1.setId(null);
        sDescriptionList1.setNodeName(null);
        sDescriptionList1.setContext(null);
        sDescriptionList1.setDocument(null);
        sDescriptionList1.setInline(false);
        sDescriptionList1.setBlock(false);
        sDescriptionList1.setAttributes(Collections.emptyMap());
        sDescriptionList1.setRoles(Collections.emptyList());
        sDescriptionList1.setReftext(null);
        sDescriptionList1.setCaption(null);
        sDescriptionList1.setTitle(null);
        sDescriptionList1.setStyle(null);
        sDescriptionList1.setLevel(0);
        sDescriptionList1.setContentModel(null);
        sDescriptionList1.setSourceLocation(null);
        return sDescriptionList1;
    }
    // end::generated-code[]
}
