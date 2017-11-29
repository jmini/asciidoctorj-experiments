package fr.jmini.eadoc.converter;

import org.asciidoctor.ast.Row;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.eadoc.ERow;
import fr.jmini.eadoc.EadocFactory;

public class EadocCodeGeneratorRowTest {

    @Test
    public void testRow() throws Exception {
        Row eRow = createEadoc();

        EadocCodeGenerator generator = new EadocCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createRowCode(sb, eRow);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public ERow createEadoc() {
        ERow eRow1 = EadocFactory.eINSTANCE.createERow();
        return eRow1;
    }
    // end::generated-code[]
}
