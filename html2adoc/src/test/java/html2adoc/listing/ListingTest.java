package html2adoc.listing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import html2adoc.Html2Adoc;

public class ListingTest {

  @Test
  public void testListing() throws Exception {
    String html = "" + //
        "    <table border=\"1\" cellpadding=\"4\" cellspacing=\"0\" width=\"100%\" align=\"center\">" + //
        "    <tbody>" + //
        "     <tr bgcolor=\"#A6A5C2\">" + //
        "      <td>Exemple :</td>" + //
        "     </tr>" + //
        "     <tr>" + //
        "      <td> <pre><code>package com.example.abc;\n" + //
        "\n" + //
        "public class Test {\n" + //
        "\n" + //
        "&nbsp; public static void main(String[] args) {\n" + //
        "&nbsp;&nbsp;&nbsp; System.out.println(&quot;test&quot;);\n" + //
        "&nbsp; }\n" + //
        "}</code></pre> </td>" + //
        "     </tr>" + //
        "    </tbody>" + //
        "   </table>";
    String result = Html2Adoc.convert(html);
    String expected = "\n" + //
        "----\n" + //
        "package com.example.abc;\n" + //
        "\n" + //
        "public class Test {\n" + //
        "\n" + //
        "  public static void main(String[] args) {\n" + //
        "    System.out.println(\"test\");\n" + //
        "  }\n" + //
        "}\n" + //
        "----\n\n";
    assertEquals(expected, result);
  }
}
