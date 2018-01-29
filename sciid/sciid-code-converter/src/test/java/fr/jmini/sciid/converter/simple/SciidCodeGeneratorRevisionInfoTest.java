package fr.jmini.sciid.converter.simple;

import org.asciidoctor.ast.RevisionInfo;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.sciid.SRevisionInfo;
import fr.jmini.sciid.SciidFactory;
import fr.jmini.sciid.converter.SciidCodeGenerator;

public class SciidCodeGeneratorRevisionInfoTest {

    @Test
    public void testRevisionInfo() throws Exception {
        RevisionInfo revisionInfo = createSciidObject();

        SciidCodeGenerator generator = new SciidCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createRevisionInfoCode(sb, revisionInfo);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public SRevisionInfo createSciidObject() {
        SRevisionInfo sRevisionInfo1 = SciidFactory.eINSTANCE.createSRevisionInfo();
        sRevisionInfo1.setDate("2018-01-01");
        sRevisionInfo1.setNumber("3");
        sRevisionInfo1.setRemark("rem");
        return sRevisionInfo1;
    }
    // end::generated-code[]
}
