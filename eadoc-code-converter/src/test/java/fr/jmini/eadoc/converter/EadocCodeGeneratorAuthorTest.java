package fr.jmini.eadoc.converter;

import org.asciidoctor.ast.Author;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.eadoc.EAuthor;
import fr.jmini.eadoc.EadocFactory;

public class EadocCodeGeneratorAuthorTest {

  @Test
  public void testAuthor() throws Exception {
    Author eAuthor = createEadoc();

    EadocCodeGenerator generator = new EadocCodeGenerator();
    StringBuilder sb = new StringBuilder();
    generator.createAuthorCode(sb, eAuthor);
    CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
  }

  // tag::generated-code[]
  public EAuthor createEadoc() {
    EAuthor eAuthor1 = EadocFactory.eINSTANCE.createEAuthor();
    eAuthor1.setEmail("doc.writer@asciidoc.org");
    eAuthor1.setFullName("Doc Writer");
    eAuthor1.setFirstName("Doc");
    eAuthor1.setLastName("Writer");
    eAuthor1.setMiddleName(null);
    eAuthor1.setInitials("DW");
    return eAuthor1;
  }
  // end::generated-code[]
}
