package fr.jmini.eadoc.converter;

import java.util.Arrays;
import java.util.Collections;

import org.asciidoctor.ast.Column;
import org.asciidoctor.ast.Table;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.eadoc.EColumn;
import fr.jmini.eadoc.EadocFactory;

public class EadocCodeGeneratorColumnTest {

    @Test
    public void testColumn() throws Exception {
        Column eColumn = createEadoc();

        EadocCodeGenerator generator = new EadocCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createColumnCode(sb, eColumn);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public EColumn createEadoc() {
        EColumn eColumn1 = EadocFactory.eINSTANCE.createEColumn();
        eColumn1.setId("di");
        eColumn1.setNodeName("emaNedoN");
        eColumn1.setParent(null);
        eColumn1.setContext("txetnoC");
        eColumn1.setDocument(null);
        eColumn1.setAttributes(Collections.emptyMap());
        eColumn1.setRoles(Arrays.asList("r1", "r2", "r3"));
        eColumn1.setStyle("STYLE");
        eColumn1.setTable(null);
        eColumn1.setWidth(550);
        eColumn1.setHorizontalAlignment(Table.HorizontalAlignment.CENTER);
        eColumn1.setVerticalAlignment(Table.VerticalAlignment.MIDDLE);
        return eColumn1;
    }
    // end::generated-code[]
}
