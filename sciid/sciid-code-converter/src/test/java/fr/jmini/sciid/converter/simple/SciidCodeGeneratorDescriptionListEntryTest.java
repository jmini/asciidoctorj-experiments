package fr.jmini.sciid.converter.simple;

import org.asciidoctor.ast.DescriptionListEntry;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.sciid.SDescriptionListEntry;
import fr.jmini.sciid.SciidFactory;
import fr.jmini.sciid.converter.SciidCodeGenerator;

public class SciidCodeGeneratorDescriptionListEntryTest {

    @Test
    public void testDescriptionListEntry() throws Exception {
        DescriptionListEntry descriptionListEntry = createSciidObject();

        SciidCodeGenerator generator = new SciidCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createDescriptionListEntryCode(sb, descriptionListEntry);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public SDescriptionListEntry createSciidObject() {
        SDescriptionListEntry sDescriptionListEntry1 = SciidFactory.eINSTANCE.createSDescriptionListEntry();
        sDescriptionListEntry1.setDescription(null);
        return sDescriptionListEntry1;
    }
    // end::generated-code[]
}