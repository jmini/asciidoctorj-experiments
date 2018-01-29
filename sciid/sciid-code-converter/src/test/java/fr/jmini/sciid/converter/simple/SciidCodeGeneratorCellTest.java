package fr.jmini.sciid.converter.simple;

import java.util.Collections;

import org.asciidoctor.ast.Cell;
import org.asciidoctor.ast.Table;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.sciid.SCell;
import fr.jmini.sciid.SciidFactory;
import fr.jmini.sciid.converter.SciidCodeGenerator;

public class SciidCodeGeneratorCellTest {

    @Test
    public void testCell() throws Exception {
        Cell cell = createSciidObject();

        SciidCodeGenerator generator = new SciidCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createCellCode(sb, cell);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public SCell createSciidObject() {
        SCell sCell1 = SciidFactory.eINSTANCE.createSCell();
        sCell1.setId("id");
        sCell1.setNodeName("nn");
        sCell1.setParent(null);
        sCell1.setContext("cx");
        sCell1.setDocument(null);
        sCell1.setInline(false);
        sCell1.setBlock(false);
        sCell1.setAttributes(Collections.emptyMap());
        sCell1.setRoles(Collections.emptyList());
        sCell1.setReftext(null);
        sCell1.setColumn(null);
        sCell1.setColspan(1);
        sCell1.setRowspan(2);
        sCell1.setSource("src");
        sCell1.setStyle("stl");
        sCell1.setHorizontalAlignment(Table.HorizontalAlignment.LEFT);
        sCell1.setVerticalAlignment(Table.VerticalAlignment.BOTTOM);
        sCell1.setInnerDocument(null);
        return sCell1;
    }
    // end::generated-code[]
}
