package fr.jmini.eadoc.converter;

import org.asciidoctor.ast.DescriptionListEntry;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.eadoc.EDescriptionListEntry;
import fr.jmini.eadoc.EadocFactory;

public class EadocCodeGeneratorDescriptionListEntryTest {

    @Test
    public void testDescriptionListEntry() throws Exception {
        DescriptionListEntry eDescriptionListEntry = createEadoc();

        EadocCodeGenerator generator = new EadocCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createDescriptionListEntryCode(sb, eDescriptionListEntry);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public EDescriptionListEntry createEadoc() {
        EDescriptionListEntry eDescriptionListEntry1 = EadocFactory.eINSTANCE.createEDescriptionListEntry();
        eDescriptionListEntry1.setDescription(null);
        return eDescriptionListEntry1;
    }
    // end::generated-code[]
}