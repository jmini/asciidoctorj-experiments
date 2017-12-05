package html2adoc.convert;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

import html2adoc.context.IContext;

public class ImageConverter extends AbstractConverter {

  @Override
  public boolean canConvert(IContext context, Node node) {
    if (node instanceof Element) {
      return "img".equals(((Element) node).tagName());
    }
    return false;
  }

  @Override
  public IContext convert(IContext context, Node node, StringBuilder sb) {
    Element element = (Element) node;
    Element parent = element.parent();
    boolean imageBloc = parent != null && (("p".equals(parent.tagName()) && hasNoOtherChild(parent)) || "body".equals(parent.tagName())) && isNotInsideATable(parent);
    if (imageBloc) {
      sb.append("\n");
      sb.append("image::");
    }
    else {
      sb.append(" image:");
    }
    sb.append(element.attr("src"));
    sb.append("[]");
    if (imageBloc) {
      sb.append("\n");
      if ("body".equals(parent.tagName())) {
        sb.append("\n");
      }
    }
    else {
      sb.append(" ");
    }
    return context;
  }

  /**
   * @param parent
   * @return
   */
  private boolean isNotInsideATable(Element parent) {
    Element e = parent;
    while (e != null) {
      if ("table".equals(e.tagName())) {
        return false;
      }
      e = e.parent();
    }
    return true;
  }

  private boolean hasNoOtherChild(Element parent) {
    if (parent.childNodes().size() == 1) {
      return true;
    }
    else {
      int i = 0;
      for (Node n : parent.childNodes()) {
        if (n instanceof TextNode) {
          String text = ((TextNode) n).text();
          if (!text.matches("[" + (char) 160 + "\\s]+")) {
            return false;
          }
        }
        else if (n instanceof Element) {
          if ("img".equals(((Element) n).tagName())) {
            i = i + 1;
          }
          else {
            return false;
          }
        }
      }
      return i == 1;
    }
  }
}
