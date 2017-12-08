package fr.jmini.eadoc.converter;

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
import fr.jmini.eadoc.EAdocList;

public class EadocCodeGenerator extends AbstractCodeGenerator {

    @Override
    protected <T> String startMethod(StringBuilder sb, T value, Class<T> astClass) {
        String type = computeType(value);
        sb.append("public " + type + " createEadoc() {" + NL);
        String createEadocExpression = createEInstanceExpression(type);
        return createVariableForExpression(sb, createEadocExpression, value, type);
    }

    @Override
    protected void endMethod(StringBuilder sb, String varName) {
        sb.append("return " + varName + ";" + NL);
        sb.append("}");
    }

    @Override
    protected String computeType(Object object) {
        if (object instanceof org.asciidoctor.ast.List) {
            return EAdocList.class.getSimpleName();
        }
        return "E" + super.computeType(object);
    }

    @Override
    protected String createVariableForExpression(StringBuilder sb, String expression, Object value, String astClass) {
        String prefix = computeVariablePrefix(astClass);
        String varName = createVariable(prefix, value);
        sb.append(astClass + " " + varName + " = " + expression + ";" + NL);
        return varName;
    }

    @Override
    protected void appendAuthor(StringBuilder sb, String varName, Author author) {
        appendSetExpressionString(sb, varName + ".setEmail", author.getEmail());
        appendSetExpressionString(sb, varName + ".setFullName", author.getFullName());
        appendSetExpressionString(sb, varName + ".setFirstName", author.getFirstName());
        appendSetExpressionString(sb, varName + ".setLastName", author.getLastName());
        appendSetExpressionString(sb, varName + ".setMiddleName", author.getMiddleName());
        appendSetExpressionString(sb, varName + ".setInitials", author.getInitials());
    }

    @Override
    protected void appendBlock(StringBuilder sb, String varName, Block block) {
        appendStructuralNode(sb, varName, block);
        appendSetExpressionStringList(sb, varName + ".setLines", block.getLines());
        appendSetExpressionString(sb, varName + ".setSource", block.getSource());
    }

    @Override
    protected void appendCell(StringBuilder sb, String varName, Cell cell) {
        appendContentNode(sb, varName, cell);
        appendSetExpressionObject(sb, varName + ".setColumn", cell.getColumn());
        appendSetExpressionInt(sb, varName + ".setColspan", cell.getColspan());
        appendSetExpressionInt(sb, varName + ".setRowspan", cell.getRowspan());
        // appendSetExpressionString(sb, varName + ".setText", cell.getText());
        appendSetExpressionString(sb, varName + ".setSource", cell.getSource());
        // appendSetExpressionString(sb, varName + ".setContent", cell.getContent());
        appendSetExpressionString(sb, varName + ".setStyle", cell.getStyle());
        appendSetExpressionHorizontalAlignment(sb, varName + ".setHorizontalAlignment", cell.getHorizontalAlignment());
        appendSetExpressionVerticalAlignment(sb, varName + ".setVerticalAlignment", cell.getVerticalAlignment());
        appendSetExpressionObject(sb, varName + ".setInnerDocument", cell.getInnerDocument());
    }

    @Override
    protected void appendColumn(StringBuilder sb, String varName, Column column) {
        appendContentNode(sb, varName, column);
        appendSetExpressionString(sb, varName + ".setStyle", column.getStyle());
        appendSetExpressionObject(sb, varName + ".setTable", column.getTable());
        // appendSetExpressionInt(sb, varName + ".setColumnNumber", column.getColumnNumber());
        appendSetExpressionInt(sb, varName + ".setWidth", column.getWidth());
        appendSetExpressionHorizontalAlignment(sb, varName + ".setHorizontalAlignment", column.getHorizontalAlignment());
        appendSetExpressionVerticalAlignment(sb, varName + ".setVerticalAlignment", column.getVerticalAlignment());
    }

