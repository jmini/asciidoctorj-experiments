package fr.jmini.asciidoctorj.converter.assertcode;

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
import org.asciidoctor.converter.ConverterFor;

import fr.jmini.asciidoctorj.converter.code.AbstractCodeConverter;
import fr.jmini.asciidoctorj.converter.code.CodeConverterUtility;

@ConverterFor("assert-code")
public class AssertCodeConverter extends AbstractCodeConverter {

    public AssertCodeConverter(String backend, Map<String, Object> opts) {
        super(backend, opts);
    }

    @Override
    public String createAuthorCode(StringBuilder sb, Author aAuthor) {
        String varName = startMethod(sb, aAuthor, Author.class);
        appendAuthor(sb, varName, aAuthor);
        endMethod(sb);
        return varName;
    }

    @Override
    public String createBlockCode(StringBuilder sb, Block aBlock) {
        String varName = startMethod(sb, aBlock, Block.class);
        appendBlock(sb, varName, aBlock);
        endMethod(sb);
        return varName;
    }

    @Override
    public String createCellCode(StringBuilder sb, Cell aCell) {
        String varName = startMethod(sb, aCell, Cell.class);
        appendCell(sb, varName, aCell);
        endMethod(sb);
        return varName;
    }

    @Override
    public String createColumnCode(StringBuilder sb, Column aColumn) {
        String varName = startMethod(sb, aColumn, Column.class);
        appendColumn(sb, varName, aColumn);
        endMethod(sb);
        return varName;
    }

    @Override
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

    @Override
    public String createContentPartCode(StringBuilder sb, ContentPart aContentPart) {
        String varName = startMethod(sb, aContentPart, ContentPart.class);
        appendContentPart(sb, varName, aContentPart);
        endMethod(sb);
        return varName;
    }

    @Override
    public String createCursorCode(StringBuilder sb, Cursor aCursor) {
        String varName = startMethod(sb, aCursor, Cursor.class);
        appendCursor(sb, varName, aCursor);
        endMethod(sb);
        return varName;
    }

    @Override
    public String createDescriptionListCode(StringBuilder sb, DescriptionList aDescriptionList) {
        String varName = startMethod(sb, aDescriptionList, DescriptionList.class);
        appendDescriptionList(sb, varName, aDescriptionList);
        endMethod(sb);
        return varName;
    }

    @Override
    public String createDescriptionListEntryCode(StringBuilder sb, DescriptionListEntry aDescriptionListEntry) {
        String varName = startMethod(sb, aDescriptionListEntry, DescriptionListEntry.class);
        appendDescriptionListEntry(sb, varName, aDescriptionListEntry);
        endMethod(sb);
        return varName;
    }

    @Override
    public String createDocumentCode(StringBuilder sb, Document aDocument) {
        String varName = startMethod(sb, aDocument, Document.class);
        appendDocument(sb, varName, aDocument);
        endMethod(sb);
        return varName;
    }

    @Override
    public String createDocumentHeaderCode(StringBuilder sb, DocumentHeader aDocumentHeader) {
        String varName = startMethod(sb, aDocumentHeader, DocumentHeader.class);
        appendDocumentHeader(sb, varName, aDocumentHeader);
        endMethod(sb);
        return varName;
    }

    @Override
    public String createListCode(StringBuilder sb, org.asciidoctor.ast.List aList) {
        String varName = startMethod(sb, aList, org.asciidoctor.ast.List.class);
        appendList(sb, varName, aList);
        endMethod(sb);
        return varName;
    }

    @Override
    public String createListItemCode(StringBuilder sb, ListItem aListItem) {
        String varName = startMethod(sb, aListItem, ListItem.class);
        appendListItem(sb, varName, aListItem);
        endMethod(sb);
        return varName;
    }

    @Override
    public String createPhraseNodeCode(StringBuilder sb, PhraseNode aPhraseNode) {
        String varName = startMethod(sb, aPhraseNode, PhraseNode.class);
        appendPhraseNode(sb, varName, aPhraseNode);
        endMethod(sb);
        return varName;
    }

