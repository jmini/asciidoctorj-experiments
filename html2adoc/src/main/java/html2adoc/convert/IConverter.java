package html2adoc.convert;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import html2adoc.context.IContext;

public interface IConverter {

  /**
   * Tell if the node can be converted by this converter or not.
   *
   * @param context
   * @param node
   * @return
   */
  boolean canConvert(IContext context, Node node);

  /**
   * Do the conversion of the current {@link Element} in the {@link StringBuilder} and return the next Element that will
   * be processed.
   *
   * @param context
   * @param node
   * @param sb
   */
  IContext convert(IContext context, Node node, StringBuilder sb);

}
