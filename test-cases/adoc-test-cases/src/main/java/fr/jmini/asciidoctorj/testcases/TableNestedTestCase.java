package fr.jmini.asciidoctorj.testcases;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.asciidoctor.OptionsBuilder;
import org.asciidoctor.ast.Block;
import org.asciidoctor.ast.Cell;
import org.asciidoctor.ast.Column;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.Row;
import org.asciidoctor.ast.Table;

public class TableNestedTestCase implements AdocTestCase {

    public static final String ASCIIDOC = "" +
            "[cols=\"1,2a\"]\n" +
            "|===\n" +
            "| Col 1 | Col 2\n" +
            "\n" +
            "| Cell 1.1\n" +
            "| Cell 1.2\n" +
            "\n" +
            "| Cell 2.1\n" +
            "| Cell 2.2\n" +
            "\n" +
            "[cols=\"2,1\"]\n" +
            "!===\n" +
            "! Col1 ! Col2\n" +
            "\n" +
            "! C11\n" +
            "! C12\n" +
            "\n" +
            "!===\n" +
            "\n" +
            "|===";

    @Override
    public String getAdocInput() {
        return ASCIIDOC;
    }

    @Override
    public Map<String, Object> getInputOptions() {
        return OptionsBuilder.options()
                .asMap();
    }

    // tag::expected-html[]
    public static final String EXPECTED_HTML = "" +
            "<table class=\"tableblock frame-all grid-all spread\">\n" +
            "<colgroup>\n" +
            "<col style=\"width: 33.3333%;\" />\n" +
            "<col style=\"width: 66.6667%;\" />\n" +
            "</colgroup>\n" +
            "<thead>\n" +
            "<tr>\n" +
            "<th class=\"tableblock halign-left valign-top\">Col 1</th>\n" +
            "<th class=\"tableblock halign-left valign-top\">Col 2</th>\n" +
            "</tr>\n" +
            "</thead>\n" +
            "<tbody>\n" +
            "<tr>\n" +
            "<td class=\"tableblock halign-left valign-top\"><p class=\"tableblock\">Cell 1.1</p></td>\n" +
            "<td class=\"tableblock halign-left valign-top\">\n" +
            "<div>\n" +
            "<div class=\"paragraph\">\n" +
            "<p>Cell 1.2</p>\n" +
            "</div>\n" +
            "</div></td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td class=\"tableblock halign-left valign-top\"><p class=\"tableblock\">Cell 2.1</p></td>\n" +
            "<td class=\"tableblock halign-left valign-top\">\n" +
            "<div>\n" +
            "<div class=\"paragraph\">\n" +
            "<p>Cell 2.2</p>\n" +
            "</div>\n" +
            "<table class=\"tableblock frame-all grid-all spread\">\n" +
            "<colgroup>\n" +
            "<col style=\"width: 66.6666%;\" />\n" +
            "<col style=\"width: 33.3334%;\" />\n" +
            "</colgroup>\n" +
            "<thead>\n" +
            "<tr>\n" +
            "<th class=\"tableblock halign-left valign-top\">Col1</th>\n" +
            "<th class=\"tableblock halign-left valign-top\">Col2</th>\n" +
            "</tr>\n" +
            "</thead>\n" +
            "<tbody>\n" +
            "<tr>\n" +
            "<td class=\"tableblock halign-left valign-top\"><p class=\"tableblock\">C11</p></td>\n" +
            "<td class=\"tableblock halign-left valign-top\"><p class=\"tableblock\">C12</p></td>\n" +
            "</tr>\n" +
            "</tbody>\n" +
            "</table>\n" +
            "</div></td>\n" +
            "</tr>\n" +
            "</tbody>\n" +
            "</table>";
    // end::expected-html[]

    @Override
    public String getHtmlOutput() {
        return EXPECTED_HTML;
    }

