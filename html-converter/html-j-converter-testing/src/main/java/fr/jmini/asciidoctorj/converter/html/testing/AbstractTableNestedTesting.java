package fr.jmini.asciidoctorj.converter.html.testing;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.asciidoctor.ast.Block;
import org.asciidoctor.ast.Cell;
import org.asciidoctor.ast.Column;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.Row;
import org.asciidoctor.ast.Table;
import org.junit.Test;

public abstract class AbstractTableNestedTesting {

    @Test
    public void test() throws Exception {
        String asciiDoc = createAsciiDocInput();
        Document astDocument = createAstDocument(asciiDoc);
        checkAst(astDocument);
        String html = convertToHtml(astDocument);
        assertThat(html).isEqualTo(EXPECTED_HTML);
    }

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

    // tag::expected-html[]
    public static final String EXPECTED_HTML = "<table class=\"tableblock frame-all grid-all spread\">\n" +
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

    public String createAsciiDocInput() {
        return ASCIIDOC;
    }

    protected abstract Document createAstDocument(String asciiDoc);

    protected abstract String convertToHtml(Document astDocument);

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
                .containsEntry("filetype", "html")
                .containsEntry("notitle", "")
                .containsEntry("prewrap", "")
                .containsEntry("table-caption", "Table");
        assertThat(document1.getRoles()).isNullOrEmpty();
        assertThat(document1.isReftext()).isFalse();
        assertThat(document1.getReftext()).isNull();
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
                .containsEntry("filetype", "html")
                .containsEntry("notitle", "")
                .containsEntry("prewrap", "")
                .containsEntry("table-caption", "Table");
        assertThat(document2.getRoles()).isNullOrEmpty();
        assertThat(document2.isReftext()).isFalse();
        assertThat(document2.getReftext()).isNull();
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
                .containsEntry("filetype", "html")
                .containsEntry("notitle", "")
                .containsEntry("prewrap", "")
                .containsEntry("table-caption", "Table");
        assertThat(document3.getRoles()).isNullOrEmpty();
        assertThat(document3.isReftext()).isFalse();
        assertThat(document3.getReftext()).isNull();
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
                .containsEntry("filetype", "html")
                .containsEntry("notitle", "")
                .containsEntry("prewrap", "")
                .containsEntry("table-caption", "Table");
        assertThat(document4.getRoles()).isNullOrEmpty();
        assertThat(document4.isReftext()).isFalse();
        assertThat(document4.getReftext()).isNull();
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

}
