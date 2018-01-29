package fr.jmini.sciid.converter.simple;

import org.asciidoctor.ast.Row;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.sciid.SRow;
import fr.jmini.sciid.SciidFactory;
import fr.jmini.sciid.converter.SciidCodeGenerator;

public class SciidCodeGeneratorRowTest {

    @Test
    public void testRow() throws Exception {
        Row row = createSciidObject();

        SciidCodeGenerator generator = new SciidCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createRowCode(sb, row);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public SRow createSciidObject() {
        SRow sRow1 = SciidFactory.eINSTANCE.createSRow();
        return sRow1;
    }
    // end::generated-code[]
}