    @Override
    // tag::assert-code[]
    public void checkAst(Document astDocument) {
        Document document1 = astDocument;
        assertThat(document1.getId()).isNull();
        assertThat(document1.getNodeName()).isEqualTo("document");
        assertThat(document1.getParent()).isNull();
        assertThat(document1.getContext()).isEqualTo("document");
        assertThat(document1.getDocument()).isSameAs(document1);
        assertThat(document1.isInline()).isFalse();
        assertThat(document1.isBlock()).isTrue();
        assertThat(document1.getAttributes()).containsEntry("doctype", "article")
                .containsEntry("example-caption", "Example")
                .containsEntry("figure-caption", "Figure")
                .containsEntry("filetype", "html")
                .containsEntry("notitle", "")
                .containsEntry("prewrap", "")
                .containsEntry("table-caption", "Table");
        assertThat(document1.getRoles()).isNullOrEmpty();
        assertThat(document1.isReftext()).isFalse();
        assertThat(document1.getReftext()).isNull();
        assertThat(document1.getCaption()).isNull();
        assertThat(document1.getTitle()).isNull();
        assertThat(document1.getStyle()).isNull();
        assertThat(document1.getLevel()).isEqualTo(0);
        assertThat(document1.getContentModel()).isEqualTo("compound");
        assertThat(document1.getSourceLocation()).isNull();
        assertThat(document1.getSubstitutions()).isNullOrEmpty();
        assertThat(document1.getBlocks()).hasSize(1);
        Table table1 = (Table) document1.getBlocks()
                .get(0);
        assertThat(table1.getId()).isNull();
        assertThat(table1.getNodeName()).isEqualTo("table");
        assertThat(table1.getParent()).isSameAs(document1);
        assertThat(table1.getContext()).isEqualTo("table");
        assertThat(table1.getDocument()).isSameAs(document1);
        assertThat(table1.isInline()).isFalse();
        assertThat(table1.isBlock()).isTrue();
        assertThat(table1.getAttributes()).containsEntry("colcount", 2L)
                .containsEntry("cols", "1,2a")
                .containsEntry("header-option", "")
                .containsEntry("options", "header")
                .containsEntry("rowcount", 3L)
                .containsEntry("style", "table")
                .containsEntry("tablepcwidth", 100L);
        assertThat(table1.getRoles()).isNullOrEmpty();
        assertThat(table1.isReftext()).isFalse();
        assertThat(table1.getReftext()).isNull();
        assertThat(table1.getCaption()).isNull();
        assertThat(table1.getTitle()).isNull();
        assertThat(table1.getStyle()).isEqualTo("table");
        assertThat(table1.getLevel()).isEqualTo(0);
        assertThat(table1.getContentModel()).isEqualTo("compound");
        assertThat(table1.getSourceLocation()).isNull();
        assertThat(table1.getSubstitutions()).isNullOrEmpty();
        assertThat(table1.getBlocks()).isNullOrEmpty();
        assertThat(table1.hasHeaderOption()).isTrue();
        assertThat(table1.getColumns()).hasSize(2);
        Column column1 = (Column) table1.getColumns()
                .get(0);
        assertThat(column1.getId()).isNull();
        assertThat(column1.getNodeName()).isEqualTo("column");
        assertThat(column1.getParent()).isSameAs(table1);
        assertThat(column1.getContext()).isEqualTo("column");
        assertThat(column1.getDocument()).isSameAs(document1);
        assertThatThrownBy(() -> {
            column1.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            column1.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(column1.getAttributes()).containsEntry("colnumber", 1L)
                .containsEntry("colpcwidth", 33.3333)
                .containsEntry("halign", "left")
                .containsEntry("valign", "top")
                .containsEntry("width", 1L);
        assertThat(column1.getRoles()).isNullOrEmpty();
        assertThat(column1.isReftext()).isFalse();
        assertThat(column1.getReftext()).isNull();
        assertThat(column1.getStyle()).isNull();
        assertThat(column1.getTable()).isSameAs(table1);
        assertThat(column1.getColumnNumber()).isEqualTo(1);
        assertThat(column1.getWidth()).isEqualTo(1);
        assertThat(column1.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(column1.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
        Column column2 = (Column) table1.getColumns()
                .get(1);
        assertThat(column2.getId()).isNull();
        assertThat(column2.getNodeName()).isEqualTo("column");
        assertThat(column2.getParent()).isSameAs(table1);
        assertThat(column2.getContext()).isEqualTo("column");
        assertThat(column2.getDocument()).isSameAs(document1);
        assertThatThrownBy(() -> {
            column2.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            column2.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(column2.getAttributes()).containsEntry("colnumber", 2L)
                .containsEntry("colpcwidth", 66.6667)
                .containsEntry("halign", "left")
                .containsEntry("valign", "top")
                .containsEntry("width", 2L);
        assertThat(column2.getRoles()).isNullOrEmpty();
        assertThat(column2.isReftext()).isFalse();
        assertThat(column2.getReftext()).isNull();
        assertThat(column2.getStyle()).isEqualTo("asciidoc");
        assertThat(column2.getTable()).isSameAs(table1);
        assertThat(column2.getColumnNumber()).isEqualTo(2);
        assertThat(column2.getWidth()).isEqualTo(2);
        assertThat(column2.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(column2.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
        assertThat(table1.getHeader()).hasSize(1);
        Row row1 = (Row) table1.getHeader()
                .get(0);
        assertThat(row1.getCells()).hasSize(2);
        Cell cell1 = (Cell) row1.getCells()
                .get(0);
        assertThat(cell1.getId()).isNull();
        assertThat(cell1.getNodeName()).isEqualTo("cell");
        assertThat(cell1.getParent()).isSameAs(column1);
        assertThat(cell1.getContext()).isEqualTo("cell");
        assertThat(cell1.getDocument()).isSameAs(document1);
        assertThatThrownBy(() -> {
            cell1.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            cell1.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(cell1.getAttributes()).containsEntry("colnumber", 1L)
                .containsEntry("colpcwidth", 33.3333)
                .containsEntry("halign", "left")
                .containsEntry("valign", "top")
                .containsEntry("width", 1L);
        assertThat(cell1.getRoles()).isNullOrEmpty();
        assertThat(cell1.isReftext()).isFalse();
        assertThat(cell1.getReftext()).isNull();
        assertThat(cell1.getColumn()).isSameAs(column1);
        assertThat(cell1.getColspan()).isEqualTo(0);
        assertThat(cell1.getRowspan()).isEqualTo(0);
        assertThat(cell1.getText()).isEqualTo("Col 1");
        assertThat(cell1.getSource()).isEqualTo("Col 1");
        assertThat(cell1.getStyle()).isNull();
        assertThat(cell1.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(cell1.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
        assertThat(cell1.getInnerDocument()).isNull();
        Cell cell2 = (Cell) row1.getCells()
                .get(1);
        assertThat(cell2.getId()).isNull();
        assertThat(cell2.getNodeName()).isEqualTo("cell");
        assertThat(cell2.getParent()).isSameAs(column2);
        assertThat(cell2.getContext()).isEqualTo("cell");
        assertThat(cell2.getDocument()).isSameAs(document1);
        assertThatThrownBy(() -> {
            cell2.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            cell2.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(cell2.getAttributes()).containsEntry("colnumber", 2L)
                .containsEntry("colpcwidth", 66.6667)
                .containsEntry("halign", "left")
                .containsEntry("valign", "top")
                .containsEntry("width", 2L);
        assertThat(cell2.getRoles()).isNullOrEmpty();
        assertThat(cell2.isReftext()).isFalse();
        assertThat(cell2.getReftext()).isNull();
        assertThat(cell2.getColumn()).isSameAs(column2);
        assertThat(cell2.getColspan()).isEqualTo(0);
        assertThat(cell2.getRowspan()).isEqualTo(0);
        assertThat(cell2.getText()).isEqualTo("Col 2");
        assertThat(cell2.getSource()).isEqualTo("Col 2");
        assertThat(cell2.getStyle()).isNull();
        assertThat(cell2.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(cell2.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
        Document document2 = cell2.getInnerDocument();
        assertThat(document2.getId()).isNull();
        assertThat(document2.getNodeName()).isEqualTo("document");
        assertThat(document2.getParent()).isNull();
        assertThat(document2.getContext()).isEqualTo("document");
        assertThat(document2.getDocument()).isSameAs(document2);
        assertThat(document2.isInline()).isFalse();
        assertThat(document2.isBlock()).isTrue();
        assertThat(document2.getAttributes()).containsEntry("doctype", "article")
                .containsEntry("example-caption", "Example")
                .containsEntry("figure-caption", "Figure")
                .containsEntry("filetype", "html")
                .containsEntry("notitle", "")
                .containsEntry("prewrap", "")
                .containsEntry("table-caption", "Table");
        assertThat(document2.getRoles()).isNullOrEmpty();
        assertThat(document2.isReftext()).isFalse();
        assertThat(document2.getReftext()).isNull();
        assertThat(document2.getCaption()).isNull();
        assertThat(document2.getTitle()).isNull();
        assertThat(document2.getStyle()).isNull();
        assertThat(document2.getLevel()).isEqualTo(0);
        assertThat(document2.getContentModel()).isEqualTo("compound");
        assertThat(document2.getSourceLocation()).isNull();
        assertThat(document2.getSubstitutions()).isNullOrEmpty();
        assertThat(document2.getBlocks()).hasSize(1);
        Block block1 = (Block) document2.getBlocks()
                .get(0);
        assertThat(block1.getId()).isNull();
        assertThat(block1.getNodeName()).isEqualTo("paragraph");
        assertThat(block1.getParent()).isSameAs(document2);
        assertThat(block1.getContext()).isEqualTo("paragraph");
        assertThat(block1.getDocument()).isSameAs(document2);
        assertThat(block1.isInline()).isFalse();
        assertThat(block1.isBlock()).isTrue();
        assertThat(block1.getAttributes()).isNullOrEmpty();
        assertThat(block1.getRoles()).isNullOrEmpty();
        assertThat(block1.isReftext()).isFalse();
        assertThat(block1.getReftext()).isNull();
        assertThat(block1.getCaption()).isNull();
        assertThat(block1.getTitle()).isNull();
        assertThat(block1.getStyle()).isNull();
        assertThat(block1.getLevel()).isEqualTo(0);
        assertThat(block1.getContentModel()).isEqualTo("simple");
        assertThat(block1.getSourceLocation()).isNull();
        assertThat(block1.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(block1.getBlocks()).isNullOrEmpty();
        assertThat(block1.getLines()).containsExactly("Col 2");
        assertThat(block1.getSource()).isEqualTo("Col 2");
        assertThat(document2.getStructuredDoctitle()).isNull();
        assertThat(document2.getDoctitle()).isNull();
        assertThat(document2.getOptions()).containsEntry("header_footer", false);
        assertThat(table1.getFooter()).isNullOrEmpty();
        assertThat(table1.getBody()).hasSize(2);
        Row row2 = (Row) table1.getBody()
                .get(0);
        assertThat(row2.getCells()).hasSize(2);
        Cell cell3 = (Cell) row2.getCells()
                .get(0);
        assertThat(cell3.getId()).isNull();
        assertThat(cell3.getNodeName()).isEqualTo("cell");
        assertThat(cell3.getParent()).isSameAs(column1);
        assertThat(cell3.getContext()).isEqualTo("cell");
        assertThat(cell3.getDocument()).isSameAs(document1);
        assertThatThrownBy(() -> {
            cell3.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            cell3.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(cell3.getAttributes()).containsEntry("colnumber", 1L)
                .containsEntry("colpcwidth", 33.3333)
                .containsEntry("halign", "left")
                .containsEntry("valign", "top")
                .containsEntry("width", 1L);
        assertThat(cell3.getRoles()).isNullOrEmpty();
        assertThat(cell3.isReftext()).isFalse();
        assertThat(cell3.getReftext()).isNull();
        assertThat(cell3.getColumn()).isSameAs(column1);
        assertThat(cell3.getColspan()).isEqualTo(0);
        assertThat(cell3.getRowspan()).isEqualTo(0);
        assertThat(cell3.getText()).isEqualTo("Cell 1.1");
        assertThat(cell3.getSource()).isEqualTo("Cell 1.1");
        assertThat(cell3.getStyle()).isNull();
        assertThat(cell3.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(cell3.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
        assertThat(cell3.getInnerDocument()).isNull();
        Cell cell4 = (Cell) row2.getCells()
                .get(1);
        assertThat(cell4.getId()).isNull();
        assertThat(cell4.getNodeName()).isEqualTo("cell");
        assertThat(cell4.getParent()).isSameAs(column2);
        assertThat(cell4.getContext()).isEqualTo("cell");
        assertThat(cell4.getDocument()).isSameAs(document1);
        assertThatThrownBy(() -> {
            cell4.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            cell4.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(cell4.getAttributes()).containsEntry("colnumber", 2L)
                .containsEntry("colpcwidth", 66.6667)
                .containsEntry("halign", "left")
                .containsEntry("valign", "top")
                .containsEntry("width", 2L);
        assertThat(cell4.getRoles()).isNullOrEmpty();
        assertThat(cell4.isReftext()).isFalse();
        assertThat(cell4.getReftext()).isNull();
        assertThat(cell4.getColumn()).isSameAs(column2);
        assertThat(cell4.getColspan()).isEqualTo(0);
        assertThat(cell4.getRowspan()).isEqualTo(0);
        assertThat(cell4.getText()).isEqualTo("Cell 1.2");
        assertThat(cell4.getSource()).isEqualTo("Cell 1.2");
        assertThat(cell4.getStyle()).isEqualTo("asciidoc");
        assertThat(cell4.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(cell4.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
        Document document3 = cell4.getInnerDocument();
        assertThat(document3.getId()).isNull();
        assertThat(document3.getNodeName()).isEqualTo("document");
        assertThat(document3.getParent()).isNull();
        assertThat(document3.getContext()).isEqualTo("document");
        assertThat(document3.getDocument()).isSameAs(document3);
        assertThat(document3.isInline()).isFalse();
        assertThat(document3.isBlock()).isTrue();
        assertThat(document3.getAttributes()).containsEntry("doctype", "article")
                .containsEntry("example-caption", "Example")
                .containsEntry("figure-caption", "Figure")
                .containsEntry("filetype", "html")
                .containsEntry("notitle", "")
                .containsEntry("prewrap", "")
                .containsEntry("table-caption", "Table");
        assertThat(document3.getRoles()).isNullOrEmpty();
        assertThat(document3.isReftext()).isFalse();
        assertThat(document3.getReftext()).isNull();
        assertThat(document3.getCaption()).isNull();
        assertThat(document3.getTitle()).isNull();
        assertThat(document3.getStyle()).isNull();
        assertThat(document3.getLevel()).isEqualTo(0);
        assertThat(document3.getContentModel()).isEqualTo("compound");
        assertThat(document3.getSourceLocation()).isNull();
        assertThat(document3.getSubstitutions()).isNullOrEmpty();
        assertThat(document3.getBlocks()).hasSize(1);
        Block block2 = (Block) document3.getBlocks()
                .get(0);
        assertThat(block2.getId()).isNull();
        assertThat(block2.getNodeName()).isEqualTo("paragraph");
        assertThat(block2.getParent()).isSameAs(document3);
        assertThat(block2.getContext()).isEqualTo("paragraph");
        assertThat(block2.getDocument()).isSameAs(document3);
        assertThat(block2.isInline()).isFalse();
        assertThat(block2.isBlock()).isTrue();
        assertThat(block2.getAttributes()).isNullOrEmpty();
        assertThat(block2.getRoles()).isNullOrEmpty();
        assertThat(block2.isReftext()).isFalse();
        assertThat(block2.getReftext()).isNull();
        assertThat(block2.getCaption()).isNull();
        assertThat(block2.getTitle()).isNull();
        assertThat(block2.getStyle()).isNull();
        assertThat(block2.getLevel()).isEqualTo(0);
        assertThat(block2.getContentModel()).isEqualTo("simple");
        assertThat(block2.getSourceLocation()).isNull();
        assertThat(block2.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(block2.getBlocks()).isNullOrEmpty();
        assertThat(block2.getLines()).containsExactly("Cell 1.2");
        assertThat(block2.getSource()).isEqualTo("Cell 1.2");
        assertThat(document3.getStructuredDoctitle()).isNull();
        assertThat(document3.getDoctitle()).isNull();
        assertThat(document3.getOptions()).containsEntry("header_footer", false);
        Row row3 = (Row) table1.getBody()
                .get(1);
        assertThat(row3.getCells()).hasSize(2);
        Cell cell5 = (Cell) row3.getCells()
                .get(0);
        assertThat(cell5.getId()).isNull();
        assertThat(cell5.getNodeName()).isEqualTo("cell");
        assertThat(cell5.getParent()).isSameAs(column1);
        assertThat(cell5.getContext()).isEqualTo("cell");
        assertThat(cell5.getDocument()).isSameAs(document1);
        assertThatThrownBy(() -> {
            cell5.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            cell5.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(cell5.getAttributes()).containsEntry("colnumber", 1L)
                .containsEntry("colpcwidth", 33.3333)
                .containsEntry("halign", "left")
                .containsEntry("valign", "top")
                .containsEntry("width", 1L);
        assertThat(cell5.getRoles()).isNullOrEmpty();
        assertThat(cell5.isReftext()).isFalse();
        assertThat(cell5.getReftext()).isNull();
        assertThat(cell5.getColumn()).isSameAs(column1);
        assertThat(cell5.getColspan()).isEqualTo(0);
        assertThat(cell5.getRowspan()).isEqualTo(0);
        assertThat(cell5.getText()).isEqualTo("Cell 2.1");
        assertThat(cell5.getSource()).isEqualTo("Cell 2.1");
        assertThat(cell5.getStyle()).isNull();
        assertThat(cell5.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(cell5.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
        assertThat(cell5.getInnerDocument()).isNull();
        Cell cell6 = (Cell) row3.getCells()
                .get(1);
        assertThat(cell6.getId()).isNull();
        assertThat(cell6.getNodeName()).isEqualTo("cell");
        assertThat(cell6.getParent()).isSameAs(column2);
        assertThat(cell6.getContext()).isEqualTo("cell");
        assertThat(cell6.getDocument()).isSameAs(document1);
        assertThatThrownBy(() -> {
            cell6.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            cell6.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(cell6.getAttributes()).containsEntry("colnumber", 2L)
                .containsEntry("colpcwidth", 66.6667)
                .containsEntry("halign", "left")
                .containsEntry("valign", "top")
                .containsEntry("width", 2L);
        assertThat(cell6.getRoles()).isNullOrEmpty();
        assertThat(cell6.isReftext()).isFalse();
        assertThat(cell6.getReftext()).isNull();
        assertThat(cell6.getColumn()).isSameAs(column2);
        assertThat(cell6.getColspan()).isEqualTo(0);
        assertThat(cell6.getRowspan()).isEqualTo(0);
        assertThat(cell6.getText()).isEqualTo("Cell 2.2\n" +
                "\n" +
                "[cols=\"2,1\"]\n" +
                "!===\n" +
                "! Col1 ! Col2\n" +
                "\n" +
                "! C11\n" +
                "! C12\n" +
                "\n" +
                "!===");
        assertThat(cell6.getSource()).isEqualTo("Cell 2.2\n" +
                "\n" +
                "[cols=\"2,1\"]\n" +
                "!===\n" +
                "! Col1 ! Col2\n" +
                "\n" +
                "! C11\n" +
                "! C12\n" +
                "\n" +
                "!===");
        assertThat(cell6.getStyle()).isEqualTo("asciidoc");
        assertThat(cell6.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(cell6.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
        Document document4 = cell6.getInnerDocument();
        assertThat(document4.getId()).isNull();
        assertThat(document4.getNodeName()).isEqualTo("document");
        assertThat(document4.getParent()).isNull();
        assertThat(document4.getContext()).isEqualTo("document");
        assertThat(document4.getDocument()).isSameAs(document4);
        assertThat(document4.isInline()).isFalse();
        assertThat(document4.isBlock()).isTrue();
        assertThat(document4.getAttributes()).containsEntry("doctype", "article")
                .containsEntry("example-caption", "Example")
                .containsEntry("figure-caption", "Figure")
                .containsEntry("filetype", "html")
                .containsEntry("notitle", "")
                .containsEntry("prewrap", "")
                .containsEntry("table-caption", "Table");
        assertThat(document4.getRoles()).isNullOrEmpty();
        assertThat(document4.isReftext()).isFalse();
        assertThat(document4.getReftext()).isNull();
        assertThat(document4.getCaption()).isNull();
        assertThat(document4.getTitle()).isNull();
        assertThat(document4.getStyle()).isNull();
        assertThat(document4.getLevel()).isEqualTo(0);
        assertThat(document4.getContentModel()).isEqualTo("compound");
        assertThat(document4.getSourceLocation()).isNull();
        assertThat(document4.getSubstitutions()).isNullOrEmpty();
        assertThat(document4.getBlocks()).hasSize(2);
        Block block3 = (Block) document4.getBlocks()
                .get(0);
        assertThat(block3.getId()).isNull();
        assertThat(block3.getNodeName()).isEqualTo("paragraph");
        assertThat(block3.getParent()).isSameAs(document4);
        assertThat(block3.getContext()).isEqualTo("paragraph");
        assertThat(block3.getDocument()).isSameAs(document4);
        assertThat(block3.isInline()).isFalse();
        assertThat(block3.isBlock()).isTrue();
        assertThat(block3.getAttributes()).isNullOrEmpty();
        assertThat(block3.getRoles()).isNullOrEmpty();
        assertThat(block3.isReftext()).isFalse();
        assertThat(block3.getReftext()).isNull();
        assertThat(block3.getCaption()).isNull();
        assertThat(block3.getTitle()).isNull();
        assertThat(block3.getStyle()).isNull();
        assertThat(block3.getLevel()).isEqualTo(0);
        assertThat(block3.getContentModel()).isEqualTo("simple");
        assertThat(block3.getSourceLocation()).isNull();
        assertThat(block3.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(block3.getBlocks()).isNullOrEmpty();
        assertThat(block3.getLines()).containsExactly("Cell 2.2");
        assertThat(block3.getSource()).isEqualTo("Cell 2.2");
        Table table2 = (Table) document4.getBlocks()
                .get(1);
        assertThat(table2.getId()).isNull();
        assertThat(table2.getNodeName()).isEqualTo("table");
        assertThat(table2.getParent()).isSameAs(document4);
        assertThat(table2.getContext()).isEqualTo("table");
        assertThat(table2.getDocument()).isSameAs(document4);
        assertThat(table2.isInline()).isFalse();
        assertThat(table2.isBlock()).isTrue();
        assertThat(table2.getAttributes()).containsEntry("colcount", 2L)
                .containsEntry("cols", "2,1")
                .containsEntry("header-option", "")
                .containsEntry("options", "header")
                .containsEntry("rowcount", 2L)
                .containsEntry("style", "table")
                .containsEntry("tablepcwidth", 100L);
        assertThat(table2.getRoles()).isNullOrEmpty();
        assertThat(table2.isReftext()).isFalse();
        assertThat(table2.getReftext()).isNull();
        assertThat(table2.getCaption()).isNull();
        assertThat(table2.getTitle()).isNull();
        assertThat(table2.getStyle()).isEqualTo("table");
        assertThat(table2.getLevel()).isEqualTo(0);
        assertThat(table2.getContentModel()).isEqualTo("compound");
        assertThat(table2.getSourceLocation()).isNull();
        assertThat(table2.getSubstitutions()).isNullOrEmpty();
        assertThat(table2.getBlocks()).isNullOrEmpty();
        assertThat(table2.hasHeaderOption()).isTrue();
        assertThat(table2.getColumns()).hasSize(2);
        Column column3 = (Column) table2.getColumns()
                .get(0);
        assertThat(column3.getId()).isNull();
        assertThat(column3.getNodeName()).isEqualTo("column");
        assertThat(column3.getParent()).isSameAs(table2);
        assertThat(column3.getContext()).isEqualTo("column");
        assertThat(column3.getDocument()).isSameAs(document4);
        assertThatThrownBy(() -> {
            column3.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            column3.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(column3.getAttributes()).containsEntry("colnumber", 1L)
                .containsEntry("colpcwidth", 66.6666)
                .containsEntry("halign", "left")
                .containsEntry("valign", "top")
                .containsEntry("width", 2L);
        assertThat(column3.getRoles()).isNullOrEmpty();
        assertThat(column3.isReftext()).isFalse();
        assertThat(column3.getReftext()).isNull();
        assertThat(column3.getStyle()).isNull();
        assertThat(column3.getTable()).isSameAs(table2);
        assertThat(column3.getColumnNumber()).isEqualTo(1);
        assertThat(column3.getWidth()).isEqualTo(2);
        assertThat(column3.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(column3.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
        Column column4 = (Column) table2.getColumns()
                .get(1);
        assertThat(column4.getId()).isNull();
        assertThat(column4.getNodeName()).isEqualTo("column");
        assertThat(column4.getParent()).isSameAs(table2);
        assertThat(column4.getContext()).isEqualTo("column");
        assertThat(column4.getDocument()).isSameAs(document4);
        assertThatThrownBy(() -> {
            column4.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            column4.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(column4.getAttributes()).containsEntry("colnumber", 2L)
                .containsEntry("colpcwidth", 33.3334)
                .containsEntry("halign", "left")
                .containsEntry("valign", "top")
                .containsEntry("width", 1L);
        assertThat(column4.getRoles()).isNullOrEmpty();
        assertThat(column4.isReftext()).isFalse();
        assertThat(column4.getReftext()).isNull();
        assertThat(column4.getStyle()).isNull();
        assertThat(column4.getTable()).isSameAs(table2);
        assertThat(column4.getColumnNumber()).isEqualTo(2);
        assertThat(column4.getWidth()).isEqualTo(1);
        assertThat(column4.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(column4.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
        assertThat(table2.getHeader()).hasSize(1);
        Row row4 = (Row) table2.getHeader()
                .get(0);
        assertThat(row4.getCells()).hasSize(2);
        Cell cell7 = (Cell) row4.getCells()
                .get(0);
        assertThat(cell7.getId()).isNull();
        assertThat(cell7.getNodeName()).isEqualTo("cell");
        assertThat(cell7.getParent()).isSameAs(column3);
        assertThat(cell7.getContext()).isEqualTo("cell");
        assertThat(cell7.getDocument()).isSameAs(document4);
        assertThatThrownBy(() -> {
            cell7.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            cell7.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(cell7.getAttributes()).containsEntry("colnumber", 1L)
                .containsEntry("colpcwidth", 66.6666)
                .containsEntry("halign", "left")
                .containsEntry("valign", "top")
                .containsEntry("width", 2L);
        assertThat(cell7.getRoles()).isNullOrEmpty();
        assertThat(cell7.isReftext()).isFalse();
        assertThat(cell7.getReftext()).isNull();
        assertThat(cell7.getColumn()).isSameAs(column3);
        assertThat(cell7.getColspan()).isEqualTo(0);
        assertThat(cell7.getRowspan()).isEqualTo(0);
        assertThat(cell7.getText()).isEqualTo("Col1");
        assertThat(cell7.getSource()).isEqualTo("Col1");
        assertThat(cell7.getStyle()).isNull();
        assertThat(cell7.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(cell7.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
        assertThat(cell7.getInnerDocument()).isNull();
        Cell cell8 = (Cell) row4.getCells()
                .get(1);
        assertThat(cell8.getId()).isNull();
        assertThat(cell8.getNodeName()).isEqualTo("cell");
        assertThat(cell8.getParent()).isSameAs(column4);
        assertThat(cell8.getContext()).isEqualTo("cell");
        assertThat(cell8.getDocument()).isSameAs(document4);
        assertThatThrownBy(() -> {
            cell8.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            cell8.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(cell8.getAttributes()).containsEntry("colnumber", 2L)
                .containsEntry("colpcwidth", 33.3334)
                .containsEntry("halign", "left")
                .containsEntry("valign", "top")
                .containsEntry("width", 1L);
        assertThat(cell8.getRoles()).isNullOrEmpty();
        assertThat(cell8.isReftext()).isFalse();
        assertThat(cell8.getReftext()).isNull();
        assertThat(cell8.getColumn()).isSameAs(column4);
        assertThat(cell8.getColspan()).isEqualTo(0);
        assertThat(cell8.getRowspan()).isEqualTo(0);
        assertThat(cell8.getText()).isEqualTo("Col2");
        assertThat(cell8.getSource()).isEqualTo("Col2");
        assertThat(cell8.getStyle()).isNull();
        assertThat(cell8.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(cell8.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
        assertThat(cell8.getInnerDocument()).isNull();
        assertThat(table2.getFooter()).isNullOrEmpty();
        assertThat(table2.getBody()).hasSize(1);
        Row row5 = (Row) table2.getBody()
                .get(0);
        assertThat(row5.getCells()).hasSize(2);
        Cell cell9 = (Cell) row5.getCells()
                .get(0);
        assertThat(cell9.getId()).isNull();
        assertThat(cell9.getNodeName()).isEqualTo("cell");
        assertThat(cell9.getParent()).isSameAs(column3);
        assertThat(cell9.getContext()).isEqualTo("cell");
        assertThat(cell9.getDocument()).isSameAs(document4);
        assertThatThrownBy(() -> {
            cell9.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            cell9.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(cell9.getAttributes()).containsEntry("colnumber", 1L)
                .containsEntry("colpcwidth", 66.6666)
                .containsEntry("halign", "left")
                .containsEntry("valign", "top")
                .containsEntry("width", 2L);
        assertThat(cell9.getRoles()).isNullOrEmpty();
        assertThat(cell9.isReftext()).isFalse();
        assertThat(cell9.getReftext()).isNull();
        assertThat(cell9.getColumn()).isSameAs(column3);
        assertThat(cell9.getColspan()).isEqualTo(0);
        assertThat(cell9.getRowspan()).isEqualTo(0);
        assertThat(cell9.getText()).isEqualTo("C11");
        assertThat(cell9.getSource()).isEqualTo("C11");
        assertThat(cell9.getStyle()).isNull();
        assertThat(cell9.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(cell9.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
        assertThat(cell9.getInnerDocument()).isNull();
        Cell cell10 = (Cell) row5.getCells()
                .get(1);
        assertThat(cell10.getId()).isNull();
        assertThat(cell10.getNodeName()).isEqualTo("cell");
        assertThat(cell10.getParent()).isSameAs(column4);
        assertThat(cell10.getContext()).isEqualTo("cell");
        assertThat(cell10.getDocument()).isSameAs(document4);
        assertThatThrownBy(() -> {
            cell10.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            cell10.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(cell10.getAttributes()).containsEntry("colnumber", 2L)
                .containsEntry("colpcwidth", 33.3334)
                .containsEntry("halign", "left")
                .containsEntry("valign", "top")
                .containsEntry("width", 1L);
        assertThat(cell10.getRoles()).isNullOrEmpty();
        assertThat(cell10.isReftext()).isFalse();
        assertThat(cell10.getReftext()).isNull();
        assertThat(cell10.getColumn()).isSameAs(column4);
        assertThat(cell10.getColspan()).isEqualTo(0);
        assertThat(cell10.getRowspan()).isEqualTo(0);
        assertThat(cell10.getText()).isEqualTo("C12");
        assertThat(cell10.getSource()).isEqualTo("C12");
        assertThat(cell10.getStyle()).isNull();
        assertThat(cell10.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(cell10.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
        assertThat(cell10.getInnerDocument()).isNull();
        assertThat(table2.getFrame()).isEqualTo("all");
        assertThat(table2.getGrid()).isEqualTo("all");
        assertThat(document4.getStructuredDoctitle()).isNull();
        assertThat(document4.getDoctitle()).isNull();
        assertThat(document4.getOptions()).containsEntry("header_footer", false);
        assertThat(table1.getFrame()).isEqualTo("all");
        assertThat(table1.getGrid()).isEqualTo("all");
        assertThat(document1.getStructuredDoctitle()).isNull();
        assertThat(document1.getDoctitle()).isNull();
        assertThat(document1.getOptions()).containsEntry("header_footer", false);
    }
    // end::assert-code[]

    @Override
    // tag::mock-code[]
    public Document createMock() {
        Document mockDocument1 = mock(Document.class);
        when(mockDocument1.getId()).thenReturn(null);
        when(mockDocument1.getNodeName()).thenReturn("document");
        when(mockDocument1.getParent()).thenReturn(null);
        when(mockDocument1.getContext()).thenReturn("document");
        when(mockDocument1.getDocument()).thenReturn(mockDocument1);
        when(mockDocument1.isInline()).thenReturn(false);
        when(mockDocument1.isBlock()).thenReturn(true);
        Map<String, Object> map1 = new HashMap<>();
        map1.put("doctype", "article");
        map1.put("example-caption", "Example");
        map1.put("figure-caption", "Figure");
        map1.put("filetype", "html");
        map1.put("notitle", "");
        map1.put("prewrap", "");
        map1.put("table-caption", "Table");
        when(mockDocument1.getAttributes()).thenReturn(map1);
        when(mockDocument1.getRoles()).thenReturn(Collections.emptyList());
        when(mockDocument1.isReftext()).thenReturn(false);
        when(mockDocument1.getReftext()).thenReturn(null);
        when(mockDocument1.getCaption()).thenReturn(null);
        when(mockDocument1.getTitle()).thenReturn(null);
        when(mockDocument1.getStyle()).thenReturn(null);
        when(mockDocument1.getLevel()).thenReturn(0);
        when(mockDocument1.getContentModel()).thenReturn("compound");
        when(mockDocument1.getSourceLocation()).thenReturn(null);
        when(mockDocument1.getSubstitutions()).thenReturn(Collections.emptyList());
        Table mockTable1 = mock(Table.class);
        when(mockTable1.getId()).thenReturn(null);
        when(mockTable1.getNodeName()).thenReturn("table");
        when(mockTable1.getParent()).thenReturn(mockDocument1);
        when(mockTable1.getContext()).thenReturn("table");
        when(mockTable1.getDocument()).thenReturn(mockDocument1);
        when(mockTable1.isInline()).thenReturn(false);
        when(mockTable1.isBlock()).thenReturn(true);
        Map<String, Object> map2 = new HashMap<>();
        map2.put("colcount", 2L);
        map2.put("cols", "1,2a");
        map2.put("header-option", "");
        map2.put("options", "header");
        map2.put("rowcount", 3L);
        map2.put("style", "table");
        map2.put("tablepcwidth", 100L);
        when(mockTable1.getAttributes()).thenReturn(map2);
        when(mockTable1.getRoles()).thenReturn(Collections.emptyList());
        when(mockTable1.isReftext()).thenReturn(false);
        when(mockTable1.getReftext()).thenReturn(null);
        when(mockTable1.getCaption()).thenReturn(null);
        when(mockTable1.getTitle()).thenReturn(null);
        when(mockTable1.getStyle()).thenReturn("table");
        when(mockTable1.getLevel()).thenReturn(0);
        when(mockTable1.getContentModel()).thenReturn("compound");
        when(mockTable1.getSourceLocation()).thenReturn(null);
        when(mockTable1.getSubstitutions()).thenReturn(Collections.emptyList());
        when(mockTable1.getBlocks()).thenReturn(Collections.emptyList());
        when(mockTable1.hasHeaderOption()).thenReturn(true);
        Column mockColumn1 = mock(Column.class);
        when(mockColumn1.getId()).thenReturn(null);
        when(mockColumn1.getNodeName()).thenReturn("column");
        when(mockColumn1.getParent()).thenReturn(mockTable1);
        when(mockColumn1.getContext()).thenReturn("column");
        when(mockColumn1.getDocument()).thenReturn(mockDocument1);
        when(mockColumn1.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockColumn1.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map3 = new HashMap<>();
        map3.put("colnumber", 1L);
        map3.put("colpcwidth", 33.3333);
        map3.put("halign", "left");
        map3.put("valign", "top");
        map3.put("width", 1L);
        when(mockColumn1.getAttributes()).thenReturn(map3);
        when(mockColumn1.getRoles()).thenReturn(Collections.emptyList());
        when(mockColumn1.isReftext()).thenReturn(false);
        when(mockColumn1.getReftext()).thenReturn(null);
        when(mockColumn1.getStyle()).thenReturn(null);
        when(mockColumn1.getTable()).thenReturn(mockTable1);
        when(mockColumn1.getColumnNumber()).thenReturn(1);
        when(mockColumn1.getWidth()).thenReturn(1);
        when(mockColumn1.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockColumn1.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        Column mockColumn2 = mock(Column.class);
        when(mockColumn2.getId()).thenReturn(null);
        when(mockColumn2.getNodeName()).thenReturn("column");
        when(mockColumn2.getParent()).thenReturn(mockTable1);
        when(mockColumn2.getContext()).thenReturn("column");
        when(mockColumn2.getDocument()).thenReturn(mockDocument1);
        when(mockColumn2.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockColumn2.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map4 = new HashMap<>();
        map4.put("colnumber", 2L);
        map4.put("colpcwidth", 66.6667);
        map4.put("halign", "left");
        map4.put("style", "asciidoc");
        map4.put("valign", "top");
        map4.put("width", 2L);
        when(mockColumn2.getAttributes()).thenReturn(map4);
        when(mockColumn2.getRoles()).thenReturn(Collections.emptyList());
        when(mockColumn2.isReftext()).thenReturn(false);
        when(mockColumn2.getReftext()).thenReturn(null);
        when(mockColumn2.getStyle()).thenReturn("asciidoc");
        when(mockColumn2.getTable()).thenReturn(mockTable1);
        when(mockColumn2.getColumnNumber()).thenReturn(2);
        when(mockColumn2.getWidth()).thenReturn(2);
        when(mockColumn2.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockColumn2.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        when(mockTable1.getColumns()).thenReturn(Arrays.asList(mockColumn1, mockColumn2));
        Row mockRow1 = mock(Row.class);
        Cell mockCell1 = mock(Cell.class);
        when(mockCell1.getId()).thenReturn(null);
        when(mockCell1.getNodeName()).thenReturn("cell");
        when(mockCell1.getParent()).thenReturn(mockColumn1);
        when(mockCell1.getContext()).thenReturn("cell");
        when(mockCell1.getDocument()).thenReturn(mockDocument1);
        when(mockCell1.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockCell1.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map5 = new HashMap<>();
        map5.put("colnumber", 1L);
        map5.put("colpcwidth", 33.3333);
        map5.put("halign", "left");
        map5.put("valign", "top");
        map5.put("width", 1L);
        when(mockCell1.getAttributes()).thenReturn(map5);
        when(mockCell1.getRoles()).thenReturn(Collections.emptyList());
        when(mockCell1.isReftext()).thenReturn(false);
        when(mockCell1.getReftext()).thenReturn(null);
        when(mockCell1.getColumn()).thenReturn(mockColumn1);
        when(mockCell1.getColspan()).thenReturn(0);
        when(mockCell1.getRowspan()).thenReturn(0);
        when(mockCell1.getText()).thenReturn("Col 1");
        when(mockCell1.getSource()).thenReturn("Col 1");
        when(mockCell1.getStyle()).thenReturn(null);
        when(mockCell1.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockCell1.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        when(mockCell1.getInnerDocument()).thenReturn(null);
        Cell mockCell2 = mock(Cell.class);
        when(mockCell2.getId()).thenReturn(null);
        when(mockCell2.getNodeName()).thenReturn("cell");
        when(mockCell2.getParent()).thenReturn(mockColumn2);
        when(mockCell2.getContext()).thenReturn("cell");
        when(mockCell2.getDocument()).thenReturn(mockDocument1);
        when(mockCell2.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockCell2.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map6 = new HashMap<>();
        map6.put("colnumber", 2L);
        map6.put("colpcwidth", 66.6667);
        map6.put("halign", "left");
        map6.put("style", "asciidoc");
        map6.put("valign", "top");
        map6.put("width", 2L);
        when(mockCell2.getAttributes()).thenReturn(map6);
        when(mockCell2.getRoles()).thenReturn(Collections.emptyList());
        when(mockCell2.isReftext()).thenReturn(false);
        when(mockCell2.getReftext()).thenReturn(null);
        when(mockCell2.getColumn()).thenReturn(mockColumn2);
        when(mockCell2.getColspan()).thenReturn(0);
        when(mockCell2.getRowspan()).thenReturn(0);
        when(mockCell2.getText()).thenReturn("Col 2");
        when(mockCell2.getSource()).thenReturn("Col 2");
        when(mockCell2.getStyle()).thenReturn(null);
        when(mockCell2.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockCell2.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        Document mockDocument2 = mock(Document.class);
        when(mockDocument2.getId()).thenReturn(null);
        when(mockDocument2.getNodeName()).thenReturn("document");
        when(mockDocument2.getParent()).thenReturn(null);
        when(mockDocument2.getContext()).thenReturn("document");
        when(mockDocument2.getDocument()).thenReturn(mockDocument2);
        when(mockDocument2.isInline()).thenReturn(false);
        when(mockDocument2.isBlock()).thenReturn(true);
        Map<String, Object> map7 = new HashMap<>();
        map7.put("doctype", "article");
        map7.put("example-caption", "Example");
        map7.put("figure-caption", "Figure");
        map7.put("filetype", "html");
        map7.put("notitle", "");
        map7.put("prewrap", "");
        map7.put("table-caption", "Table");
        when(mockDocument2.getAttributes()).thenReturn(map7);
        when(mockDocument2.getRoles()).thenReturn(Collections.emptyList());
        when(mockDocument2.isReftext()).thenReturn(false);
        when(mockDocument2.getReftext()).thenReturn(null);
        when(mockDocument2.getCaption()).thenReturn(null);
        when(mockDocument2.getTitle()).thenReturn(null);
        when(mockDocument2.getStyle()).thenReturn(null);
        when(mockDocument2.getLevel()).thenReturn(0);
        when(mockDocument2.getContentModel()).thenReturn("compound");
        when(mockDocument2.getSourceLocation()).thenReturn(null);
        when(mockDocument2.getSubstitutions()).thenReturn(Collections.emptyList());
        Block mockBlock1 = mock(Block.class);
        when(mockBlock1.getId()).thenReturn(null);
        when(mockBlock1.getNodeName()).thenReturn("paragraph");
        when(mockBlock1.getParent()).thenReturn(mockDocument2);
        when(mockBlock1.getContext()).thenReturn("paragraph");
        when(mockBlock1.getDocument()).thenReturn(mockDocument2);
        when(mockBlock1.isInline()).thenReturn(false);
        when(mockBlock1.isBlock()).thenReturn(true);
        when(mockBlock1.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockBlock1.getRoles()).thenReturn(Collections.emptyList());
        when(mockBlock1.isReftext()).thenReturn(false);
        when(mockBlock1.getReftext()).thenReturn(null);
        when(mockBlock1.getCaption()).thenReturn(null);
        when(mockBlock1.getTitle()).thenReturn(null);
        when(mockBlock1.getStyle()).thenReturn(null);
        when(mockBlock1.getLevel()).thenReturn(0);
        when(mockBlock1.getContentModel()).thenReturn("simple");
        when(mockBlock1.getSourceLocation()).thenReturn(null);
        when(mockBlock1.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockBlock1.getBlocks()).thenReturn(Collections.emptyList());
        when(mockBlock1.getLines()).thenReturn(Collections.singletonList("Col 2"));
        when(mockBlock1.getSource()).thenReturn("Col 2");
        when(mockDocument2.getBlocks()).thenReturn(Collections.singletonList(mockBlock1));
        when(mockDocument2.getStructuredDoctitle()).thenReturn(null);
        when(mockDocument2.getDoctitle()).thenReturn(null);
        Map<Object, Object> map8 = new HashMap<>();
        map8.put("cursor", "<stdin>: line 22");
        map8.put("header_footer", false);
        when(mockDocument2.getOptions()).thenReturn(map8);
        when(mockCell2.getInnerDocument()).thenReturn(mockDocument2);
        when(mockRow1.getCells()).thenReturn(Arrays.asList(mockCell1, mockCell2));
        when(mockTable1.getHeader()).thenReturn(Collections.singletonList(mockRow1));
        when(mockTable1.getFooter()).thenReturn(Collections.emptyList());
        Row mockRow2 = mock(Row.class);
        Cell mockCell3 = mock(Cell.class);
        when(mockCell3.getId()).thenReturn(null);
        when(mockCell3.getNodeName()).thenReturn("cell");
        when(mockCell3.getParent()).thenReturn(mockColumn1);
        when(mockCell3.getContext()).thenReturn("cell");
        when(mockCell3.getDocument()).thenReturn(mockDocument1);
        when(mockCell3.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockCell3.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map9 = new HashMap<>();
        map9.put("colnumber", 1L);
        map9.put("colpcwidth", 33.3333);
        map9.put("halign", "left");
        map9.put("valign", "top");
        map9.put("width", 1L);
        when(mockCell3.getAttributes()).thenReturn(map9);
        when(mockCell3.getRoles()).thenReturn(Collections.emptyList());
        when(mockCell3.isReftext()).thenReturn(false);
        when(mockCell3.getReftext()).thenReturn(null);
        when(mockCell3.getColumn()).thenReturn(mockColumn1);
        when(mockCell3.getColspan()).thenReturn(0);
        when(mockCell3.getRowspan()).thenReturn(0);
        when(mockCell3.getText()).thenReturn("Cell 1.1");
        when(mockCell3.getSource()).thenReturn("Cell 1.1");
        when(mockCell3.getStyle()).thenReturn(null);
        when(mockCell3.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockCell3.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        when(mockCell3.getInnerDocument()).thenReturn(null);
        Cell mockCell4 = mock(Cell.class);
        when(mockCell4.getId()).thenReturn(null);
        when(mockCell4.getNodeName()).thenReturn("cell");
        when(mockCell4.getParent()).thenReturn(mockColumn2);
        when(mockCell4.getContext()).thenReturn("cell");
        when(mockCell4.getDocument()).thenReturn(mockDocument1);
        when(mockCell4.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockCell4.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map10 = new HashMap<>();
        map10.put("colnumber", 2L);
        map10.put("colpcwidth", 66.6667);
        map10.put("halign", "left");
        map10.put("style", "asciidoc");
        map10.put("valign", "top");
        map10.put("width", 2L);
        when(mockCell4.getAttributes()).thenReturn(map10);
        when(mockCell4.getRoles()).thenReturn(Collections.emptyList());
        when(mockCell4.isReftext()).thenReturn(false);
        when(mockCell4.getReftext()).thenReturn(null);
        when(mockCell4.getColumn()).thenReturn(mockColumn2);
        when(mockCell4.getColspan()).thenReturn(0);
        when(mockCell4.getRowspan()).thenReturn(0);
        when(mockCell4.getText()).thenReturn("Cell 1.2");
        when(mockCell4.getSource()).thenReturn("Cell 1.2");
        when(mockCell4.getStyle()).thenReturn("asciidoc");
        when(mockCell4.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockCell4.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        Document mockDocument3 = mock(Document.class);
        when(mockDocument3.getId()).thenReturn(null);
        when(mockDocument3.getNodeName()).thenReturn("document");
        when(mockDocument3.getParent()).thenReturn(null);
        when(mockDocument3.getContext()).thenReturn("document");
        when(mockDocument3.getDocument()).thenReturn(mockDocument3);
        when(mockDocument3.isInline()).thenReturn(false);
        when(mockDocument3.isBlock()).thenReturn(true);
        Map<String, Object> map11 = new HashMap<>();
        map11.put("doctype", "article");
        map11.put("example-caption", "Example");
        map11.put("figure-caption", "Figure");
        map11.put("filetype", "html");
        map11.put("notitle", "");
        map11.put("prewrap", "");
        map11.put("table-caption", "Table");
        when(mockDocument3.getAttributes()).thenReturn(map11);
        when(mockDocument3.getRoles()).thenReturn(Collections.emptyList());
        when(mockDocument3.isReftext()).thenReturn(false);
        when(mockDocument3.getReftext()).thenReturn(null);
        when(mockDocument3.getCaption()).thenReturn(null);
        when(mockDocument3.getTitle()).thenReturn(null);
        when(mockDocument3.getStyle()).thenReturn(null);
        when(mockDocument3.getLevel()).thenReturn(0);
        when(mockDocument3.getContentModel()).thenReturn("compound");
        when(mockDocument3.getSourceLocation()).thenReturn(null);
        when(mockDocument3.getSubstitutions()).thenReturn(Collections.emptyList());
        Block mockBlock2 = mock(Block.class);
        when(mockBlock2.getId()).thenReturn(null);
        when(mockBlock2.getNodeName()).thenReturn("paragraph");
        when(mockBlock2.getParent()).thenReturn(mockDocument3);
        when(mockBlock2.getContext()).thenReturn("paragraph");
        when(mockBlock2.getDocument()).thenReturn(mockDocument3);
        when(mockBlock2.isInline()).thenReturn(false);
        when(mockBlock2.isBlock()).thenReturn(true);
        when(mockBlock2.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockBlock2.getRoles()).thenReturn(Collections.emptyList());
        when(mockBlock2.isReftext()).thenReturn(false);
        when(mockBlock2.getReftext()).thenReturn(null);
        when(mockBlock2.getCaption()).thenReturn(null);
        when(mockBlock2.getTitle()).thenReturn(null);
        when(mockBlock2.getStyle()).thenReturn(null);
        when(mockBlock2.getLevel()).thenReturn(0);
        when(mockBlock2.getContentModel()).thenReturn("simple");
        when(mockBlock2.getSourceLocation()).thenReturn(null);
        when(mockBlock2.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockBlock2.getBlocks()).thenReturn(Collections.emptyList());
        when(mockBlock2.getLines()).thenReturn(Collections.singletonList("Cell 1.2"));
        when(mockBlock2.getSource()).thenReturn("Cell 1.2");
        when(mockDocument3.getBlocks()).thenReturn(Collections.singletonList(mockBlock2));
        when(mockDocument3.getStructuredDoctitle()).thenReturn(null);
        when(mockDocument3.getDoctitle()).thenReturn(null);
        Map<Object, Object> map12 = new HashMap<>();
        map12.put("cursor", "<stdin>: line 25");
        map12.put("header_footer", false);
        when(mockDocument3.getOptions()).thenReturn(map12);
        when(mockCell4.getInnerDocument()).thenReturn(mockDocument3);
        when(mockRow2.getCells()).thenReturn(Arrays.asList(mockCell3, mockCell4));
        Row mockRow3 = mock(Row.class);
        Cell mockCell5 = mock(Cell.class);
        when(mockCell5.getId()).thenReturn(null);
        when(mockCell5.getNodeName()).thenReturn("cell");
        when(mockCell5.getParent()).thenReturn(mockColumn1);
        when(mockCell5.getContext()).thenReturn("cell");
        when(mockCell5.getDocument()).thenReturn(mockDocument1);
        when(mockCell5.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockCell5.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map13 = new HashMap<>();
        map13.put("colnumber", 1L);
        map13.put("colpcwidth", 33.3333);
        map13.put("halign", "left");
        map13.put("valign", "top");
        map13.put("width", 1L);
        when(mockCell5.getAttributes()).thenReturn(map13);
        when(mockCell5.getRoles()).thenReturn(Collections.emptyList());
        when(mockCell5.isReftext()).thenReturn(false);
        when(mockCell5.getReftext()).thenReturn(null);
        when(mockCell5.getColumn()).thenReturn(mockColumn1);
        when(mockCell5.getColspan()).thenReturn(0);
        when(mockCell5.getRowspan()).thenReturn(0);
        when(mockCell5.getText()).thenReturn("Cell 2.1");
        when(mockCell5.getSource()).thenReturn("Cell 2.1");
        when(mockCell5.getStyle()).thenReturn(null);
        when(mockCell5.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockCell5.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        when(mockCell5.getInnerDocument()).thenReturn(null);
        Cell mockCell6 = mock(Cell.class);
        when(mockCell6.getId()).thenReturn(null);
        when(mockCell6.getNodeName()).thenReturn("cell");
        when(mockCell6.getParent()).thenReturn(mockColumn2);
        when(mockCell6.getContext()).thenReturn("cell");
        when(mockCell6.getDocument()).thenReturn(mockDocument1);
        when(mockCell6.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockCell6.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map14 = new HashMap<>();
        map14.put("colnumber", 2L);
        map14.put("colpcwidth", 66.6667);
        map14.put("halign", "left");
        map14.put("style", "asciidoc");
        map14.put("valign", "top");
        map14.put("width", 2L);
        when(mockCell6.getAttributes()).thenReturn(map14);
        when(mockCell6.getRoles()).thenReturn(Collections.emptyList());
        when(mockCell6.isReftext()).thenReturn(false);
        when(mockCell6.getReftext()).thenReturn(null);
        when(mockCell6.getColumn()).thenReturn(mockColumn2);
        when(mockCell6.getColspan()).thenReturn(0);
        when(mockCell6.getRowspan()).thenReturn(0);
        when(mockCell6.getText()).thenReturn("Cell 2.2\n" +
                "\n" +
                "[cols=\"2,1\"]\n" +
                "!===\n" +
                "! Col1 ! Col2\n" +
                "\n" +
                "! C11\n" +
                "! C12\n" +
                "\n" +
                "!===");
        when(mockCell6.getSource()).thenReturn("Cell 2.2\n" +
                "\n" +
                "[cols=\"2,1\"]\n" +
                "!===\n" +
                "! Col1 ! Col2\n" +
                "\n" +
                "! C11\n" +
                "! C12\n" +
                "\n" +
                "!===");
        when(mockCell6.getStyle()).thenReturn("asciidoc");
        when(mockCell6.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockCell6.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        Document mockDocument4 = mock(Document.class);
        when(mockDocument4.getId()).thenReturn(null);
        when(mockDocument4.getNodeName()).thenReturn("document");
        when(mockDocument4.getParent()).thenReturn(null);
        when(mockDocument4.getContext()).thenReturn("document");
        when(mockDocument4.getDocument()).thenReturn(mockDocument4);
        when(mockDocument4.isInline()).thenReturn(false);
        when(mockDocument4.isBlock()).thenReturn(true);
        Map<String, Object> map15 = new HashMap<>();
        map15.put("doctype", "article");
        map15.put("example-caption", "Example");
        map15.put("figure-caption", "Figure");
        map15.put("filetype", "html");
        map15.put("notitle", "");
        map15.put("prewrap", "");
        map15.put("table-caption", "Table");
        when(mockDocument4.getAttributes()).thenReturn(map15);
        when(mockDocument4.getRoles()).thenReturn(Collections.emptyList());
        when(mockDocument4.isReftext()).thenReturn(false);
        when(mockDocument4.getReftext()).thenReturn(null);
        when(mockDocument4.getCaption()).thenReturn(null);
        when(mockDocument4.getTitle()).thenReturn(null);
        when(mockDocument4.getStyle()).thenReturn(null);
        when(mockDocument4.getLevel()).thenReturn(0);
        when(mockDocument4.getContentModel()).thenReturn("compound");
        when(mockDocument4.getSourceLocation()).thenReturn(null);
        when(mockDocument4.getSubstitutions()).thenReturn(Collections.emptyList());
        Block mockBlock3 = mock(Block.class);
        when(mockBlock3.getId()).thenReturn(null);
        when(mockBlock3.getNodeName()).thenReturn("paragraph");
        when(mockBlock3.getParent()).thenReturn(mockDocument4);
        when(mockBlock3.getContext()).thenReturn("paragraph");
        when(mockBlock3.getDocument()).thenReturn(mockDocument4);
        when(mockBlock3.isInline()).thenReturn(false);
        when(mockBlock3.isBlock()).thenReturn(true);
        when(mockBlock3.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockBlock3.getRoles()).thenReturn(Collections.emptyList());
        when(mockBlock3.isReftext()).thenReturn(false);
        when(mockBlock3.getReftext()).thenReturn(null);
        when(mockBlock3.getCaption()).thenReturn(null);
        when(mockBlock3.getTitle()).thenReturn(null);
        when(mockBlock3.getStyle()).thenReturn(null);
        when(mockBlock3.getLevel()).thenReturn(0);
        when(mockBlock3.getContentModel()).thenReturn("simple");
        when(mockBlock3.getSourceLocation()).thenReturn(null);
        when(mockBlock3.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockBlock3.getBlocks()).thenReturn(Collections.emptyList());
        when(mockBlock3.getLines()).thenReturn(Collections.singletonList("Cell 2.2"));
        when(mockBlock3.getSource()).thenReturn("Cell 2.2");
        Table mockTable2 = mock(Table.class);
        when(mockTable2.getId()).thenReturn(null);
        when(mockTable2.getNodeName()).thenReturn("table");
        when(mockTable2.getParent()).thenReturn(mockDocument4);
        when(mockTable2.getContext()).thenReturn("table");
        when(mockTable2.getDocument()).thenReturn(mockDocument4);
        when(mockTable2.isInline()).thenReturn(false);
        when(mockTable2.isBlock()).thenReturn(true);
        Map<String, Object> map16 = new HashMap<>();
        map16.put("colcount", 2L);
        map16.put("cols", "2,1");
        map16.put("header-option", "");
        map16.put("options", "header");
        map16.put("rowcount", 2L);
        map16.put("style", "table");
        map16.put("tablepcwidth", 100L);
        when(mockTable2.getAttributes()).thenReturn(map16);
        when(mockTable2.getRoles()).thenReturn(Collections.emptyList());
        when(mockTable2.isReftext()).thenReturn(false);
        when(mockTable2.getReftext()).thenReturn(null);
        when(mockTable2.getCaption()).thenReturn(null);
        when(mockTable2.getTitle()).thenReturn(null);
        when(mockTable2.getStyle()).thenReturn("table");
        when(mockTable2.getLevel()).thenReturn(0);
        when(mockTable2.getContentModel()).thenReturn("compound");
        when(mockTable2.getSourceLocation()).thenReturn(null);
        when(mockTable2.getSubstitutions()).thenReturn(Collections.emptyList());
        when(mockTable2.getBlocks()).thenReturn(Collections.emptyList());
        when(mockTable2.hasHeaderOption()).thenReturn(true);
        Column mockColumn3 = mock(Column.class);
        when(mockColumn3.getId()).thenReturn(null);
        when(mockColumn3.getNodeName()).thenReturn("column");
        when(mockColumn3.getParent()).thenReturn(mockTable2);
        when(mockColumn3.getContext()).thenReturn("column");
        when(mockColumn3.getDocument()).thenReturn(mockDocument4);
        when(mockColumn3.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockColumn3.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map17 = new HashMap<>();
        map17.put("colnumber", 1L);
        map17.put("colpcwidth", 66.6666);
        map17.put("halign", "left");
        map17.put("valign", "top");
        map17.put("width", 2L);
        when(mockColumn3.getAttributes()).thenReturn(map17);
        when(mockColumn3.getRoles()).thenReturn(Collections.emptyList());
        when(mockColumn3.isReftext()).thenReturn(false);
        when(mockColumn3.getReftext()).thenReturn(null);
        when(mockColumn3.getStyle()).thenReturn(null);
        when(mockColumn3.getTable()).thenReturn(mockTable2);
        when(mockColumn3.getColumnNumber()).thenReturn(1);
        when(mockColumn3.getWidth()).thenReturn(2);
        when(mockColumn3.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockColumn3.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        Column mockColumn4 = mock(Column.class);
        when(mockColumn4.getId()).thenReturn(null);
        when(mockColumn4.getNodeName()).thenReturn("column");
        when(mockColumn4.getParent()).thenReturn(mockTable2);
        when(mockColumn4.getContext()).thenReturn("column");
        when(mockColumn4.getDocument()).thenReturn(mockDocument4);
        when(mockColumn4.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockColumn4.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map18 = new HashMap<>();
        map18.put("colnumber", 2L);
        map18.put("colpcwidth", 33.3334);
        map18.put("halign", "left");
        map18.put("valign", "top");
        map18.put("width", 1L);
        when(mockColumn4.getAttributes()).thenReturn(map18);
        when(mockColumn4.getRoles()).thenReturn(Collections.emptyList());
        when(mockColumn4.isReftext()).thenReturn(false);
        when(mockColumn4.getReftext()).thenReturn(null);
        when(mockColumn4.getStyle()).thenReturn(null);
        when(mockColumn4.getTable()).thenReturn(mockTable2);
        when(mockColumn4.getColumnNumber()).thenReturn(2);
        when(mockColumn4.getWidth()).thenReturn(1);
        when(mockColumn4.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockColumn4.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        when(mockTable2.getColumns()).thenReturn(Arrays.asList(mockColumn3, mockColumn4));
        Row mockRow4 = mock(Row.class);
        Cell mockCell7 = mock(Cell.class);
        when(mockCell7.getId()).thenReturn(null);
        when(mockCell7.getNodeName()).thenReturn("cell");
        when(mockCell7.getParent()).thenReturn(mockColumn3);
        when(mockCell7.getContext()).thenReturn("cell");
        when(mockCell7.getDocument()).thenReturn(mockDocument4);
        when(mockCell7.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockCell7.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map19 = new HashMap<>();
        map19.put("colnumber", 1L);
        map19.put("colpcwidth", 66.6666);
        map19.put("halign", "left");
        map19.put("valign", "top");
        map19.put("width", 2L);
        when(mockCell7.getAttributes()).thenReturn(map19);
        when(mockCell7.getRoles()).thenReturn(Collections.emptyList());
        when(mockCell7.isReftext()).thenReturn(false);
        when(mockCell7.getReftext()).thenReturn(null);
        when(mockCell7.getColumn()).thenReturn(mockColumn3);
        when(mockCell7.getColspan()).thenReturn(0);
        when(mockCell7.getRowspan()).thenReturn(0);
        when(mockCell7.getText()).thenReturn("Col1");
        when(mockCell7.getSource()).thenReturn("Col1");
        when(mockCell7.getStyle()).thenReturn(null);
        when(mockCell7.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockCell7.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        when(mockCell7.getInnerDocument()).thenReturn(null);
        Cell mockCell8 = mock(Cell.class);
        when(mockCell8.getId()).thenReturn(null);
        when(mockCell8.getNodeName()).thenReturn("cell");
        when(mockCell8.getParent()).thenReturn(mockColumn4);
        when(mockCell8.getContext()).thenReturn("cell");
        when(mockCell8.getDocument()).thenReturn(mockDocument4);
        when(mockCell8.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockCell8.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map20 = new HashMap<>();
        map20.put("colnumber", 2L);
        map20.put("colpcwidth", 33.3334);
        map20.put("halign", "left");
        map20.put("valign", "top");
        map20.put("width", 1L);
        when(mockCell8.getAttributes()).thenReturn(map20);
        when(mockCell8.getRoles()).thenReturn(Collections.emptyList());
        when(mockCell8.isReftext()).thenReturn(false);
        when(mockCell8.getReftext()).thenReturn(null);
        when(mockCell8.getColumn()).thenReturn(mockColumn4);
        when(mockCell8.getColspan()).thenReturn(0);
        when(mockCell8.getRowspan()).thenReturn(0);
        when(mockCell8.getText()).thenReturn("Col2");
        when(mockCell8.getSource()).thenReturn("Col2");
        when(mockCell8.getStyle()).thenReturn(null);
        when(mockCell8.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockCell8.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        when(mockCell8.getInnerDocument()).thenReturn(null);
        when(mockRow4.getCells()).thenReturn(Arrays.asList(mockCell7, mockCell8));
        when(mockTable2.getHeader()).thenReturn(Collections.singletonList(mockRow4));
        when(mockTable2.getFooter()).thenReturn(Collections.emptyList());
        Row mockRow5 = mock(Row.class);
        Cell mockCell9 = mock(Cell.class);
        when(mockCell9.getId()).thenReturn(null);
        when(mockCell9.getNodeName()).thenReturn("cell");
        when(mockCell9.getParent()).thenReturn(mockColumn3);
        when(mockCell9.getContext()).thenReturn("cell");
        when(mockCell9.getDocument()).thenReturn(mockDocument4);
        when(mockCell9.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockCell9.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map21 = new HashMap<>();
        map21.put("colnumber", 1L);
        map21.put("colpcwidth", 66.6666);
        map21.put("halign", "left");
        map21.put("valign", "top");
        map21.put("width", 2L);
        when(mockCell9.getAttributes()).thenReturn(map21);
        when(mockCell9.getRoles()).thenReturn(Collections.emptyList());
        when(mockCell9.isReftext()).thenReturn(false);
        when(mockCell9.getReftext()).thenReturn(null);
        when(mockCell9.getColumn()).thenReturn(mockColumn3);
        when(mockCell9.getColspan()).thenReturn(0);
        when(mockCell9.getRowspan()).thenReturn(0);
        when(mockCell9.getText()).thenReturn("C11");
        when(mockCell9.getSource()).thenReturn("C11");
        when(mockCell9.getStyle()).thenReturn(null);
        when(mockCell9.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockCell9.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        when(mockCell9.getInnerDocument()).thenReturn(null);
        Cell mockCell10 = mock(Cell.class);
        when(mockCell10.getId()).thenReturn(null);
        when(mockCell10.getNodeName()).thenReturn("cell");
        when(mockCell10.getParent()).thenReturn(mockColumn4);
        when(mockCell10.getContext()).thenReturn("cell");
        when(mockCell10.getDocument()).thenReturn(mockDocument4);
        when(mockCell10.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockCell10.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map22 = new HashMap<>();
        map22.put("colnumber", 2L);
        map22.put("colpcwidth", 33.3334);
        map22.put("halign", "left");
        map22.put("valign", "top");
        map22.put("width", 1L);
        when(mockCell10.getAttributes()).thenReturn(map22);
        when(mockCell10.getRoles()).thenReturn(Collections.emptyList());
        when(mockCell10.isReftext()).thenReturn(false);
        when(mockCell10.getReftext()).thenReturn(null);
        when(mockCell10.getColumn()).thenReturn(mockColumn4);
        when(mockCell10.getColspan()).thenReturn(0);
        when(mockCell10.getRowspan()).thenReturn(0);
        when(mockCell10.getText()).thenReturn("C12");
        when(mockCell10.getSource()).thenReturn("C12");
        when(mockCell10.getStyle()).thenReturn(null);
        when(mockCell10.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockCell10.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        when(mockCell10.getInnerDocument()).thenReturn(null);
        when(mockRow5.getCells()).thenReturn(Arrays.asList(mockCell9, mockCell10));
        when(mockTable2.getBody()).thenReturn(Collections.singletonList(mockRow5));
        when(mockTable2.getFrame()).thenReturn("all");
        when(mockTable2.getGrid()).thenReturn("all");
        when(mockDocument4.getBlocks()).thenReturn(Arrays.asList(mockBlock3, mockTable2));
        when(mockDocument4.getStructuredDoctitle()).thenReturn(null);
        when(mockDocument4.getDoctitle()).thenReturn(null);
        Map<Object, Object> map23 = new HashMap<>();
        map23.put("cursor", "<stdin>: line 28");
        map23.put("header_footer", false);
        when(mockDocument4.getOptions()).thenReturn(map23);
        when(mockCell6.getInnerDocument()).thenReturn(mockDocument4);
        when(mockRow3.getCells()).thenReturn(Arrays.asList(mockCell5, mockCell6));
        when(mockTable1.getBody()).thenReturn(Arrays.asList(mockRow2, mockRow3));
        when(mockTable1.getFrame()).thenReturn("all");
        when(mockTable1.getGrid()).thenReturn("all");
        when(mockDocument1.getBlocks()).thenReturn(Collections.singletonList(mockTable1));
        when(mockDocument1.getStructuredDoctitle()).thenReturn(null);
        when(mockDocument1.getDoctitle()).thenReturn(null);
        Map<Object, Object> map24 = new HashMap<>();
        map24.put("attributes", "{}");
        map24.put("header_footer", false);
        when(mockDocument1.getOptions()).thenReturn(map24);
        return mockDocument1;
    }
    // end::mock-code[]
}