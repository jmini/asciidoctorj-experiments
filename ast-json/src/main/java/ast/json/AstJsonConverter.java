package ast.json;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonValue;
import javax.json.JsonWriter;
import javax.json.JsonWriterFactory;
import javax.json.stream.JsonGenerator;

import org.asciidoctor.ast.Block;
import org.asciidoctor.ast.Cell;
import org.asciidoctor.ast.Column;
import org.asciidoctor.ast.ContentNode;
import org.asciidoctor.ast.Cursor;
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

@ConverterFor("ast-json")
public class AstJsonConverter extends AbstractConverter<JsonObject> {

  private String LINE_SEPARATOR = "\n";

  public AstJsonConverter(String backend, Map<String, Object> opts) {
    super(backend, opts);
  }

  @Override
  public JsonObject convert(ContentNode node, String transform, Map<Object, Object> o) {
    return convertToJsonObject(node);
  }

  private JsonObject convertToJsonObject(ContentNode node) {
    if (node == null) {
      return null;
    }
    JsonObjectBuilder builder = Json.createObjectBuilder();
    //addToBuilder(builder, "javaClass", node.getClass().getSimpleName());
    addToBuilder(builder, "attributes", mapToJsonObject(node.getAttributes()));
    addToBuilder(builder, "context", node.getContext());
    addToBuilder(builder, "id", node.getId());
    addToBuilder(builder, "nodeName", node.getNodeName());
    addToBuilder(builder, "reftext", node.getReftext());
    addToBuilder(builder, "role", node.getRole());
    addToBuilder(builder, "roles", listToJsonArray(node.getRoles()));
    //node.getDocument() is not added to the JSON structure.
    //node.getParent() is not added to the JSON structure.

    if (node instanceof Cell) {
      Cell cell = (Cell) node;
      addToBuilder(builder, "colspan", cell.getColspan());
      //addToBuilder(builder, "content", cell.getContent());
      addToBuilder(builder, "horizontalAlignment", cell.getHorizontalAlignment().toString());
      addToBuilder(builder, "innerDocument", convertToJsonObject(cell.getInnerDocument()));
      addToBuilder(builder, "rowspan", cell.getRowspan());
      addToBuilder(builder, "style", cell.getStyle());
      addToBuilder(builder, "text", cell.getText());
      addToBuilder(builder, "verticalAlignment", cell.getVerticalAlignment().toString());
      //cell.getColumn() is not added to the JSON structure.
    }
    else if (node instanceof Column) {
      Column column = (Column) node;
      addToBuilder(builder, "columnNumber", column.getColumnNumber());
      addToBuilder(builder, "horizontalAlignment", column.getHorizontalAlignment().toString());
      addToBuilder(builder, "style", column.getStyle());
      addToBuilder(builder, "verticalAlignment", column.getVerticalAlignment().toString());
      addToBuilder(builder, "width", column.getWidth());
      //column.getTable() is not added to the JSON structure.
    }
    else if (node instanceof PhraseNode) {
      PhraseNode phraseNode = (PhraseNode) node;
      addToBuilder(builder, "type", phraseNode.getType());
      addToBuilder(builder, "text", phraseNode.getText());
      addToBuilder(builder, "target", phraseNode.getTarget());
    }
    else if (node instanceof StructuralNode) {
      StructuralNode structuralNode = (StructuralNode) node;
      addToBuilder(builder, "level", structuralNode.getLevel());
      addToBuilder(builder, "sourceLocation", convertCursorToJsonObject(structuralNode.getSourceLocation()));
      addToBuilder(builder, "style", structuralNode.getStyle());
      addToBuilder(builder, "title", structuralNode.getTitle());
      addToBuilder(builder, "blocks", convertToJsonArray(structuralNode.getBlocks()));
      //addToBuilder(builder, "content", structuralNode.getContent());

      if (structuralNode instanceof Block) {
        Block block = (Block) structuralNode;
        addToBuilder(builder, "lines", listToJsonArray(block.getLines()));
        addToBuilder(builder, "source", block.getSource());
      }
      else if (structuralNode instanceof DescriptionList) {
        DescriptionList descriptionList = (DescriptionList) structuralNode;
        addToBuilder(builder, "items", convertDescriptionListItemsToJsonArray(descriptionList));
      }
      else if (structuralNode instanceof Document) {
        Document document = (Document) structuralNode;
        addToBuilder(builder, "doctitle", document.getDoctitle());
        addToBuilder(builder, "options", mapToJsonObject(document.getOptions()));
        addToBuilder(builder, "structuredDoctitle", mapTitleToJsonObject(document.getStructuredDoctitle()));
      }
      else if (structuralNode instanceof org.asciidoctor.ast.List) {
        org.asciidoctor.ast.List list = (org.asciidoctor.ast.List) structuralNode;
        addToBuilder(builder, "items", convertToJsonArray(list.getItems()));
      }
      else if (structuralNode instanceof ListItem) {
        ListItem listItem = (ListItem) structuralNode;
        addToBuilder(builder, "marker", listItem.getMarker());
        addToBuilder(builder, "text", listItem.getText());
      }
      else if (structuralNode instanceof Section) {
        Section section = (Section) structuralNode;
        addToBuilder(builder, "index", section.getIndex());
        addToBuilder(builder, "number", section.getNumber());
        addToBuilder(builder, "sectionName", section.getSectionName());
        addToBuilder(builder, "special", section.isSpecial());
      }
      else if (structuralNode instanceof Table) {
        Table table = (Table) structuralNode;
        addToBuilder(builder, "frame", table.getFrame());
        addToBuilder(builder, "grid", table.getGrid());
        addToBuilder(builder, "body", convertRowsToJsonArray(table.getBody()));
        addToBuilder(builder, "columns", convertToJsonArray(table.getColumns()));
        addToBuilder(builder, "footer", convertRowsToJsonArray(table.getFooter()));
        addToBuilder(builder, "header", convertRowsToJsonArray(table.getHeader()));
      }
    }
    return builder.build();
  }

