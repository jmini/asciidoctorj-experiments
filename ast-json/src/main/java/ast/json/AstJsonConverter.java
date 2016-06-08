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
    obj.put("Attributes", mapToJSONObject(node.getAttributes()));
    obj.put("Context", node.getContext());
    obj.put("Id", node.getId());
    obj.put("NodeName", node.getNodeName());
    obj.put("Reftext", node.getReftext());
    obj.put("Role", node.getRole());
    obj.put("Roles", mapToJSONArray(node.getRoles()));
    //node.getDocument() is not added to the JSON structure.
    //node.getParent() is not added to the JSON structure.

    if (node instanceof Cell) {
      Cell cell = (Cell) node;
      obj.put("Colspan", cell.getColspan());
      obj.put("Content", cell.getContent());
      obj.put("HorizontalAlignment", cell.getHorizontalAlignment());
      obj.put("InnerDocument", cell.getInnerDocument());
      obj.put("Rowspan", cell.getRowspan());
      obj.put("Style", cell.getStyle());
      obj.put("Text", cell.getText());
      obj.put("VerticalAlignment", cell.getVerticalAlignment());
      //cell.getColumn() is not added to the JSON structure.
    }
    else if (node instanceof Column) {
      Column column = (Column) node;
      obj.put("ColumnNumber", column.getColumnNumber());
      obj.put("HorizontalAlignment", column.getHorizontalAlignment());
      obj.put("Style", column.getStyle());
      obj.put("VerticalAlignment", column.getVerticalAlignment());
      obj.put("Width", column.getWidth());
      //column.getTable() is not added to the JSON structure.
    }
    else if (node instanceof PhraseNode) {
      PhraseNode phraseNode = (PhraseNode) node;
      obj.put("Type", phraseNode.getType());
      obj.put("Text", phraseNode.getText());
      obj.put("Target", phraseNode.getTarget());
    }
    else if (node instanceof StructuralNode) {
      StructuralNode structuralNode = (StructuralNode) node;
      obj.put("Level", structuralNode.getLevel());
      obj.put("SourceLocation", structuralNode.getSourceLocation());
      obj.put("Style", structuralNode.getStyle());
      obj.put("Title", structuralNode.getTitle());
      obj.put("Blocks", convertToJSONArray(structuralNode.getBlocks()));
      obj.put("Content", structuralNode.getContent());

      if (structuralNode instanceof Block) {
        Block block = (Block) structuralNode;
        obj.put("Lines", mapToJSONArray(block.getLines()));
        obj.put("Source", block.getSource());
      }
      else if (structuralNode instanceof DescriptionList) {
        DescriptionList descriptionList = (DescriptionList) structuralNode;
        obj.put("Items", convertDescriptionListItemsToJSONArray(descriptionList));
      }
      else if (structuralNode instanceof Document) {
        Document document = (Document) structuralNode;
        obj.put("Doctitle", document.getDoctitle());
        obj.put("Options", mapToJSONObject(document.getOptions()));
        obj.put("StructuredDoctitle", mapTitleToJSONObject(document.getStructuredDoctitle()));
      }
      else if (structuralNode instanceof org.asciidoctor.ast.List) {
        org.asciidoctor.ast.List list = (org.asciidoctor.ast.List) structuralNode;
        obj.put("Items", convertToJSONArray(list.getItems()));
      }
      else if (structuralNode instanceof ListItem) {
        ListItem listItem = (ListItem) structuralNode;
        obj.put("Marker", listItem.getMarker());
        obj.put("Text", listItem.getText());
      }
      else if (structuralNode instanceof Section) {
        Section section = (Section) structuralNode;
        obj.put("Index", section.getIndex());
        obj.put("Number", section.getNumber());
        obj.put("SectionName", section.getSectionName());
        obj.put("Special", section.isSpecial());
      }
      else if (structuralNode instanceof Table) {
        Table table = (Table) structuralNode;
        obj.put("Frame", table.getFrame());
        obj.put("Grid", table.getGrid());
        obj.put("Body", convertRowsToJSONArray(table.getBody()));
        obj.put("Columns", convertToJSONArray(table.getColumns()));
        obj.put("Footer", convertRowsToJSONArray(table.getFooter()));
        obj.put("Header", convertRowsToJSONArray(table.getHeader()));
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
    obj.put("Combined", title.getCombined());
    obj.put("Main", title.getMain());
    obj.put("Subtitle", title.getSubtitle());
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
    obj.put("Description", entry.getDescription());
    obj.put("Terms", convertToJSONArray(entry.getTerms()));
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

  private JSONArray mapToJSONArray(List<String> list) {
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
