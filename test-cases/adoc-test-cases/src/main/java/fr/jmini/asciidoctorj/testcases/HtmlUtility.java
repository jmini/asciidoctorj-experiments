package fr.jmini.asciidoctorj.testcases;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings.Syntax;

public class HtmlUtility {

    public static String normalizeHtml(String html) {
        Document doc = Jsoup.parseBodyFragment(html);
        doc.outputSettings()
                .syntax(Syntax.xml)
                .indentAmount(0);
        String result = doc.body()
                .html();
        String lines[] = result.split("\\r?\\n");
        StringBuilder sb = new StringBuilder();
        boolean needNewLine = false;
        for (String line : lines) {
            if (needNewLine) {
                sb.append("\n");
            }
            sb.append(line.trim());
            needNewLine = true;
        }
        return sb.toString();
    }

}
