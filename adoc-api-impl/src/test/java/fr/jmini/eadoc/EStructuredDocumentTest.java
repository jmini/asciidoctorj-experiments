package fr.jmini.eadoc;

import java.util.List;

import org.asciidoctor.ast.ContentPart;
import org.asciidoctor.ast.DocumentHeader;
import org.asciidoctor.ast.StructuredDocument;
import org.asciidoctor.testing.ast.StructuredDocumentTesting;

public class EStructuredDocumentTest extends StructuredDocumentTesting {

    @Override
    protected StructuredDocument createStructuredDocument(DocumentHeader header, List<ContentPart> parts) {
        EStructuredDocument structuredDocument = EadocFactory.eINSTANCE.createEStructuredDocument();
        structuredDocument.setHeader(header);
        structuredDocument.setParts(parts);
        return structuredDocument;
    }

}
