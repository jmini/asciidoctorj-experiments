package fr.jmini.asciidoctorj.converter.code;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import org.asciidoctor.ast.Author;
import org.asciidoctor.ast.Block;
import org.asciidoctor.ast.Cell;
import org.asciidoctor.ast.Column;
import org.asciidoctor.ast.ContentNode;
import org.asciidoctor.ast.ContentPart;
import org.asciidoctor.ast.Cursor;
import org.asciidoctor.ast.DescriptionList;
import org.asciidoctor.ast.DescriptionListEntry;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.DocumentHeader;
import org.asciidoctor.ast.ListItem;
import org.asciidoctor.ast.PhraseNode;
import org.asciidoctor.ast.RevisionInfo;
import org.asciidoctor.ast.Row;
import org.asciidoctor.ast.Section;
import org.asciidoctor.ast.StructuralNode;
import org.asciidoctor.ast.StructuredDocument;
import org.asciidoctor.ast.Table;
import org.asciidoctor.ast.Title;
import org.asciidoctor.converter.AbstractConverter;

public abstract class AbstractCodeConverter extends AbstractConverter<String> {
    protected static final String NL = "\n";
    private Map<String, Integer> counter = new HashMap<>();
    protected Map<Integer, String> referenceHolder = new HashMap<>();

    public AbstractCodeConverter(String backend, Map<String, Object> opts) {
        super(backend, opts);
    }

    @Override
    public String convert(ContentNode node, String transform, Map<Object, Object> o) {
        StringBuilder sb = new StringBuilder();
        createContentNodeCode(sb, node);
        return sb.toString();
    }

    @Override
    public void write(String content, OutputStream out) throws IOException {
        if (content != null) {
            try (PrintWriter p = new PrintWriter(out)) {
                p.println("content");
            }
        }
    }

    public String createAuthorCode(StringBuilder sb, Author aAuthor) {
        String varName = startMethod(sb, aAuthor, Author.class);
        appendAuthor(sb, varName, aAuthor);
        endMethod(sb);
        return varName;
    }

    public String createBlockCode(StringBuilder sb, Block aBlock) {
        String varName = startMethod(sb, aBlock, Block.class);
        appendBlock(sb, varName, aBlock);
        endMethod(sb);
        return varName;
    }

    public String createCellCode(StringBuilder sb, Cell aCell) {
        String varName = startMethod(sb, aCell, Cell.class);
        appendCell(sb, varName, aCell);
        endMethod(sb);
        return varName;
    }

    public String createColumnCode(StringBuilder sb, Column aColumn) {
        String varName = startMethod(sb, aColumn, Column.class);
        appendColumn(sb, varName, aColumn);
        endMethod(sb);
        return varName;
    }

    public String createContentNodeCode(StringBuilder sb, ContentNode contentNode) {
        if (contentNode instanceof Cell) {
            return createCellCode(sb, (Cell) contentNode);
        } else if (contentNode instanceof Column) {
            return createColumnCode(sb, (Column) contentNode);
        } else if (contentNode instanceof PhraseNode) {
            return createPhraseNodeCode(sb, (PhraseNode) contentNode);
        } else if (contentNode instanceof StructuralNode) {
            return createStructuralNodeCode(sb, (StructuralNode) contentNode);
        } else {
            String varName = startMethod(sb, contentNode, ContentNode.class);
            appendContentNode(sb, varName, contentNode);
            endMethod(sb);
            return varName;
        }
    }

    public String createContentPartCode(StringBuilder sb, ContentPart aContentPart) {
        String varName = startMethod(sb, aContentPart, ContentPart.class);
        appendContentPart(sb, varName, aContentPart);
        endMethod(sb);
        return varName;
    }

    public String createCursorCode(StringBuilder sb, Cursor aCursor) {
        String varName = startMethod(sb, aCursor, Cursor.class);
        appendCursor(sb, varName, aCursor);
        endMethod(sb);
        return varName;
    }