  @Override
  public void write(JsonObject output, OutputStream out) throws IOException {
    if (output != null) {
      Map<String, Boolean> config = Collections.singletonMap(JsonGenerator.PRETTY_PRINTING, Boolean.TRUE);
      JsonWriterFactory writerFactory = Json.createWriterFactory(config);
      JsonWriter jsonWriter = writerFactory.createWriter(out);

      jsonWriter.write(output);
      jsonWriter.close();
    }
  }

  private JsonObject mapTitleToJsonObject(Title title) {
    if (title == null) {
      return null;
    }
    JsonObjectBuilder builder = Json.createObjectBuilder();
    addToBuilder(builder, "combined", title.getCombined());
    addToBuilder(builder, "main", title.getMain());
    addToBuilder(builder, "subtitle", title.getSubtitle());
    return builder.build();
  }

  private JsonArray convertRowsToJsonArray(List<Row> rows) {
    JsonArrayBuilder builder = Json.createArrayBuilder();
    for (Row row : rows) {
      builder.add(convertToJsonArray(row.getCells()));
    }
    return builder.build();
  }

  private JsonArray convertDescriptionListItemsToJsonArray(DescriptionList descriptionList) {
    JsonArrayBuilder builder = Json.createArrayBuilder();
    for (DescriptionListEntry e : descriptionList.getItems()) {
      builder.add(convertDescriptionListEntryToJsonObject(e));
    }
    return builder.build();
  }

  private JsonObject convertDescriptionListEntryToJsonObject(DescriptionListEntry entry) {
    JsonObjectBuilder builder = Json.createObjectBuilder();
    addToBuilder(builder, "description", convertToJsonObject(entry.getDescription()));
    addToBuilder(builder, "terms", convertToJsonArray(entry.getTerms()));
    return builder.build();
  }

  private JsonObject convertCursorToJsonObject(Cursor cursor) {
    if (cursor == null) {
      return null;
    }
    JsonObjectBuilder builder = Json.createObjectBuilder();
    addToBuilder(builder, "lineNumber", cursor.getLineNumber());
    addToBuilder(builder, "path", cursor.getPath());
    addToBuilder(builder, "dir", cursor.getDir());
    addToBuilder(builder, "file", cursor.getFile());
    return builder.build();
  }

  private JsonArray convertToJsonArray(List<? extends ContentNode> list) {
    if (list != null && list.size() > 0) {
      JsonArrayBuilder builder = Json.createArrayBuilder();
      for (ContentNode node : list) {
        builder.add(convertToJsonObject(node));
      }
      return builder.build();
    }
    return null;
  }

  private JsonArray listToJsonArray(List<String> list) {
    return Json.createArrayBuilder(list).build();
  }

  private JsonObject mapToJsonObject(Map<? extends Object, Object> map) {
    JsonObjectBuilder builder = Json.createObjectBuilder();
    for (Entry<? extends Object, Object> entry : map.entrySet()) {
      if (entry.getValue() == null) {
        builder.addNull(entry.getKey().toString());
      }
      else {
        builder.add(entry.getKey().toString(), entry.getValue().toString());
      }
    }
    return builder.build();
  }

  private static void addToBuilder(JsonObjectBuilder builder, String key, JsonValue value) {
    if (value != null) {
      builder.add(key, value);
    }
  }

  private static void addToBuilder(JsonObjectBuilder builder, String key, String value) {
    if (value != null) {
      builder.add(key, value);
    }
  }

  private static void addToBuilder(JsonObjectBuilder builder, String key, boolean value) {
    builder.add(key, value);
  }

  private static void addToBuilder(JsonObjectBuilder builder, String key, int value) {
    builder.add(key, value);
  }
}
