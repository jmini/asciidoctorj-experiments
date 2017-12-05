package html2adoc.format;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import html2adoc.Html2Adoc;

public class StrongTest {

  @Test
  public void testStrong() throws Exception {
    String html = "<p>This <strong>is</strong> important</p>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "This *is* important\n" + //
        "\n";
    assertEquals(expected, result);
  }

  @Test
  public void testStrongAll() throws Exception {
    String html = "<p><strong>This is important</strong>.</p>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "*This is important*.\n" + //
        "\n";
    assertEquals(expected, result);
  }

  @Test
  public void testStrongSecondSentence() throws Exception {
    String html = "<p>Ipsum. <strong>This is important.</strong> Lorem.</p>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "Ipsum. *This is important.* Lorem.\n" + //
        "\n";
    assertEquals(expected, result);
  }

  @Test
  public void testStrongWrongSpacesBegin() throws Exception {
    String html = "<p><strong>Lorem</strong>: ipsum</p>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "*Lorem*: ipsum\n" + //
        "\n";
    assertEquals(expected, result);
  }

  @Test
  public void testStrongWrongSpacesEnd() throws Exception {
    String html = "<p>This is<strong>important</strong>!</p>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "This is *important*!\n" + //
        "\n";
    assertEquals(expected, result);
  }

  @Test
  public void testNoSpaceRequired() throws Exception {
    String html = "<p>Lorem d'<strong>ipsum</strong>?</p>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "Lorem d'*ipsum*?\n" + //
        "\n";
    assertEquals(expected, result);
  }

  @Test
  public void testKeepSpace1() throws Exception {
    String html = "<p>10. <strong>Ipsum</strong>;</p>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "10. *Ipsum*;\n" + //
        "\n";
    assertEquals(expected, result);
  }

  @Test
  public void testKeepSpace2() throws Exception {
    String html = "<p>http://www.xxx.yy/fr/ <strong>is</strong> correct!</p>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "http://www.xxx.yy/fr/ *is* correct!\n" + //
        "\n";
    assertEquals(expected, result);
  }

  @Test
  public void testKeepSpace3() throws Exception {
    String html = "<p>10 <strong>is</strong> 10</p>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "10 *is* 10\n" + //
        "\n";
    assertEquals(expected, result);
  }

  @Test
  public void testKeepSpace4() throws Exception {
    String html = "<p>/xxx/ <strong>is</strong> /xxx/</p>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "/xxx/ *is* /xxx/\n" + //
        "\n";
    assertEquals(expected, result);
  }

  @Test
  public void testKeepSpace5() throws Exception {
    String html = "<p>Lorem: <strong>Ipsum...</strong></p>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "Lorem: *Ipsum...*\n" + //
        "\n";
    assertEquals(expected, result);
  }

  @Test
  public void testKeepSpaceWithBrackets() throws Exception {
    String html = "<p>(lorem) <strong>is</strong> (ipsum)</p>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "(lorem) *is* (ipsum)\n" + //
        "\n";
    assertEquals(expected, result);
  }
}
