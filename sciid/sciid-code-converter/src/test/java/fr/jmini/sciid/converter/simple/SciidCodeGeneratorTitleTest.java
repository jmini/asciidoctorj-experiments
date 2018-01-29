package fr.jmini.sciid.converter.simple;

import org.asciidoctor.ast.Title;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.sciid.STitle;
import fr.jmini.sciid.SciidFactory;
import fr.jmini.sciid.converter.SciidCodeGenerator;

public class SciidCodeGeneratorTitleTest {

    @Test
    public void testTitle() throws Exception {
        Title title = createSciidObject();

        SciidCodeGenerator generator = new SciidCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createTitleCode(sb, title);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public STitle createSciidObject() {
        STitle sTitle1 = SciidFactory.eINSTANCE.createSTitle();
        sTitle1.setMain("main");
        sTitle1.setSubtitle("subt");
        sTitle1.setCombined("comb");
        sTitle1.setSanitized(true);
        return sTitle1;
    }
    // end::generated-code[]
}
