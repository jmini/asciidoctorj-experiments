package fr.jmini.asciidoctorj.converter.html.testing;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class HtmlConverterTestingUtilityTest {

    @Test
    public void testNormalizeHtml() throws Exception {
        String html;
        html = HtmlConverterTestingUtility.normalizeHtml("<ol start=\"5\"><li>one</li></ol>");
        assertThat(html).isEqualTo("<ol start=\"5\">\n" +
                "<li>one</li>\n" +
                "</ol>");

        html = HtmlConverterTestingUtility.normalizeHtml("<ol reversed><li>one</li></ol>");
        assertThat(html).isEqualTo("<ol reversed=\"\">\n" +
                "<li>one</li>\n" +
                "</ol>");
        System.out.println(HtmlConverterTestingUtility.normalizeHtml("<ol reversed><li>one</li></ol>"));

    }

}