    public String createDescriptionListCode(StringBuilder sb, DescriptionList aDescriptionList) {
        String varName = startMethod(sb, aDescriptionList, DescriptionList.class);
        appendDescriptionList(sb, varName, aDescriptionList);
        endMethod(sb);
        return varName;
    }

    public String createDescriptionListEntryCode(StringBuilder sb, DescriptionListEntry aDescriptionListEntry) {
        String varName = startMethod(sb, aDescriptionListEntry, DescriptionListEntry.class);
        appendDescriptionListEntry(sb, varName, aDescriptionListEntry);
        endMethod(sb);
        return varName;
    }

    public String createDocumentCode(StringBuilder sb, Document aDocument) {
        String varName = startMethod(sb, aDocument, Document.class);
        appendDocument(sb, varName, aDocument);
        endMethod(sb);
        return varName;
    }

    public String createDocumentHeaderCode(StringBuilder sb, DocumentHeader aDocumentHeader) {
        String varName = startMethod(sb, aDocumentHeader, DocumentHeader.class);
        appendDocumentHeader(sb, varName, aDocumentHeader);
        endMethod(sb);
        return varName;
    }

    public String createListCode(StringBuilder sb, org.asciidoctor.ast.List aList) {
        String varName = startMethod(sb, aList, org.asciidoctor.ast.List.class);
        appendList(sb, varName, aList);
        endMethod(sb);
        return varName;
    }

    public String createListItemCode(StringBuilder sb, ListItem aListItem) {
        String varName = startMethod(sb, aListItem, ListItem.class);
        appendListItem(sb, varName, aListItem);
        endMethod(sb);
        return varName;
    }

    public String createPhraseNodeCode(StringBuilder sb, PhraseNode aPhraseNode) {
        String varName = startMethod(sb, aPhraseNode, PhraseNode.class);
        appendPhraseNode(sb, varName, aPhraseNode);
        endMethod(sb);
        return varName;
    }

    public String createRevisionInfoCode(StringBuilder sb, RevisionInfo aRevisionInfo) {
        String varName = startMethod(sb, aRevisionInfo, RevisionInfo.class);
        appendRevisionInfo(sb, varName, aRevisionInfo);
        endMethod(sb);
        return varName;
    }

    public String createRowCode(StringBuilder sb, Row aRow) {
        String varName = startMethod(sb, aRow, Row.class);
        appendRow(sb, varName, aRow);
        endMethod(sb);
        return varName;
    }

    public String createSectionCode(StringBuilder sb, Section aSection) {
        String varName = startMethod(sb, aSection, Section.class);
        appendSection(sb, varName, aSection);
        endMethod(sb);
        return varName;
    }

    public String createStructuralNodeCode(StringBuilder sb, StructuralNode structuralNode) {
        if (structuralNode instanceof Block) {
            return createBlockCode(sb, (Block) structuralNode);
        } else if (structuralNode instanceof DescriptionList) {
            return createDescriptionListCode(sb, (DescriptionList) structuralNode);
        } else if (structuralNode instanceof Document) {
            return createDocumentCode(sb, (Document) structuralNode);
        } else if (structuralNode instanceof org.asciidoctor.ast.List) {
            return createListCode(sb, (org.asciidoctor.ast.List) structuralNode);
        } else if (structuralNode instanceof ListItem) {
            return createListItemCode(sb, (ListItem) structuralNode);
        } else if (structuralNode instanceof Section) {
            return createSectionCode(sb, (Section) structuralNode);
        } else if (structuralNode instanceof Table) {
            return createTableCode(sb, (Table) structuralNode);
        } else {
            String varName = startMethod(sb, structuralNode, StructuralNode.class);
            appendStructuralNode(sb, varName, structuralNode);
            endMethod(sb);
            return varName;
        }
    }

    public String createStructuredDocumentCode(StringBuilder sb, StructuredDocument aStructuredDocument) {
        String varName = startMethod(sb, aStructuredDocument, StructuredDocument.class);
        appendStructuredDocument(sb, varName, aStructuredDocument);
        endMethod(sb);
        return varName;
    }

