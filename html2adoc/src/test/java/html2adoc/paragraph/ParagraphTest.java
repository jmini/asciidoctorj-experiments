package html2adoc.paragraph;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import html2adoc.Html2Adoc;

public class ParagraphTest {

  @Test
  public void testSimpleParagraph() throws Exception {
    String html = "<p>A simple paragraph</p>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "A simple paragraph\n" + //
        "\n";
    assertEquals(expected, result);
  }

  @Test
  public void testTwoSimpleParagraphs() throws Exception {
    String html = "<p>First</p><p>Second</p>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "First\n" + //
        "\n" + //
        "Second\n" + //
        "\n";
    assertEquals(expected, result);
  }

  @Test
  public void testTwoParagraphsBr() throws Exception {
    String html = "<p>First</p><p> <br>Second</p>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "First\n" + //
        "\n" + //
        "Second\n" + //
        "\n";
    assertEquals(expected, result);
  }

  @Test
  public void testEmptyParagraph() throws Exception {
    String html = "<p>&nbsp;</p>";
    String result = Html2Adoc.convert(html);
    String expected = "";
    assertEquals(expected, result);
  }

  @Test
  public void testBrStart() throws Exception {
    String html = "<p><br>Lorem Ipsum</p>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "Lorem Ipsum\n" + //
        "\n";
    assertEquals(expected, result);
  }

  @Test
  public void testBrMiddle() throws Exception {
    String html = "<p>Lorem<br> Ipsum</p>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "Lorem Ipsum\n" + //
        "\n";
    assertEquals(expected, result);
  }

  @Test
  public void testBrEnd() throws Exception {
    String html = "<p>Lorem Ipsum<br></p>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "Lorem Ipsum\n" + //
        "\n";
    assertEquals(expected, result);
  }

  @Test
  public void testWithBrAndStrong() throws Exception {
    String html = "<p>Lorem<br> <strong>Ipsum</strong></p>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "Lorem *Ipsum*\n" + //
        "\n";
    assertEquals(expected, result);
  }

}
