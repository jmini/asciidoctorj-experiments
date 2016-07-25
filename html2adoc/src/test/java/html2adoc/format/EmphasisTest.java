package html2adoc.format;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import html2adoc.Html2Adoc;

public class EmphasisTest {

  @Test
  public void testEmphasis() throws Exception {
    String html = "<p>This <em>is</em> important</p>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "This _is_ important\n" + //
        "\n";
    assertEquals(expected, result);
  }
}
