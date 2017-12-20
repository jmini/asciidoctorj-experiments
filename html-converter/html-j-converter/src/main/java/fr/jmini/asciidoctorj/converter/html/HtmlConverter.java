package fr.jmini.asciidoctorj.converter.html;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.asciidoctor.ast.Block;
import org.asciidoctor.ast.ContentNode;
import org.asciidoctor.ast.StructuralNode;
import org.asciidoctor.converter.ConverterFor;
import org.asciidoctor.converter.StringConverter;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

@ConverterFor("html-j")
public class HtmlConverter extends StringConverter {

    public HtmlConverter(String backend, Map<String, Object> opts) {
        super(backend, opts);
    }

    @Override
    public String convert(ContentNode node, String transform, Map<Object, Object> o) {
        // TODO work in progress
        Document jsoupDocument = new Document("");
        Element html = jsoupDocument.appendElement("html");
        Element body = html.appendElement("body");

        if (node instanceof org.asciidoctor.ast.Document) {
            List<StructuralNode> blocks = ((StructuralNode) node).getBlocks();
            for (StructuralNode structuralNode : blocks) {
                Element div = body.appendElement("div");
                if (structuralNode.getId() != null) {
                    div.attr("id", structuralNode.getId());
                }
                List<String> classAttributeMembers = new ArrayList<>();
                classAttributeMembers.add(structuralNode.getContext());
                if (structuralNode.getRoles() != null) {
                    classAttributeMembers.addAll(structuralNode.getRoles());
                }
                div.attr("class", String.join(" ", classAttributeMembers));
                if (structuralNode instanceof org.asciidoctor.ast.Block) {
                    Element p = div.appendElement("p");
                    for (String line : ((Block) structuralNode).getLines()) {
                        p.text(line);
                    }
                }
            }
        }
        return body.html();
    }

}
