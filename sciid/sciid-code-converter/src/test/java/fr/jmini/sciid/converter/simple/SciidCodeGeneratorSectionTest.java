package fr.jmini.sciid.converter.simple;

import java.util.Collections;

import org.asciidoctor.ast.Section;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.sciid.SSection;
import fr.jmini.sciid.SciidFactory;
import fr.jmini.sciid.converter.SciidCodeGenerator;

public class SciidCodeGeneratorSectionTest {

    @Test
    public void testSection() throws Exception {
        Section section = createSciidObject();

        SciidCodeGenerator generator = new SciidCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createSectionCode(sb, section);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public SSection createSciidObject() {
        SSection sSection1 = SciidFactory.eINSTANCE.createSSection();
        sSection1.setId(null);
        sSection1.setNodeName(null);
        sSection1.setContext(null);
        sSection1.setDocument(null);
        sSection1.setInline(false);
        sSection1.setBlock(false);
        sSection1.setAttributes(Collections.emptyMap());
        sSection1.setRoles(Collections.emptyList());
        sSection1.setReftext(null);
        sSection1.setCaption(null);
        sSection1.setTitle(null);
        sSection1.setStyle(null);
        sSection1.setLevel(0);
        sSection1.setContentModel(null);
        sSection1.setSourceLocation(null);
        sSection1.setIndex(2);
        sSection1.setNumber(10);
        sSection1.setSectionName("nnn");
        sSection1.setSpecial(false);
        sSection1.setNumbered(true);
        return sSection1;
    }
    // end::generated-code[]
}
