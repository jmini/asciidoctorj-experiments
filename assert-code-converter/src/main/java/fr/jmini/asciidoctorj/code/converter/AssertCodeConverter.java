package fr.jmini.asciidoctorj.code.converter;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;

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
import org.asciidoctor.ast.Table.HorizontalAlignment;
import org.asciidoctor.ast.Table.VerticalAlignment;
import org.asciidoctor.ast.Title;
import org.asciidoctor.converter.AbstractConverter;
import org.asciidoctor.converter.ConverterFor;
import org.omg.CORBA.ObjectHolder;

//varName \+ "\.[a-zA-Z]+\(" \+ convert([a-zA-Z]+)\(([a-zA-Z]+)\.([a-zA-Z]+)\(\)\) \+ "\);"
// "assertThat(" + varName + ".$3())." + equalsToExpression$1($2.$3()) + ";" + NL);
@ConverterFor("assert-code")
public class AssertCodeConverter extends AbstractConverter<String> {
    private static final String NL = "\n";
    private Map<String, Integer> counter = new HashMap<>();
    private Map<Integer, String> referenceHolder = new HashMap<>();
    private Stack<ObjectHolder> stack = new Stack<ObjectHolder>();

    public AssertCodeConverter(String backend, Map<String, Object> opts) {
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

    String createAuthorCode(StringBuilder sb, Author aAuthor) {
        String varName = createCheckMethod(sb, aAuthor, Author.class);
        appendAuthor(sb, varName, aAuthor);
        sb.append("}");
        return varName;
    }

    String createBlockCode(StringBuilder sb, Block aBlock) {
        String varName = createCheckMethod(sb, aBlock, Block.class);

        // ObjectHolder item = new ObjectHolder(varName, aBlock);
        // stack.push(item);
        // generateCode(sb);
        appendBlock(sb, varName, aBlock);

        sb.append("}");
        return varName;
    }

    String createCellCode(StringBuilder sb, Cell aCell) {
        String varName = createCheckMethod(sb, aCell, Cell.class);
        appendCell(sb, varName, aCell);
        sb.append("}");
        return varName;
    }

    String createColumnCode(StringBuilder sb, Column aColumn) {
        String varName = createCheckMethod(sb, aColumn, Column.class);
        appendColumn(sb, varName, aColumn);
        sb.append("}");
        return varName;
    }

    String createContentNodeCode(StringBuilder sb, ContentNode contentNode) {
        if (contentNode instanceof Cell) {
            return createCellCode(sb, (Cell) contentNode);
        } else if (contentNode instanceof Column) {
            return createColumnCode(sb, (Column) contentNode);
        } else if (contentNode instanceof PhraseNode) {
            return createPhraseNodeCode(sb, (PhraseNode) contentNode);
        } else if (contentNode instanceof StructuralNode) {
            return createStructuralNodeCode(sb, (StructuralNode) contentNode);
        } else {
            String varName = createCheckMethod(sb, contentNode, ContentNode.class);
            appendContentNode(sb, varName, contentNode);
            sb.append("}");
            return varName;
        }
    }

    String createContentPartCode(StringBuilder sb, ContentPart aContentPart) {
        String varName = createCheckMethod(sb, aContentPart, ContentPart.class);
        appendContentPart(sb, varName, aContentPart);
        sb.append("}");
        return varName;
    }

    String createCursorCode(StringBuilder sb, Cursor aCursor) {
        String varName = createCheckMethod(sb, aCursor, Cursor.class);
        appendCursor(sb, varName, aCursor);
        sb.append("}");
        return varName;
    }

    String createDescriptionListCode(StringBuilder sb, DescriptionList aDescriptionList) {
        String varName = createCheckMethod(sb, aDescriptionList, DescriptionList.class);
        appendDescriptionList(sb, varName, aDescriptionList);
        sb.append("}");
        return varName;
    }

    String createDescriptionListEntryCode(StringBuilder sb, DescriptionListEntry aDescriptionListEntry) {
        String varName = createCheckMethod(sb, aDescriptionListEntry, DescriptionListEntry.class);
        appendDescriptionListEntry(sb, varName, aDescriptionListEntry);
        sb.append("}");
        return varName;
    }

    String createDocumentCode(StringBuilder sb, Document aDocument) {
        String varName = createCheckMethod(sb, aDocument, Document.class);
        appendDocument(sb, varName, aDocument);
        sb.append("}");
        return varName;
    }

    String createDocumentHeaderCode(StringBuilder sb, DocumentHeader aDocumentHeader) {
        String varName = createCheckMethod(sb, aDocumentHeader, DocumentHeader.class);
        appendDocumentHeader(sb, varName, aDocumentHeader);
        sb.append("}");
        return varName;
    }

    String createListCode(StringBuilder sb, org.asciidoctor.ast.List aList) {
        String varName = createCheckMethod(sb, aList, org.asciidoctor.ast.List.class);
        appendList(sb, varName, aList);
        sb.append("}");
        return varName;
    }

    String createListItemCode(StringBuilder sb, ListItem aListItem) {
        String varName = createCheckMethod(sb, aListItem, ListItem.class);
        appendListItem(sb, varName, aListItem);
        sb.append("}");
        return varName;
    }

    String createPhraseNodeCode(StringBuilder sb, PhraseNode aPhraseNode) {
        String varName = createCheckMethod(sb, aPhraseNode, PhraseNode.class);
        appendPhraseNode(sb, varName, aPhraseNode);
        sb.append("}");
        return varName;
    }

    String createRevisionInfoCode(StringBuilder sb, RevisionInfo aRevisionInfo) {
        String varName = createCheckMethod(sb, aRevisionInfo, RevisionInfo.class);
        appendRevisionInfo(sb, varName, aRevisionInfo);
        sb.append("}");
        return varName;
    }

    String createRowCode(StringBuilder sb, Row aRow) {
        String varName = createCheckMethod(sb, aRow, Row.class);
        appendRow(sb, varName, aRow);
        sb.append("}");
        return varName;
    }

    String createSectionCode(StringBuilder sb, Section aSection) {
        String varName = createCheckMethod(sb, aSection, Section.class);
        appendSection(sb, varName, aSection);
        sb.append("}");
        return varName;
    }

    String createStructuralNodeCode(StringBuilder sb, StructuralNode structuralNode) {
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
            String varName = createCheckMethod(sb, structuralNode, StructuralNode.class);
            appendStructuralNode(sb, varName, structuralNode);
            sb.append("}");
            return varName;
        }
    }

