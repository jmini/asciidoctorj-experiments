package fr.jmini.asciidoctorj.converter.html;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

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

import com.google.common.base.Splitter;

@ConverterFor(HtmlConverter.ID)
public class HtmlConverter extends StringConverter {

    public static final String ID = "html-j";

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
        Map<String, Object> blockAttributes = block.getAttributes();
        if ("listing".equals(block.getNodeName())) {
            Element div = e.appendElement("div");
            handleId(div, block);
            handleRoles(div, block, "listingblock");
            handleTitle(div, block, "div", true, true);
            Element content = appendContentDiv(div);
            Element pre = content.appendElement("pre");
            List<String> classAttributeMembers = new ArrayList<>();
            if ("source".equals(block.getStyle())) {
                classAttributeMembers.add("highlight");
            }
            if (!block.getDocument()
                    .getAttributes()
                    .containsKey("prewrap")
                    || blockAttributes
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
        } else if ("image".equals(block.getNodeName())) {
            Element div = e.appendElement("div");
            handleId(div, block);
            handleRoles(div, block, "imageblock");
            Element content = appendContentDiv(div);
            Element container;
            if (blockAttributes.containsKey("link")) {
                container = content.appendElement("a");
                container.attr("class", "image");
                container.attr("href", blockAttributes.get("link")
                        .toString());
            } else {
                container = content;
            }
            Element img = container.appendElement("img");
            if (blockAttributes.containsKey("alt")) {
                img.attr("alt", blockAttributes.get("alt")
                        .toString());
            }
            if (blockAttributes.containsKey("height")) {
                img.attr("height", blockAttributes.get("height")
                        .toString());
            }
            if (blockAttributes.containsKey("target")) {
                String target = blockAttributes.get("target")
                        .toString();
                String src = "";
                if (!Pattern.matches("(?:\\/|[a-zA-Z]\\:[\\\\\\/]|(?:https?|ftp|file)\\:\\/\\/)[^\\s]+", target)
                        && block.getDocument()
                                .getAttributes()
                                .containsKey("imagesdir")) {
                    src = block.getDocument()
                            .getAttributes()
                            .get("imagesdir")
                            .toString();
                    if (!src.endsWith("/")) {
                        src = src + "/";
                    }
                }
                src = normalizePath(src + target);
                img.attr("src", src);
            }
            if (blockAttributes.containsKey("width")) {
                img.attr("width", blockAttributes.get("width")
                        .toString());
            }
            handleStructuralNodeBlocks(content, block);
            handleTitle(div, block, "div", true, true);
        } else if ("example".equals(block.getNodeName())) {
            Element div = e.appendElement("div");
            handleId(div, block);
            handleRoles(div, block, "exampleblock");
            handleTitle(div, block, "div", true, true);
            Element content = appendContentDiv(div);
            handleStructuralNodeBlocks(content, block);
        } else if ("quote".equals(block.getNodeName())) {
            Element div = e.appendElement("div");
            handleId(div, block);
            handleRoles(div, block, "quoteblock");
            handleTitle(div, block, "div", true, true);
            Element blockquote = div.appendElement("blockquote");
            blockquote.text(String.join("\n", block.getLines()));
            handleStructuralNodeBlocks(blockquote, block);
        } else if ("sidebar".equals(block.getNodeName())) {
            Element div = e.appendElement("div");
            handleId(div, block);
            handleRoles(div, block, "sidebarblock");
            Element content = div.appendElement("div");
            content.attr("class", "content");
            if (block.getLines() != null && block.getLines()
                    .size() > 0) {
                content.text(String.join("\n", block.getLines()));
            } else {
                handleTitle(content, block, "div", true, true);
                handleStructuralNodeBlocks(content, block);
            }
        } else if ("open".equals(block.getNodeName())) {
            Element div = e.appendElement("div");
            handleId(div, block);
            handleRoles(div, block, "openblock");
            handleTitle(div, block, "div", true, true);
            Element content = div.appendElement("div");
            content.attr("class", "content");
            content.text(String.join("\n", block.getLines()));
            handleStructuralNodeBlocks(content, block);
        } else if ("admonition".equals(block.getNodeName())) {
            Element div = e.appendElement("div");
            handleId(div, block);
            handleRoles(div, block, Arrays.asList("admonitionblock", block.getStyle()
                    .toLowerCase()));
            Element table = div.appendElement("table");
            Element tbody = table.appendElement("tbody");
            Element tr = tbody.appendElement("tr");
            Element td1 = tr.appendElement("td");
            td1.attr("class", "icon");
            handleTitle(td1, block, "div", true, false);
            Element td2 = tr.appendElement("td");
            td2.attr("class", "content");
            if (block.getLines() != null && block.getLines()
                    .size() > 0) {
                td2.text(" " + String.join("\n", block.getLines()) + " ");
            } else {
                handleTitle(td2, block, "div", false, true);
                handleStructuralNodeBlocks(td2, block);
            }
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
        Element c;
        if ("header".equals(cell.getStyle())) {
            c = e.appendElement("th");
        } else {
            c = e.appendElement(cellTagName);
        }
        handleId(c, cell);
        addClassAttribute(c, Arrays.asList("tableblock",
                "halign-" + cell.getAttributes()
                        .get("halign"),
                "valign-" + cell.getAttributes()
                        .get("valign")));

        if (cell.getColspan() > 0) {
            c.attr("colspan", Integer.toString(cell.getColspan()));
        }
        if (cell.getRowspan() > 0) {
            c.attr("rowspan", Integer.toString(cell.getRowspan()));
        }

        if ("th".equals(cellTagName)) {
            c.text(cell.getSource());
        } else if (cell.getInnerDocument() != null) {
            Element div = c.appendElement("div");
            convertDocument(div, cell.getInnerDocument());
        } else if ("literal".equals(cell.getStyle())) {
            Element div = c.appendElement("div");
            div.attr("class", "literal");
            Element pre = div.appendElement("pre");
            pre.text(cell.getSource());
        } else if ("verse".equals(cell.getStyle())) {
            Element div = c.appendElement("div");
            div.attr("class", "verse");
            div.text(cell.getSource());
        } else {
            Element p = c.appendElement("p");
            p.attr("class", "tableblock");
            Element textElement;
            if ("emphasis".equals(cell.getStyle())) {
                Element em = p.appendElement("em");
                textElement = em;
            } else if ("monospaced".equals(cell.getStyle())) {
                Element code = p.appendElement("code");
                textElement = code;
            } else if ("strong".equals(cell.getStyle())) {
                Element strong = p.appendElement("strong");
                textElement = strong;
            } else {
                textElement = p;
            }
            textElement.text(cell.getSource());
        }
    }

    public void convertColumn(Element e, Column column) {
        Element col = e.appendElement("col");
        if (!column.getTable()
                .getAttributes()
                .containsKey("autowidth-option")) {
            col.attr("style", "width: " + column.getAttributes()
                    .get("colpcwidth") + "%;");
        }
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
        handleStyleAndRoles(div, contentNode, null, Collections.singletonList(initialClass));
    }

    private void handleRoles(Element div, ContentNode contentNode, List<String> initialClasses) {
        handleStyleAndRoles(div, contentNode, null, initialClasses);
    }

    private void handleStyleAndRoles(Element div, ContentNode contentNode, String style, List<String> initialClasses) {
        List<String> classAttributeMembers = new ArrayList<>();
        classAttributeMembers.addAll(initialClasses);
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
        handleStyleAndRoles(div, descriptionList, descriptionList.getStyle(), Collections.singletonList(descriptionList.getContext()));
        handleTitle(div, descriptionList, "div", true, true);
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
        if (document.getDoctitle() != null
                && document.getDoctitle()
                        .length() > 0
                && ((document.getAttributes()
                        .containsKey("showtitle"))
                        || !document.getAttributes()
                                .containsKey("notitle"))) {
            Element h1 = e.appendElement("h1");
            h1.text(document.getDoctitle());
        }
        handleStructuralNodeBlocks(e, document);
    }

    public void convertDocumentHeader(Element e, DocumentHeader documentHeader) {
        // not implemented yet
    }

    public void convertList(Element e, org.asciidoctor.ast.List list) {
        Element div = e.appendElement("div");
        handleId(div, list);
        handleStyleAndRoles(div, list, list.getStyle(), Collections.singletonList(list.getContext()));
        handleTitle(div, list, "div", true, true);
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

    private void handleTitle(Element e, StructuralNode structuralNode, String tagName, boolean includeCaption, boolean includeTitle) {
        String text = "";
        if (includeCaption && structuralNode.getCaption() != null) {
            text = structuralNode.getCaption();
        }
        if (includeTitle && structuralNode.getTitle() != null) {
            text = text + structuralNode.getTitle();
        }
        if (!text.isEmpty()) {
            Element div = e.appendElement(tagName);
            div.attr("class", "title");
            div.text(text);
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
        List<String> rolesList = new ArrayList<>();
        rolesList.add("tableblock");
        rolesList.add("frame-" + table.getFrame());
        rolesList.add("grid-" + table.getGrid());
        if (!table.getAttributes()
                .containsKey("autowidth-option") &&
                !table.getAttributes()
                        .containsKey("width")) {
            rolesList.add("spread");
        }
        handleRoles(t, table, rolesList);
        if (table.getAttributes()
                .containsKey("width")) {
            t.attr("style", "width: " + table.getAttributes()
                    .get("width") + ";");
        }
        handleTitle(t, table, "caption", true, true);

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

    static String normalizePath(String path) {
        if (Pattern.matches("(https?|ftp|file)\\:\\/.+", path)) {
            return path;
        }

        List<String> parts = new ArrayList<>();
        Iterable<String> split = Splitter.on('/')
                .split(path);
        int folderIndex = -1;
        boolean isFirst = true;
        for (String part : split) {
            if (!".".equals(part) || isFirst) {
                if ("..".equals(part)) {
                    if (folderIndex >= 0 && parts.size() > 0) {
                        parts.remove(folderIndex);
                        folderIndex = findLastFolder(parts);
                    } else if (folderIndex != Integer.MIN_VALUE) {
                        parts.add(part);
                    }
                } else {
                    parts.add(part);
                    folderIndex = findLastFolder(parts);
                }
            }
            isFirst = false;
        }
        return String.join("/", parts);
    }

    private static int findLastFolder(List<String> parts) {
        for (int i = parts.size() - 1; i > -1; i--) {
            if (i == 0 && "".equals(parts.get(0))) {
                return Integer.MIN_VALUE;
            }
            if (!"".equals(parts.get(i)) && !".".equals(parts.get(i)) && !"..".equals(parts.get(i))) {
                return i;
            }
        }
        return -1;
    }
}
