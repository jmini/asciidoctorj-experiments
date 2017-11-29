package fr.jmini.eadoc.converter;

import org.asciidoctor.ast.StructuredDocument;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.eadoc.EStructuredDocument;
import fr.jmini.eadoc.EadocFactory;

public class EadocCodeGeneratorStructuredDocumentTest {

    @Test
    public void testStructuredDocument() throws Exception {
        StructuredDocument eStructuredDocument = createEadoc();

        EadocCodeGenerator generator = new EadocCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createStructuredDocumentCode(sb, eStructuredDocument);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public EStructuredDocument createEadoc() {
        EStructuredDocument eStructuredDocument1 = EadocFactory.eINSTANCE.createEStructuredDocument();
        eStructuredDocument1.setHeader(null);
        return eStructuredDocument1;
    }
    // end::generated-code[]
}
