package html2adoc.convert;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import html2adoc.Html2Adoc;
import html2adoc.context.ContextBuilder;
import html2adoc.context.IContext;

public class ParagraphConverter extends AbstractConverter {

  @Override
  public boolean canConvert(IContext context, Node node) {
    if (node instanceof Element) {
      return "p".equals(((Element) node).tagName());
    }
    return false;
  }

  @Override
  public IContext convert(IContext context, Node node, StringBuilder sb) {
    Element element = (Element) node;
    String text = element.text();
    if (element.children().size() != 0 || !text.matches("[" + (char) 160 + "\\s]+")) {
      IContext newContext = ContextBuilder.build(context).withSpaceNeeded(false).create();
      Html2Adoc.convert(newContext, sb, node);
      sb.append("\n\n");
    }
    return context;
  }

}
