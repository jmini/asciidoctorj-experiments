package fr.jmini.asciidoctorj.testcases;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.asciidoctor.OptionsBuilder;
import org.asciidoctor.ast.Block;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.ListItem;

public class AdmonitionBlockTipTestCase implements AdocTestCase {

    public static final String ASCIIDOC = "" +
            "[TIP] \n" +
            "==== \n" +
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n" +
            "Donec aliquam tempus quam et sollicitudin.\n" +
            "\n" +
            "* Lorem.\n" +
            "* Ipsum.\n" +
            "* Dolor.\n" +
            "====\n" +
            "";

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
            "<div class=\"admonitionblock tip\">\n" +
            "<table>\n" +
            "<tbody>\n" +
            "<tr>\n" +
            "<td class=\"icon\">\n" +
            "<div class=\"title\">\n" +
            "Tip\n" +
            "</div> </td>\n" +
            "<td class=\"content\">\n" +
            "<div class=\"paragraph\">\n" +
            "<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec aliquam tempus quam et sollicitudin.</p>\n" +
            "</div>\n" +
            "<div class=\"ulist\">\n" +
            "<ul>\n" +
            "<li> <p>Lorem.</p> </li>\n" +
            "<li> <p>Ipsum.</p> </li>\n" +
            "<li> <p>Dolor.</p> </li>\n" +
            "</ul>\n" +
            "</div> </td>\n" +
            "</tr>\n" +
            "</tbody>\n" +
            "</table>\n" +
            "</div>";
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
        Block block1 = (Block) document1.getBlocks()
                .get(0);
        assertThat(block1.getId()).isNull();
        assertThat(block1.getNodeName()).isEqualTo("admonition");
        assertThat(block1.getParent()).isSameAs(document1);
        assertThat(block1.getContext()).isEqualTo("admonition");
        assertThat(block1.getDocument()).isSameAs(document1);
        assertThat(block1.isInline()).isFalse();
        assertThat(block1.isBlock()).isTrue();
        assertThat(block1.getAttributes()).containsEntry("1", "TIP")
                .containsEntry("name", "tip")
                .containsEntry("style", "TIP")
                .containsEntry("textlabel", "Tip");
        assertThat(block1.getRoles()).isNullOrEmpty();
        assertThat(block1.isReftext()).isFalse();
        assertThat(block1.getReftext()).isNull();
        assertThat(block1.getCaption()).isEqualTo("Tip");
        assertThat(block1.getTitle()).isNull();
        assertThat(block1.getStyle()).isEqualTo("TIP");
        assertThat(block1.getLevel()).isEqualTo(0);
        assertThat(block1.getContentModel()).isEqualTo("compound");
        assertThat(block1.getSourceLocation()).isNull();
        assertThat(block1.getSubstitutions()).isNullOrEmpty();
        assertThat(block1.getBlocks()).hasSize(2);
        Block block2 = (Block) block1.getBlocks()
                .get(0);
        assertThat(block2.getId()).isNull();
        assertThat(block2.getNodeName()).isEqualTo("paragraph");
        assertThat(block2.getParent()).isSameAs(block1);
        assertThat(block2.getContext()).isEqualTo("paragraph");
        assertThat(block2.getDocument()).isSameAs(document1);
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
        assertThat(block2.getLines()).containsExactly("Lorem ipsum dolor sit amet, consectetur adipiscing elit.", "Donec aliquam tempus quam et sollicitudin.");
        assertThat(block2.getSource()).isEqualTo("Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n" +
                "Donec aliquam tempus quam et sollicitudin.");
        org.asciidoctor.ast.List list1 = (org.asciidoctor.ast.List) block1.getBlocks()
                .get(1);
        assertThat(list1.getId()).isNull();
        assertThat(list1.getNodeName()).isEqualTo("ulist");
        assertThat(list1.getParent()).isSameAs(block1);
        assertThat(list1.getContext()).isEqualTo("ulist");
        assertThat(list1.getDocument()).isSameAs(document1);
        assertThat(list1.isInline()).isFalse();
        assertThat(list1.isBlock()).isTrue();
        assertThat(list1.getAttributes()).isNullOrEmpty();
        assertThat(list1.getRoles()).isNullOrEmpty();
        assertThat(list1.isReftext()).isFalse();
        assertThat(list1.getReftext()).isNull();
        assertThat(list1.getCaption()).isNull();
        assertThat(list1.getTitle()).isNull();
        assertThat(list1.getStyle()).isNull();
        assertThat(list1.getLevel()).isEqualTo(1);
        assertThat(list1.getContentModel()).isEqualTo("compound");
        assertThat(list1.getSourceLocation()).isNull();
        assertThat(list1.getSubstitutions()).isNullOrEmpty();
        assertThat(list1.getBlocks()).isNullOrEmpty();
        assertThat(list1.getItems()).hasSize(3);
        ListItem listItem1 = (ListItem) list1.getItems()
                .get(0);
        assertThat(listItem1.getId()).isNull();
        assertThat(listItem1.getNodeName()).isEqualTo("list_item");
        assertThat(listItem1.getParent()).isSameAs(list1);
        assertThat(listItem1.getContext()).isEqualTo("list_item");
        assertThat(listItem1.getDocument()).isSameAs(document1);
        assertThat(listItem1.isInline()).isFalse();
        assertThat(listItem1.isBlock()).isTrue();
        assertThat(listItem1.getAttributes()).isNullOrEmpty();
        assertThat(listItem1.getRoles()).isNullOrEmpty();
        assertThat(listItem1.isReftext()).isFalse();
        assertThat(listItem1.getReftext()).isNull();
        assertThat(listItem1.getCaption()).isNull();
        assertThat(listItem1.getTitle()).isNull();
        assertThat(listItem1.getStyle()).isNull();
        assertThat(listItem1.getLevel()).isEqualTo(1);
        assertThat(listItem1.getContentModel()).isEqualTo("compound");
        assertThat(listItem1.getSourceLocation()).isNull();
        assertThat(listItem1.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(listItem1.getBlocks()).isNullOrEmpty();
        assertThat(listItem1.getMarker()).isEqualTo("*");
        assertThat(listItem1.getText()).isEqualTo("Lorem.");
        assertThat(listItem1.getSource()).isEqualTo("Lorem.");
        assertThat(listItem1.hasText()).isTrue();
        ListItem listItem2 = (ListItem) list1.getItems()
                .get(1);
        assertThat(listItem2.getId()).isNull();
        assertThat(listItem2.getNodeName()).isEqualTo("list_item");
        assertThat(listItem2.getParent()).isSameAs(list1);
        assertThat(listItem2.getContext()).isEqualTo("list_item");
        assertThat(listItem2.getDocument()).isSameAs(document1);
        assertThat(listItem2.isInline()).isFalse();
        assertThat(listItem2.isBlock()).isTrue();
        assertThat(listItem2.getAttributes()).isNullOrEmpty();
        assertThat(listItem2.getRoles()).isNullOrEmpty();
        assertThat(listItem2.isReftext()).isFalse();
        assertThat(listItem2.getReftext()).isNull();
        assertThat(listItem2.getCaption()).isNull();
        assertThat(listItem2.getTitle()).isNull();
        assertThat(listItem2.getStyle()).isNull();
        assertThat(listItem2.getLevel()).isEqualTo(1);
        assertThat(listItem2.getContentModel()).isEqualTo("compound");
        assertThat(listItem2.getSourceLocation()).isNull();
        assertThat(listItem2.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(listItem2.getBlocks()).isNullOrEmpty();
        assertThat(listItem2.getMarker()).isEqualTo("*");
        assertThat(listItem2.getText()).isEqualTo("Ipsum.");
        assertThat(listItem2.getSource()).isEqualTo("Ipsum.");
        assertThat(listItem2.hasText()).isTrue();
        ListItem listItem3 = (ListItem) list1.getItems()
                .get(2);
        assertThat(listItem3.getId()).isNull();
        assertThat(listItem3.getNodeName()).isEqualTo("list_item");
        assertThat(listItem3.getParent()).isSameAs(list1);
        assertThat(listItem3.getContext()).isEqualTo("list_item");
        assertThat(listItem3.getDocument()).isSameAs(document1);
        assertThat(listItem3.isInline()).isFalse();
        assertThat(listItem3.isBlock()).isTrue();
        assertThat(listItem3.getAttributes()).isNullOrEmpty();
        assertThat(listItem3.getRoles()).isNullOrEmpty();
        assertThat(listItem3.isReftext()).isFalse();
        assertThat(listItem3.getReftext()).isNull();
        assertThat(listItem3.getCaption()).isNull();
        assertThat(listItem3.getTitle()).isNull();
        assertThat(listItem3.getStyle()).isNull();
        assertThat(listItem3.getLevel()).isEqualTo(1);
        assertThat(listItem3.getContentModel()).isEqualTo("compound");
        assertThat(listItem3.getSourceLocation()).isNull();
        assertThat(listItem3.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(listItem3.getBlocks()).isNullOrEmpty();
        assertThat(listItem3.getMarker()).isEqualTo("*");
        assertThat(listItem3.getText()).isEqualTo("Dolor.");
        assertThat(listItem3.getSource()).isEqualTo("Dolor.");
        assertThat(listItem3.hasText()).isTrue();
        assertThat(list1.hasItems()).isTrue();
        assertThat(block1.getLines()).isNullOrEmpty();
        assertThat(block1.getSource()).isEqualTo("");
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
        Block mockBlock1 = mock(Block.class);
        when(mockBlock1.getId()).thenReturn(null);
        when(mockBlock1.getNodeName()).thenReturn("admonition");
        when(mockBlock1.getParent()).thenReturn(mockDocument1);
        when(mockBlock1.getContext()).thenReturn("admonition");
        when(mockBlock1.getDocument()).thenReturn(mockDocument1);
        when(mockBlock1.isInline()).thenReturn(false);
        when(mockBlock1.isBlock()).thenReturn(true);
        Map<String, Object> map2 = new HashMap<>();
        map2.put("1", "TIP");
        map2.put("name", "tip");
        map2.put("style", "TIP");
        map2.put("textlabel", "Tip");
        when(mockBlock1.getAttributes()).thenReturn(map2);
        when(mockBlock1.getRoles()).thenReturn(Collections.emptyList());
        when(mockBlock1.isReftext()).thenReturn(false);
        when(mockBlock1.getReftext()).thenReturn(null);
        when(mockBlock1.getCaption()).thenReturn("Tip");
        when(mockBlock1.getTitle()).thenReturn(null);
        when(mockBlock1.getStyle()).thenReturn("TIP");
        when(mockBlock1.getLevel()).thenReturn(0);
        when(mockBlock1.getContentModel()).thenReturn("compound");
        when(mockBlock1.getSourceLocation()).thenReturn(null);
        when(mockBlock1.getSubstitutions()).thenReturn(Collections.emptyList());
        Block mockBlock2 = mock(Block.class);
        when(mockBlock2.getId()).thenReturn(null);
        when(mockBlock2.getNodeName()).thenReturn("paragraph");
        when(mockBlock2.getParent()).thenReturn(mockBlock1);
        when(mockBlock2.getContext()).thenReturn("paragraph");
        when(mockBlock2.getDocument()).thenReturn(mockDocument1);
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
        when(mockBlock2.getLines()).thenReturn(Arrays.asList("Lorem ipsum dolor sit amet, consectetur adipiscing elit.", "Donec aliquam tempus quam et sollicitudin."));
        when(mockBlock2.getSource()).thenReturn("Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n" +
                "Donec aliquam tempus quam et sollicitudin.");
        org.asciidoctor.ast.List mockList1 = mock(org.asciidoctor.ast.List.class);
        when(mockList1.getId()).thenReturn(null);
        when(mockList1.getNodeName()).thenReturn("ulist");
        when(mockList1.getParent()).thenReturn(mockBlock1);
        when(mockList1.getContext()).thenReturn("ulist");
        when(mockList1.getDocument()).thenReturn(mockDocument1);
        when(mockList1.isInline()).thenReturn(false);
        when(mockList1.isBlock()).thenReturn(true);
        when(mockList1.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockList1.getRoles()).thenReturn(Collections.emptyList());
        when(mockList1.isReftext()).thenReturn(false);
        when(mockList1.getReftext()).thenReturn(null);
        when(mockList1.getCaption()).thenReturn(null);
        when(mockList1.getTitle()).thenReturn(null);
        when(mockList1.getStyle()).thenReturn(null);
        when(mockList1.getLevel()).thenReturn(1);
        when(mockList1.getContentModel()).thenReturn("compound");
        when(mockList1.getSourceLocation()).thenReturn(null);
        when(mockList1.getSubstitutions()).thenReturn(Collections.emptyList());
        when(mockList1.getBlocks()).thenReturn(null);
        ListItem mockListItem1 = mock(ListItem.class);
        when(mockListItem1.getId()).thenReturn(null);
        when(mockListItem1.getNodeName()).thenReturn("list_item");
        when(mockListItem1.getParent()).thenReturn(mockList1);
        when(mockListItem1.getContext()).thenReturn("list_item");
        when(mockListItem1.getDocument()).thenReturn(mockDocument1);
        when(mockListItem1.isInline()).thenReturn(false);
        when(mockListItem1.isBlock()).thenReturn(true);
        when(mockListItem1.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockListItem1.getRoles()).thenReturn(Collections.emptyList());
        when(mockListItem1.isReftext()).thenReturn(false);
        when(mockListItem1.getReftext()).thenReturn(null);
        when(mockListItem1.getCaption()).thenReturn(null);
        when(mockListItem1.getTitle()).thenReturn(null);
        when(mockListItem1.getStyle()).thenReturn(null);
        when(mockListItem1.getLevel()).thenReturn(1);
        when(mockListItem1.getContentModel()).thenReturn("compound");
        when(mockListItem1.getSourceLocation()).thenReturn(null);
        when(mockListItem1.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockListItem1.getBlocks()).thenReturn(Collections.emptyList());
        when(mockListItem1.getMarker()).thenReturn("*");
        when(mockListItem1.getText()).thenReturn("Lorem.");
        when(mockListItem1.getSource()).thenReturn("Lorem.");
        when(mockListItem1.hasText()).thenReturn(true);
        ListItem mockListItem2 = mock(ListItem.class);
        when(mockListItem2.getId()).thenReturn(null);
        when(mockListItem2.getNodeName()).thenReturn("list_item");
        when(mockListItem2.getParent()).thenReturn(mockList1);
        when(mockListItem2.getContext()).thenReturn("list_item");
        when(mockListItem2.getDocument()).thenReturn(mockDocument1);
        when(mockListItem2.isInline()).thenReturn(false);
        when(mockListItem2.isBlock()).thenReturn(true);
        when(mockListItem2.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockListItem2.getRoles()).thenReturn(Collections.emptyList());
        when(mockListItem2.isReftext()).thenReturn(false);
        when(mockListItem2.getReftext()).thenReturn(null);
        when(mockListItem2.getCaption()).thenReturn(null);
        when(mockListItem2.getTitle()).thenReturn(null);
        when(mockListItem2.getStyle()).thenReturn(null);
        when(mockListItem2.getLevel()).thenReturn(1);
        when(mockListItem2.getContentModel()).thenReturn("compound");
        when(mockListItem2.getSourceLocation()).thenReturn(null);
        when(mockListItem2.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockListItem2.getBlocks()).thenReturn(Collections.emptyList());
        when(mockListItem2.getMarker()).thenReturn("*");
        when(mockListItem2.getText()).thenReturn("Ipsum.");
        when(mockListItem2.getSource()).thenReturn("Ipsum.");
        when(mockListItem2.hasText()).thenReturn(true);
        ListItem mockListItem3 = mock(ListItem.class);
        when(mockListItem3.getId()).thenReturn(null);
        when(mockListItem3.getNodeName()).thenReturn("list_item");
        when(mockListItem3.getParent()).thenReturn(mockList1);
        when(mockListItem3.getContext()).thenReturn("list_item");
        when(mockListItem3.getDocument()).thenReturn(mockDocument1);
        when(mockListItem3.isInline()).thenReturn(false);
        when(mockListItem3.isBlock()).thenReturn(true);
        when(mockListItem3.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockListItem3.getRoles()).thenReturn(Collections.emptyList());
        when(mockListItem3.isReftext()).thenReturn(false);
        when(mockListItem3.getReftext()).thenReturn(null);
        when(mockListItem3.getCaption()).thenReturn(null);
        when(mockListItem3.getTitle()).thenReturn(null);
        when(mockListItem3.getStyle()).thenReturn(null);
        when(mockListItem3.getLevel()).thenReturn(1);
        when(mockListItem3.getContentModel()).thenReturn("compound");
        when(mockListItem3.getSourceLocation()).thenReturn(null);
        when(mockListItem3.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockListItem3.getBlocks()).thenReturn(Collections.emptyList());
        when(mockListItem3.getMarker()).thenReturn("*");
        when(mockListItem3.getText()).thenReturn("Dolor.");
        when(mockListItem3.getSource()).thenReturn("Dolor.");
        when(mockListItem3.hasText()).thenReturn(true);
        when(mockList1.getItems()).thenReturn(Arrays.asList(mockListItem1, mockListItem2, mockListItem3));
        when(mockList1.hasItems()).thenReturn(true);
        when(mockBlock1.getBlocks()).thenReturn(Arrays.asList(mockBlock2, mockList1));
        when(mockBlock1.getLines()).thenReturn(Collections.emptyList());
        when(mockBlock1.getSource()).thenReturn("");
        when(mockDocument1.getBlocks()).thenReturn(Collections.singletonList(mockBlock1));
        when(mockDocument1.getStructuredDoctitle()).thenReturn(null);
        when(mockDocument1.getDoctitle()).thenReturn(null);
        Map<Object, Object> map3 = new HashMap<>();
        map3.put("attributes", "{}");
        map3.put("header_footer", false);
        when(mockDocument1.getOptions()).thenReturn(map3);
        return mockDocument1;
    }
    // end::mock-code[]
}