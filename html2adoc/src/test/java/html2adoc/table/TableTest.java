package html2adoc.table;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import html2adoc.Html2Adoc;

public class TableTest {

  @Test
  public void testTable() throws Exception {
    String html = "" + //
        "<table width=\"80%\" border=\"1\" align=\"center\" cellpadding=\"4\" cellspacing=\"0\">" + //
        "<tbody>" + //
        " <tr>" + //
        "  <td>Date</td>" + //
        "  <td>Version</td>" + //
        " </tr>" + //
        " <tr>" + //
        "  <td>Septembre 2016</td>" + //
        "  <td>1.0</td>" + //
        " </tr>" + //
        "</tbody>" + //
        "</table>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "[cols=\"2*\"]\n" + //
        "|===\n" + //
        "\n" + //
        "|Date\n" + //
        "|Version\n" + //
        "\n" + //
        "|Septembre 2016\n" + //
        "|1.0\n" + //
        "|===\n";
    assertEquals(expected, result);
  }

  @Test
  public void testTableWithHeader() throws Exception {
    String html = "" + //
        "<table cellspacing=\"0\">\n" + //
        "  <tr><th width=\"110\">Header 1</th><th>Header 2</th></tr>\n" + //
        "  <tr>\n" + //
        "    <td>Item 1</td>\n" + //
        "    <td>Item 2</td>\n" + //
        "  </tr>\n" + //
        "  <tr>\n" + //
        "    <td>Item a</td>\n" + //
        "    <td>Item b</td>\n" + //
        "  </tr>\n" + //
        "</table>";
    String result = Html2Adoc.convert(html);
    String expected = "" + //
        "[cols=\"2*\", options=\"header\"]\n" + //
        "|===\n" + //
        "\n" + //
        "|Header 1\n" + //
        "|Header 2\n" + //
        "\n" + //
        "|Item 1\n" + //
        "|Item 2\n" + //
        "\n" + //
        "|Item a\n" + //
        "|Item b\n" + //
        "|===\n";
    assertEquals(expected, result);
  }
}
