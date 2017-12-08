package fr.jmini.eadoc.converter;

import org.asciidoctor.ast.Cursor;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.eadoc.ECursor;
import fr.jmini.eadoc.EadocFactory;

public class EadocCodeGeneratorCursorTest {

    @Test
    public void testCursor() throws Exception {
        Cursor cursor = createEadoc();

        EadocCodeGenerator generator = new EadocCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createCursorCode(sb, cursor);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public ECursor createEadoc() {
        ECursor eCursor1 = EadocFactory.eINSTANCE.createECursor();
        eCursor1.setLineNumber(234);
        eCursor1.setPath("path");
        eCursor1.setDir("dir");
        eCursor1.setFile("file.txt");
        return eCursor1;
    }
    // end::generated-code[]
}
