package html2adoc.convert;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import html2adoc.context.IContext;

public class ListingConverter extends AbstractConverter {

  @Override
  public boolean canConvert(IContext context, Node node) {
    if (node instanceof Element) {
      return isListingTable((Element) node);
    }
    return false;
  }

  @Override
  public IContext convert(IContext context, Node node, StringBuilder sb) {
    Element element = findListingElement((Element) node);

    sb.append("\n");
    sb.append("----\n");
    sb.append(element.textNodes().get(0).getWholeText());// textNodes().get(0).getWholeText());
    sb.append("\n");
    sb.append("----\n\n");
    return context;
  }

  private boolean isListingTable(Element table) {
    return findListingElement(table) != null;
  }

  private Element findListingElement(Element table) {
    if (!"table".equals(table.tagName())) {
      return null;
    }
    if (table.children().size() != 1) {
      return null;
    }
    Element tbody = table.child(0);
    if (!"tbody".equals(tbody.tagName())) {
      return null;
    }
    if (tbody.children().size() != 2) {
      return null;
    }
    Element tr1 = tbody.child(0);
    if (!"tr".equals(tr1.tagName())) {
      return null;
    }
    if (tr1.children().size() != 1) {
      return null;
    }
    Element td1 = tr1.child(0);
    if (!"td".equals(td1.tagName())) {
      return null;
    }
    if (!"Exemple :".equals(td1.text().trim())) {
      return null;
    }
    Element tr2 = tbody.child(1);
    if (!"tr".equals(tr2.tagName())) {
      return null;
    }
    if (tr2.children().size() != 1) {
      return null;
    }
    Element td2 = tr2.child(0);
    if (!"td".equals(td2.tagName())) {
      return null;
    }
    if (td2.children().size() != 1) {
      return null;
    }
    Element pre = td2.child(0);
    if (!"pre".equals(pre.tagName())) {
      return null;
    }
    if (pre.children().size() != 1) {
      return null;
    }
    Element code = pre.child(0);
    if (!"code".equals(code.tagName())) {
      return null;
    }
    return code;
  }

  /**
   * @param root
   * @param string
   * @return
   */
  private static Element findFirstElement(Element root, String tagName) {
    Elements children = root.children();
    for (Element e : children) {
      if (tagName.equals(e.tagName())) {
        return e;
      }
      Element r = findFirstElement(e, tagName);
      if (r != null) {
        return r;
      }
    }
    return null;
  }
}