    @Override
    protected void appendContentNode(StringBuilder sb, String varName, ContentNode contentNode) {
        appendSetExpressionString(sb, varName + ".setId", contentNode.getId());
        appendSetExpressionString(sb, varName + ".setNodeName", contentNode.getNodeName());
        // getParent() can not be called on the root element, see https://github.com/asciidoctor/asciidoctorj/issues/593
        if (!(contentNode instanceof StructuralNode) || ((StructuralNode) contentNode).getLevel() > 0) {
            appendSetExpressionObject(sb, varName + ".setParent", contentNode.getParent());
        }
        appendSetExpressionString(sb, varName + ".setContext", contentNode.getContext());
        appendSetExpressionObject(sb, varName + ".setDocument", contentNode.getDocument());
        // NOTE: a NotImplementedError is sometime thrown when contentNode.isInline() is called.
        try {
            appendSetExpressionBoolean(sb, varName + ".setInline", contentNode.isInline());
        } catch (Exception e) {
            if (e.getMessage() != null && e.getMessage()
                    .contains("NotImplementedError")) {
                // nothing to do
            } else {
                throw new IllegalStateException("Unexpected exception", e);
            }
        }
        // NOTE: a NotImplementedError is sometime thrown when contentNode.isBlock() is called.
        try {
            appendSetExpressionBoolean(sb, varName + ".setBlock", contentNode.isBlock());
        } catch (Exception e) {
            if (e.getMessage() != null && e.getMessage()
                    .contains("NotImplementedError")) {
                // nothing to do
            } else {
                throw new IllegalStateException("Unexpected exception", e);
            }
        }
        appendSetExpressionMap(sb, varName + ".setAttributes", String.class, contentNode.getAttributes());
        appendSetExpressionStringList(sb, varName + ".setRoles", contentNode.getRoles());
        appendSetExpressionString(sb, varName + ".setReftext", contentNode.getReftext());
    }

    @Override
    protected void appendContentPart(StringBuilder sb, String varName, ContentPart contentPart) {
        appendSetExpressionString(sb, varName + ".setId", contentPart.getId());
        appendSetExpressionInt(sb, varName + ".setLevel", contentPart.getLevel());
        appendSetExpressionString(sb, varName + ".setContext", contentPart.getContext());
        appendSetExpressionString(sb, varName + ".setStyle", contentPart.getStyle());
        appendSetExpressionString(sb, varName + ".setRole", contentPart.getRole());
        appendSetExpressionString(sb, varName + ".setTitle", contentPart.getTitle());
        appendSetExpressionMap(sb, varName + ".setAttributes", String.class, contentPart.getAttributes());
        // appendSetExpressionObjectList(sb, varName + ".setParts", contentPart.getParts());
    }

    @Override
    protected void appendCursor(StringBuilder sb, String varName, Cursor cursor) {
        appendSetExpressionInt(sb, varName + ".setLineNumber", cursor.getLineNumber());
        appendSetExpressionString(sb, varName + ".setPath", cursor.getPath());
        appendSetExpressionString(sb, varName + ".setDir", cursor.getDir());
        appendSetExpressionString(sb, varName + ".setFile", cursor.getFile());
    }

    @Override
    protected void appendDescriptionList(StringBuilder sb, String varName, DescriptionList descriptionList) {
        appendStructuralNode(sb, varName, descriptionList);
        // appendSetExpressionObjectList(sb, varName + ".setItems", descriptionList.getItems());
    }

    @Override
    protected void appendDescriptionListEntry(StringBuilder sb, String varName, DescriptionListEntry descriptionListEntry) {
        appendSetExpressionObject(sb, varName + ".setDescription", descriptionListEntry.getDescription());
        // appendSetExpressionObjectList(sb, varName + ".setTerms", descriptionListEntry.getTerms());
    }

    @Override
    protected void appendDocument(StringBuilder sb, String varName, Document document) {
        appendStructuralNode(sb, varName, document);
        appendSetExpressionObject(sb, varName + ".setStructuredDoctitle", document.getStructuredDoctitle());
        appendSetExpressionString(sb, varName + ".setDoctitle", document.getDoctitle());
        appendSetExpressionMap(sb, varName + ".setOptions", Object.class, document.getOptions());
    }

    @Override
    protected void appendDocumentHeader(StringBuilder sb, String varName, DocumentHeader documentHeader) {
        // appendSetExpressionObjectList(sb, varName + ".setAuthors", documentHeader.getAuthors());
        appendSetExpressionObject(sb, varName + ".setDocumentTitle", documentHeader.getDocumentTitle());
        appendSetExpressionString(sb, varName + ".setPageTitle", documentHeader.getPageTitle());
        // appendSetExpressionObject(sb, varName + ".setAuthor", documentHeader.getAuthor());
        appendSetExpressionObject(sb, varName + ".setRevisionInfo", documentHeader.getRevisionInfo());
        appendSetExpressionString(sb, varName + ".setPageTitle", documentHeader.getPageTitle());
        appendSetExpressionMap(sb, varName + ".setAttributes", String.class, documentHeader.getAttributes());
    }

