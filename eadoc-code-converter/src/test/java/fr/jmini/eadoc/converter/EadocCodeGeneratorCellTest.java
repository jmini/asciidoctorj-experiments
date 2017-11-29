package fr.jmini.eadoc.converter;

import java.util.Collections;

import org.asciidoctor.ast.Cell;
import org.asciidoctor.ast.Table;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.eadoc.ECell;
import fr.jmini.eadoc.EadocFactory;

public class EadocCodeGeneratorCellTest {

    @Test
    public void testCell() throws Exception {
        Cell eCell = createEadoc();

        EadocCodeGenerator generator = new EadocCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createCellCode(sb, eCell);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public ECell createEadoc() {
        ECell eCell1 = EadocFactory.eINSTANCE.createECell();
        eCell1.setId("id");
        eCell1.setNodeName("nn");
        eCell1.setParent(null);
        eCell1.setContext("cx");
        eCell1.setDocument(null);
        eCell1.setAttributes(Collections.emptyMap());
        eCell1.setRoles(Collections.emptyList());
        eCell1.setColumn(null);
        eCell1.setColspan(1);
        eCell1.setRowspan(2);
        eCell1.setSource("src");
        eCell1.setStyle("stl");
        eCell1.setHorizontalAlignment(Table.HorizontalAlignment.LEFT);
        eCell1.setVerticalAlignment(Table.VerticalAlignment.BOTTOM);
        eCell1.setInnerDocument(null);
        return eCell1;
    }
    // end::generated-code[]
}
