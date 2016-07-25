package html2adoc.context;

public class Context implements IContext {

  private ListType listType;
  private boolean lineStarted;
  private boolean spaceNeeded;

  Context() {
  }

  @Override
  public ListType getListType() {
    return listType;
  }

  void setListType(ListType listType) {
    this.listType = listType;
  }

  @Override
  public boolean isLineStarted() {
    return lineStarted;
  }

  void setLineStarted(boolean lineStarted) {
    this.lineStarted = lineStarted;
  }

  @Override
  public boolean isSpaceNeeded() {
    return spaceNeeded;
  }

  void setSpaceNeeded(boolean spaceNeeded) {
    this.spaceNeeded = spaceNeeded;
  }

}
