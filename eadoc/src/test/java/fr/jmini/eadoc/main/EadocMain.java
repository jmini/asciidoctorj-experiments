package fr.jmini.eadoc.main;

import fr.jmini.eadoc.EadocCodeCreator;
import fr.jmini.eadoc.EAuthor;
import fr.jmini.eadoc.EDocument;
import fr.jmini.eadoc.ESection;
import fr.jmini.eadoc.EadocFactory;

public class EadocMain {

    public static void main(String[] args) {
        EAuthor a = EadocFactory.eINSTANCE.createEAuthor();
        a.setEmail("doc.writer@asciidoc.org");
        a.setFullName("Doc Writer");
        a.setFirstName("Doc");
        a.setLastName("Writer");
        a.setMiddleName("Foo");
        a.setInitials("DW");

        StringBuilder sb = new StringBuilder();
        EadocCodeCreator.createAuthorCode(sb, a);
        // System.out.println(sb);
        // System.out.println();

        EDocument d1 = EadocFactory.eINSTANCE.createEDocument();
        d1.setContext("document");
        d1.setNodeName("document");
        d1.setLevel(0);
        ESection s1 = EadocFactory.eINSTANCE.createESection();
        s1.setContext("section");
        s1.setId("id");
        s1.setNodeName("section");
        s1.setTitle("Totally ignored header");
        d1.getBlocks().add(s1);

        EadocCodeCreator.createDocumentCode(sb, d1);
        System.out.println(sb);
        System.out.println();
    }
}