    String createStructuredDocumentCode(StringBuilder sb, StructuredDocument aStructuredDocument) {
        String varName = createCheckMethod(sb, aStructuredDocument, StructuredDocument.class);
        appendStructuredDocument(sb, varName, aStructuredDocument);
        sb.append("}");
        return varName;
    }

    String createTableCode(StringBuilder sb, Table aTable) {
        String varName = createCheckMethod(sb, aTable, Table.class);
        appendTable(sb, varName, aTable);
        sb.append("}");
        return varName;
    }

    String createTitleCode(StringBuilder sb, Title aTitle) {
        String varName = createCheckMethod(sb, aTitle, Title.class);
        appendTitle(sb, varName, aTitle);
        sb.append("}");
        return varName;
    }

    void appendAuthor(StringBuilder sb, String varName, Author author) {
        sb.append("assertThat(" + varName + ".getEmail())." + equalsToExpressionString(author.getEmail()) + ";" + NL);
        sb.append("assertThat(" + varName + ".getFullName())." + equalsToExpressionString(author.getFullName()) + ";" + NL);
        sb.append("assertThat(" + varName + ".getFirstName())." + equalsToExpressionString(author.getFirstName()) + ";" + NL);
        sb.append("assertThat(" + varName + ".getLastName())." + equalsToExpressionString(author.getLastName()) + ";" + NL);
        sb.append("assertThat(" + varName + ".getMiddleName())." + equalsToExpressionString(author.getMiddleName()) + ";" + NL);
        sb.append("assertThat(" + varName + ".getInitials())." + equalsToExpressionString(author.getInitials()) + ";" + NL);
    }