    @Override
    public String createRevisionInfoCode(StringBuilder sb, RevisionInfo aRevisionInfo) {
        String varName = startMethod(sb, aRevisionInfo, RevisionInfo.class);
        appendRevisionInfo(sb, varName, aRevisionInfo);
        endMethod(sb);
        return varName;
    }

    @Override
    public String createRowCode(StringBuilder sb, Row aRow) {
        String varName = startMethod(sb, aRow, Row.class);
        appendRow(sb, varName, aRow);
        endMethod(sb);
        return varName;
    }

    @Override
    public String createSectionCode(StringBuilder sb, Section aSection) {
        String varName = startMethod(sb, aSection, Section.class);
        appendSection(sb, varName, aSection);
        endMethod(sb);
        return varName;
    }

    @Override
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

    @Override
    public String createStructuredDocumentCode(StringBuilder sb, StructuredDocument aStructuredDocument) {
        String varName = startMethod(sb, aStructuredDocument, StructuredDocument.class);
        appendStructuredDocument(sb, varName, aStructuredDocument);
        endMethod(sb);
        return varName;
    }

    @Override
    public String createTableCode(StringBuilder sb, Table aTable) {
        String varName = startMethod(sb, aTable, Table.class);
        appendTable(sb, varName, aTable);
        endMethod(sb);
        return varName;
    }

    @Override
    public String createTitleCode(StringBuilder sb, Title aTitle) {
        String varName = startMethod(sb, aTitle, Title.class);
        appendTitle(sb, varName, aTitle);
        endMethod(sb);
        return varName;
    }

    @Override
    protected void appendAuthor(StringBuilder sb, String varName, Author author) {
        appendEqualsToExpressionString(sb, varName + ".getEmail()", author.getEmail());
        appendEqualsToExpressionString(sb, varName + ".getFullName()", author.getFullName());
        appendEqualsToExpressionString(sb, varName + ".getFirstName()", author.getFirstName());
        appendEqualsToExpressionString(sb, varName + ".getLastName()", author.getLastName());
        appendEqualsToExpressionString(sb, varName + ".getMiddleName()", author.getMiddleName());
        appendEqualsToExpressionString(sb, varName + ".getInitials()", author.getInitials());
    }

    @Override
    protected void appendBlock(StringBuilder sb, String varName, Block block) {
        appendStructuralNode(sb, varName, block);
        appendEqualsToExpressionStringList(sb, varName + ".getLines()", block.getLines());
        appendEqualsToExpressionString(sb, varName + ".getSource()", block.getSource());
    }

    @Override
    protected void appendCell(StringBuilder sb, String varName, Cell cell) {
        appendContentNode(sb, varName, cell);
        appendEqualsToExpressionObject(sb, varName + ".getColumn()", cell.getColumn());
        appendEqualsToExpressionInt(sb, varName + ".getColspan()", cell.getColspan());
        appendEqualsToExpressionInt(sb, varName + ".getRowspan()", cell.getRowspan());
        appendEqualsToExpressionString(sb, varName + ".getText()", cell.getText());
        appendEqualsToExpressionString(sb, varName + ".getSource()", cell.getSource());
        // appendEqualsToExpressionString(sb, varName + ".getContent()", cell.getContent());
        appendEqualsToExpressionString(sb, varName + ".getStyle()", cell.getStyle());
        appendEqualsToExpressionHorizontalAlignment(sb, varName + ".getHorizontalAlignment()", cell.getHorizontalAlignment());
        appendEqualsToExpressionVerticalAlignment(sb, varName + ".getVerticalAlignment()", cell.getVerticalAlignment());
        appendEqualsToExpressionObject(sb, varName + ".getInnerDocument()", cell.getInnerDocument());
    }

