package html2adoc.convert;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import html2adoc.Html2Adoc;
import html2adoc.context.ContextBuilder;
import html2adoc.context.IContext;
import html2adoc.context.ListType;

public class ListConverter extends AbstractConverter {

  @Override
  public boolean canConvert(IContext context, Node node) {
    if (node instanceof Element) {
      return ((Element) node).tagName().matches("[uo]l");
    }
    return false;
  }

  @Override
  public IContext convert(IContext context, Node node, StringBuilder sb) {
    Element element = (Element) node;
    ListType listType;
    if ("ul".equals(element.tagName())) {
      listType = ListType.UL;
    }
    else if ("ol".equals(element.tagName())) {
      listType = ListType.OL;
    }
    else {
      throw new IllegalStateException("Unexpected list Type");
    }
    IContext newContext = ContextBuilder.build(context).withListType(listType).withSpaceNeeded(false).create();
    Html2Adoc.convert(newContext, sb, node);
    sb.append("\n");
    return context;
  }
}
