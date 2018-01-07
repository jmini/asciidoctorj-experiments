package fr.jmini.asciidoctorj.converter.html;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
import org.asciidoctor.converter.ConverterFor;
import org.asciidoctor.converter.StringConverter;
import org.jsoup.nodes.Document.OutputSettings.Syntax;
import org.jsoup.nodes.Element;

@ConverterFor("html-j")
public class HtmlConverter extends StringConverter {

    public HtmlConverter(String backend, Map<String, Object> opts) {
        super(backend, opts);
    }

    @Override
    public String convert(ContentNode node, String transform, Map<Object, Object> o) {
        org.jsoup.nodes.Document jsoupDocument = new org.jsoup.nodes.Document("");
        jsoupDocument.outputSettings()
                .syntax(Syntax.xml)
                .indentAmount(0);
        Element html = jsoupDocument.appendElement("html");
        Element body = html.appendElement("body");
        convertContentNode(body, node);
        return body.html();
    }

    public void convertAuthor(Element e, Author author) {
        // not implemented yet
    }

    public void convertBlock(Element e, Block block) {
        if ("listing".equals(block.getNodeName())) {
            Element div = e.appendElement("div");
            handleId(div, block);
            handleRoles(div, block, "listingblock");
            handleTitle(div, block, "div", true);
            Element content = appendContentDiv(div);
            Element pre = content.appendElement("pre");
            List<String> classAttributeMembers = new ArrayList<>();
            if ("source".equals(block.getStyle())) {
                classAttributeMembers.add("highlight");
            }
            if (!block.getDocument()
                    .getAttributes()
                    .containsKey("prewrap")
                    || block.getAttributes()
                            .containsKey("nowrap-option")) {
                classAttributeMembers.add("nowrap");
            }
            addClassAttribute(pre, classAttributeMembers);
            if ("source".equals(block.getStyle())) {
                Element code = pre.appendElement("code");
                code.text(String.join("\n", block.getLines()));
            } else {
                pre.text(String.join("\n", block.getLines()));
            }
        } else if ("example".equals(block.getNodeName())) {
            Element div = e.appendElement("div");
            handleId(div, block);
            handleRoles(div, block, "exampleblock");
            handleTitle(div, block, "div", true);
            Element content = appendContentDiv(div);
            handleStructuralNodeBlocks(content, block);
        } else if ("quote".equals(block.getNodeName())) {
            Element div = e.appendElement("div");
            handleId(div, block);
            handleRoles(div, block, "quoteblock");
            handleTitle(div, block, "div", false);
            Element blockquote = div.appendElement("blockquote");
            blockquote.text(String.join("\n", block.getLines()));
            handleStructuralNodeBlocks(blockquote, block);
        } else if ("thematic_break".equals(block.getNodeName())) {
            e.appendElement("hr");
        } else {
            Element div = e.appendElement("div");
            handleId(div, block);
            handleRoles(div, block, block.getContext());
            Element p = div.appendElement("p");
            p.text(String.join("\n", block.getLines()));
        }
    }

    private Element appendContentDiv(Element div) {
        Element content = div.appendElement("div");
        content.attr("class", "content");
        return content;
    }

    public void convertCell(Element e, Cell cell, String cellTagName) {
        Element c = e.appendElement(cellTagName);
        handleId(c, cell);
        addClassAttribute(c, Arrays.asList("tableblock",
                "halign-" + cell.getAttributes()
                        .get("halign"),
                "valign-" + cell.getAttributes()
                        .get("valign")));

        if ("th".equals(cellTagName)) {
            c.text(cell.getSource());
        } else {
            Element p = c.appendElement("p");
            p.attr("class", "tableblock");
            p.text(cell.getSource());
        }
    }

    public void convertColumn(Element e, Column column) {
        Element col = e.appendElement("col");
        col.attr("style", "width: " + column.getAttributes()
                .get("colpcwidth") + "%;");
    }

    public void convertContentNode(Element e, ContentNode contentNode) {
        if (contentNode instanceof Cell) {
            convertCell(e, (Cell) contentNode, "td");
        } else if (contentNode instanceof Column) {
            convertColumn(e, (Column) contentNode);
        } else if (contentNode instanceof PhraseNode) {
            convertPhraseNode(e, (PhraseNode) contentNode);
        } else if (contentNode instanceof StructuralNode) {
            convertStructuralNode(e, (StructuralNode) contentNode);
        } else {
            // not implemented yet
        }
    }

