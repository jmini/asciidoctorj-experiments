package html2adoc.convert;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import html2adoc.Html2Adoc;
import html2adoc.context.ContextBuilder;
import html2adoc.context.IContext;

public class LinkConverter extends AbstractConverter {

  @Override
  public boolean canConvert(IContext context, Node node) {
    if (node instanceof Element) {
      Element e = (Element) node;
      if ("a".equals(e.tagName())) {
        if (isExternalLink(e) || isExternalLink(e) || isInternalLinkSamePage(e) || isInternalLinkOtherPage(e)) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public IContext convert(IContext context, Node node, StringBuilder sb) {
    IContext spaceContext = ContextBuilder.build(context).withSpaceNeeded(true).create();
    addSpaceIfNeeded(spaceContext, sb);
    Element e = (Element) node;
    if (isLocalhostLink(e)) {
      sb.append("`");
      IContext newContext = ContextBuilder.build(context).withSpaceNeeded(false).create();
      Html2Adoc.convert(newContext, sb, node);
      sb.append("`");
    }
    else if (isExternalLink(e)) {
      addSpaceIfNeeded(context, sb);
      sb.append("link:");
      String attr = e.attr("href");
      sb.append(attr);
      sb.append("[");
      IContext newContext = ContextBuilder.build(context).withSpaceNeeded(false).create();
      Html2Adoc.convert(newContext, sb, node);
      sb.append("]");
    }
    else if (isInternalLinkSamePage(e)) {
      addSpaceIfNeeded(context, sb);
      sb.append("<<");
      String attr = e.attr("href").substring(1);
      sb.append(attr);
      sb.append(",");
      IContext newContext = ContextBuilder.build(context).withSpaceNeeded(false).create();
      Html2Adoc.convert(newContext, sb, node);
      sb.append(">>");
    }
    else if (isInternalLinkOtherPage(e)) {
      addSpaceIfNeeded(context, sb);
      sb.append("<<");
      String href = e.attr("href");
      int i = href.indexOf("#");
      int j = href.substring(0, i).lastIndexOf(".");
      sb.append(href.substring(0, j));
      sb.append(".adoc#");
      sb.append(href.substring(i + 1));
      sb.append(",");
      IContext newContext = ContextBuilder.build(context).withSpaceNeeded(false).create();
      Html2Adoc.convert(newContext, sb, node);
      sb.append(">>");
    }
    return context;
  }

  private boolean isLocalhostLink(Element e) {
    String attr = e.attr("href");
    return attr != null && attr.startsWith("http://localhost");
  }

  private boolean isExternalLink(Element e) {
    String attr = e.attr("href");
    return attr != null && attr.startsWith("http");
  }

  private boolean isInternalLinkSamePage(Element e) {
    String attr = e.attr("href");
    return attr != null && attr.startsWith("#");
  }

  private boolean isInternalLinkOtherPage(Element e) {
    String attr = e.attr("href");
    return attr != null && (attr.contains("html#") || attr.contains("htm#"));
  }

}