    @Override
    protected void appendColumn(StringBuilder sb, String varName, Column column) {
        appendContentNode(sb, varName, column);
        appendEqualsToExpressionString(sb, varName + ".getStyle()", column.getStyle());
        appendEqualsToExpressionObject(sb, varName + ".getTable()", column.getTable());
        appendEqualsToExpressionInt(sb, varName + ".getColumnNumber()", column.getColumnNumber());
        appendEqualsToExpressionInt(sb, varName + ".getWidth()", column.getWidth());
        appendEqualsToExpressionHorizontalAlignment(sb, varName + ".getHorizontalAlignment()", column.getHorizontalAlignment());
        appendEqualsToExpressionVerticalAlignment(sb, varName + ".getVerticalAlignment()", column.getVerticalAlignment());
    }

    @Override
    protected void appendContentNode(StringBuilder sb, String varName, ContentNode contentNode) {
        appendEqualsToExpressionString(sb, varName + ".getId()", contentNode.getId());
        appendEqualsToExpressionString(sb, varName + ".getNodeName()", contentNode.getNodeName());
        // getParent() can not be called on the root element, see https://github.com/asciidoctor/asciidoctorj/issues/593
        if (!(contentNode instanceof StructuralNode) || ((StructuralNode) contentNode).getLevel() > 0) {
            appendEqualsToExpressionObject(sb, varName + ".getParent()", contentNode.getParent());
        }
        appendEqualsToExpressionString(sb, varName + ".getContext()", contentNode.getContext());
        appendEqualsToExpressionObject(sb, varName + ".getDocument()", contentNode.getDocument());
        appendEqualsToExpressionBoolean(sb, varName + ".isInline()", contentNode.isInline());
        appendEqualsToExpressionBoolean(sb, varName + ".isBlock()", contentNode.isBlock());
        appendEqualsToExpressionMap(sb, varName + ".getAttributes()", contentNode.getAttributes());
        appendEqualsToExpressionStringList(sb, varName + ".getRoles()", contentNode.getRoles());
        appendEqualsToExpressionBoolean(sb, varName + ".isReftext()", contentNode.isReftext());
    }

    @Override
    protected void appendContentPart(StringBuilder sb, String varName, ContentPart contentPart) {
        appendEqualsToExpressionString(sb, varName + ".getId()", contentPart.getId());
        appendEqualsToExpressionInt(sb, varName + ".getLevel()", contentPart.getLevel());
        appendEqualsToExpressionString(sb, varName + ".getContext()", contentPart.getContext());
        appendEqualsToExpressionString(sb, varName + ".getStyle()", contentPart.getStyle());
        appendEqualsToExpressionString(sb, varName + ".getRole()", contentPart.getRole());
        appendEqualsToExpressionString(sb, varName + ".getTitle()", contentPart.getTitle());
        appendEqualsToExpressionMap(sb, varName + ".getAttributes()", contentPart.getAttributes());
        appendEqualsToExpressionObjectList(sb, varName + ".getParts()", contentPart.getParts());
    }

    @Override
    protected void appendCursor(StringBuilder sb, String varName, Cursor cursor) {
        appendEqualsToExpressionInt(sb, varName + ".getLineNumber()", cursor.getLineNumber());
        appendEqualsToExpressionString(sb, varName + ".getPath()", cursor.getPath());
        appendEqualsToExpressionString(sb, varName + ".getDir()", cursor.getDir());
        appendEqualsToExpressionString(sb, varName + ".getFile()", cursor.getFile());
    }

    @Override
    protected void appendDescriptionList(StringBuilder sb, String varName, DescriptionList descriptionList) {
        appendStructuralNode(sb, varName, descriptionList);
        appendEqualsToExpressionObjectList(sb, varName + ".getItems()", descriptionList.getItems());
    }

    @Override
    protected void appendDescriptionListEntry(StringBuilder sb, String varName, DescriptionListEntry descriptionListEntry) {
        appendEqualsToExpressionObject(sb, varName + ".getDescription()", descriptionListEntry.getDescription());
        appendEqualsToExpressionObjectList(sb, varName + ".getTerms()", descriptionListEntry.getTerms());
    }

