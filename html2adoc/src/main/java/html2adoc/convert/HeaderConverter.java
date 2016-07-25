package html2adoc.convert;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import com.google.common.base.Strings;

import html2adoc.Html2Adoc;
import html2adoc.context.ContextBuilder;
import html2adoc.context.IContext;

public class HeaderConverter extends AbstractConverter {

  @Override
  public boolean canConvert(IContext context, Node node) {
    if (node instanceof Element) {
      return ((Element) node).tagName().matches("h[1-6]");
    }
    return false;
  }

  @Override
  public IContext convert(IContext context, Node node, StringBuilder sb) {
    Element element = (Element) node;
    int count = Integer.valueOf(element.tagName().substring(1));
    sb.append(Strings.repeat("=", count));
    sb.append(" ");
    IContext newContext = ContextBuilder.build(context).withSpaceNeeded(false).withLineStarted(true).create();
    Html2Adoc.convert(newContext, sb, node);
    sb.append("\n\n");
    return context;
  }
}
