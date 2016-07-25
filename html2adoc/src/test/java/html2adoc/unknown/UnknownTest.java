package html2adoc.unknown;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import html2adoc.Html2Adoc;

public class UnknownTest {

  @Test
  public void testUnknown() throws Exception {
    String html = "<p>A <xx>simple</xx> paragraph</p>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "A simple paragraph\n" + //
        "\n";
    assertEquals(expected, result);
  }

  @Test
  public void testWithoutSpaces() throws Exception {
    String html = "<yyy>Lorem</yyy><xx>Ipsum</xx>";
    String result = Html2Adoc.convert(html);
    String expected = "Lorem Ipsum";
    assertEquals(expected, result);
  }

  @Test
  public void testParagraphWithoutSpaces() throws Exception {
    String html = "<p><yyy>Lorem</yyy><xx>Ipsum</xx></p>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "Lorem Ipsum\n" + //
        "\n";
    assertEquals(expected, result);
  }
}