    @Override
    protected void appendDocument(StringBuilder sb, String varName, Document document) {
        appendStructuralNode(sb, varName, document);
        appendEqualsToExpressionObject(sb, varName + ".getStructuredDoctitle()", document.getStructuredDoctitle());
        appendEqualsToExpressionString(sb, varName + ".getDoctitle()", document.getDoctitle());
        appendEqualsToExpressionMap(sb, varName + ".getOptions()", document.getOptions());
    }

    @Override
    protected void appendDocumentHeader(StringBuilder sb, String varName, DocumentHeader documentHeader) {
        appendEqualsToExpressionObjectList(sb, varName + ".getAuthors()", documentHeader.getAuthors());
        appendEqualsToExpressionObject(sb, varName + ".getDocumentTitle()", documentHeader.getDocumentTitle());
        appendEqualsToExpressionString(sb, varName + ".getPageTitle()", documentHeader.getPageTitle());
        appendEqualsToExpressionObject(sb, varName + ".getAuthor()", documentHeader.getAuthor());
        appendEqualsToExpressionObject(sb, varName + ".getRevisionInfo()", documentHeader.getRevisionInfo());
        appendEqualsToExpressionString(sb, varName + ".getPageTitle()", documentHeader.getPageTitle());
        appendEqualsToExpressionMap(sb, varName + ".getAttributes()", documentHeader.getAttributes());
    }

    @Override
    protected void appendList(StringBuilder sb, String varName, org.asciidoctor.ast.List list) {
        appendStructuralNode(sb, varName, list);
        appendEqualsToExpressionObjectList(sb, varName + ".getItems()", list.getItems());
        appendEqualsToExpressionBoolean(sb, varName + ".hasItems()", list.hasItems());
    }

    @Override
    protected void appendListItem(StringBuilder sb, String varName, ListItem listItem) {
        appendStructuralNode(sb, varName, listItem);
        appendEqualsToExpressionString(sb, varName + ".getMarker()", listItem.getMarker());
        appendEqualsToExpressionString(sb, varName + ".getText()", listItem.getText());
        appendEqualsToExpressionString(sb, varName + ".getSource()", listItem.getSource());
        appendEqualsToExpressionBoolean(sb, varName + ".hasText()", listItem.hasText());
    }

    @Override
    protected void appendPhraseNode(StringBuilder sb, String varName, PhraseNode phraseNode) {
        appendContentNode(sb, varName, phraseNode);
        appendEqualsToExpressionString(sb, varName + ".getType()", phraseNode.getType());
        appendEqualsToExpressionString(sb, varName + ".getText()", phraseNode.getText());
        appendEqualsToExpressionString(sb, varName + ".getTarget()", phraseNode.getTarget());
    }

    @Override
    protected void appendRevisionInfo(StringBuilder sb, String varName, RevisionInfo revisionInfo) {
        appendEqualsToExpressionString(sb, varName + ".getDate()", revisionInfo.getDate());
        appendEqualsToExpressionString(sb, varName + ".getNumber()", revisionInfo.getNumber());
        appendEqualsToExpressionString(sb, varName + ".getRemark()", revisionInfo.getRemark());
    }

    @Override
    protected void appendRow(StringBuilder sb, String varName, Row row) {
        appendEqualsToExpressionObjectList(sb, varName + ".getCells()", row.getCells());
    }

    @Override
    protected void appendSection(StringBuilder sb, String varName, Section section) {
        appendStructuralNode(sb, varName, section);
        appendEqualsToExpressionInt(sb, varName + ".getIndex()", section.getIndex());
        appendEqualsToExpressionInt(sb, varName + ".getNumber()", section.getNumber());
        appendEqualsToExpressionString(sb, varName + ".getSectionName()", section.getSectionName());
        appendEqualsToExpressionBoolean(sb, varName + ".isSpecial()", section.isSpecial());
        appendEqualsToExpressionBoolean(sb, varName + ".isNumbered()", section.isNumbered());
    }

