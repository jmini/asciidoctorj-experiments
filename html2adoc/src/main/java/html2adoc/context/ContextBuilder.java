package html2adoc.context;

public class ContextBuilder {

  private Context context;

  private ContextBuilder() {
    context = new Context();
  }

  public static ContextBuilder build() {
    return new ContextBuilder();
  }

  public static ContextBuilder build(IContext context) {
    return build().withContext(context);
  }

  public ContextBuilder withContext(IContext originalContext) {
    context.setListType(originalContext.getListType());
    context.setLineStarted(originalContext.isLineStarted());
    context.setSpaceNeeded(originalContext.isSpaceNeeded());
    return this;
  }

  public ContextBuilder withListType(ListType listType) {
    context.setListType(listType);
    return this;
  }

  public ContextBuilder withLineStarted(boolean lineStarted) {
    context.setLineStarted(lineStarted);
    return this;
  }

  public ContextBuilder withSpaceNeeded(boolean spaceNeeded) {
    context.setSpaceNeeded(spaceNeeded);
    return this;
  }

  public IContext create() {
    return context;
  }
}
