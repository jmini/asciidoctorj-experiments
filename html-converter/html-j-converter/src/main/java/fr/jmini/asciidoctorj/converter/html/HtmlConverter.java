package fr.jmini.asciidoctorj.converter.html;

import java.util.ArrayList;
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
import org.jsoup.nodes.Element;

@ConverterFor("html-j")
public class HtmlConverter extends StringConverter {

    public HtmlConverter(String backend, Map<String, Object> opts) {
        super(backend, opts);
    }

    @Override
    public String convert(ContentNode node, String transform, Map<Object, Object> o) {
        org.jsoup.nodes.Document jsoupDocument = new org.jsoup.nodes.Document("");
        Element html = jsoupDocument.appendElement("html");
        Element body = html.appendElement("body");
        convertContentNode(body, node);
        return body.html();
    }

    public void convertAuthor(Element e, Author aAuthor) {

    }

    public void convertBlock(Element e, Block aBlock) {
        Element div = e.appendElement("div");
        handleId(div, aBlock);
        handleRoles(div, aBlock, aBlock.getContext());
        Element p = div.appendElement("p");
        p.text(String.join("\n", aBlock.getLines()));
    }

    public void convertCell(Element e, Cell aCell) {

    }

    public void convertColumn(Element e, Column aColumn) {

    }

    public void convertContentNode(Element e, ContentNode contentNode) {
        if (contentNode instanceof Cell) {
            convertCell(e, (Cell) contentNode);
        } else if (contentNode instanceof Column) {
            convertColumn(e, (Column) contentNode);
        } else if (contentNode instanceof PhraseNode) {
            convertPhraseNode(e, (PhraseNode) contentNode);
        } else if (contentNode instanceof StructuralNode) {
            convertStructuralNode(e, (StructuralNode) contentNode);
        } else {
            // TODO
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
        div.attr("class", String.join(" ", classAttributeMembers));
    }

    public void convertContentPart(Element e, ContentPart aContentPart) {

    }

    public void convertCursor(Element e, Cursor aCursor) {

    }

    public void convertDescriptionList(Element e, DescriptionList aDescriptionList) {

    }

    public void convertDescriptionListEntry(Element e, DescriptionListEntry aDescriptionListEntry) {

    }

    public void convertDocument(Element e, Document aDocument) {
        handleStructuralNodeBlocks(e, aDocument);
    }

    public void convertDocumentHeader(Element e, DocumentHeader aDocumentHeader) {

    }

    public void convertList(Element e, org.asciidoctor.ast.List list) {
        Element div = e.appendElement("div");
        handleId(div, list);
        handleStyleAndRoles(div, list, list.getStyle(), list.getContext());
        Element l = div.appendElement(list.getNodeName()
                .substring(0, 2));
        if (list.getStyle() != null) {
            l.attr("class", list.getStyle());
        }
        handleStructuralNodeList(l, list.getItems());
    }

    public void convertListItem(Element e, ListItem listItem) {
        Element li = e.appendElement("li");
        Element p = li.appendElement("p");
        p.text(listItem.getText());
        handleStructuralNodeBlocks(li, listItem);
    }

    public void convertPhraseNode(Element e, PhraseNode aPhraseNode) {

    }

    public void convertRevisionInfo(Element e, RevisionInfo aRevisionInfo) {

    }

    public void convertRow(Element e, Row aRow) {

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
            convertListItem(e, (ListItem) structuralNode);
        } else if (structuralNode instanceof Section) {
            convertSection(e, (Section) structuralNode);
        } else if (structuralNode instanceof Table) {
            convertTable(e, (Table) structuralNode);
        } else {
            // TODO
            handleStructuralNodeBlocks(e, structuralNode);
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

    public void convertStructuredDocument(Element e, StructuredDocument aStructuredDocument) {

    }

    public void convertTable(Element e, Table aTable) {

    }

    public void convertTitle(Element e, Title aTitle) {

    }

}
