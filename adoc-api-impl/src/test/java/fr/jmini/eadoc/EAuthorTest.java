package fr.jmini.eadoc;

import org.asciidoctor.ast.Author;
import org.asciidoctor.testing.ast.AuthorTesting;

public class EAuthorTest extends AuthorTesting {

	@Override
	protected Author createAuthor() {
		return EadocFactory.eINSTANCE.createEAuthor();
	}

}
