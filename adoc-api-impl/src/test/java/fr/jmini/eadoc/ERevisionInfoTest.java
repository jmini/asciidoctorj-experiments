package fr.jmini.eadoc;

import org.asciidoctor.ast.RevisionInfo;
import org.asciidoctor.testing.ast.RevisionInfoTesting;

public class ERevisionInfoTest extends RevisionInfoTesting {

    @Override
    protected RevisionInfo createRevisionInfo() {
		return EadocFactory.eINSTANCE.createERevisionInfo();
    }

}