    void appendBlock(StringBuilder sb, String varName, Block block) {
        appendStructuralNode(sb, varName, block);
        sb.append("assertThat(" + varName + ".getLines())." + equalsToExpressionStringList(block.getLines()) + ";" + NL);
        sb.append("assertThat(" + varName + ".getSource())." + equalsToExpressionString(block.getSource()) + ";" + NL);
    }

    void appendCell(StringBuilder sb, String varName, Cell cell) {
        // sb.append(varName + .setColumn(convertColumn(convertString(cell.getColumn())) + ");" + NL);
        sb.append("assertThat(" + varName + ".getColspan())." + equalsToExpressionInt(cell.getColspan()) + ";" + NL);
        sb.append("assertThat(" + varName + ".getRowspan())." + equalsToExpressionInt(cell.getRowspan()) + ";" + NL);
        // XXX sb.append("assertThat("+varName+".getText())." + equalsToExpressionString(cell.getText()) + ";"+ NL);
        sb.append("assertThat(" + varName + ".getSource())." + equalsToExpressionString(cell.getSource()) + ";" + NL);
        sb.append("assertThat(" + varName + ".getStyle())." + equalsToExpressionString(cell.getStyle()) + ";" + NL);
        sb.append("assertThat(" + varName + ".getHorizontalAlignment())." + equalsToExpressionHorizontalAlignment(cell.getHorizontalAlignment()) + ";" + NL);
        sb.append("assertThat(" + varName + ".getVerticalAlignment())." + equalsToExpressionVerticalAlignment(cell.getVerticalAlignment()) + ";" + NL);
        if (cell.getInnerDocument() != null) {
            String docVarName = createDocumentCode(sb, cell.getInnerDocument());
            sb.append(varName + ".setInnerDocument(" + docVarName + ");" + NL);
        } else {
            sb.append(varName + ".setInnerDocument(null);" + NL);
        }
    }

    void appendColumn(StringBuilder sb, String varName, Column column) {
        sb.append("assertThat(" + varName + ".getStyle())." + equalsToExpressionString(column.getStyle()) + ";" + NL);
        // sb.append("assertThat("+varName+".getTable())." + equalsToExpressionTable(column.getTable()) + ";"+ NL);
        sb.append("assertThat(" + varName + ".getWidth())." + equalsToExpressionInt(column.getWidth()) + ";" + NL);
        sb.append("assertThat(" + varName + ".getHorizontalAlignment())." + equalsToExpressionHorizontalAlignment(column.getHorizontalAlignment()) + ";" + NL);
        sb.append("assertThat(" + varName + ".getVerticalAlignment())." + equalsToExpressionVerticalAlignment(column.getVerticalAlignment()) + ";" + NL);
    }

    void appendContentNode(StringBuilder sb, String varName, ContentNode contentNode) {
        sb.append("assertThat(" + varName + ".getId())." + equalsToExpressionString(contentNode.getId()) + ";" + NL);
        sb.append("assertThat(" + varName + ".getNodeName())." + equalsToExpressionString(contentNode.getNodeName()) + ";" + NL);
        // eContentNode.setParent(contentNode.getParent());" + NL);
        sb.append("assertThat(" + varName + ".getContext())." + equalsToExpressionString(contentNode.getContext()) + ";" + NL);
        sb.append("assertThat(" + varName + ".isInline())." + equalsToExpressionBoolean(contentNode.isInline()) + ";" + NL);
        sb.append("assertThat(" + varName + ".isBlock())." + equalsToExpressionBoolean(contentNode.isBlock()) + ";" + NL);
        // XXX sb.append("assertThat("+varName+".getAttributes())." + equalsToExpressionString(contentNode.getAttributes()) + ";"+ NL);
        sb.append("assertThat(" + varName + ".getRoles())." + equalsToExpressionStringList(contentNode.getRoles()) + ";" + NL);
    }

