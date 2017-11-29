package fr.jmini.eadoc.converter;

import org.asciidoctor.ast.ContentPart;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.eadoc.EContentPart;
import fr.jmini.eadoc.EadocFactory;

public class EadocCodeGeneratorContentPartTest {

    @Test
    public void testContentPart() throws Exception {
        ContentPart eContentPart = createEadoc();

        EadocCodeGenerator generator = new EadocCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createContentPartCode(sb, eContentPart);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public EContentPart createEadoc() {
        EContentPart eContentPart1 = EadocFactory.eINSTANCE.createEContentPart();
        eContentPart1.setId("id");
        eContentPart1.setLevel(3);
        eContentPart1.setContext("ctxt");
        eContentPart1.setStyle("stle");
        eContentPart1.setRole("role");
        eContentPart1.setTitle("some-title");
        eContentPart1.setAttributes(null);
        return eContentPart1;
    }
    // end::generated-code[]
}
