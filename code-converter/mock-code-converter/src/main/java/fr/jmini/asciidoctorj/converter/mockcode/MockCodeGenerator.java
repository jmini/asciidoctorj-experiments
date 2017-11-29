package fr.jmini.asciidoctorj.converter.mockcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
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

import fr.jmini.asciidoctorj.converter.code.AbstractCodeGenerator;
import fr.jmini.asciidoctorj.converter.code.CodeConverterUtility;

public class MockCodeGenerator extends AbstractCodeGenerator {

    @Override
    protected void appendAuthor(StringBuilder sb, String varName, Author author) {
        appendWhenExpressionString(sb, varName + ".getEmail()", author.getEmail());
        appendWhenExpressionString(sb, varName + ".getFullName()", author.getFullName());
        appendWhenExpressionString(sb, varName + ".getFirstName()", author.getFirstName());
        appendWhenExpressionString(sb, varName + ".getLastName()", author.getLastName());
        appendWhenExpressionString(sb, varName + ".getMiddleName()", author.getMiddleName());
        appendWhenExpressionString(sb, varName + ".getInitials()", author.getInitials());
    }

    @Override
    protected void appendBlock(StringBuilder sb, String varName, Block block) {
        appendStructuralNode(sb, varName, block);
        appendWhenExpressionStringList(sb, varName + ".getLines()", block.getLines());
        appendWhenExpressionString(sb, varName + ".getSource()", block.getSource());
    }

    @Override
    protected void appendCell(StringBuilder sb, String varName, Cell cell) {
        appendContentNode(sb, varName, cell);
        appendWhenExpressionObject(sb, varName + ".getColumn()", cell.getColumn());
        appendWhenExpressionInt(sb, varName + ".getColspan()", cell.getColspan());
        appendWhenExpressionInt(sb, varName + ".getRowspan()", cell.getRowspan());
        appendWhenExpressionString(sb, varName + ".getText()", cell.getText());
        appendWhenExpressionString(sb, varName + ".getSource()", cell.getSource());
        // appendWhenExpressionString(sb, varName + ".getContent()", cell.getContent());
        appendWhenExpressionString(sb, varName + ".getStyle()", cell.getStyle());
        appendWhenExpressionHorizontalAlignment(sb, varName + ".getHorizontalAlignment()", cell.getHorizontalAlignment());
        appendWhenExpressionVerticalAlignment(sb, varName + ".getVerticalAlignment()", cell.getVerticalAlignment());
        appendWhenExpressionObject(sb, varName + ".getInnerDocument()", cell.getInnerDocument());
    }

    @Override
    protected void appendColumn(StringBuilder sb, String varName, Column column) {
        appendContentNode(sb, varName, column);
        appendWhenExpressionString(sb, varName + ".getStyle()", column.getStyle());
        appendWhenExpressionObject(sb, varName + ".getTable()", column.getTable());
        appendWhenExpressionInt(sb, varName + ".getColumnNumber()", column.getColumnNumber());
        appendWhenExpressionInt(sb, varName + ".getWidth()", column.getWidth());
        appendWhenExpressionHorizontalAlignment(sb, varName + ".getHorizontalAlignment()", column.getHorizontalAlignment());
        appendWhenExpressionVerticalAlignment(sb, varName + ".getVerticalAlignment()", column.getVerticalAlignment());
    }

    @Override
    protected void appendContentNode(StringBuilder sb, String varName, ContentNode contentNode) {
        appendWhenExpressionString(sb, varName + ".getId()", contentNode.getId());
        appendWhenExpressionString(sb, varName + ".getNodeName()", contentNode.getNodeName());
        // getParent() can not be called on the root element, see https://github.com/asciidoctor/asciidoctorj/issues/593
        if (!(contentNode instanceof StructuralNode) || ((StructuralNode) contentNode).getLevel() > 0) {
            appendWhenExpressionObject(sb, varName + ".getParent()", contentNode.getParent());
        }
        appendWhenExpressionString(sb, varName + ".getContext()", contentNode.getContext());
        appendWhenExpressionObject(sb, varName + ".getDocument()", contentNode.getDocument());
        // NOTE: contentNode.isInline() throws NotImplementedError at RUBY.inline?
        // appendWhenExpressionBoolean(sb, varName + ".isInline()", contentNode.isInline());
        // NOTE: contentNode.isBlock() throws NotImplementedError at RUBY.block?
        // appendWhenExpressionBoolean(sb, varName + ".isBlock()", contentNode.isBlock());
        appendWhenExpressionMap(sb, varName + ".getAttributes()", String.class, contentNode.getAttributes());
        appendWhenExpressionStringList(sb, varName + ".getRoles()", contentNode.getRoles());
        appendWhenExpressionBoolean(sb, varName + ".isReftext()", contentNode.isReftext());
    }

