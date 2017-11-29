package fr.jmini.eadoc.converter;

import org.asciidoctor.ast.Title;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.eadoc.ETitle;
import fr.jmini.eadoc.EadocFactory;

public class EadocCodeGeneratorTitleTest {

  @Test
  public void testTitle() throws Exception {
    Title eTitle = createEadoc();

    EadocCodeGenerator generator = new EadocCodeGenerator();
    StringBuilder sb = new StringBuilder();
    generator.createTitleCode(sb, eTitle);
    CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
  }

  // tag::generated-code[]
  public ETitle createEadoc() {
    ETitle eTitle1 = EadocFactory.eINSTANCE.createETitle();
    eTitle1.setMain("main");
    eTitle1.setSubtitle("subt");
    eTitle1.setCombined("comb");
    eTitle1.setSanitized(true);
    return eTitle1;
  }
  // end::generated-code[]
}