    private void handleId(Element e, ContentNode contentNode) {
        if (contentNode.getId() != null) {
            e.attr("id", contentNode.getId());
        }
    }

    private void handleRoles(Element div, ContentNode contentNode, String initialClass) {
        handleStyleAndRoles(div, contentNode, null, initialClass);
    }

    private void handleStyleAndRoles(Element div, ContentNode contentNode, String style, String initialClass) {
        List<String> classAttributeMembers = new ArrayList<>();
        classAttributeMembers.add(initialClass);
        if (style != null && !style.isEmpty()) {
            classAttributeMembers.add(style);
        }
        if (contentNode.getRoles() != null) {
            classAttributeMembers.addAll(contentNode.getRoles());
        }
        addClassAttribute(div, classAttributeMembers);
    }

    private void addClassAttribute(Element e, List<String> classAttributeMembers) {
        if (!classAttributeMembers.isEmpty()) {
            e.attr("class", String.join(" ", classAttributeMembers));
        }
    }

    public void convertContentPart(Element e, ContentPart contentPart) {
        // not implemented yet
    }

    public void convertCursor(Element e, Cursor cursor) {
        // not implemented yet
    }

    public void convertDescriptionList(Element e, DescriptionList descriptionList) {
        Element div = e.appendElement("div");
        handleId(div, descriptionList);
        handleStyleAndRoles(div, descriptionList, descriptionList.getStyle(), descriptionList.getContext());
        handleTitle(div, descriptionList, "div", false);
        Element dl = div.appendElement("dl");
        List<DescriptionListEntry> items = descriptionList.getItems();
        if (items != null) {
            for (DescriptionListEntry entry : items) {
                convertDescriptionListEntry(dl, entry);
            }
        }
    }

    public void convertDescriptionListEntry(Element e, DescriptionListEntry descriptionListEntry) {
        // not implemented yet
        List<ListItem> terms = descriptionListEntry.getTerms();
        for (ListItem term : terms) {
            Element dt = e.appendElement("dt");
            dt.attr("class", "hdlist1");
            dt.text(term.getText());
        }
        convertListItem(e, descriptionListEntry.getDescription(), "dd");
    }

    public void convertDocument(Element e, Document document) {
        handleStructuralNodeBlocks(e, document);
    }

    public void convertDocumentHeader(Element e, DocumentHeader documentHeader) {
        // not implemented yet
    }

    public void convertList(Element e, org.asciidoctor.ast.List list) {
        Element div = e.appendElement("div");
        handleId(div, list);
        handleStyleAndRoles(div, list, list.getStyle(), list.getContext());
        handleTitle(div, list, "div", false);
        Element l = div.appendElement(list.getNodeName()
                .substring(0, 2));
        if (list.getStyle() != null) {
            l.attr("class", list.getStyle());
            if ("olist".equals(list.getNodeName())) {
                String type = convertListType(list.getStyle());
                if (!"1".equals(type)) {
                    l.attr("type", type);
                }
            }
        }
        if (list.getAttributes()
                .containsKey("start")) {
            l.attr("start", list.getAttributes()
                    .get("start")
                    .toString());
        }
        if (list.getAttributes()
                .containsKey("reversed-option")) {
            l.attr("reversed", "");
        }
        handleStructuralNodeList(l, list.getItems());
    }

    private String convertListType(String style) {
        switch (style) {
        case "loweralpha":
            return "a";
        case "lowerroman":
            return "i";
        case "upperalpha":
            return "A";
        case "upperroman":
            return "I";
        case "lowergreek":
        case "arabic":
        case "decimal":
            return "1";
        default:
            return null;
        }
    }

    public void convertListItem(Element e, ListItem listItem, String tagName) {
        Element li = e.appendElement(tagName);
        if (listItem.hasText()) {
            Element p = li.appendElement("p");
            p.text(listItem.getText());
        }
        handleStructuralNodeBlocks(li, listItem);
    }

    public void convertPhraseNode(Element e, PhraseNode phraseNode) {
        // not implemented yet
    }

    public void convertRevisionInfo(Element e, RevisionInfo revisionInfo) {
        // not implemented yet
    }

    public void convertRow(Element e, Row row, String cellTagName) {
        Element tr = e.appendElement("tr");
        for (Cell cell : row.getCells()) {
            convertCell(tr, cell, cellTagName);
        }
    }

