package fr.jmini.sciid.converter.simple;

import org.asciidoctor.ast.Author;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.sciid.SAuthor;
import fr.jmini.sciid.SciidFactory;
import fr.jmini.sciid.converter.SciidCodeGenerator;

public class SciidCodeGeneratorAuthorTest {

    @Test
    public void testAuthor() throws Exception {
        Author author = createSciidObject();

        SciidCodeGenerator generator = new SciidCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createAuthorCode(sb, author);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public SAuthor createSciidObject() {
        SAuthor sAuthor1 = SciidFactory.eINSTANCE.createSAuthor();
        sAuthor1.setEmail("doc.writer@asciidoc.org");
        sAuthor1.setFullName("Doc Writer");
        sAuthor1.setFirstName("Doc");
        sAuthor1.setLastName("Writer");
        sAuthor1.setMiddleName(null);
        sAuthor1.setInitials("DW");
        return sAuthor1;
    }
    // end::generated-code[]
}