    void appendContentPart(StringBuilder sb, String varName, ContentPart contentPart) {
        sb.append("assertThat(" + varName + ".getId())." + equalsToExpressionString(contentPart.getId()) + ";" + NL);
        sb.append("assertThat(" + varName + ".getLevel())." + equalsToExpressionInt(contentPart.getLevel()) + ";" + NL);
        sb.append("assertThat(" + varName + ".getContext())." + equalsToExpressionString(contentPart.getContext()) + ";" + NL);
        sb.append("assertThat(" + varName + ".getStyle())." + equalsToExpressionString(contentPart.getStyle()) + ";" + NL);
        sb.append("assertThat(" + varName + ".getRole())." + equalsToExpressionString(contentPart.getRole()) + ";" + NL);
        sb.append("assertThat(" + varName + ".getTitle())." + equalsToExpressionString(contentPart.getTitle()) + ";" + NL);
        // XXX sb.append("assertThat("+varName+".getAttributes())." + equalsToExpressionString(contentPart.getAttributes()) + ";"+ NL);
        // XXX convertAndAddAllContentPart(eContentPart.getParts(), contentPart.getParts());
    }

    void appendCursor(StringBuilder sb, String varName, Cursor cursor) {
        sb.append("assertThat(" + varName + ".getLineNumber())." + equalsToExpressionInt(cursor.getLineNumber()) + ";" + NL);
        sb.append("assertThat(" + varName + ".getPath())." + equalsToExpressionString(cursor.getPath()) + ";" + NL);
        sb.append("assertThat(" + varName + ".getDir())." + equalsToExpressionString(cursor.getDir()) + ";" + NL);
        sb.append("assertThat(" + varName + ".getFile())." + equalsToExpressionString(cursor.getFile()) + ";" + NL);
    }

    void appendDescriptionList(StringBuilder sb, String varName, DescriptionList descriptionList) {
        appendStructuralNode(sb, varName, descriptionList);
        // XXX eDescriptionList.set(descriptionList.getItems());
    }

    void appendDescriptionListEntry(StringBuilder sb, String varName, DescriptionListEntry descriptionListEntry) {
        // XXX eDescriptionListEntry.set(descriptionListEntry.getTerms());
        // XXX sb.append("assertThat("+varName+".getDescription())." + equalsToExpressionString(descriptionListEntry.getDescription()) + ";"+ NL);
    }

    void appendDocument(StringBuilder sb, String varName, Document document) {
        appendStructuralNode(sb, varName, document);
        // XXX sb.append(varName + ".setStructuredDoctitle(" +
        // convertTitle(document.getStructuredDoctitle()) + ");" + NL);
        sb.append("assertThat(" + varName + ".getDoctitle())." + equalsToExpressionString(document.getDoctitle()) + ";" + NL);
        // XXX sb.append("assertThat("+varName+".getOptions())." + equalsToExpressionString(document.getOptions()) + ";"+ NL);
    }

    void appendDocumentHeader(StringBuilder sb, String varName, DocumentHeader documentHeader) {
        // sb.append(varName + ".set( documentHeader. getAuthors() + ");" + NL);
        // XXX sb.append(varName + ".setDocumentTitle(" +
        // convertTitle(documentHeader.getDocumentTitle()) + ");" + NL);
        sb.append("assertThat(" + varName + ".getPageTitle())." + equalsToExpressionString(documentHeader.getPageTitle()) + ";" + NL);
        // sb.append(varName + ".setA(documentHeader. getAuthor() + ");" + NL);
        // XXX sb.append(varName + ".setRevisionInfo(" +
        // convertRevisionInfo(documentHeader.getRevisionInfo()) + ");" + NL);
        // XXX sb.append("assertThat("+varName+".getAttributes())." + equalsToExpressionString(documentHeader.getAttributes()) + ";"+ NL);
    }

    void appendList(StringBuilder sb, String varName, org.asciidoctor.ast.List list) {
        appendStructuralNode(sb, varName, list);
        // eAdocList.set(list.getItems());
    }

