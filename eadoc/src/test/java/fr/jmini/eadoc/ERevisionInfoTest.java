package fr.jmini.eadoc;

import org.asciidoctor.ast.RevisionInfo;
import org.asciidoctor.testing.ast.RevisionInfoTesting;

public class ERevisionInfoTest extends RevisionInfoTesting {

    @Override
    protected RevisionInfo createInstance(String date, String number, String remark) {
        ERevisionInfo revisionInfo = EadocFactory.eINSTANCE.createERevisionInfo();
        revisionInfo.setDate(date);
        revisionInfo.setNumber(number);
        revisionInfo.setRemark(remark);
        return revisionInfo;
    }
}