    @Override
    protected void appendList(StringBuilder sb, String varName, org.asciidoctor.ast.List list) {
        appendStructuralNode(sb, varName, list);
        appendSetExpressionObjectList(sb, varName + ".getItems()", list.getItems());
        // appendSetExpressionBoolean(sb, varName + ".hasItems", list.hasItems());
    }

    @Override
    protected void appendListItem(StringBuilder sb, String varName, ListItem listItem) {
        appendStructuralNode(sb, varName, listItem);
        appendSetExpressionString(sb, varName + ".setMarker", listItem.getMarker());
        appendSetExpressionString(sb, varName + ".setText", listItem.getText());
        appendSetExpressionString(sb, varName + ".setSource", listItem.getSource());
    }

    @Override
    protected void appendPhraseNode(StringBuilder sb, String varName, PhraseNode phraseNode) {
        appendContentNode(sb, varName, phraseNode);
        appendSetExpressionString(sb, varName + ".setType", phraseNode.getType());
        appendSetExpressionString(sb, varName + ".setText", phraseNode.getText());
        appendSetExpressionString(sb, varName + ".setTarget", phraseNode.getTarget());
    }

    @Override
    protected void appendRevisionInfo(StringBuilder sb, String varName, RevisionInfo revisionInfo) {
        appendSetExpressionString(sb, varName + ".setDate", revisionInfo.getDate());
        appendSetExpressionString(sb, varName + ".setNumber", revisionInfo.getNumber());
        appendSetExpressionString(sb, varName + ".setRemark", revisionInfo.getRemark());
    }

    @Override
    protected void appendRow(StringBuilder sb, String varName, Row row) {
        // appendSetExpressionObjectList(sb, varName + ".setCells", row.getCells());
    }

    @Override
    protected void appendSection(StringBuilder sb, String varName, Section section) {
        appendStructuralNode(sb, varName, section);
        appendSetExpressionInt(sb, varName + ".setIndex", section.getIndex());
        appendSetExpressionInt(sb, varName + ".setNumber", section.getNumber());
        appendSetExpressionString(sb, varName + ".setSectionName", section.getSectionName());
        appendSetExpressionBoolean(sb, varName + ".setSpecial", section.isSpecial());
        appendSetExpressionBoolean(sb, varName + ".setNumbered", section.isNumbered());
    }

    @Override
    protected void appendStructuralNode(StringBuilder sb, String varName, StructuralNode structuralNode) {
        appendContentNode(sb, varName, structuralNode);
        appendSetExpressionString(sb, varName + ".setTitle", structuralNode.getTitle());
        appendSetExpressionString(sb, varName + ".setStyle", structuralNode.getStyle());
        // appendSetExpressionString(sb, varName + ".setContent", structuralNode.getContent());
        appendSetExpressionInt(sb, varName + ".setLevel", structuralNode.getLevel());
        appendSetExpressionString(sb, varName + ".setContentModel", structuralNode.getContentModel());
        appendSetExpressionObject(sb, varName + ".setSourceLocation", structuralNode.getSourceLocation());
        appendSetExpressionObjectList(sb, varName + ".getSubstitutions()", structuralNode.getSubstitutions());
        appendSetExpressionObjectList(sb, varName + ".getBlocks()", structuralNode.getBlocks());
    }

    @Override
    protected void appendStructuredDocument(StringBuilder sb, String varName, StructuredDocument structuredDocument) {
        appendSetExpressionObjectList(sb, varName + ".getParts()", structuredDocument.getParts());
        appendSetExpressionObject(sb, varName + ".setHeader", structuredDocument.getHeader());
    }

    @Override
    protected void appendTable(StringBuilder sb, String varName, Table table) {
        appendStructuralNode(sb, varName, table);
        appendSetExpressionBoolean(sb, varName + ".setHeaderOption", table.hasHeaderOption());
        // appendSetExpressionObjectList(sb, varName + ".setColumns", table.getColumns());
        // appendSetExpressionObjectList(sb, varName + ".setHeader", table.getHeader());
        // appendSetExpressionObjectList(sb, varName + ".setFooter", table.getFooter());
        // appendSetExpressionObjectList(sb, varName + ".setBody", table.getBody());
        appendSetExpressionString(sb, varName + ".setFrame", table.getFrame());
        appendSetExpressionString(sb, varName + ".setGrid", table.getGrid());
    }

    @Override
    protected void appendTitle(StringBuilder sb, String varName, Title title) {
        appendSetExpressionString(sb, varName + ".setMain", title.getMain());
        appendSetExpressionString(sb, varName + ".setSubtitle", title.getSubtitle());
        appendSetExpressionString(sb, varName + ".setCombined", title.getCombined());
        appendSetExpressionBoolean(sb, varName + ".setSanitized", title.isSanitized());
    }

