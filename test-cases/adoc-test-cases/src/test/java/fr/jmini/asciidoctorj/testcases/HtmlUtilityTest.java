package fr.jmini.asciidoctorj.testcases;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class HtmlUtilityTest {

    @Test
    public void testNormalizeHtml() throws Exception {
        String html;
        html = HtmlUtility.normalizeHtml("<ol start=\"5\"><li>one</li></ol>");
        assertThat(html).isEqualTo("<ol start=\"5\">\n" +
                "<li>one</li>\n" +
                "</ol>");

        html = HtmlUtility.normalizeHtml("<ol reversed><li>one</li></ol>");
        assertThat(html).isEqualTo("<ol reversed=\"\">\n" +
                "<li>one</li>\n" +
                "</ol>");
        System.out.println(HtmlUtility.normalizeHtml("<ol reversed><li>one</li></ol>"));

    }

}
