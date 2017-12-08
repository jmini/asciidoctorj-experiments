package fr.jmini.eadoc.converter;

import java.util.Collections;

import org.asciidoctor.ast.DescriptionList;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.eadoc.EDescriptionList;
import fr.jmini.eadoc.EadocFactory;

public class EadocCodeGeneratorDescriptionListTest {

    @Test
    public void testDescriptionList() throws Exception {
        DescriptionList eDescriptionList = createEadoc();

        EadocCodeGenerator generator = new EadocCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createDescriptionListCode(sb, eDescriptionList);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public EDescriptionList createEadoc() {
        EDescriptionList eDescriptionList1 = EadocFactory.eINSTANCE.createEDescriptionList();
        eDescriptionList1.setId(null);
        eDescriptionList1.setNodeName(null);
        eDescriptionList1.setContext(null);
        eDescriptionList1.setDocument(null);
        eDescriptionList1.setInline(false);
        eDescriptionList1.setBlock(false);
        eDescriptionList1.setAttributes(Collections.emptyMap());
        eDescriptionList1.setRoles(Collections.emptyList());
        eDescriptionList1.setReftext(null);
        eDescriptionList1.setTitle(null);
        eDescriptionList1.setStyle(null);
        eDescriptionList1.setLevel(0);
        eDescriptionList1.setContentModel(null);
        eDescriptionList1.setSourceLocation(null);
        return eDescriptionList1;
    }
    // end::generated-code[]
}
