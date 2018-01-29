package fr.jmini.sciid.converter.simple;

import java.util.Collections;

import org.asciidoctor.ast.Table;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.sciid.STable;
import fr.jmini.sciid.SciidFactory;
import fr.jmini.sciid.converter.SciidCodeGenerator;

public class SciidCodeGeneratorTableTest {

    @Test
    public void testTable() throws Exception {
        Table table = createSciidObject();

        SciidCodeGenerator generator = new SciidCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createTableCode(sb, table);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public STable createSciidObject() {
        STable sTable1 = SciidFactory.eINSTANCE.createSTable();
        sTable1.setId("id");
        sTable1.setNodeName("nn");
        sTable1.setContext("ctx");
        sTable1.setDocument(null);
        sTable1.setInline(false);
        sTable1.setBlock(false);
        sTable1.setAttributes(Collections.emptyMap());
        sTable1.setRoles(Collections.emptyList());
        sTable1.setReftext(null);
        sTable1.setCaption(null);
        sTable1.setTitle(null);
        sTable1.setStyle(null);
        sTable1.setLevel(0);
        sTable1.setContentModel(null);
        sTable1.setSourceLocation(null);
        sTable1.setHeaderOption(true);
        sTable1.setFrame("my-frame");
        sTable1.setGrid("my-grid");
        return sTable1;
    }
    // end::generated-code[]
}
