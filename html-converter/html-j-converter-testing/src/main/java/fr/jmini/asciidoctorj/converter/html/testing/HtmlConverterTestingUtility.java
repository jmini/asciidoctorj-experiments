package fr.jmini.asciidoctorj.converter.html.testing;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class HtmlConverterTestingUtility {

    public static String normalizeHtml(String html) {
        Document doc = Jsoup.parseBodyFragment(html);
        return doc.body()
                .html();
    }

}
