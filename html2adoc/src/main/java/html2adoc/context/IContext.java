package html2adoc.context;

public interface IContext {

  ListType getListType();

  boolean isLineStarted();

  boolean isSpaceNeeded();

}