    @Override
    protected String computeVariablePrefix(String astClass) {
        if (org.asciidoctor.ast.List.class.getCanonicalName()
                .equals(astClass)) {
            return "eList";
        } else if (EAdocList.class.getSimpleName()
                .equals(astClass)) {
            return "eList";
        }
        return astClass.substring(0, 1)
                .toLowerCase() + astClass.substring(1);
    }

    private String createEInstanceExpression(String type) {
        return "EadocFactory.eINSTANCE.create" + type + "()";
    }

    private void appendSetExpressionBoolean(StringBuilder sb, String expression, Boolean value) {
        sb.append(expression + "(" + CodeConverterUtility.convertBoolean(value) + ");" + NL);
    }

    private void appendSetExpressionInt(StringBuilder sb, String expression, Integer value) {
        sb.append(expression + "(" + CodeConverterUtility.convertInt(value) + ");" + NL);
    }

    private void appendSetExpressionString(StringBuilder sb, String expression, String value) {
        sb.append(expression + "(" + CodeConverterUtility.convertString(value) + ");" + NL);
    }

    private void appendSetExpressionStringList(StringBuilder sb, String expression, List<String> value) {
        sb.append(expression + "(");
        if (value == null) {
            sb.append("null");
        } else if (value.isEmpty()) {
            sb.append("Collections.emptyList()");
        } else {
            if (value.size() == 1) {
                sb.append("Collections.singletonList(");
            } else {
                sb.append("Arrays.asList(");
            }
            sb.append(value.stream()
                    .map(CodeConverterUtility::convertString)
                    .collect(Collectors.joining(", ")));
            sb.append(")");
        }
        sb.append(");" + NL);
    }

    private void appendSetExpressionHorizontalAlignment(StringBuilder sb, String expression, HorizontalAlignment value) {
        sb.append(expression + "(" + CodeConverterUtility.convertHorizontalAlignment(value) + ");" + NL);
    }

    private void appendSetExpressionVerticalAlignment(StringBuilder sb, String expression, VerticalAlignment value) {
        sb.append(expression + "(" + CodeConverterUtility.convertVerticalAlignment(value) + ");" + NL);
    }

    private <T extends Object> void appendSetExpressionMap(StringBuilder sb, String expression, Class<T> keyClass, Map<T, Object> value) {
        if (value == null) {
            sb.append(expression + "(null);" + NL);
        } else if (value.isEmpty()) {
            sb.append(expression + "(Collections.emptyMap());" + NL);
        } else if (value.size() == 1) {
            Entry<? extends Object, Object> e = value.entrySet()
                    .iterator()
                    .next();
            String entryKey = CodeConverterUtility.convertString(e.getKey()
                    .toString());
            String entryValue = CodeConverterUtility.convertObject(e.getValue());
            sb.append(expression + "(Collections.singletonMap(" + entryKey + ", " + entryValue + "));" + NL);
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
            sb.append(expression + "(" + mapVarName + ");" + NL);
        }
    }

    private void appendSetExpressionObject(StringBuilder sb, String expression, Object value) {
        if (value == null) {
            sb.append(expression + "(null);" + NL);
        } else {
            if (!referenceHolder.containsKey(System.identityHashCode(value))) {
                String astClass = computeType(value);
                String createMockExpression = createEInstanceExpression(astClass);
                String varName = createVariableForExpression(sb, createMockExpression, value, astClass);
                appendObject(sb, varName, value);
            }
            sb.append(expression + "(" + referenceHolder.get(System.identityHashCode(value)) + ");" + NL);
        }
    }

    private void appendSetExpressionObjectList(StringBuilder sb, String listGetterExpression, List<?> value) {
        if (value != null && !value.isEmpty()) {
            for (Object item : value) {
                if (item instanceof String) {
                    sb.append(listGetterExpression);
                    sb.append(".add(");
                    sb.append(CodeConverterUtility.convertString((String) item));
                    sb.append(");" + NL);
                } else {
                    String itemClass = computeType(item);
                    String itemCreateMockExpression = createEInstanceExpression(itemClass);
                    String itemVarName = createVariableForExpression(sb, itemCreateMockExpression, item, itemClass);
                    appendObject(sb, itemVarName, item);
                    sb.append(listGetterExpression);
                    sb.append(".add(" + itemVarName + ");" + NL);
                }
            }
        }
    }
}
