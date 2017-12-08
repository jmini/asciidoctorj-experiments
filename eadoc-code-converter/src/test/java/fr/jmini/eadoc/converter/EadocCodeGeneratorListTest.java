package fr.jmini.eadoc.converter;

import java.util.Collections;

import org.asciidoctor.ast.List;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.eadoc.EAdocList;
import fr.jmini.eadoc.EadocFactory;

public class EadocCodeGeneratorListTest {

    @Test
    public void testList() throws Exception {
        List eList = createEadoc();

        EadocCodeGenerator generator = new EadocCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createListCode(sb, eList);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public EAdocList createEadoc() {
        EAdocList eList1 = EadocFactory.eINSTANCE.createEAdocList();
        eList1.setId("some-id");
        eList1.setNodeName("some-node-name");
        eList1.setContext("some-context");
        eList1.setDocument(null);
        eList1.setInline(false);
        eList1.setBlock(false);
        eList1.setAttributes(Collections.singletonMap("one", "a"));
        eList1.setRoles(Collections.emptyList());
        eList1.setReftext(null);
        eList1.setTitle(null);
        eList1.setStyle(null);
        eList1.setLevel(0);
        eList1.setContentModel(null);
        eList1.setSourceLocation(null);
        return eList1;
    }
    // end::generated-code[]
}
