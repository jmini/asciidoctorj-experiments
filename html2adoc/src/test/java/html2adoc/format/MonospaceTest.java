package html2adoc.format;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import html2adoc.Html2Adoc;

public class MonospaceTest {

  @Test
  public void testMonospace() throws Exception {
    String html = "<p>This <code>is</code> important</p>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "This `is` important\n" + //
        "\n";
    assertEquals(expected, result);
  }
}