    @Override
    protected void appendContentPart(StringBuilder sb, String varName, ContentPart contentPart) {
        appendWhenExpressionString(sb, varName + ".getId()", contentPart.getId());
        appendWhenExpressionInt(sb, varName + ".getLevel()", contentPart.getLevel());
        appendWhenExpressionString(sb, varName + ".getContext()", contentPart.getContext());
        appendWhenExpressionString(sb, varName + ".getStyle()", contentPart.getStyle());
        appendWhenExpressionString(sb, varName + ".getRole()", contentPart.getRole());
        appendWhenExpressionString(sb, varName + ".getTitle()", contentPart.getTitle());
        appendWhenExpressionMap(sb, varName + ".getAttributes()", String.class, contentPart.getAttributes());
        appendWhenExpressionObjectList(sb, varName + ".getParts()", contentPart.getParts());
    }

    @Override
    protected void appendCursor(StringBuilder sb, String varName, Cursor cursor) {
        appendWhenExpressionInt(sb, varName + ".getLineNumber()", cursor.getLineNumber());
        appendWhenExpressionString(sb, varName + ".getPath()", cursor.getPath());
        appendWhenExpressionString(sb, varName + ".getDir()", cursor.getDir());
        appendWhenExpressionString(sb, varName + ".getFile()", cursor.getFile());
    }

    @Override
    protected void appendDescriptionList(StringBuilder sb, String varName, DescriptionList descriptionList) {
        appendStructuralNode(sb, varName, descriptionList);
        appendWhenExpressionObjectList(sb, varName + ".getItems()", descriptionList.getItems());
    }

    @Override
    protected void appendDescriptionListEntry(StringBuilder sb, String varName, DescriptionListEntry descriptionListEntry) {
        appendWhenExpressionObject(sb, varName + ".getDescription()", descriptionListEntry.getDescription());
        appendWhenExpressionObjectList(sb, varName + ".getTerms()", descriptionListEntry.getTerms());
    }

    @Override
    protected void appendDocument(StringBuilder sb, String varName, Document document) {
        appendStructuralNode(sb, varName, document);
        appendWhenExpressionObject(sb, varName + ".getStructuredDoctitle()", document.getStructuredDoctitle());
        appendWhenExpressionString(sb, varName + ".getDoctitle()", document.getDoctitle());
        appendWhenExpressionMap(sb, varName + ".getOptions()", Object.class, document.getOptions());
    }

    @Override
    protected void appendDocumentHeader(StringBuilder sb, String varName, DocumentHeader documentHeader) {
        appendWhenExpressionObjectList(sb, varName + ".getAuthors()", documentHeader.getAuthors());
        appendWhenExpressionObject(sb, varName + ".getDocumentTitle()", documentHeader.getDocumentTitle());
        appendWhenExpressionString(sb, varName + ".getPageTitle()", documentHeader.getPageTitle());
        appendWhenExpressionObject(sb, varName + ".getAuthor()", documentHeader.getAuthor());
        appendWhenExpressionObject(sb, varName + ".getRevisionInfo()", documentHeader.getRevisionInfo());
        appendWhenExpressionString(sb, varName + ".getPageTitle()", documentHeader.getPageTitle());
        appendWhenExpressionMap(sb, varName + ".getAttributes()", String.class, documentHeader.getAttributes());
    }