    public String createTableCode(StringBuilder sb, Table aTable) {
        String varName = startMethod(sb, aTable, Table.class);
        appendTable(sb, varName, aTable);
        endMethod(sb);
        return varName;
    }

    public String createTitleCode(StringBuilder sb, Title aTitle) {
        String varName = startMethod(sb, aTitle, Title.class);
        appendTitle(sb, varName, aTitle);
        endMethod(sb);
        return varName;
    }

    protected <T> String startMethod(StringBuilder sb, T value, Class<T> astClass) {
        String astVariable = "ast" + astClass.getSimpleName();
        sb.append("public void checkAst(" + astClass.getSimpleName() + " " + astVariable + ") {" + NL);
        return createVariableForExpression(sb, astVariable, value, astClass.getSimpleName());
    }

    protected void endMethod(StringBuilder sb) {
        sb.append("}");
    }

    protected abstract void appendAuthor(StringBuilder sb, String varName, Author author);

    protected abstract void appendBlock(StringBuilder sb, String varName, Block block);

    protected abstract void appendCell(StringBuilder sb, String varName, Cell cell);

    protected abstract void appendColumn(StringBuilder sb, String varName, Column column);

    protected abstract void appendContentNode(StringBuilder sb, String varName, ContentNode contentNode);

    protected abstract void appendContentPart(StringBuilder sb, String varName, ContentPart contentPart);

    protected abstract void appendCursor(StringBuilder sb, String varName, Cursor cursor);

    protected abstract void appendDescriptionList(StringBuilder sb, String varName, DescriptionList descriptionList);

    protected abstract void appendDescriptionListEntry(StringBuilder sb, String varName, DescriptionListEntry descriptionListEntry);

    protected abstract void appendDocument(StringBuilder sb, String varName, Document document);

    protected abstract void appendDocumentHeader(StringBuilder sb, String varName, DocumentHeader documentHeader);

    protected abstract void appendList(StringBuilder sb, String varName, org.asciidoctor.ast.List list);

    protected abstract void appendListItem(StringBuilder sb, String varName, ListItem listItem);

    protected abstract void appendPhraseNode(StringBuilder sb, String varName, PhraseNode phraseNode);

    protected abstract void appendRevisionInfo(StringBuilder sb, String varName, RevisionInfo revisionInfo);

    protected abstract void appendRow(StringBuilder sb, String varName, Row row);

    protected abstract void appendSection(StringBuilder sb, String varName, Section section);

    protected abstract void appendStructuralNode(StringBuilder sb, String varName, StructuralNode structuralNode);

    protected abstract void appendStructuredDocument(StringBuilder sb, String varName, StructuredDocument structuredDocument);

    protected abstract void appendTable(StringBuilder sb, String varName, Table table);

    protected abstract void appendTitle(StringBuilder sb, String varName, Title title);

