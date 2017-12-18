package fr.jmini.asciidoctorj.converter.html;

import java.util.Map;

import org.asciidoctor.ast.ContentNode;
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
        // TODO some hardcoded method stub
        Document d1 = new Document("");
        Element html = d1.appendElement("html");
        Element body = html.appendElement("body");
        Element div = body.appendElement("div");
        div.attr("class", "paragraph");
        Element p = div.appendElement("p");
        p.text("Some text");

        // Document d = Jsoup.parse("<div class=\"paragraph\">\n" +
        // "<p>Some text</p>\n" +
        // "</div>");

        return body.html();
    }

}
