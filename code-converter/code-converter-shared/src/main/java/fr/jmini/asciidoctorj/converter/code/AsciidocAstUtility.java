package fr.jmini.asciidoctorj.converter.code;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.asciidoctor.ast.Cell;
import org.asciidoctor.ast.ContentNode;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.Row;
import org.asciidoctor.ast.StructuralNode;
import org.asciidoctor.ast.Table;

public class AsciidocAstUtility {

    public static Set<Document> findAllDocumentNode(ContentNode value) {
        HashSet<Document> result = new HashSet<>();
        if (value instanceof Document) {
            result.add((Document) value);
        }
        if (value instanceof Table) {
            addAllDocumentNodeInRow(result, ((Table) value).getHeader());
            addAllDocumentNodeInRow(result, ((Table) value).getBody());
            addAllDocumentNodeInRow(result, ((Table) value).getFooter());
        }
        if (value instanceof Cell) {
            if (((Cell) value).getInnerDocument() != null) {
                result.add(((Cell) value).getInnerDocument());
            }
        }
        if (value instanceof StructuralNode) {
            allAllDocumentNodeInList(result, ((StructuralNode) value).getBlocks());
        }
        return result;
    }

    private static void allAllDocumentNodeInList(HashSet<Document> result, List<? extends ContentNode> list) {
        if (list != null) {
            for (ContentNode item : list) {
                result.addAll(findAllDocumentNode(item));
            }
        }
    }

    private static void addAllDocumentNodeInRow(HashSet<Document> result, List<Row> list) {
        if (list != null) {
            for (Row row : list) {
                if (row != null) {
                    allAllDocumentNodeInList(result, row.getCells());
                }
            }
        }
    }
}
