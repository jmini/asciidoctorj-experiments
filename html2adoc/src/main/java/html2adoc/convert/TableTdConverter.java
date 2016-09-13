package html2adoc.convert;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import html2adoc.Html2Adoc;
import html2adoc.context.ContextBuilder;
import html2adoc.context.IContext;

public class TableTdConverter extends AbstractConverter {

  @Override
  public boolean canConvert(IContext context, Node node) {
    if (node instanceof Element) {
      return "td".equals(((Element) node).tagName());
    }
    return false;
  }

  @Override
  public IContext convert(IContext context, Node node, StringBuilder sb) {
    sb.append("|");
    IContext newContext = ContextBuilder.build(context).withSpaceNeeded(false).create();
    Html2Adoc.convert(newContext, sb, node);
    sb.append("\n");
    return context;
  }
}
