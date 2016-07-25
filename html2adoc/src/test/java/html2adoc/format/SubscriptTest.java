package html2adoc.format;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import html2adoc.Html2Adoc;

public class SubscriptTest {

  @Test
  public void testSuperscript() throws Exception {
    String html = "<p>The <sub>hello</sub> world</p>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "The ~hello~ world\n" + //
        "\n";
    assertEquals(expected, result);
  }
}
