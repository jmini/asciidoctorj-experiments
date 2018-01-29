package fr.jmini.sciid.converter.simple;

import java.util.Collections;

import org.asciidoctor.ast.List;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.sciid.SList;
import fr.jmini.sciid.SciidFactory;
import fr.jmini.sciid.converter.SciidCodeGenerator;

public class SciidCodeGeneratorListTest {

    @Test
    public void testList() throws Exception {
        List list = createSciidObject();

        SciidCodeGenerator generator = new SciidCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createListCode(sb, list);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public SList createSciidObject() {
        SList sList1 = SciidFactory.eINSTANCE.createSList();
        sList1.setId("some-id");
        sList1.setNodeName("some-node-name");
        sList1.setContext("some-context");
        sList1.setDocument(null);
        sList1.setInline(false);
        sList1.setBlock(false);
        sList1.setAttributes(Collections.singletonMap("one", "a"));
        sList1.setRoles(Collections.emptyList());
        sList1.setReftext(null);
        sList1.setCaption(null);
        sList1.setTitle(null);
        sList1.setStyle(null);
        sList1.setLevel(0);
        sList1.setContentModel(null);
        sList1.setSourceLocation(null);
        return sList1;
    }
    // end::generated-code[]
}