    void appendListItem(StringBuilder sb, String varName, ListItem listItem) {
        appendStructuralNode(sb, varName, listItem);
        sb.append("assertThat(" + varName + ".getMarker())." + equalsToExpressionString(listItem.getMarker()) + ";" + NL);
        sb.append("assertThat(" + varName + ".getText())." + equalsToExpressionString(listItem.getText()) + ";" + NL);
        sb.append("assertThat(" + varName + ".getSource())." + equalsToExpressionString(listItem.getSource()) + ";" + NL);
    }

    void appendPhraseNode(StringBuilder sb, String varName, PhraseNode phraseNode) {
        sb.append("assertThat(" + varName + ".getType())." + equalsToExpressionString(phraseNode.getType()) + ";" + NL);
        sb.append("assertThat(" + varName + ".getText())." + equalsToExpressionString(phraseNode.getText()) + ";" + NL);
        sb.append("assertThat(" + varName + ".getTarget())." + equalsToExpressionString(phraseNode.getTarget()) + ";" + NL);
    }

    void appendRevisionInfo(StringBuilder sb, String varName, RevisionInfo revisionInfo) {
        sb.append("assertThat(" + varName + ".getDate())." + equalsToExpressionString(revisionInfo.getDate()) + ";" + NL);
        sb.append("assertThat(" + varName + ".getNumber())." + equalsToExpressionString(revisionInfo.getNumber()) + ";" + NL);
        sb.append("assertThat(" + varName + ".getRemark())." + equalsToExpressionString(revisionInfo.getRemark()) + ";" + NL);
    }

    void appendRow(StringBuilder sb, String varName, Row row) {
        // eRow.set(row.getCells());
    }

    void appendSection(StringBuilder sb, String varName, Section section) {
        appendStructuralNode(sb, varName, section);
        sb.append("assertThat(" + varName + ".getIndex())." + equalsToExpressionInt(section.getIndex()) + ";" + NL);
        sb.append("assertThat(" + varName + ".getNumber())." + equalsToExpressionInt(section.getNumber()) + ";" + NL);
        sb.append("assertThat(" + varName + ".getSectionName())." + equalsToExpressionString(section.getSectionName()) + ";" + NL);
        sb.append("assertThat(" + varName + ".isSpecial())." + equalsToExpressionBoolean(section.isSpecial()) + ";" + NL);
        sb.append("assertThat(" + varName + ".isNumbered())." + equalsToExpressionBoolean(section.isNumbered()) + ";" + NL);
    }

    void appendStructuralNode(StringBuilder sb, String varName, StructuralNode structuralNode) {
        appendContentNode(sb, varName, structuralNode);
        sb.append("assertThat(" + varName + ".getTitle())." + equalsToExpressionString(structuralNode.getTitle()) + ";" + NL);
        sb.append("assertThat(" + varName + ".getStyle())." + equalsToExpressionString(structuralNode.getStyle()) + ";" + NL);
        // eStructuralNode.set(structuralNode.getContent());
        sb.append("assertThat(" + varName + ".getLevel())." + equalsToExpressionInt(structuralNode.getLevel()) + ";" + NL);
        // eStructuralNode.setContentModel(structuralNode.getContentModel());
        appendEqualsToExpressionObject(sb, varName + ".getSourceLocation()", structuralNode.getSourceLocation());
        // eStructuralNode.setSubstitutions(structuralNode.getSubstitutions());
        if (structuralNode.getBlocks() != null) {
            for (StructuralNode block : structuralNode.getBlocks()) {
                String blockVarName = createStructuralNodeCode(sb, block);
                sb.append(varName + ".getBlocks().add(" + blockVarName + ");" + NL);
            }
        }
    }

    void appendStructuredDocument(StringBuilder sb, String varName, StructuredDocument structuredDocument) {
        // eStructuredDocument.set(structuredDocument.getParts());
        // XXX sb.append("assertThat("+varName+".getHeader())." + equalsToExpressionString(structuredDocument.getHeader()) + ";"+ NL);
    }