    @Override
    protected void appendList(StringBuilder sb, String varName, org.asciidoctor.ast.List list) {
        appendStructuralNode(sb, varName, list);
        appendWhenExpressionObjectList(sb, varName + ".getItems()", list.getItems());
        appendWhenExpressionBoolean(sb, varName + ".hasItems()", list.hasItems());
    }

    @Override
    protected void appendListItem(StringBuilder sb, String varName, ListItem listItem) {
        appendStructuralNode(sb, varName, listItem);
        appendWhenExpressionString(sb, varName + ".getMarker()", listItem.getMarker());
        appendWhenExpressionString(sb, varName + ".getText()", listItem.getText());
        appendWhenExpressionString(sb, varName + ".getSource()", listItem.getSource());
        appendWhenExpressionBoolean(sb, varName + ".hasText()", listItem.hasText());
    }

    @Override
    protected void appendPhraseNode(StringBuilder sb, String varName, PhraseNode phraseNode) {
        appendContentNode(sb, varName, phraseNode);
        appendWhenExpressionString(sb, varName + ".getType()", phraseNode.getType());
        appendWhenExpressionString(sb, varName + ".getText()", phraseNode.getText());
        appendWhenExpressionString(sb, varName + ".getTarget()", phraseNode.getTarget());
    }

    @Override
    protected void appendRevisionInfo(StringBuilder sb, String varName, RevisionInfo revisionInfo) {
        appendWhenExpressionString(sb, varName + ".getDate()", revisionInfo.getDate());
        appendWhenExpressionString(sb, varName + ".getNumber()", revisionInfo.getNumber());
        appendWhenExpressionString(sb, varName + ".getRemark()", revisionInfo.getRemark());
    }

    @Override
    protected void appendRow(StringBuilder sb, String varName, Row row) {
        appendWhenExpressionObjectList(sb, varName + ".getCells()", row.getCells());
    }

    @Override
    protected void appendSection(StringBuilder sb, String varName, Section section) {
        appendStructuralNode(sb, varName, section);
        appendWhenExpressionInt(sb, varName + ".getIndex()", section.getIndex());
        appendWhenExpressionInt(sb, varName + ".getNumber()", section.getNumber());
        appendWhenExpressionString(sb, varName + ".getSectionName()", section.getSectionName());
        appendWhenExpressionBoolean(sb, varName + ".isSpecial()", section.isSpecial());
        appendWhenExpressionBoolean(sb, varName + ".isNumbered()", section.isNumbered());
    }

    @Override
    protected void appendStructuralNode(StringBuilder sb, String varName, StructuralNode structuralNode) {
        appendContentNode(sb, varName, structuralNode);
        appendWhenExpressionString(sb, varName + ".getTitle()", structuralNode.getTitle());
        appendWhenExpressionString(sb, varName + ".getStyle()", structuralNode.getStyle());
        // appendWhenExpressionString(sb, varName + ".getContent()", structuralNode.getContent());
        appendWhenExpressionInt(sb, varName + ".getLevel()", structuralNode.getLevel());
        appendWhenExpressionString(sb, varName + ".getContentModel()", structuralNode.getContentModel());
        appendWhenExpressionObject(sb, varName + ".getSourceLocation()", structuralNode.getSourceLocation());
        appendWhenExpressionStringList(sb, varName + ".getSubstitutions()", structuralNode.getSubstitutions());
        appendWhenExpressionObjectList(sb, varName + ".getBlocks()", structuralNode.getBlocks());
    }

    @Override
    protected void appendStructuredDocument(StringBuilder sb, String varName, StructuredDocument structuredDocument) {
        appendWhenExpressionObjectList(sb, varName + ".getParts()", structuredDocument.getParts());
        appendWhenExpressionObject(sb, varName + ".getHeader()", structuredDocument.getHeader());
    }

