package fr.jmini.eadoc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
import org.eclipse.emf.ecore.EObject;

public class EAdocCodeConverter {

    private static final String NL = "\n";
    private static final Map<String, Integer> counter = new HashMap<>();

    public static String createAuthorCode(StringBuilder sb, Author aAuthor) {
        String varName = createVariable(sb, EAuthor.class);
        appendAuthor(sb, varName, aAuthor);
        return varName;
    }

    public static String createBlockCode(StringBuilder sb, Block aBlock) {
        String varName = createVariable(sb, EBlock.class);
        appendBlock(sb, varName, aBlock);
        return varName;
    }

    public static String createCellCode(StringBuilder sb, Cell aCell) {
        String varName = createVariable(sb, ECell.class);
        appendCell(sb, varName, aCell);
        return varName;
    }

    public static String createColumnCode(StringBuilder sb, Column aColumn) {
        String varName = createVariable(sb, EColumn.class);
        appendColumn(sb, varName, aColumn);
        return varName;
    }

    public static String createContentNodeCode(StringBuilder sb, ContentNode contentNode) {
        if (contentNode instanceof Cell) {
            return createCellCode(sb, (Cell) contentNode);
        } else if (contentNode instanceof Column) {
            return createColumnCode(sb, (Column) contentNode);
        } else if (contentNode instanceof PhraseNode) {
            return createPhraseNodeCode(sb, (PhraseNode) contentNode);
        } else if (contentNode instanceof StructuralNode) {
            return createStructuralNodeCode(sb, (StructuralNode) contentNode);
        } else {
            String varName = createVariable(sb, EContentNode.class);
            appendContentNode(sb, varName, contentNode);
            return varName;
        }
    }

    public static String createContentPartCode(StringBuilder sb, ContentPart aContentPart) {
        String varName = createVariable(sb, EContentPart.class);
        appendContentPart(sb, varName, aContentPart);
        return varName;
    }

    public static String createCursorCode(StringBuilder sb, Cursor aCursor) {
        String varName = createVariable(sb, ECursor.class);
        appendCursor(sb, varName, aCursor);
        return varName;
    }

    public static String createDescriptionListCode(StringBuilder sb, DescriptionList aDescriptionList) {
        String varName = createVariable(sb, EDescriptionList.class);
        appendDescriptionList(sb, varName, aDescriptionList);
        return varName;
    }

    public static String createDescriptionListEntryCode(StringBuilder sb, DescriptionListEntry aDescriptionListEntry) {
        String varName = createVariable(sb, EDescriptionListEntry.class);
        appendDescriptionListEntry(sb, varName, aDescriptionListEntry);
        return varName;
    }

    public static String createDocumentCode(StringBuilder sb, Document aDocument) {
        String varName = createVariable(sb, EDocument.class);
        appendDocument(sb, varName, aDocument);
        return varName;
    }

    public static String createDocumentHeaderCode(StringBuilder sb, DocumentHeader aDocumentHeader) {
        String varName = createVariable(sb, EDocumentHeader.class);
        appendDocumentHeader(sb, varName, aDocumentHeader);
        return varName;
    }

    public static String createListCode(StringBuilder sb, org.asciidoctor.ast.List aList) {
        String varName = createVariable(sb, EAdocList.class);
        appendList(sb, varName, aList);
        return varName;
    }

    public static String createListItemCode(StringBuilder sb, ListItem aListItem) {
        String varName = createVariable(sb, EListItem.class);
        appendListItem(sb, varName, aListItem);
        return varName;
    }

    public static String createPhraseNodeCode(StringBuilder sb, PhraseNode aPhraseNode) {
        String varName = createVariable(sb, EPhraseNode.class);
        appendPhraseNode(sb, varName, aPhraseNode);
        return varName;
    }

    public static String createRevisionInfoCode(StringBuilder sb, RevisionInfo aRevisionInfo) {
        String varName = createVariable(sb, ERevisionInfo.class);
        appendRevisionInfo(sb, varName, aRevisionInfo);
        return varName;
    }

    public static String createRowCode(StringBuilder sb, Row aRow) {
        String varName = createVariable(sb, ERow.class);
        appendRow(sb, varName, aRow);
        return varName;
    }