    void appendTable(StringBuilder sb, String varName, Table table) {
        appendStructuralNode(sb, varName, table);
        sb.append("assertThat(" + varName + ".hasHeaderOption())." + equalsToExpressionBoolean(table.hasHeaderOption()) + ";" + NL);
        // sb.append(varName + ".set( " + table.getColumns() + ");" + NL);
        // sb.append(varName + ".set( " + table.getHeader() + ");" + NL);
        // sb.append(varName + ".set( " + table.getFooter() + ");" + NL);
        // sb.append(varName + ".set( " + table.getBody() + ");" + NL);
        sb.append("assertThat(" + varName + ".getFrame())." + equalsToExpressionString(table.getFrame()) + ";" + NL);
        sb.append("assertThat(" + varName + ".getGrid())." + equalsToExpressionString(table.getGrid()) + ";" + NL);
    }

    void appendTitle(StringBuilder sb, String varName, Title title) {
        sb.append("assertThat(" + varName + ".getMain())." + equalsToExpressionString(title.getMain()) + ";" + NL);
        sb.append("assertThat(" + varName + ".getSubtitle())." + equalsToExpressionString(title.getSubtitle()) + ";" + NL);
        sb.append("assertThat(" + varName + ".getCombined())." + equalsToExpressionString(title.getCombined()) + ";" + NL);
        sb.append("assertThat(" + varName + ".isSanitized())." + equalsToExpressionBoolean(title.isSanitized()) + ";" + NL);
    }

