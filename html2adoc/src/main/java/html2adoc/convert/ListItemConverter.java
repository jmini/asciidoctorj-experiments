package html2adoc.convert;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import html2adoc.Html2Adoc;
import html2adoc.context.ContextBuilder;
import html2adoc.context.IContext;

public class ListItemConverter extends AbstractConverter {

  @Override
  public boolean canConvert(IContext context, Node node) {
    if (node instanceof Element) {
      return "li".equals(((Element) node).tagName());
    }
    return false;
  }

  @Override
  public IContext convert(IContext context, Node node, StringBuilder sb) {
    switch (context.getListType()) {
      case UL:
        sb.append("*");
        break;
      case OL:
        sb.append(".");
        break;
      default:
        throw new IllegalStateException("Unexpected List Type");
    }
    sb.append(" ");
    IContext newContext = ContextBuilder.build(context).withSpaceNeeded(false).withLineStarted(true).create();
    Html2Adoc.convert(newContext, sb, node);
    sb.append("\n");
    return context;
  }
}