    @Override
    protected void appendTable(StringBuilder sb, String varName, Table table) {
        appendStructuralNode(sb, varName, table);
        appendWhenExpressionBoolean(sb, varName + ".hasHeaderOption()", table.hasHeaderOption());
        appendWhenExpressionObjectList(sb, varName + ".getColumns()", table.getColumns());
        appendWhenExpressionObjectList(sb, varName + ".getHeader()", table.getHeader());
        appendWhenExpressionObjectList(sb, varName + ".getFooter()", table.getFooter());
        appendWhenExpressionObjectList(sb, varName + ".getBody()", table.getBody());
        appendWhenExpressionString(sb, varName + ".getFrame()", table.getFrame());
        appendWhenExpressionString(sb, varName + ".getGrid()", table.getGrid());
    }

    @Override
    protected void appendTitle(StringBuilder sb, String varName, Title title) {
        appendWhenExpressionString(sb, varName + ".getMain()", title.getMain());
        appendWhenExpressionString(sb, varName + ".getSubtitle()", title.getSubtitle());
        appendWhenExpressionString(sb, varName + ".getCombined()", title.getCombined());
        appendWhenExpressionBoolean(sb, varName + ".isSanitized()", title.isSanitized());
    }

    @Override
    protected <T> String startMethod(StringBuilder sb, T value, Class<T> astClass) {
        String type = computeType(value);
        sb.append("public " + type + " createMock() {" + NL);
        String createMockExpression = createMockExpression(type);
        return createVariableForExpression(sb, createMockExpression, value, astClass.getSimpleName());
    }

    @Override
    protected void endMethod(StringBuilder sb, String varName) {
        sb.append("return " + varName + ";" + NL);
        sb.append("}");
    }

    private String createMockExpression(String type) {
        return "mock(" + type + ".class)";
    }

    @Override
    protected String computeVariablePrefix(String astClass) {
        if (org.asciidoctor.ast.List.class.getCanonicalName()
                .equals(astClass)) {
            return "mockList";
        }
        return "mock" + astClass;
    }

    private void appendWhenExpressionBoolean(StringBuilder sb, String expression, Boolean value) {
        sb.append("when(" + expression + ")." + thenReturnExpressionBoolean(value) + ";" + NL);
    }

    private void appendWhenExpressionInt(StringBuilder sb, String expression, Integer value) {
        sb.append("when(" + expression + ")." + thenReturnExpressionInt(value) + ";" + NL);
    }

    private void appendWhenExpressionString(StringBuilder sb, String expression, String value) {
        sb.append("when(" + expression + ")." + thenReturnExpressionString(value) + ";" + NL);
    }

    private void appendWhenExpressionStringList(StringBuilder sb, String expression, List<String> value) {
        sb.append("when(" + expression + ")." + thenReturnExpressionStringList(value) + ";" + NL);
    }

    private <T extends Object> void appendWhenExpressionMap(StringBuilder sb, String expression, Class<T> keyClass, Map<T, Object> value) {
        if (value == null) {
            sb.append("when(" + expression + ").thenReturn(null);" + NL);
        } else if (value.isEmpty()) {
            sb.append("when(" + expression + ").thenReturn(Collections.emptyMap());" + NL);
        } else if (value.size() == 1) {
            Entry<? extends Object, Object> e = value.entrySet()
                    .iterator()
                    .next();
            String entryKey = CodeConverterUtility.convertString(e.getKey()
                    .toString());
            String entryValue = CodeConverterUtility.convertObject(e.getValue());
            sb.append("when(" + expression + ").thenReturn(Collections.singletonMap(" + entryKey + ", " + entryValue + "));" + NL);
        } else {
            String mapVarName = createVariable("map", null);
            sb.append("ImmutableMap<" + keyClass.getSimpleName() + ", Object> " + mapVarName + " = ImmutableMap.<" + keyClass.getSimpleName() + ", Object>builder()" + NL);
            sb.append(".put(");
            sb.append(value.entrySet()
                    .stream()
                    .map(e -> {
                        return CodeConverterUtility.convertString(e.getKey()
                                .toString()) + ", " + CodeConverterUtility.convertObject(e.getValue());
                    })
                    .collect(Collectors.joining(")" + NL + ".put(")));
            sb.append(")" + NL + ".build();" + NL);

            sb.append("when(" + expression + ").thenReturn(" + mapVarName + ");" + NL);
        }
    }

