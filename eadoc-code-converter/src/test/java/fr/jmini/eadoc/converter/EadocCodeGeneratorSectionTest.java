package fr.jmini.eadoc.converter;

import java.util.Collections;

import org.asciidoctor.ast.Section;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.eadoc.ESection;
import fr.jmini.eadoc.EadocFactory;

public class EadocCodeGeneratorSectionTest {

    @Test
    public void testSection() throws Exception {
        Section eSection = createEadoc();

        EadocCodeGenerator generator = new EadocCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createSectionCode(sb, eSection);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public ESection createEadoc() {
        ESection eSection1 = EadocFactory.eINSTANCE.createESection();
        eSection1.setId(null);
        eSection1.setNodeName(null);
        eSection1.setContext(null);
        eSection1.setDocument(null);
        eSection1.setInline(false);
        eSection1.setBlock(false);
        eSection1.setAttributes(Collections.emptyMap());
        eSection1.setRoles(Collections.emptyList());
        eSection1.setReftext(null);
        eSection1.setTitle(null);
        eSection1.setStyle(null);
        eSection1.setLevel(0);
        eSection1.setContentModel(null);
        eSection1.setSourceLocation(null);
        eSection1.setIndex(2);
        eSection1.setNumber(10);
        eSection1.setSectionName("nnn");
        eSection1.setSpecial(false);
        eSection1.setNumbered(true);
        return eSection1;
    }
    // end::generated-code[]
}
