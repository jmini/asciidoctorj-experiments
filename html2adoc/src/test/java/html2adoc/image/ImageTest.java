package html2adoc.image;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import html2adoc.Html2Adoc;

public class ImageTest {
  @Test
  public void testImageBloc() throws Exception {
    String html = "<p><img src=\"images/install002.png\" width=\"360\" height=\"144\" /></p>";
    String result = Html2Adoc.convert(html);
    String expected = "\nimage::images/install002.png[]\n\n\n";
    assertEquals(expected, result);
  }

  @Test
  public void testImageBlocAlignCenter() throws Exception {
    String html = "<p align=\"center\"><img src=\"images/install002.png\" width=\"360\" height=\"144\" /></p>";
    String result = Html2Adoc.convert(html);
    String expected = "\nimage::images/install002.png[]\n\n\n";
    assertEquals(expected, result);
  }

  @Test
  public void testImageBlocSpaces() throws Exception {
    String html = "<p><img src=\"images/install002.png\" width=\"360\" height=\"144\" /> </p>";
    String result = Html2Adoc.convert(html);
    String expected = "\nimage::images/install002.png[]\n\n\n";
    assertEquals(expected, result);
  }

  @Test
  public void testImageBlocNbsp() throws Exception {
    String html = "<p><img src=\"images/install002.png\" width=\"360\" height=\"144\" />&nbsp;</p>";
    String result = Html2Adoc.convert(html);
    //TODO "&nbsp;" / "(char) 160" is probably not what we want to have in the result:
    String expected = "\nimage::images/install002.png[]\n" + (char) 160 + "\n\n";
    assertEquals(expected, result);
  }

  @Test
  public void test2Images() throws Exception {
    String html = "<p align=\"center\"><img src=\"images/install001.png\" /><img src=\"images/install002.png\" /></p>";
    String result = Html2Adoc.convert(html);
    String expected = " image:images/install001.png[]  image:images/install002.png[] \n\n";
    assertEquals(expected, result);
  }

  @Test
  public void testImageInsideTable() throws Exception {
    String html = "<p><table><tr><td>Lorem</td><td><p align=\"center\"><img src=\"images/install002.png\"/></p></td><td>Ipsum</td></tr></table></p>";
    String result = Html2Adoc.convert(html);
    String expected = "\n\n" + //
        "[cols=\"3*\"]\n" + //
        "|===\n" + //
        "\n" + //
        "|Lorem\n" + //
        "| image:images/install002.png[] \n" + //
        "\n" + //
        "\n" + //
        "|Ipsum\n" + //
        "|===\n\n\n";

    assertEquals(expected, result);
  }

  @Test
  public void testImageInline() throws Exception {
    String html = "<p>Lorem <img src=\"images/install002.png\"/> Ipsum</p>";
    String result = Html2Adoc.convert(html);
    String expected = "Lorem image:images/install002.png[] Ipsum\n\n";
    assertEquals(expected, result);
  }
}
