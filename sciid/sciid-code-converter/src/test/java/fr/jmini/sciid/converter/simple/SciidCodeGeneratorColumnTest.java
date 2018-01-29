package fr.jmini.sciid.converter.simple;

import java.util.Arrays;
import java.util.Collections;

import org.asciidoctor.ast.Column;
import org.asciidoctor.ast.Table;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.sciid.SColumn;
import fr.jmini.sciid.SciidFactory;
import fr.jmini.sciid.converter.SciidCodeGenerator;

public class SciidCodeGeneratorColumnTest {

    @Test
    public void testColumn() throws Exception {
        Column column = createSciidObject();

        SciidCodeGenerator generator = new SciidCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createColumnCode(sb, column);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public SColumn createSciidObject() {
        SColumn sColumn1 = SciidFactory.eINSTANCE.createSColumn();
        sColumn1.setId("di");
        sColumn1.setNodeName("emaNedoN");
        sColumn1.setParent(null);
        sColumn1.setContext("txetnoC");
        sColumn1.setDocument(null);
        sColumn1.setInline(false);
        sColumn1.setBlock(false);
        sColumn1.setAttributes(Collections.emptyMap());
        sColumn1.setRoles(Arrays.asList("r1", "r2", "r3"));
        sColumn1.setReftext(null);
        sColumn1.setStyle("STYLE");
        sColumn1.setTable(null);
        sColumn1.setWidth(550);
        sColumn1.setHorizontalAlignment(Table.HorizontalAlignment.CENTER);
        sColumn1.setVerticalAlignment(Table.VerticalAlignment.MIDDLE);
        return sColumn1;
    }
    // end::generated-code[]
}
