package html2adoc.convert;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import html2adoc.Html2Adoc;
import html2adoc.context.ContextBuilder;
import html2adoc.context.IContext;

public class TableTbodyConverter extends AbstractConverter {

  @Override
  public boolean canConvert(IContext context, Node node) {
    if (node instanceof Element) {
      return "tbody".equals(((Element) node).tagName());
    }
    return false;
  }

  @Override
  public IContext convert(IContext context, Node node, StringBuilder sb) {
    Element tr = findFirstElement((Element) node, "tr");
    int colsCount = 0;
    Elements children = tr.children();
    for (Element e : children) {
      if ("td".equals(e.tagName())) {
        colsCount = colsCount + 1;
      }
    }
    sb.append("[cols=\"" + colsCount + "*\"]");
    sb.append("\n");
    sb.append("|===");
    sb.append("\n");
    IContext newContext = ContextBuilder.build(context).withSpaceNeeded(false).create();
    Html2Adoc.convert(newContext, sb, node);
    sb.append("|===");
    sb.append("\n");
    return context;
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
