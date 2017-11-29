package fr.jmini.eadoc.converter;

import org.asciidoctor.ast.DocumentHeader;
import org.junit.Test;

import com.google.common.collect.ImmutableMap;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.eadoc.EDocumentHeader;
import fr.jmini.eadoc.EadocFactory;

public class EadocCodeGeneratorDocumentHeaderTest {

    @Test
    public void testDocumentHeader() throws Exception {
        DocumentHeader eDocumentHeader = createEadoc();

        EadocCodeGenerator generator = new EadocCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createDocumentHeaderCode(sb, eDocumentHeader);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public EDocumentHeader createEadoc() {
        EDocumentHeader eDocumentHeader1 = EadocFactory.eINSTANCE.createEDocumentHeader();
        eDocumentHeader1.setDocumentTitle(null);
        eDocumentHeader1.setPageTitle(null);
        eDocumentHeader1.setRevisionInfo(null);
        eDocumentHeader1.setPageTitle(null);
        ImmutableMap<String, Object> map1 = ImmutableMap.<String, Object>builder()
                .put("one", 1)
                .put("two", 2)
                .build();
        eDocumentHeader1.setAttributes(map1);
        return eDocumentHeader1;
    }
    // end::generated-code[]
}