    public void convertSection(Element e, Section section) {
        Element div = e.appendElement("div");
        handleRoles(div, section, "sect" + section.getLevel());
        Element header = div.appendElement("h" + (section.getLevel() + 1));
        handleId(header, section);
        header.text(section.getTitle());
        if (section.getLevel() == 1) {
            Element sectionbody = div.appendElement("div");
            sectionbody.attr("class", "sectionbody");
            handleStructuralNodeBlocks(sectionbody, section);
        } else {
            handleStructuralNodeBlocks(div, section);
        }
    }

    public void convertStructuralNode(Element e, StructuralNode structuralNode) {
        if (structuralNode instanceof Block) {
            convertBlock(e, (Block) structuralNode);
        } else if (structuralNode instanceof DescriptionList) {
            convertDescriptionList(e, (DescriptionList) structuralNode);
        } else if (structuralNode instanceof Document) {
            convertDocument(e, (Document) structuralNode);
        } else if (structuralNode instanceof org.asciidoctor.ast.List) {
            convertList(e, (org.asciidoctor.ast.List) structuralNode);
        } else if (structuralNode instanceof ListItem) {
            convertListItem(e, (ListItem) structuralNode, "li");
        } else if (structuralNode instanceof Section) {
            convertSection(e, (Section) structuralNode);
        } else if (structuralNode instanceof Table) {
            convertTable(e, (Table) structuralNode);
        } else {
            // not implemented yet
        }
    }

    private void handleTitle(Element e, StructuralNode structuralNode, String tagName, boolean hasCaption) {
        String title = structuralNode.getTitle();
        if (title != null && !title.isEmpty()) {
            Element div = e.appendElement(tagName);
            div.attr("class", "title");
            String captionKey = structuralNode.getNodeName() + "-caption";
            if (hasCaption
                    && structuralNode.getDocument()
                            .getAttributes()
                            .containsKey(captionKey)) {
                int captionCounter = incrementCounterAndGet(structuralNode);
                String captionLabel = structuralNode.getDocument()
                        .getAttributes()
                        .get(captionKey)
                        .toString();
                div.text(captionLabel + " " + captionCounter + ". " + title);
            } else {
                div.text(title);
            }
        }
    }

    private void handleStructuralNodeBlocks(Element e, StructuralNode structuralNode) {
        handleStructuralNodeList(e, structuralNode.getBlocks());
    }

    private void handleStructuralNodeList(Element e, List<StructuralNode> items) {
        if (items != null) {
            for (StructuralNode item : items) {
                convertStructuralNode(e, item);
            }
        }
    }

    public void convertStructuredDocument(Element e, StructuredDocument structuredDocument) {
        // not implemented yet
    }

    public void convertTable(Element e, Table table) {
        Element t = e.appendElement("table");
        handleId(t, table);
        handleRoles(t, table, "tableblock frame-all grid-all spread");
        handleTitle(t, table, "caption", true);

        Element cg = t.appendElement("colgroup");
        for (Column column : table.getColumns()) {
            convertColumn(cg, column);
        }

        List<Row> header = table.getHeader();
        if (header.size() > 0) {
            Element thead = t.appendElement("thead");
            for (Row row : header) {
                convertRow(thead, row, "th");
            }
        }
        List<Row> footer = table.getFooter();
        if (footer.size() > 0) {
            Element tfoot = t.appendElement("tfoot");
            for (Row row : footer) {
                convertRow(tfoot, row, "td");
            }
        }
        List<Row> body = table.getBody();
        if (body.size() > 0) {
            Element tbody = t.appendElement("tbody");
            for (Row row : body) {
                convertRow(tbody, row, "td");
            }
        }
    }

    public void convertTitle(Element e, Title title) {
        // not implemented yet
    }

    private int incrementCounterAndGet(StructuralNode structuralNode) {
        Integer value;
        String counterKey = structuralNode.getNodeName() + "-number";
        Map<String, Object> attributes = structuralNode.getDocument()
                .getAttributes();
        if (attributes.containsKey(counterKey)) {
            value = Integer.valueOf(attributes.get(counterKey)
                    .toString());
        } else {
            value = 0;
        }
        value = value + 1;
        attributes.put(counterKey, value.toString());
        return value;
    }

}