    private void appendWhenExpressionHorizontalAlignment(StringBuilder sb, String expression, HorizontalAlignment value) {
        sb.append("when(" + expression + ")." + thenReturnExpressionHorizontalAlignment(value) + ";" + NL);
    }

    private void appendWhenExpressionVerticalAlignment(StringBuilder sb, String expression, VerticalAlignment value) {
        sb.append("when(" + expression + ")." + thenReturnExpressionVerticalAlignment(value) + ";" + NL);
    }

    private void appendWhenExpressionObject(StringBuilder sb, String getterExpression, Object value) {
        if (value == null) {
            sb.append("when(" + getterExpression + ").thenReturn(null);" + NL);
        } else {
            if (!referenceHolder.containsKey(System.identityHashCode(value))) {
                String astClass = computeType(value);
                String createMockExpression = createMockExpression(astClass);
                String varName = createVariableForExpression(sb, createMockExpression, value, astClass);
                appendObject(sb, varName, value);
            }
            sb.append("when(" + getterExpression + ").thenReturn(" + referenceHolder.get(System.identityHashCode(value)) + ");" + NL);
        }
    }

    private void appendWhenExpressionObjectList(StringBuilder sb, String getterExpression, List<?> value) {
        if (value == null) {
            sb.append("when(" + getterExpression + ").thenReturn(null);" + NL);
        } else if (value.isEmpty()) {
            sb.append("when(" + getterExpression + ").thenReturn(Collections.emptyList());" + NL);
        } else {
            List<String> itemVarNames = new ArrayList<>();
            int i = 0;
            for (Object item : value) {
                String itemClass = computeType(item);
                String itemCreateMockExpression = createMockExpression(itemClass);
                String itemVarName = createVariableForExpression(sb, itemCreateMockExpression, item, itemClass);
                appendObject(sb, itemVarName, item);
                itemVarNames.add(itemVarName);
                i = i + 1;
            }
            sb.append("when(" + getterExpression + ")");
            sb.append(".thenReturn(");
            if (itemVarNames.size() == 1) {
                sb.append("Collections.singletonList(");
            } else {
                sb.append("Arrays.asList(");
            }
            sb.append(itemVarNames.stream()
                    .collect(Collectors.joining(", ")));
            sb.append("))");
            sb.append(";" + NL);
        }
    }

    private static String thenReturnExpressionBoolean(Boolean value) {
        if (value == null) {
            return "thenReturn(null)";
        } else if (value.booleanValue()) {
            return "thenReturn(true)";
        } else {
            return "thenReturn(false)";
        }
    }

    private static String thenReturnExpressionInt(Integer value) {
        if (value == null) {
            return "thenReturn(null)";
        }
        return "thenReturn(" + CodeConverterUtility.convertInt(value) + ")";
    }

    private static String thenReturnExpressionString(String value) {
        if (value == null) {
            return "thenReturn(null)";
        }
        return "thenReturn(" + CodeConverterUtility.convertString(value) + ")";
    }

    private static String thenReturnExpressionStringList(List<String> value) {
        if (value == null) {
            return "thenReturn(null)";
        } else if (value.isEmpty()) {
            return "thenReturn(Collections.emptyList())";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("thenReturn(");
            if (value.size() == 1) {
                sb.append("Collections.singletonList(");
            } else {
                sb.append("Arrays.asList(");
            }
            sb.append(value.stream()
                    .map(CodeConverterUtility::convertString)
                    .collect(Collectors.joining(", ")));
            sb.append("))");
            return sb.toString();
        }
    }

    private static String thenReturnExpressionHorizontalAlignment(HorizontalAlignment value) {
        if (value == null) {
            return "thenReturn(null)";
        }
        return "thenReturn(" + CodeConverterUtility.convertHorizontalAlignment(value) + ")";
    }

    private static String thenReturnExpressionVerticalAlignment(VerticalAlignment value) {
        if (value == null) {
            return "thenReturn(null)";
        }
        return "thenReturn(" + CodeConverterUtility.convertVerticalAlignment(value) + ")";
    }
}
