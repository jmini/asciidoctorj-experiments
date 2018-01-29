package fr.jmini.sciid.converter.simple;

import org.asciidoctor.ast.Cursor;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.sciid.SCursor;
import fr.jmini.sciid.SciidFactory;
import fr.jmini.sciid.converter.SciidCodeGenerator;

public class SciidCodeGeneratorCursorTest {

    @Test
    public void testCursor() throws Exception {
        Cursor cursor = createSciidObject();

        SciidCodeGenerator generator = new SciidCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createCursorCode(sb, cursor);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public SCursor createSciidObject() {
        SCursor sCursor1 = SciidFactory.eINSTANCE.createSCursor();
        sCursor1.setLineNumber(234);
        sCursor1.setPath("path");
        sCursor1.setDir("dir");
        sCursor1.setFile("file.txt");
        return sCursor1;
    }
    // end::generated-code[]
}
