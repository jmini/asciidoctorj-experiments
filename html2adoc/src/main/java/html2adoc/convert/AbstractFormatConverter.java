package html2adoc.convert;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import html2adoc.Html2Adoc;
import html2adoc.context.ContextBuilder;
import html2adoc.context.IContext;

abstract class AbstractFormatConverter extends AbstractConverter {

  private String tagName;
  private String adocChar;

  AbstractFormatConverter(String tagName, String adocChar) {
    this.tagName = tagName;
    this.adocChar = adocChar;
  }

  @Override
  public boolean canConvert(IContext context, Node node) {
    if (node instanceof Element) {
      return tagName.equals(((Element) node).tagName());
    }
    return false;
  }

  @Override
  public IContext convert(IContext context, Node node, StringBuilder sb) {
    addSpaceIfNeeded(context, sb);
    sb.append(adocChar);
    IContext newContext = ContextBuilder.build(context).withSpaceNeeded(false).create();
    Html2Adoc.convert(newContext, sb, node);
    sb.append(adocChar);
    return ContextBuilder.build(context).withSpaceNeeded(true).create();
  }

}