    public static String createSectionCode(StringBuilder sb, Section aSection) {
        String varName = createVariable(sb, ESection.class);
        appendSection(sb, varName, aSection);
        return varName;
    }

    public static String createStructuralNodeCode(StringBuilder sb, StructuralNode structuralNode) {
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
            String varName = createVariable(sb, EStructuralNode.class);
            appendStructuralNode(sb, varName, structuralNode);
            return varName;
        }
    }

    public static String createStructuredDocumentCode(StringBuilder sb, StructuredDocument aStructuredDocument) {
        String varName = createVariable(sb, EStructuredDocument.class);
        appendStructuredDocument(sb, varName, aStructuredDocument);
        return varName;
    }

    public static String createTableCode(StringBuilder sb, Table aTable) {
        String varName = createVariable(sb, ETable.class);
        appendTable(sb, varName, aTable);
        return varName;
    }

    public static String createTitleCode(StringBuilder sb, Title aTitle) {
        String varName = createVariable(sb, ETitle.class);
        appendTitle(sb, varName, aTitle);
        return varName;
    }

    private static void appendAuthor(StringBuilder sb, String varName, Author author) {
        sb.append(varName + ".setEmail(" + convertString(author.getEmail()) + ");" + NL);
        sb.append(varName + ".setFullName(" + convertString(author.getFullName()) + ");" + NL);
        sb.append(varName + ".setFirstName(" + convertString(author.getFirstName()) + ");" + NL);
        sb.append(varName + ".setLastName(" + convertString(author.getLastName()) + ");" + NL);
        sb.append(varName + ".setMiddleName(" + convertString(author.getMiddleName()) + ");" + NL);
        sb.append(varName + ".setInitials(" + convertString(author.getInitials()) + ");" + NL);
    }

    private static String createVariable(StringBuilder sb, Class<? extends EObject> eClass) {
        String key = computeEClassKey(eClass);

        Integer c = counter.get(key);
        if (c == null) {
            c = 0;
        }
        c = c.intValue() + 1;
        counter.put(key, c);

        String varName = key + c.toString();
        sb.append(eClass.getSimpleName() + " " + varName + " = EadocFactory.eINSTANCE.create" + eClass.getSimpleName() + "();" + NL);
        return varName;
    }

    private static String computeEClassKey(Class<? extends EObject> eClass) {
        if (EAuthor.class.getSimpleName().equals(eClass.getSimpleName())) {
            return "a";
        } else if (EBlock.class.getSimpleName().equals(eClass.getSimpleName())) {
            return "b";
        } else if (ECell.class.getSimpleName().equals(eClass.getSimpleName())) {
            return "c";
        } else if (EColumn.class.getSimpleName().equals(eClass.getSimpleName())) {
            return "c";
        } else if (EContentNode.class.getSimpleName().equals(eClass.getSimpleName())) {
            return "n";
        } else if (EContentPart.class.getSimpleName().equals(eClass.getSimpleName())) {
            return "p";
        } else if (ECursor.class.getSimpleName().equals(eClass.getSimpleName())) {
            return "c";
        } else if (EDescriptionList.class.getSimpleName().equals(eClass.getSimpleName())) {
            return "l";
        } else if (EDescriptionListEntry.class.getSimpleName().equals(eClass.getSimpleName())) {
            return "e";
        } else if (EDocument.class.getSimpleName().equals(eClass.getSimpleName())) {
            return "d";
        } else if (EDocumentHeader.class.getSimpleName().equals(eClass.getSimpleName())) {
            return "h";
        } else if (EAdocList.class.getSimpleName().equals(eClass.getSimpleName())) {
            return "l";
        } else if (EListItem.class.getSimpleName().equals(eClass.getSimpleName())) {
            return "i";
        } else if (EPhraseNode.class.getSimpleName().equals(eClass.getSimpleName())) {
            return "n";
        } else if (ERevisionInfo.class.getSimpleName().equals(eClass.getSimpleName())) {
            return "r";
        } else if (ERow.class.getSimpleName().equals(eClass.getSimpleName())) {
            return "r";
        } else if (ESection.class.getSimpleName().equals(eClass.getSimpleName())) {
            return "s";
        } else if (EStructuralNode.class.getSimpleName().equals(eClass.getSimpleName())) {
            return "n";
        } else if (EStructuredDocument.class.getSimpleName().equals(eClass.getSimpleName())) {
            return "d";
        } else if (ETable.class.getSimpleName().equals(eClass.getSimpleName())) {
            return "t";
        } else if (ETitle.class.getSimpleName().equals(eClass.getSimpleName())) {
            return "t";
        } else {
            throw new IllegalArgumentException("");
        }
    }

    private static void appendBlock(StringBuilder sb, String varName, Block block) {
        appendStructuralNode(sb, varName, block);
        sb.append(varName + ".setLines(" + convertStringList(block.getLines()) + ");" + NL);
        sb.append(varName + ".setSource(" + convertString(block.getSource()) + ");" + NL);
    }

    private static void appendCell(StringBuilder sb, String varName, Cell cell) {
        // sb.append(varName + .setColumn(convertColumn(convertString(cell.getColumn())) + ");" + NL);
        sb.append(varName + ".setColspan(" + convertInt(cell.getColspan()) + ");" + NL);
        sb.append(varName + ".setRowspan(" + convertInt(cell.getRowspan()) + ");" + NL);
        // sb.append(varName + ".set(" + convertString(cell.getText()) + ");" + NL);
        sb.append(varName + ".setSource(" + convertString(cell.getSource()) + ");" + NL);
        sb.append(varName + ".setStyle(" + convertString(cell.getStyle()) + ");" + NL);
        sb.append(varName + ".setHorizontalAlignment(" + convertHorizontalAlignment(cell.getHorizontalAlignment()) + ");" + NL);
        sb.append(varName + ".setVerticalAlignment(" + convertVerticalAlignment(cell.getVerticalAlignment()) + ");" + NL);
        // XXX sb.append(varName + ".setInnerDocument(" + convertString(cell.getInnerDocument()) + ");" + NL);
    }

    private static void appendColumn(StringBuilder sb, String varName, Column column) {
        sb.append(varName + ".setStyle(" + convertString(column.getStyle()) + ");" + NL);
        // sb.append(varName + ".setTable(" + convertTable(column.getTable()) + ");" + NL);
        sb.append(varName + ".setWidth(" + convertInt(column.getWidth()) + ");" + NL);
        sb.append(varName + ".setHorizontalAlignment(" + convertHorizontalAlignment(column.getHorizontalAlignment()) + ");" + NL);
        sb.append(varName + ".setVerticalAlignment(" + convertVerticalAlignment(column.getVerticalAlignment()) + ");" + NL);
    }

    private static void appendContentNode(StringBuilder sb, String varName, ContentNode contentNode) {
        sb.append(varName + ".setId(" + convertString(contentNode.getId()) + ");" + NL);
        sb.append(varName + ".setNodeName(" + convertString(contentNode.getNodeName()) + ");" + NL);
        // eContentNode.setParent(contentNode.getParent());" + NL);
        sb.append(varName + ".setContext(" + convertString(contentNode.getContext()) + ");" + NL);
        sb.append(varName + ".setInline(" + convertBoolean(contentNode.isInline()) + ");" + NL);
        sb.append(varName + ".setBlock(" + convertBoolean(contentNode.isBlock()) + ");" + NL);
        // XXX sb.append(varName + ".setAttributes(" + convertString(contentNode.getAttributes()) + ");" + NL);
        sb.append(varName + ".setRoles(" + convertStringList(contentNode.getRoles()) + ");" + NL);
    }

    private static void appendContentPart(StringBuilder sb, String varName, ContentPart contentPart) {
        sb.append(varName + ".setId(" + convertString(contentPart.getId()) + ");" + NL);
        sb.append(varName + ".setLevel(" + convertInt(contentPart.getLevel()) + ");" + NL);
        sb.append(varName + ".setContext(" + convertString(contentPart.getContext()) + ");" + NL);
        sb.append(varName + ".setStyle(" + convertString(contentPart.getStyle()) + ");" + NL);
        sb.append(varName + ".setRole(" + convertString(contentPart.getRole()) + ");" + NL);
        sb.append(varName + ".setTitle(" + convertString(contentPart.getTitle()) + ");" + NL);
        // XXX sb.append(varName + ".setAttributes(" + convertString(contentPart.getAttributes()) + ");" + NL);
        // XXX convertAndAddAllContentPart(eContentPart.getParts(), contentPart.getParts());
    }

    private static void appendCursor(StringBuilder sb, String varName, Cursor cursor) {
        sb.append(varName + ".setLineNumber(" + convertInt(cursor.getLineNumber()) + ");" + NL);
        sb.append(varName + ".setPath(" + convertString(cursor.getPath()) + ");" + NL);
        sb.append(varName + ".setDir(" + convertString(cursor.getDir()) + ");" + NL);
        sb.append(varName + ".setFile(" + convertString(cursor.getFile()) + ");" + NL);
    }

    private static void appendDescriptionList(StringBuilder sb, String varName, DescriptionList descriptionList) {
        appendStructuralNode(sb, varName, descriptionList);
        // XXX eDescriptionList.set(descriptionList.getItems());
    }

    private static void appendDescriptionListEntry(StringBuilder sb, String varName, DescriptionListEntry descriptionListEntry) {
        // XXX eDescriptionListEntry.set(descriptionListEntry.getTerms());
        // XXX sb.append(varName + ".setDescription(" + convertString(descriptionListEntry.getDescription()) + ");" + NL);
    }

    private static void appendDocument(StringBuilder sb, String varName, Document document) {
        appendStructuralNode(sb, varName, document);
        // XXX sb.append(varName + ".setStructuredDoctitle(" +
        // convertTitle(document.getStructuredDoctitle()) + ");" + NL);
        sb.append(varName + ".setDoctitle(" + convertString(document.getDoctitle()) + ");" + NL);
        // XXX sb.append(varName + ".setOptions(" + convertString(document.getOptions()) + ");" + NL);
    }

    private static void appendDocumentHeader(StringBuilder sb, String varName, DocumentHeader documentHeader) {
        // sb.append(varName + ".set( documentHeader. getAuthors() + ");" + NL);
        // XXX sb.append(varName + ".setDocumentTitle(" +
        // convertTitle(documentHeader.getDocumentTitle()) + ");" + NL);
        sb.append(varName + ".setPageTitle(" + convertString(documentHeader.getPageTitle()) + ");" + NL);
        // sb.append(varName + ".setA(documentHeader. getAuthor() + ");" + NL);
        // XXX sb.append(varName + ".setRevisionInfo(" +
        // convertRevisionInfo(documentHeader.getRevisionInfo()) + ");" + NL);
        // XXX sb.append(varName + ".setAttributes(" + convertString(documentHeader.getAttributes()) + ");" + NL);
    }

    private static void appendList(StringBuilder sb, String varName, org.asciidoctor.ast.List list) {
        appendStructuralNode(sb, varName, list);
        // eAdocList.set(list.getItems());
    }

    private static void appendListItem(StringBuilder sb, String varName, ListItem listItem) {
        appendStructuralNode(sb, varName, listItem);
        sb.append(varName + ".setMarker(" + convertString(listItem.getMarker()) + ");" + NL);
        sb.append(varName + ".setText(" + convertString(listItem.getText()) + ");" + NL);
        sb.append(varName + ".setSource(" + convertString(listItem.getSource()) + ");" + NL);
    }

    private static void appendPhraseNode(StringBuilder sb, String varName, PhraseNode phraseNode) {
        sb.append(varName + ".setType(" + convertString(phraseNode.getType()) + ");" + NL);
        sb.append(varName + ".setText(" + convertString(phraseNode.getText()) + ");" + NL);
        sb.append(varName + ".setTarget(" + convertString(phraseNode.getTarget()) + ");" + NL);
    }

    private static void appendRevisionInfo(StringBuilder sb, String varName, RevisionInfo revisionInfo) {
        sb.append(varName + ".setDate(" + convertString(revisionInfo.getDate()) + ");" + NL);
        sb.append(varName + ".setNumber(" + convertString(revisionInfo.getNumber()) + ");" + NL);
        sb.append(varName + ".setRemark(" + convertString(revisionInfo.getRemark()) + ");" + NL);
    }

    private static void appendRow(StringBuilder sb, String varName, Row row) {
        // eRow.set(row.getCells());
    }

    private static void appendSection(StringBuilder sb, String varName, Section section) {
        appendStructuralNode(sb, varName, section);
        sb.append(varName + ".setIndex(" + convertInt(section.getIndex()) + ");" + NL);
        sb.append(varName + ".setNumber(" + convertInt(section.getNumber()) + ");" + NL);
        sb.append(varName + ".setSectionName(" + convertString(section.getSectionName()) + ");" + NL);
        sb.append(varName + ".setSpecial(" + convertBoolean(section.isSpecial()) + ");" + NL);
        sb.append(varName + ".setNumbered(" + convertBoolean(section.isNumbered()) + ");" + NL);
    }

    private static void appendStructuralNode(StringBuilder sb, String varName, StructuralNode structuralNode) {
        appendContentNode(sb, varName, structuralNode);
        sb.append(varName + ".setTitle(" + structuralNode.getTitle() + ");" + NL);
        sb.append(varName + ".setStyle(" + structuralNode.getStyle() + ");" + NL);
        // eStructuralNode.set(structuralNode.getContent());
        sb.append(varName + ".setLevel(" + structuralNode.getLevel() + ");" + NL);
        // eStructuralNode.setContentModel(structuralNode.getContentModel());
        if (structuralNode.getSourceLocation() != null) {
            String sourceLocationVarName = createCursorCode(sb, structuralNode.getSourceLocation());
            sb.append(varName + ".setSourceLocation(" + sourceLocationVarName + ");" + NL);
        } else {
            sb.append(varName + ".setSourceLocation(null);" + NL);
        }
        // eStructuralNode.setSubstitutions(structuralNode.getSubstitutions());
        if (structuralNode.getBlocks() != null) {
            for (StructuralNode block : structuralNode.getBlocks()) {
                String blockVarName = createStructuralNodeCode(sb, block);
                sb.append(varName + ".getBlocks().add(" + blockVarName + ");" + NL);
            }
        }
    }

    private static void appendStructuredDocument(StringBuilder sb, String varName, StructuredDocument structuredDocument) {
        // eStructuredDocument.set(structuredDocument.getParts());
        // XXX sb.append(varName + ".setHeader(" + convertString(structuredDocument.getHeader()) + ");" + NL);
    }

    private static void appendTable(StringBuilder sb, String varName, Table table) {
        appendStructuralNode(sb, varName, table);
        sb.append(varName + ".setHeaderOption(" + convertBoolean(table.hasHeaderOption()) + ");" + NL);
        // sb.append(varName + ".set( " + table.getColumns() + ");" + NL);
        // sb.append(varName + ".set( " + table.getHeader() + ");" + NL);
        // sb.append(varName + ".set( " + table.getFooter() + ");" + NL);
        // sb.append(varName + ".set( " + table.getBody() + ");" + NL);
        sb.append(varName + ".setFrame(" + convertString(table.getFrame()) + ");" + NL);
        sb.append(varName + ".setGrid(" + convertString(table.getGrid()) + ");" + NL);
    }

    private static void appendTitle(StringBuilder sb, String varName, Title title) {
        sb.append(varName + ".setMain(" + convertString(title.getMain()) + ");" + NL);
        sb.append(varName + ".setSubtitle(" + convertString(title.getSubtitle()) + ");" + NL);
        sb.append(varName + ".setCombined(" + convertString(title.getCombined()) + ");" + NL);
        sb.append(varName + ".setSanitized(" + convertBoolean(title.isSanitized()) + ");" + NL);
    }

    private static String convertBoolean(Boolean value) {
        if (value == null) {
            return "null";
        }
        return value.toString();
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

    private static String convertStringList(List<String> value) {
        if (value == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Arrays.asList(");
        sb.append(value.stream().map(EAdocCodeConverter::convertString).collect(Collectors.joining(",\n")));
        sb.append(")");
        return sb.toString();
    }

    private static String convertHorizontalAlignment(HorizontalAlignment horizontalAlignment) {
        switch (horizontalAlignment) {
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

    private static String convertVerticalAlignment(VerticalAlignment verticalAlignment) {
        switch (verticalAlignment) {
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
}
