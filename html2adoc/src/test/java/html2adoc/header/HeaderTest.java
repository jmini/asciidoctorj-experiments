package html2adoc.header;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import html2adoc.Html2Adoc;

public class HeaderTest {

  @Test
  public void testH1() throws Exception {
    String html = "<h1>Title</h1>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "= Title\n" + //
        "\n";
    assertEquals(expected, result);
  }

  @Test
  public void testH2() throws Exception {
    String html = "<h2>Title</h2>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "== Title\n" + //
        "\n";
    assertEquals(expected, result);
  }

  @Test
  public void testH3() throws Exception {
    String html = "<h3>Title</h3>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "=== Title\n" + //
        "\n";
    assertEquals(expected, result);
  }

  @Test
  public void testH4() throws Exception {
    String html = "<h4>Title</h4>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "==== Title\n" + //
        "\n";
    assertEquals(expected, result);
  }

  @Test
  public void testH5() throws Exception {
    String html = "<h5>Title</h5>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "===== Title\n" + //
        "\n";
    assertEquals(expected, result);
  }

  @Test
  public void testH6() throws Exception {
    String html = "<h6>Title</h6>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "====== Title\n" + //
        "\n";
    assertEquals(expected, result);
  }

  @Test
  public void testBlank() throws Exception {
    String html = "<h1> Title</h1>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "= Title\n" + //
        "\n";
    assertEquals(expected, result);
  }

  @Test
  public void testNbspParagraphBefore() throws Exception {
    String html = "<p>&nbsp;</p> <h1>Title</h1>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        " \n" + //
        "\n" + //
        "= Title\n" + //
        "\n";
    assertEquals(expected, result);
  }

  @Test
  public void testEmStart() throws Exception {
    String html = "<h2><em>This</em> is true</h2>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "== _This_ is true\n" + //
        "\n";
    assertEquals(expected, result);
  }

  @Test
  public void testEmMiddle() throws Exception {
    String html = "<h2>This <em>is</em> true</h2>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "== This _is_ true\n" + //
        "\n";
    assertEquals(expected, result);
  }

  @Test
  public void testEmEnd() throws Exception {
    String html = "<h2>This is <em>true</em></h2>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "== This is _true_\n" + //
        "\n";
    assertEquals(expected, result);
  }

  @Test
  public void testEnsureSpaces() throws Exception {
    String html = "<h2>\"Lorem\"</h2>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "== \"Lorem\"\n" + //
        "\n";
    assertEquals(expected, result);
  }

}