    @Override
    protected void appendStructuralNode(StringBuilder sb, String varName, StructuralNode structuralNode) {
        appendContentNode(sb, varName, structuralNode);
        appendEqualsToExpressionString(sb, varName + ".getTitle()", structuralNode.getTitle());
        appendEqualsToExpressionString(sb, varName + ".getStyle()", structuralNode.getStyle());
        // appendEqualsToExpressionString(sb, varName + ".getContent()", structuralNode.getContent());
        appendEqualsToExpressionInt(sb, varName + ".getLevel()", structuralNode.getLevel());
        // appendEqualsToExpressionString(sb, varName + ".getContentModel()", structuralNode.getContentModel());
        appendEqualsToExpressionString(sb, varName + ".getContentModel()", structuralNode.getContentModel());
        appendEqualsToExpressionObject(sb, varName + ".getSourceLocation()", structuralNode.getSourceLocation());
        appendEqualsToExpressionStringList(sb, varName + ".getSubstitutions()", structuralNode.getSubstitutions());
        appendEqualsToExpressionObjectList(sb, varName + ".getBlocks()", structuralNode.getBlocks());
    }

    @Override
    protected void appendStructuredDocument(StringBuilder sb, String varName, StructuredDocument structuredDocument) {
        appendEqualsToExpressionObjectList(sb, varName + ".getParts()", structuredDocument.getParts());
        appendEqualsToExpressionObject(sb, varName + ".getHeader()", structuredDocument.getHeader());
    }

    @Override
    protected void appendTable(StringBuilder sb, String varName, Table table) {
        appendStructuralNode(sb, varName, table);
        appendEqualsToExpressionBoolean(sb, varName + ".hasHeaderOption()", table.hasHeaderOption());
        appendEqualsToExpressionObjectList(sb, varName + ".getColumns()", table.getColumns());
        appendEqualsToExpressionObjectList(sb, varName + ".getHeader()", table.getHeader());
        appendEqualsToExpressionObjectList(sb, varName + ".getFooter()", table.getFooter());
        appendEqualsToExpressionObjectList(sb, varName + ".getBody()", table.getBody());
        appendEqualsToExpressionString(sb, varName + ".getFrame()", table.getFrame());
        appendEqualsToExpressionString(sb, varName + ".getGrid()", table.getGrid());
    }

    @Override
    protected void appendTitle(StringBuilder sb, String varName, Title title) {
        appendEqualsToExpressionString(sb, varName + ".getMain()", title.getMain());
        appendEqualsToExpressionString(sb, varName + ".getSubtitle()", title.getSubtitle());
        appendEqualsToExpressionString(sb, varName + ".getCombined()", title.getCombined());
        appendEqualsToExpressionBoolean(sb, varName + ".isSanitized()", title.isSanitized());
    }

    @Override
    protected <T> String startMethod(StringBuilder sb, T value, Class<T> astClass) {
        String astVariable = "ast" + astClass.getSimpleName();
        sb.append("public void checkAst(" + astClass.getSimpleName() + " " + astVariable + ") {" + NL);
        return createVariableForExpression(sb, astVariable, value, astClass.getSimpleName());
    }

    private String createVariableForExpression(StringBuilder sb, String expression, Object value, String astClass) {
        String varName = createVariable(astClass, value);
        sb.append(astClass + " " + varName + " = " + expression + ";" + NL);
        return varName;
    }

    @Override
    protected String computeVariablePrefix(String astClass) {
        if (org.asciidoctor.ast.List.class.getCanonicalName()
                .equals(astClass)) {
            return "list";
        }
        return astClass.substring(0, 1)
                .toLowerCase() + astClass.substring(1);
    }

    private void appendEqualsToExpressionBoolean(StringBuilder sb, String expression, Boolean value) {
        sb.append("assertThat(" + expression + ")." + equalsToExpressionBoolean(value) + ";" + NL);
    }

    private void appendEqualsToExpressionInt(StringBuilder sb, String expression, Integer value) {
        sb.append("assertThat(" + expression + ")." + equalsToExpressionInt(value) + ";" + NL);
    }

    private void appendEqualsToExpressionString(StringBuilder sb, String expression, String value) {
        sb.append("assertThat(" + expression + ")." + equalsToExpressionString(value) + ";" + NL);
    }

