package html2adoc.list;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import html2adoc.Html2Adoc;

public class ListTest {

  @Test
  public void testUl() throws Exception {
    String html = "<ul><li>lorem</li><li>ipsum</li></ul>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "* lorem\n" + //
        "* ipsum\n" + //
        "\n";
    assertEquals(expected, result);
  }

  @Test
  public void testOl() throws Exception {
    String html = "<ol><li>lorem</li><li>ipsum</li></ol>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        ". lorem\n" + //
        ". ipsum\n" + //
        "\n";
    assertEquals(expected, result);
  }

  @Test
  public void testWithBrInUl() throws Exception {
    String html = "<ul><br><li>lorem</li><li>ipsum</li></ul>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "* lorem\n" + //
        "* ipsum\n" + //
        "\n";
    assertEquals(expected, result);
  }

  @Test
  public void testWithBrInLi() throws Exception {
    String html = "<ul><li><br>lorem</li><li>ipsum</li></ul>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "* lorem\n" + //
        "* ipsum\n" + //
        "\n";
    assertEquals(expected, result);
  }

  @Test
  public void testUlEnsureSpaces() throws Exception {
    String html = "<ul><li>\"lorem\"</li><li>...</li></ul>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "* \"lorem\"\n" + //
        "* ...\n" + //
        "\n";
    assertEquals(expected, result);
  }

}
