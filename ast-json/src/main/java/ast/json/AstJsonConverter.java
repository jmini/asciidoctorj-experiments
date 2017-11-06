package ast.json;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.asciidoctor.ast.Block;
import org.asciidoctor.ast.Cell;
import org.asciidoctor.ast.Column;
import org.asciidoctor.ast.ContentNode;
import org.asciidoctor.ast.DescriptionList;
import org.asciidoctor.ast.DescriptionListEntry;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.ListItem;
import org.asciidoctor.ast.PhraseNode;
import org.asciidoctor.ast.Row;
import org.asciidoctor.ast.Section;
import org.asciidoctor.ast.StructuralNode;
import org.asciidoctor.ast.Table;
import org.asciidoctor.ast.Title;
import org.asciidoctor.converter.AbstractConverter;
import org.asciidoctor.converter.ConverterFor;
import org.json.JSONArray;
import org.json.JSONObject;

@ConverterFor("ast-json")
public class AstJsonConverter extends AbstractConverter<JSONObject> {

  private String LINE_SEPARATOR = "\n";

  public AstJsonConverter(String backend, Map<String, Object> opts) {
    super(backend, opts);
  }

  @Override
  public JSONObject convert(ContentNode node, String transform, Map<Object, Object> o) {
    return convertToJSONObject(node);
  }

  private JSONObject convertToJSONObject(ContentNode node) {
    JSONObject obj = new JSONObject();
//    obj.put("javaClass", node.getClass().getSimpleName());
    obj.put("attributes", mapToJSONObject(node.getAttributes()));
    obj.put("context", node.getContext());
    obj.put("id", node.getId());
    obj.put("nodeName", node.getNodeName());
    obj.put("reftext", node.getReftext());
    obj.put("role", node.getRole());
    obj.put("roles", listToJSONArray(node.getRoles()));
    //node.getDocument() is not added to the JSON structure.
    //node.getParent() is not added to the JSON structure.

    if (node instanceof Cell) {
      Cell cell = (Cell) node;
      obj.put("colspan", cell.getColspan());
      obj.put("content", cell.getContent());
      obj.put("horizontalAlignment", cell.getHorizontalAlignment());
      obj.put("innerDocument", cell.getInnerDocument());
      obj.put("rowspan", cell.getRowspan());
      obj.put("style", cell.getStyle());
      obj.put("text", cell.getText());
      obj.put("verticalAlignment", cell.getVerticalAlignment());
      //cell.getColumn() is not added to the JSON structure.
    }
    else if (node instanceof Column) {
      Column column = (Column) node;
      obj.put("columnNumber", column.getColumnNumber());
      obj.put("horizontalAlignment", column.getHorizontalAlignment());
      obj.put("style", column.getStyle());
      obj.put("verticalAlignment", column.getVerticalAlignment());
      obj.put("width", column.getWidth());
      //column.getTable() is not added to the JSON structure.
    }
    else if (node instanceof PhraseNode) {
      PhraseNode phraseNode = (PhraseNode) node;
      obj.put("type", phraseNode.getType());
      obj.put("text", phraseNode.getText());
      obj.put("target", phraseNode.getTarget());
    }
    else if (node instanceof StructuralNode) {
      StructuralNode structuralNode = (StructuralNode) node;
      obj.put("level", structuralNode.getLevel());
      obj.put("sourceLocation", structuralNode.getSourceLocation());
      obj.put("style", structuralNode.getStyle());
      obj.put("title", structuralNode.getTitle());
      obj.put("blocks", convertToJSONArray(structuralNode.getBlocks()));
//      obj.put("content", structuralNode.getContent());

      if (structuralNode instanceof Block) {
        Block block = (Block) structuralNode;
        obj.put("lines", listToJSONArray(block.getLines()));
        obj.put("source", block.getSource());
      }
      else if (structuralNode instanceof DescriptionList) {
        DescriptionList descriptionList = (DescriptionList) structuralNode;
        obj.put("items", convertDescriptionListItemsToJSONArray(descriptionList));
      }
      else if (structuralNode instanceof Document) {
        Document document = (Document) structuralNode;
        obj.put("doctitle", document.getDoctitle());
        obj.put("options", mapToJSONObject(document.getOptions()));
        obj.put("structuredDoctitle", mapTitleToJSONObject(document.getStructuredDoctitle()));
      }
      else if (structuralNode instanceof org.asciidoctor.ast.List) {
        org.asciidoctor.ast.List list = (org.asciidoctor.ast.List) structuralNode;
        obj.put("items", convertToJSONArray(list.getItems()));
      }
      else if (structuralNode instanceof ListItem) {
        ListItem listItem = (ListItem) structuralNode;
        obj.put("marker", listItem.getMarker());
        obj.put("text", listItem.getText());
      }
      else if (structuralNode instanceof Section) {
        Section section = (Section) structuralNode;
        obj.put("index", section.getIndex());
        obj.put("number", section.getNumber());
        obj.put("sectionName", section.getSectionName());
        obj.put("special", section.isSpecial());
      }
      else if (structuralNode instanceof Table) {
        Table table = (Table) structuralNode;
        obj.put("frame", table.getFrame());
        obj.put("grid", table.getGrid());
        obj.put("body", convertRowsToJSONArray(table.getBody()));
        obj.put("columns", convertToJSONArray(table.getColumns()));
        obj.put("footer", convertRowsToJSONArray(table.getFooter()));
        obj.put("header", convertRowsToJSONArray(table.getHeader()));
      }
    }
    return obj;
  }

  @Override
  public void write(JSONObject output, OutputStream out) throws IOException {
    if (output != null) {
      out.write(output.toString(4).getBytes(Charset.forName("UTF-8")));
    }
  }

  private JSONObject mapTitleToJSONObject(Title title) {
    if (title == null) {
      return null;
    }
    JSONObject obj = new JSONObject();
    obj.put("combined", title.getCombined());
    obj.put("main", title.getMain());
    obj.put("subtitle", title.getSubtitle());
    return obj;
  }

  private JSONArray convertRowsToJSONArray(List<Row> rows) {
    JSONArray array = new JSONArray();
    for (Row row : rows) {
      array.put(convertToJSONArray(row.getCells()));
    }
    return array;
  }

  private JSONArray convertDescriptionListItemsToJSONArray(DescriptionList descriptionList) {
    JSONArray array = new JSONArray();
    for (DescriptionListEntry e : descriptionList.getItems()) {
      array.put(convertDescriptionListEntryToJSONObject(e));
    }
    return array;
  }

  private Collection<?> convertDescriptionListEntryToJSONObject(DescriptionListEntry entry) {
    JSONObject obj = new JSONObject();
    obj.put("description", entry.getDescription());
    obj.put("terms", convertToJSONArray(entry.getTerms()));
    return null;
  }

  private JSONArray convertToJSONArray(List<? extends ContentNode> list) {
    if (list != null && list.size() > 0) {
      JSONArray array = new JSONArray();
      for (ContentNode node : list) {
        array.put(convertToJSONObject(node));
      }
      return array;
    }
    return null;
  }

  private JSONArray listToJSONArray(List<String> list) {
    JSONArray array = new JSONArray();
    for (String e : list) {
      array.put(e);
    }
    return array;
  }

  private JSONObject mapToJSONObject(Map<? extends Object, Object> map) {
    JSONObject object = new JSONObject();
    for (Entry<? extends Object, Object> entry : map.entrySet()) {
      object.put(entry.getKey().toString(), entry.getValue());
    }
    return object;
  }

}
