package fr.jmini.sciid.converter.simple;

import org.asciidoctor.ast.DocumentHeader;
import org.junit.Test;

import com.google.common.collect.ImmutableMap;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.sciid.SDocumentHeader;
import fr.jmini.sciid.SciidFactory;
import fr.jmini.sciid.converter.SciidCodeGenerator;

public class SciidCodeGeneratorDocumentHeaderTest {

    @Test
    public void testDocumentHeader() throws Exception {
        DocumentHeader documentHeader = createSciidObject();

        SciidCodeGenerator generator = new SciidCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createDocumentHeaderCode(sb, documentHeader);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public SDocumentHeader createSciidObject() {
        SDocumentHeader sDocumentHeader1 = SciidFactory.eINSTANCE.createSDocumentHeader();
        sDocumentHeader1.setDocumentTitle(null);
        sDocumentHeader1.setPageTitle(null);
        sDocumentHeader1.setRevisionInfo(null);
        sDocumentHeader1.setPageTitle(null);
        ImmutableMap<String, Object> map1 = ImmutableMap.<String, Object>builder()
                .put("one", 1)
                .put("two", 2)
                .build();
        sDocumentHeader1.setAttributes(map1);
        return sDocumentHeader1;
    }
    // end::generated-code[]
}