    private void appendEqualsToExpressionStringList(StringBuilder sb, String expression, List<String> value) {
        sb.append("assertThat(" + expression + ")." + equalsToExpressionStringList(value) + ";" + NL);
    }

    private void appendEqualsToExpressionMap(StringBuilder sb, String expression, Map<? extends Object, Object> value) {
        sb.append("assertThat(" + expression + ")." + equalsToExpressionMap(value) + ";" + NL);
    }

    private void appendEqualsToExpressionHorizontalAlignment(StringBuilder sb, String expression, HorizontalAlignment value) {
        sb.append("assertThat(" + expression + ")." + equalsToExpressionHorizontalAlignment(value) + ";" + NL);
    }

    private void appendEqualsToExpressionVerticalAlignment(StringBuilder sb, String expression, VerticalAlignment value) {
        sb.append("assertThat(" + expression + ")." + equalsToExpressionVerticalAlignment(value) + ";" + NL);
    }

    private void appendEqualsToExpressionObject(StringBuilder sb, String getterExpression, Object value) {
        if (value == null) {
            sb.append("assertThat(" + getterExpression + ").isNull();" + NL);
        } else if (referenceHolder.containsKey(System.identityHashCode(value))) {
            sb.append("assertThat(" + getterExpression + ").isSameAs(" + referenceHolder.get(System.identityHashCode(value)) + ");" + NL);
        } else {
            String astClass = computeType(value);
            String varName = createVariableForExpression(sb, getterExpression, value, astClass);

            appendObject(sb, varName, value);
        }
    }

    private void appendEqualsToExpressionObjectList(StringBuilder sb, String getterExpression, List<?> value) {
        if (value == null) {
            sb.append("assertThat(" + getterExpression + ").isNull();" + NL);
        } else if (value.isEmpty()) {
            sb.append("assertThat(" + getterExpression + ").isEmpty();" + NL);
        } else {
            sb.append("assertThat(" + getterExpression + ").hasSize(" + value.size() + ");" + NL);
            int i = 0;
            for (Object item : value) {
                String itemClass = computeType(item);
                String itemVarName = createVariableForExpression(sb, "(" + itemClass + ") " + getterExpression + ".get(" + i + ")", item, itemClass);
                appendObject(sb, itemVarName, item);
                i = i + 1;
            }
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
        return "isEqualTo(" + CodeConverterUtility.convertInt(value) + ")";
    }

    private static String equalsToExpressionString(String value) {
        if (value == null) {
            return "isNull()";
        }
        return "isEqualTo(" + CodeConverterUtility.convertString(value) + ")";
    }

    private static String equalsToExpressionStringList(List<String> value) {
        if (value == null) {
            return "isNull()";
        } else if (value.isEmpty()) {
            return "isEmpty()";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("containsExactly(");
            sb.append(value.stream()
                    .map(CodeConverterUtility::convertString)
                    .collect(Collectors.joining(", ")));
            sb.append(")");
            return sb.toString();
        }
    }

    private static String equalsToExpressionMap(Map<? extends Object, Object> value) {
        if (value == null) {
            return "isNull()";
        } else if (value.isEmpty()) {
            return "isEmpty()";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("containsEntry(");
            sb.append(value.entrySet()
                    .stream()
                    .map(e -> {
                        return CodeConverterUtility.convertString(e.getKey()
                                .toString()) + ", " + CodeConverterUtility.convertObject(e.getValue());
                    })
                    .collect(Collectors.joining(").containsEntry(")));
            sb.append(")");
            return sb.toString();
        }
    }

    private static String equalsToExpressionHorizontalAlignment(HorizontalAlignment value) {
        if (value == null) {
            return "isNull()";
        }
        return "isEqualTo(" + CodeConverterUtility.convertHorizontalAlignment(value) + ")";
    }

    private static String equalsToExpressionVerticalAlignment(VerticalAlignment value) {
        if (value == null) {
            return "isNull()";
        }
        return "isEqualTo(" + CodeConverterUtility.convertVerticalAlignment(value) + ")";
    }
}
