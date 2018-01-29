package fr.jmini.sciid.converter.simple;

import org.asciidoctor.ast.StructuredDocument;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.sciid.SStructuredDocument;
import fr.jmini.sciid.SciidFactory;
import fr.jmini.sciid.converter.SciidCodeGenerator;

public class SciidCodeGeneratorStructuredDocumentTest {

    @Test
    public void testStructuredDocument() throws Exception {
        StructuredDocument structuredDocument = createSciidObject();

        SciidCodeGenerator generator = new SciidCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createStructuredDocumentCode(sb, structuredDocument);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public SStructuredDocument createSciidObject() {
        SStructuredDocument sStructuredDocument1 = SciidFactory.eINSTANCE.createSStructuredDocument();
        sStructuredDocument1.setHeader(null);
        return sStructuredDocument1;
    }
    // end::generated-code[]
}