    private void appendObject(StringBuilder sb, String varName, Object value) {
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
            throw new IllegalArgumentException("Unexpected type: " + value.getClass().getCanonicalName());
        }
    }

    // private void generateCode(StringBuilder sb) {
    // while (!stack.empty()) {
    // ObjectHolder item = stack.pop();
    // appendObject(sb, item.varName, item.value);
    // }
    // }

    private <T> String createCheckMethod(StringBuilder sb, T value, Class<T> astClass) {
        String astVariable = "ast" + astClass.getSimpleName();
        sb.append("public void checkAst(" + astClass.getSimpleName() + " " + astVariable + ") {" + NL);
        return createVariableForExpression(sb, astVariable, value, astClass.getSimpleName());
    }

    private String createVariableForExpression(StringBuilder sb, String expression, Object value, String astClass) {
        String varName = createVariable(astClass, value);
        sb.append(astClass + " " + varName + " = " + expression + ";" + NL);
        return varName;
    }

    private String createVariable(String astClass, Object value) {
        String key = computeClassKey(astClass);

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

    private static String computeClassKey(String astClass) {
        if (Author.class.getSimpleName().equals(astClass)) {
            return "a";
        } else if (Block.class.getSimpleName().equals(astClass)) {
            return "b";
        } else if (Cell.class.getSimpleName().equals(astClass)) {
            return "c";
        } else if (Column.class.getSimpleName().equals(astClass)) {
            return "c";
        } else if (ContentNode.class.getSimpleName().equals(astClass)) {
            return "n";
        } else if (ContentPart.class.getSimpleName().equals(astClass)) {
            return "p";
        } else if (Cursor.class.getSimpleName().equals(astClass)) {
            return "c";
        } else if (DescriptionList.class.getSimpleName().equals(astClass)) {
            return "l";
        } else if (DescriptionListEntry.class.getSimpleName().equals(astClass)) {
            return "e";
        } else if (Document.class.getSimpleName().equals(astClass)) {
            return "d";
        } else if (DocumentHeader.class.getSimpleName().equals(astClass)) {
            return "h";
        } else if (org.asciidoctor.ast.List.class.getSimpleName().equals(astClass)) {
            return "l";
        } else if (ListItem.class.getSimpleName().equals(astClass)) {
            return "i";
        } else if (PhraseNode.class.getSimpleName().equals(astClass)) {
            return "n";
        } else if (RevisionInfo.class.getSimpleName().equals(astClass)) {
            return "r";
        } else if (Row.class.getSimpleName().equals(astClass)) {
            return "r";
        } else if (Section.class.getSimpleName().equals(astClass)) {
            return "s";
        } else if (StructuralNode.class.getSimpleName().equals(astClass)) {
            return "n";
        } else if (StructuredDocument.class.getSimpleName().equals(astClass)) {
            return "d";
        } else if (Table.class.getSimpleName().equals(astClass)) {
            return "t";
        } else if (Title.class.getSimpleName().equals(astClass)) {
            return "t";
        } else {
            throw new IllegalArgumentException("");
        }
    }

    private static String computeType(Object object) {
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
            throw new IllegalArgumentException("Unexpected type: " + object.getClass().getCanonicalName());
        }
    }

    private void appendEqualsToExpressionObject(StringBuilder sb, String getterExpression, Object value) {
        if (value == null) {
            sb.append("assertThat(" + getterExpression + ").isNull();" + NL);
        } else if (referenceHolder.containsKey(System.identityHashCode(value))) {
            sb.append("assertThat(" + getterExpression + ").isSameAs(" + referenceHolder.get(System.identityHashCode(value)) + ");" + NL);
        } else {
            String astClass = computeType(value);
            String varName = createVariableForExpression(sb, getterExpression, value, astClass);

            // ObjectHolder item = new ObjectHolder(varName, value);
            // stack.push(item);
            appendObject(sb, varName, value);
        }
    }

    private static String equalsToExpressionBoolean(Boolean value) {
        if (value == null) {
            return "isNull()";
        } else if (value.booleanValue()) {
            return "isTrue()";
        } else {
            return "isFalse()";
        }
    }

    private static String equalsToExpressionInt(Integer value) {
        if (value == null) {
            return "isNull()";
        }
        return "isEqualTo(" + convertInt(value) + ")";
    }

    private static String equalsToExpressionString(String value) {
        if (value == null) {
            return "isNull()";
        }
        return "isEqualTo(" + convertString(value) + ")";
    }

    private static String equalsToExpressionStringList(List<String> value) {
        if (value == null) {
            return "isNull()";
        } else if (value.isEmpty()) {
            return "isEmpty()";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("containsExactly(");
            sb.append(value.stream().map(AssertCodeConverter::convertString).collect(Collectors.joining(", ")));
            sb.append(")");
            return sb.toString();
        }
    }

    private static String equalsToExpressionHorizontalAlignment(HorizontalAlignment value) {
        if (value == null) {
            return "isNull()";
        }
        return "isEqualTo(" + convertHorizontalAlignment(value) + ")";
    }

    private static String equalsToExpressionVerticalAlignment(VerticalAlignment value) {
        if (value == null) {
            return "isNull()";
        }
        return "isEqualTo(" + convertVerticalAlignment(value) + ")";
    }

    private static String convertInt(Integer value) {
        if (value == null) {
            return "null";
        }
        return value.toString();
    }

    private static String convertString(String value) {
        if (value == null) {
            return "null";
        }
        return "\"" + value.replace("\\", "\\\\").replace("\"", "\\\"").replace("\n", "\\n") + "\"";
    }

    private static String convertHorizontalAlignment(HorizontalAlignment value) {
        if (value == null) {
            return "null";
        }
        switch (value) {
        case LEFT:
            return "Table.HorizontalAlignment.LEFT";
        case CENTER:
            return "Table.HorizontalAlignment.CENTER";
        case RIGHT:
            return "Table.HorizontalAlignment.RIGHT";
        default:
            throw new IllegalArgumentException();
        }
    }

    private static String convertVerticalAlignment(VerticalAlignment value) {
        if (value == null) {
            return "null";
        }
        switch (value) {
        case TOP:
            return "Table.VerticalAlignment.TOP";
        case MIDDLE:
            return "Table.VerticalAlignment.MIDDLE";
        case BOTTOM:
            return "Table.VerticalAlignment.BOTTOM";
        default:
            throw new IllegalArgumentException();
        }
    }

    // private static class ObjectHolder {
    // final String varName;
    // final Object value;
    //
    // public ObjectHolder(String varName, Object value) {
    // super();
    // this.varName = varName;
    // this.value = value;
    // }
    // }
}
