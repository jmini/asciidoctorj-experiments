package html2adoc.convert;

import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

import html2adoc.context.ContextBuilder;
import html2adoc.context.IContext;

public class TextNodeConverter extends AbstractConverter {

  @Override
  public boolean canConvert(IContext context, Node node) {
    return node instanceof TextNode;
  }

  @Override
  public IContext convert(IContext context, Node node, StringBuilder sb) {
    String text = ((TextNode) node).text();
    if (text != null) {
      String trimmedText = text.trim();
      if (!trimmedText.isEmpty()) {
        if (trimmedText.substring(0, 1).matches("[a-zA-Z0-9/\\(\\)]")) {
          addSpaceIfNeeded(context, sb);
        }
        sb.append(trimmedText);
        boolean spaceNeeded = trimmedText.substring(trimmedText.length() - 1, trimmedText.length()).matches("[a-zA-Z0-9\\./\\(\\)]");
        return ContextBuilder.build(context).withSpaceNeeded(spaceNeeded).withLineStarted(true).create();
      }
    }
    return context;
  }
}