    protected void appendObject(StringBuilder sb, String varName, Object value) {
        if (value instanceof Author) {
            appendAuthor(sb, varName, (Author) value);
        } else if (value instanceof Block) {
            appendBlock(sb, varName, (Block) value);
        } else if (value instanceof Cell) {
            appendCell(sb, varName, (Cell) value);
        } else if (value instanceof Column) {
            appendColumn(sb, varName, (Column) value);
        } else if (value instanceof ContentPart) {
            appendContentPart(sb, varName, (ContentPart) value);
        } else if (value instanceof Cursor) {
            appendCursor(sb, varName, (Cursor) value);
        } else if (value instanceof DescriptionList) {
            appendDescriptionList(sb, varName, (DescriptionList) value);
        } else if (value instanceof DescriptionListEntry) {
            appendDescriptionListEntry(sb, varName, (DescriptionListEntry) value);
        } else if (value instanceof Document) {
            appendDocument(sb, varName, (Document) value);
        } else if (value instanceof DocumentHeader) {
            appendDocumentHeader(sb, varName, (DocumentHeader) value);
        } else if (value instanceof org.asciidoctor.ast.List) {
            appendList(sb, varName, (org.asciidoctor.ast.List) value);
        } else if (value instanceof ListItem) {
            appendListItem(sb, varName, (ListItem) value);
        } else if (value instanceof PhraseNode) {
            appendPhraseNode(sb, varName, (PhraseNode) value);
        } else if (value instanceof RevisionInfo) {
            appendRevisionInfo(sb, varName, (RevisionInfo) value);
        } else if (value instanceof Row) {
            appendRow(sb, varName, (Row) value);
        } else if (value instanceof Section) {
            appendSection(sb, varName, (Section) value);
        } else if (value instanceof StructuredDocument) {
            appendStructuredDocument(sb, varName, (StructuredDocument) value);
        } else if (value instanceof Table) {
            appendTable(sb, varName, (Table) value);
        } else if (value instanceof Title) {
            appendTitle(sb, varName, (Title) value);
        } else if (value instanceof StructuralNode) {
            appendStructuralNode(sb, varName, (StructuralNode) value);
        } else if (value instanceof ContentNode) {
            appendContentNode(sb, varName, (ContentNode) value);
        } else {
            throw new IllegalArgumentException("Unexpected type: " + value.getClass()
                    .getCanonicalName());
        }
    }

    private String createVariableForExpression(StringBuilder sb, String expression, Object value, String astClass) {
        String varName = createVariable(astClass, value);
        sb.append(astClass + " " + varName + " = " + expression + ";" + NL);
        return varName;
    }

    protected String createVariable(String astClass, Object value) {
        String key = computeVariablePrefix(astClass);

        Integer c = counter.get(key);
        if (c == null) {
            c = 0;
        }
        c = c.intValue() + 1;
        counter.put(key, c);
        String varName = key + c.toString();
        referenceHolder.put(System.identityHashCode(value), varName);
        return varName;
    }

    protected abstract String computeVariablePrefix(String astClass);

    protected static String computeType(Object object) {
        if (object instanceof Author) {
            return Author.class.getSimpleName();
        } else if (object instanceof Block) {
            return Block.class.getSimpleName();
        } else if (object instanceof Cell) {
            return Cell.class.getSimpleName();
        } else if (object instanceof Column) {
            return Cell.class.getSimpleName();
        } else if (object instanceof ContentPart) {
            return ContentPart.class.getSimpleName();
        } else if (object instanceof Cursor) {
            return Cursor.class.getSimpleName();
        } else if (object instanceof DescriptionList) {
            return DescriptionList.class.getSimpleName();
        } else if (object instanceof DescriptionListEntry) {
            return DescriptionListEntry.class.getSimpleName();
        } else if (object instanceof Document) {
            return Document.class.getSimpleName();
        } else if (object instanceof DocumentHeader) {
            return DocumentHeader.class.getSimpleName();
        } else if (object instanceof org.asciidoctor.ast.List) {
            return org.asciidoctor.ast.List.class.getCanonicalName();
        } else if (object instanceof ListItem) {
            return ListItem.class.getSimpleName();
        } else if (object instanceof PhraseNode) {
            return PhraseNode.class.getSimpleName();
        } else if (object instanceof RevisionInfo) {
            return RevisionInfo.class.getSimpleName();
        } else if (object instanceof Row) {
            return Row.class.getSimpleName();
        } else if (object instanceof Section) {
            return Section.class.getSimpleName();
        } else if (object instanceof StructuredDocument) {
            return StructuredDocument.class.getSimpleName();
        } else if (object instanceof Table) {
            return Table.class.getSimpleName();
        } else if (object instanceof Title) {
            return Title.class.getSimpleName();
        } else if (object instanceof StructuralNode) {
            return StructuralNode.class.getSimpleName();
        } else if (object instanceof ContentNode) {
            return ContentNode.class.getSimpleName();
        } else {
            throw new IllegalArgumentException("Unexpected type: " + object.getClass()
                    .getCanonicalName());
        }
    }
}
