package fr.jmini.asciidoctorj.testcases;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.asciidoctor.OptionsBuilder;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.ListItem;

public class ListOlUpperalphaTestCase implements AdocTestCase {

    public static final String ASCIIDOC = "" +
            "[upperalpha]\n" +
            ". lorem\n" +
            ". ipsum\n" +
            ". dolor";

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
            "<div class=\"olist upperalpha\">\n" +
            "<ol class=\"upperalpha\" type=\"A\">\n" +
            "<li> <p>lorem</p> </li>\n" +
            "<li> <p>ipsum</p> </li>\n" +
            "<li> <p>dolor</p> </li>\n" +
            "</ol>\n" +
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
        org.asciidoctor.ast.List list1 = (org.asciidoctor.ast.List) document1.getBlocks()
                .get(0);
        assertThat(list1.getId()).isNull();
        assertThat(list1.getNodeName()).isEqualTo("olist");
        assertThat(list1.getParent()).isSameAs(document1);
        assertThat(list1.getContext()).isEqualTo("olist");
        assertThat(list1.getDocument()).isSameAs(document1);
        assertThat(list1.isInline()).isFalse();
        assertThat(list1.isBlock()).isTrue();
        assertThat(list1.getAttributes()).containsEntry("1", "upperalpha")
                .containsEntry("style", "upperalpha");
        assertThat(list1.getRoles()).isNullOrEmpty();
        assertThat(list1.isReftext()).isFalse();
        assertThat(list1.getReftext()).isNull();
        assertThat(list1.getCaption()).isNull();
        assertThat(list1.getTitle()).isNull();
        assertThat(list1.getStyle()).isEqualTo("upperalpha");
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
        assertThat(listItem1.getMarker()).isEqualTo(".");
        assertThat(listItem1.getText()).isEqualTo("lorem");
        assertThat(listItem1.getSource()).isEqualTo("lorem");
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
        assertThat(listItem2.getMarker()).isEqualTo(".");
        assertThat(listItem2.getText()).isEqualTo("ipsum");
        assertThat(listItem2.getSource()).isEqualTo("ipsum");
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
        assertThat(listItem3.getMarker()).isEqualTo(".");
        assertThat(listItem3.getText()).isEqualTo("dolor");
        assertThat(listItem3.getSource()).isEqualTo("dolor");
        assertThat(listItem3.hasText()).isTrue();
        assertThat(list1.hasItems()).isTrue();
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
        org.asciidoctor.ast.List mockList1 = mock(org.asciidoctor.ast.List.class);
        when(mockList1.getId()).thenReturn(null);
        when(mockList1.getNodeName()).thenReturn("olist");
        when(mockList1.getParent()).thenReturn(mockDocument1);
        when(mockList1.getContext()).thenReturn("olist");
        when(mockList1.getDocument()).thenReturn(mockDocument1);
        when(mockList1.isInline()).thenReturn(false);
        when(mockList1.isBlock()).thenReturn(true);
        Map<String, Object> map2 = new HashMap<>();
        map2.put("1", "upperalpha");
        map2.put("style", "upperalpha");
        when(mockList1.getAttributes()).thenReturn(map2);
        when(mockList1.getRoles()).thenReturn(Collections.emptyList());
        when(mockList1.isReftext()).thenReturn(false);
        when(mockList1.getReftext()).thenReturn(null);
        when(mockList1.getCaption()).thenReturn(null);
        when(mockList1.getTitle()).thenReturn(null);
        when(mockList1.getStyle()).thenReturn("upperalpha");
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
        when(mockListItem1.getMarker()).thenReturn(".");
        when(mockListItem1.getText()).thenReturn("lorem");
        when(mockListItem1.getSource()).thenReturn("lorem");
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
        when(mockListItem2.getMarker()).thenReturn(".");
        when(mockListItem2.getText()).thenReturn("ipsum");
        when(mockListItem2.getSource()).thenReturn("ipsum");
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
        when(mockListItem3.getMarker()).thenReturn(".");
        when(mockListItem3.getText()).thenReturn("dolor");
        when(mockListItem3.getSource()).thenReturn("dolor");
        when(mockListItem3.hasText()).thenReturn(true);
        when(mockList1.getItems()).thenReturn(Arrays.asList(mockListItem1, mockListItem2, mockListItem3));
        when(mockList1.hasItems()).thenReturn(true);
        when(mockDocument1.getBlocks()).thenReturn(Collections.singletonList(mockList1));
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