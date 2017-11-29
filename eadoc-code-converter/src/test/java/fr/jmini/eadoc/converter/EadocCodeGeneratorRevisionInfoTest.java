package fr.jmini.eadoc.converter;

import org.asciidoctor.ast.RevisionInfo;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.eadoc.ERevisionInfo;
import fr.jmini.eadoc.EadocFactory;

public class EadocCodeGeneratorRevisionInfoTest {

    @Test
    public void testRevisionInfo() throws Exception {
        RevisionInfo eRevisionInfo = createEadoc();

        EadocCodeGenerator generator = new EadocCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createRevisionInfoCode(sb, eRevisionInfo);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public ERevisionInfo createEadoc() {
        ERevisionInfo eRevisionInfo1 = EadocFactory.eINSTANCE.createERevisionInfo();
        eRevisionInfo1.setDate("2018-01-01");
        eRevisionInfo1.setNumber("3");
        eRevisionInfo1.setRemark("rem");
        return eRevisionInfo1;
    }
    // end::generated-code[]
}
