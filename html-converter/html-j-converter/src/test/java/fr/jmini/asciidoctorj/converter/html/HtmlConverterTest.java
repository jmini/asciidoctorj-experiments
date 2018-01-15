package fr.jmini.asciidoctorj.converter.html;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class HtmlConverterTest {

    @Test
    public void testNormalizePath() throws Exception {
        assertThat(HtmlConverter.normalizePath("http://site.com/pict.png")).isEqualTo("http://site.com/pict.png");
        assertThat(HtmlConverter.normalizePath("https://www.test.com/fig.jpg")).isEqualTo("https://www.test.com/fig.jpg");
        assertThat(HtmlConverter.normalizePath("ftp://test@test.com/picutre.gif")).isEqualTo("ftp://test@test.com/picutre.gif");

        assertThat(HtmlConverter.normalizePath("pict.png")).isEqualTo("pict.png");
        assertThat(HtmlConverter.normalizePath("folder/")).isEqualTo("folder/");
        assertThat(HtmlConverter.normalizePath("/absolute/")).isEqualTo("/absolute/");

        assertThat(HtmlConverter.normalizePath("/absolute/pict.png")).isEqualTo("/absolute/pict.png");
        assertThat(HtmlConverter.normalizePath("/absolute//pict.png")).isEqualTo("/absolute//pict.png");
        assertThat(HtmlConverter.normalizePath("//absolute/pict.png")).isEqualTo("//absolute/pict.png");
        assertThat(HtmlConverter.normalizePath("/absolute/./pict.png")).isEqualTo("/absolute/pict.png");
        assertThat(HtmlConverter.normalizePath("/absolute/.//pict.png")).isEqualTo("/absolute//pict.png");
        assertThat(HtmlConverter.normalizePath("/absolute/other/../pict.png")).isEqualTo("/absolute/pict.png");
        assertThat(HtmlConverter.normalizePath("/absolute/other/.././pict.png")).isEqualTo("/absolute/pict.png");
        assertThat(HtmlConverter.normalizePath("/absolute/../f/pict.png")).isEqualTo("/f/pict.png");

        assertThat(HtmlConverter.normalizePath("/../folder/./pict1.png")).isEqualTo("/folder/pict1.png");
        assertThat(HtmlConverter.normalizePath("/other/../pict2.png")).isEqualTo("/pict2.png");
        assertThat(HtmlConverter.normalizePath("/absolute/../../pict3.png")).isEqualTo("/pict3.png");

        assertThat(HtmlConverter.normalizePath("folder/pict.png")).isEqualTo("folder/pict.png");
        assertThat(HtmlConverter.normalizePath("folder//pict.png")).isEqualTo("folder//pict.png");
        assertThat(HtmlConverter.normalizePath("folder/./pict.png")).isEqualTo("folder/pict.png");
        assertThat(HtmlConverter.normalizePath("folder/other/../pict.png")).isEqualTo("folder/pict.png");
        assertThat(HtmlConverter.normalizePath("folder/other/.././pict.png")).isEqualTo("folder/pict.png");

        assertThat(HtmlConverter.normalizePath("other/../pict.png")).isEqualTo("pict.png");
        assertThat(HtmlConverter.normalizePath("other/../../img/pict.jpg")).isEqualTo("../img/pict.jpg");
        assertThat(HtmlConverter.normalizePath("other/../../../pict.jpg")).isEqualTo("../../pict.jpg");
        assertThat(HtmlConverter.normalizePath("other/.././img/pict.jpg")).isEqualTo("img/pict.jpg");

        assertThat(HtmlConverter.normalizePath("./folder/pict.png")).isEqualTo("./folder/pict.png");
        assertThat(HtmlConverter.normalizePath("./folder/./pict.png")).isEqualTo("./folder/pict.png");
        assertThat(HtmlConverter.normalizePath("./folder/other/../pict.png")).isEqualTo("./folder/pict.png");
        assertThat(HtmlConverter.normalizePath("./folder/other/.././pict.png")).isEqualTo("./folder/pict.png");
        assertThat(HtmlConverter.normalizePath("./other/../f/pict.png")).isEqualTo("./f/pict.png");
        assertThat(HtmlConverter.normalizePath("./o1/../o2/../f/pict.png")).isEqualTo("./f/pict.png");
        assertThat(HtmlConverter.normalizePath("./o1/o2/../../f/pict.png")).isEqualTo("./f/pict.png");
        assertThat(HtmlConverter.normalizePath("./o1/o2/../../../f/pict.png")).isEqualTo("./../f/pict.png");

        assertThat(HtmlConverter.normalizePath("../folder/pict.png")).isEqualTo("../folder/pict.png");
        assertThat(HtmlConverter.normalizePath("../folder/./pict.png")).isEqualTo("../folder/pict.png");
        assertThat(HtmlConverter.normalizePath("../folder/other/../pict.png")).isEqualTo("../folder/pict.png");
        assertThat(HtmlConverter.normalizePath("../folder/other/.././pict.png")).isEqualTo("../folder/pict.png");
        assertThat(HtmlConverter.normalizePath("../other/../f/pict.png")).isEqualTo("../f/pict.png");
        assertThat(HtmlConverter.normalizePath("../o1/../o2/../f/pict.png")).isEqualTo("../f/pict.png");
        assertThat(HtmlConverter.normalizePath("../o1/o2/../../f/pict.png")).isEqualTo("../f/pict.png");
        assertThat(HtmlConverter.normalizePath("../o1/o2/../../../f/pict.png")).isEqualTo("../../f/pict.png");
        assertThat(HtmlConverter.normalizePath("../o1/o2/../../../../pict.png")).isEqualTo("../../../pict.png");

        assertThat(HtmlConverter.normalizePath("../../folder/pict.png")).isEqualTo("../../folder/pict.png");
        assertThat(HtmlConverter.normalizePath("../../folder/./pict.png")).isEqualTo("../../folder/pict.png");
        assertThat(HtmlConverter.normalizePath("../../folder/other/../pict.png")).isEqualTo("../../folder/pict.png");
        assertThat(HtmlConverter.normalizePath("../../folder/other/.././pict.png")).isEqualTo("../../folder/pict.png");
        assertThat(HtmlConverter.normalizePath("../../other/../f/pict.png")).isEqualTo("../../f/pict.png");
        assertThat(HtmlConverter.normalizePath("../../o1/o2/../../../pict.png")).isEqualTo("../../../pict.png");
        assertThat(HtmlConverter.normalizePath("../../o1/../o2/../f/pict.png")).isEqualTo("../../f/pict.png");
        assertThat(HtmlConverter.normalizePath("../o1/../../o2/../f/pict.png")).isEqualTo("../../f/pict.png");
        assertThat(HtmlConverter.normalizePath("o1/../../../o2/../f/pict.png")).isEqualTo("../../f/pict.png");
        assertThat(HtmlConverter.normalizePath("../../o1/o2/../../f/pict.png")).isEqualTo("../../f/pict.png");
        assertThat(HtmlConverter.normalizePath("../o1/o2/../../../f/pict.png")).isEqualTo("../../f/pict.png");
        assertThat(HtmlConverter.normalizePath("o1/o2/../../../../f/pict.png")).isEqualTo("../../f/pict.png");
    }
}
