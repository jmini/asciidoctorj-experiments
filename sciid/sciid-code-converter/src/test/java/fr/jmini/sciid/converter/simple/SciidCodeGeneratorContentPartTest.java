package fr.jmini.sciid.converter.simple;

import org.asciidoctor.ast.ContentPart;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.sciid.SContentPart;
import fr.jmini.sciid.SciidFactory;
import fr.jmini.sciid.converter.SciidCodeGenerator;

public class SciidCodeGeneratorContentPartTest {

    @Test
    public void testContentPart() throws Exception {
        ContentPart contentPart = createSciidObject();

        SciidCodeGenerator generator = new SciidCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createContentPartCode(sb, contentPart);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public SContentPart createSciidObject() {
        SContentPart sContentPart1 = SciidFactory.eINSTANCE.createSContentPart();
        sContentPart1.setId("id");
        sContentPart1.setLevel(3);
        sContentPart1.setContext("ctxt");
        sContentPart1.setStyle("stle");
        sContentPart1.setRole("role");
        sContentPart1.setTitle("some-title");
        sContentPart1.setAttributes(null);
        return sContentPart1;
    }
    // end::generated-code[]
}
