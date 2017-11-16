package fr.jmini.eadoc;

import org.asciidoctor.ast.Author;
import org.asciidoctor.testing.ast.AuthorTesting;

public class EAuthorTest extends AuthorTesting {

    @Override
    protected Author createInstance(String email, String fullName, String firstName, String lastName, String middleName, String initials) {
        EAuthor author = EadocFactory.eINSTANCE.createEAuthor();
        author.setEmail(email);
        author.setFullName(fullName);
        author.setFirstName(firstName);
        author.setLastName(lastName);
        author.setMiddleName(middleName);
        author.setInitials(initials);
        return author;
    }
}
