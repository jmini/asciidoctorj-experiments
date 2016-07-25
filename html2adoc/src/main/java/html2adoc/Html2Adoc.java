package html2adoc;

import java.util.Arrays;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;

import html2adoc.context.ContextBuilder;
import html2adoc.context.IContext;
import html2adoc.convert.BrConverter;
import html2adoc.convert.EmphasisConverter;
import html2adoc.convert.HeaderConverter;
import html2adoc.convert.IConverter;
import html2adoc.convert.ListConverter;
import html2adoc.convert.ListItemConverter;
import html2adoc.convert.MonospaceConverter;
import html2adoc.convert.ParagraphConverter;
import html2adoc.convert.StrongConverter;
import html2adoc.convert.SubscriptConverter;
import html2adoc.convert.SuperscriptConverter;
import html2adoc.convert.TextNodeConverter;

public class Html2Adoc {

  static List<IConverter> CONVERTERS = Arrays.<IConverter> asList(
      new HeaderConverter(),
      new ParagraphConverter(),
      new EmphasisConverter(),
      new MonospaceConverter(),
      new StrongConverter(),
      new SubscriptConverter(),
      new SuperscriptConverter(),
      new ListConverter(),
      new ListItemConverter(),
      new TextNodeConverter(),
      new BrConverter());

  /**
   * @param html
   */
  public static String convert(String html) {
    Document document = Jsoup.parse(html);
    return convert(document.body());
  }

  public static String convert(Node node) {
    IContext context = ContextBuilder.build().create();
    StringBuilder sb = new StringBuilder();
    convert(context, sb, node);
    return sb.toString();
  }

  public static IContext convert(IContext context, StringBuilder sb, Node rootNode) {
    Node node = firstChild(rootNode);
    while (node != null) {
      IConverter converter = findConverter(context, node);
      if (converter != null) {
        context = converter.convert(context, node, sb);
      }
      else if (firstChild(node) != null) {
        IContext newContext = ContextBuilder.build(context).withSpaceNeeded(true).create();
        context = convert(newContext, sb, node);
      }
      node = node.nextSibling();
    }
    return context;
  }

  private static Node firstChild(Node node) {
    List<Node> childNodes = node.childNodes();
    if (childNodes.size() > 0) {
      return childNodes.get(0);
    }
    return null;
  }

  private static IConverter findConverter(IContext context, Node node) {
    for (IConverter converter : CONVERTERS) {
      if (converter.canConvert(context, node)) {
        return converter;
      }
    }
    return null;
  }

}
