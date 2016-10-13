package html2adoc.link;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import html2adoc.Html2Adoc;

public class LinkTest {

  @Test
  public void testExternalLink() throws Exception {
    String html = "<a href=\"http://site.com/\">this site</a>";
    String result = Html2Adoc.convert(html);
    String expected = "link:http://site.com/[this site]";
    assertEquals(expected, result);
  }

  @Test
  public void testExternalLinkInParagraph() throws Exception {
    String html = "<p>Lorem <a href=\"http://site.com/\">this site</a> ipsum.</p>";
    String result = Html2Adoc.convert(html);
    String expected = "Lorem link:http://site.com/[this site] ipsum.\n\n";
    assertEquals(expected, result);
  }

  @Test
  public void testInternalLinkSamePage() throws Exception {
    String html = "<a href=\"#anchor\">this site</a>";
    String result = Html2Adoc.convert(html);
    String expected = "<<anchor,this site>>";
    assertEquals(expected, result);
  }

  @Test
  public void testInternalLinkOtherPageHtm() throws Exception {
    String html = "<a href=\"file.htm#anchor\">this site</a>";
    String result = Html2Adoc.convert(html);
    String expected = "<<file.adoc#anchor,this site>>";
    assertEquals(expected, result);
  }

  @Test
  public void testInternalLinkOtherPageHtml() throws Exception {
    String html = "<a href=\"file.html#anchor\">this site</a>";
    String result = Html2Adoc.convert(html);
    String expected = "<<file.adoc#anchor,this site>>";
    assertEquals(expected, result);
  }
}
