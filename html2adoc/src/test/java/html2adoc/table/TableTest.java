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
}
