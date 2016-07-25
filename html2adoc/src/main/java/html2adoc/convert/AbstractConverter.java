package html2adoc.convert;

import html2adoc.context.IContext;

abstract class AbstractConverter implements IConverter {
  protected void addSpaceIfNeeded(IContext context, StringBuilder sb) {
    if (context.isSpaceNeeded() && context.isLineStarted() && !" ".equals(sb.substring(sb.length() - 1, sb.length()))) {
      sb.append(" ");
    }
  }
}
