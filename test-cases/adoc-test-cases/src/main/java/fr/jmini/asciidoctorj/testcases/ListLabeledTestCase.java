package fr.jmini.asciidoctorj.testcases;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.asciidoctor.OptionsBuilder;
import org.asciidoctor.ast.DescriptionList;
import org.asciidoctor.ast.DescriptionListEntry;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.ListItem;

public class ListLabeledTestCase implements AdocTestCase {

    public static final String ASCIIDOC = "" +
            "ONE:: lorem ipsum.\n" +
            "TWO:: abc def.\n" +
            "THREE:: lorem.";

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
            "<div class=\"dlist\">\n" +
            "<dl>\n" +
            "<dt class=\"hdlist1\">\n" +
            "ONE\n" +
            "</dt>\n" +
            "<dd>\n" +
            "<p>lorem ipsum.</p>\n" +
            "</dd>\n" +
            "<dt class=\"hdlist1\">\n" +
            "TWO\n" +
            "</dt>\n" +
            "<dd>\n" +
            "<p>abc def.</p>\n" +
            "</dd>\n" +
            "<dt class=\"hdlist1\">\n" +
            "THREE\n" +
            "</dt>\n" +
            "<dd>\n" +
            "<p>lorem.</p>\n" +
            "</dd>\n" +
            "</dl>\n" +
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
        assertThat(document1.getTitle()).isNull();
        assertThat(document1.getStyle()).isNull();
        assertThat(document1.getLevel()).isEqualTo(0);
        assertThat(document1.getContentModel()).isEqualTo("compound");
        assertThat(document1.getSourceLocation()).isNull();
        assertThat(document1.getSubstitutions()).isNullOrEmpty();
        assertThat(document1.getBlocks()).hasSize(1);
        DescriptionList descriptionList1 = (DescriptionList) document1.getBlocks()
                .get(0);
        assertThat(descriptionList1.getId()).isNull();
        assertThat(descriptionList1.getNodeName()).isEqualTo("dlist");
        assertThat(descriptionList1.getParent()).isSameAs(document1);
        assertThat(descriptionList1.getContext()).isEqualTo("dlist");
        assertThat(descriptionList1.getDocument()).isSameAs(document1);
        assertThat(descriptionList1.isInline()).isFalse();
        assertThat(descriptionList1.isBlock()).isTrue();
        assertThat(descriptionList1.getAttributes()).isNullOrEmpty();
        assertThat(descriptionList1.getRoles()).isNullOrEmpty();
        assertThat(descriptionList1.isReftext()).isFalse();
        assertThat(descriptionList1.getReftext()).isNull();
        assertThat(descriptionList1.getTitle()).isNull();
        assertThat(descriptionList1.getStyle()).isNull();
        assertThat(descriptionList1.getLevel()).isEqualTo(0);
        assertThat(descriptionList1.getContentModel()).isEqualTo("compound");
        assertThat(descriptionList1.getSourceLocation()).isNull();
        assertThat(descriptionList1.getSubstitutions()).isNullOrEmpty();
        assertThat(descriptionList1.getBlocks()).isNullOrEmpty();
        assertThat(descriptionList1.getItems()).hasSize(3);
        DescriptionListEntry descriptionListEntry1 = (DescriptionListEntry) descriptionList1.getItems()
                .get(0);
        ListItem listItem1 = descriptionListEntry1.getDescription();
        assertThat(listItem1.getId()).isNull();
        assertThat(listItem1.getNodeName()).isEqualTo("list_item");
        assertThat(listItem1.getParent()).isSameAs(descriptionList1);
        assertThat(listItem1.getContext()).isEqualTo("list_item");
        assertThat(listItem1.getDocument()).isSameAs(document1);
        assertThat(listItem1.isInline()).isFalse();
        assertThat(listItem1.isBlock()).isTrue();
        assertThat(listItem1.getAttributes()).isNullOrEmpty();
        assertThat(listItem1.getRoles()).isNullOrEmpty();
        assertThat(listItem1.isReftext()).isFalse();
        assertThat(listItem1.getReftext()).isNull();
        assertThat(listItem1.getTitle()).isNull();
        assertThat(listItem1.getStyle()).isNull();
        assertThat(listItem1.getLevel()).isEqualTo(0);
        assertThat(listItem1.getContentModel()).isEqualTo("compound");
        assertThat(listItem1.getSourceLocation()).isNull();
        assertThat(listItem1.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(listItem1.getBlocks()).isNullOrEmpty();
        assertThat(listItem1.getMarker()).isNull();
        assertThat(listItem1.getText()).isEqualTo("lorem ipsum.");
        assertThat(listItem1.getSource()).isEqualTo("lorem ipsum.");
        assertThat(listItem1.hasText()).isTrue();
        assertThat(descriptionListEntry1.getTerms()).hasSize(1);
        ListItem listItem2 = (ListItem) descriptionListEntry1.getTerms()
                .get(0);
        assertThat(listItem2.getId()).isNull();
        assertThat(listItem2.getNodeName()).isEqualTo("list_item");
        assertThat(listItem2.getParent()).isSameAs(descriptionList1);
        assertThat(listItem2.getContext()).isEqualTo("list_item");
        assertThat(listItem2.getDocument()).isSameAs(document1);
        assertThat(listItem2.isInline()).isFalse();
        assertThat(listItem2.isBlock()).isTrue();
        assertThat(listItem2.getAttributes()).isNullOrEmpty();
        assertThat(listItem2.getRoles()).isNullOrEmpty();
        assertThat(listItem2.isReftext()).isFalse();
        assertThat(listItem2.getReftext()).isNull();
        assertThat(listItem2.getTitle()).isNull();
        assertThat(listItem2.getStyle()).isNull();
        assertThat(listItem2.getLevel()).isEqualTo(0);
        assertThat(listItem2.getContentModel()).isEqualTo("compound");
        assertThat(listItem2.getSourceLocation()).isNull();
        assertThat(listItem2.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(listItem2.getBlocks()).isNullOrEmpty();
        assertThat(listItem2.getMarker()).isNull();
        assertThat(listItem2.getText()).isEqualTo("ONE");
        assertThat(listItem2.getSource()).isEqualTo("ONE");
        assertThat(listItem2.hasText()).isTrue();
        DescriptionListEntry descriptionListEntry2 = (DescriptionListEntry) descriptionList1.getItems()
                .get(1);
        ListItem listItem3 = descriptionListEntry2.getDescription();
        assertThat(listItem3.getId()).isNull();
        assertThat(listItem3.getNodeName()).isEqualTo("list_item");
        assertThat(listItem3.getParent()).isSameAs(descriptionList1);
        assertThat(listItem3.getContext()).isEqualTo("list_item");
        assertThat(listItem3.getDocument()).isSameAs(document1);
        assertThat(listItem3.isInline()).isFalse();
        assertThat(listItem3.isBlock()).isTrue();
        assertThat(listItem3.getAttributes()).isNullOrEmpty();
        assertThat(listItem3.getRoles()).isNullOrEmpty();
        assertThat(listItem3.isReftext()).isFalse();
        assertThat(listItem3.getReftext()).isNull();
        assertThat(listItem3.getTitle()).isNull();
        assertThat(listItem3.getStyle()).isNull();
        assertThat(listItem3.getLevel()).isEqualTo(0);
        assertThat(listItem3.getContentModel()).isEqualTo("compound");
        assertThat(listItem3.getSourceLocation()).isNull();
        assertThat(listItem3.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(listItem3.getBlocks()).isNullOrEmpty();
        assertThat(listItem3.getMarker()).isNull();
        assertThat(listItem3.getText()).isEqualTo("abc def.");
        assertThat(listItem3.getSource()).isEqualTo("abc def.");
        assertThat(listItem3.hasText()).isTrue();
        assertThat(descriptionListEntry2.getTerms()).hasSize(1);
        ListItem listItem4 = (ListItem) descriptionListEntry2.getTerms()
                .get(0);
        assertThat(listItem4.getId()).isNull();
        assertThat(listItem4.getNodeName()).isEqualTo("list_item");
        assertThat(listItem4.getParent()).isSameAs(descriptionList1);
        assertThat(listItem4.getContext()).isEqualTo("list_item");
        assertThat(listItem4.getDocument()).isSameAs(document1);
        assertThat(listItem4.isInline()).isFalse();
        assertThat(listItem4.isBlock()).isTrue();
        assertThat(listItem4.getAttributes()).isNullOrEmpty();
        assertThat(listItem4.getRoles()).isNullOrEmpty();
        assertThat(listItem4.isReftext()).isFalse();
        assertThat(listItem4.getReftext()).isNull();
        assertThat(listItem4.getTitle()).isNull();
        assertThat(listItem4.getStyle()).isNull();
        assertThat(listItem4.getLevel()).isEqualTo(0);
        assertThat(listItem4.getContentModel()).isEqualTo("compound");
        assertThat(listItem4.getSourceLocation()).isNull();
        assertThat(listItem4.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(listItem4.getBlocks()).isNullOrEmpty();
        assertThat(listItem4.getMarker()).isNull();
        assertThat(listItem4.getText()).isEqualTo("TWO");
        assertThat(listItem4.getSource()).isEqualTo("TWO");
        assertThat(listItem4.hasText()).isTrue();
        DescriptionListEntry descriptionListEntry3 = (DescriptionListEntry) descriptionList1.getItems()
                .get(2);
        ListItem listItem5 = descriptionListEntry3.getDescription();
        assertThat(listItem5.getId()).isNull();
        assertThat(listItem5.getNodeName()).isEqualTo("list_item");
        assertThat(listItem5.getParent()).isSameAs(descriptionList1);
        assertThat(listItem5.getContext()).isEqualTo("list_item");
        assertThat(listItem5.getDocument()).isSameAs(document1);
        assertThat(listItem5.isInline()).isFalse();
        assertThat(listItem5.isBlock()).isTrue();
        assertThat(listItem5.getAttributes()).isNullOrEmpty();
        assertThat(listItem5.getRoles()).isNullOrEmpty();
        assertThat(listItem5.isReftext()).isFalse();
        assertThat(listItem5.getReftext()).isNull();
        assertThat(listItem5.getTitle()).isNull();
        assertThat(listItem5.getStyle()).isNull();
        assertThat(listItem5.getLevel()).isEqualTo(0);
        assertThat(listItem5.getContentModel()).isEqualTo("compound");
        assertThat(listItem5.getSourceLocation()).isNull();
        assertThat(listItem5.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(listItem5.getBlocks()).isNullOrEmpty();
        assertThat(listItem5.getMarker()).isNull();
        assertThat(listItem5.getText()).isEqualTo("lorem.");
        assertThat(listItem5.getSource()).isEqualTo("lorem.");
        assertThat(listItem5.hasText()).isTrue();
        assertThat(descriptionListEntry3.getTerms()).hasSize(1);
        ListItem listItem6 = (ListItem) descriptionListEntry3.getTerms()
                .get(0);
        assertThat(listItem6.getId()).isNull();
        assertThat(listItem6.getNodeName()).isEqualTo("list_item");
        assertThat(listItem6.getParent()).isSameAs(descriptionList1);
        assertThat(listItem6.getContext()).isEqualTo("list_item");
        assertThat(listItem6.getDocument()).isSameAs(document1);
        assertThat(listItem6.isInline()).isFalse();
        assertThat(listItem6.isBlock()).isTrue();
        assertThat(listItem6.getAttributes()).isNullOrEmpty();
        assertThat(listItem6.getRoles()).isNullOrEmpty();
        assertThat(listItem6.isReftext()).isFalse();
        assertThat(listItem6.getReftext()).isNull();
        assertThat(listItem6.getTitle()).isNull();
        assertThat(listItem6.getStyle()).isNull();
        assertThat(listItem6.getLevel()).isEqualTo(0);
        assertThat(listItem6.getContentModel()).isEqualTo("compound");
        assertThat(listItem6.getSourceLocation()).isNull();
        assertThat(listItem6.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(listItem6.getBlocks()).isNullOrEmpty();
        assertThat(listItem6.getMarker()).isNull();
        assertThat(listItem6.getText()).isEqualTo("THREE");
        assertThat(listItem6.getSource()).isEqualTo("THREE");
        assertThat(listItem6.hasText()).isTrue();
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
        when(mockDocument1.getTitle()).thenReturn(null);
        when(mockDocument1.getStyle()).thenReturn(null);
        when(mockDocument1.getLevel()).thenReturn(0);
        when(mockDocument1.getContentModel()).thenReturn("compound");
        when(mockDocument1.getSourceLocation()).thenReturn(null);
        when(mockDocument1.getSubstitutions()).thenReturn(Collections.emptyList());
        DescriptionList mockDescriptionList1 = mock(DescriptionList.class);
        when(mockDescriptionList1.getId()).thenReturn(null);
        when(mockDescriptionList1.getNodeName()).thenReturn("dlist");
        when(mockDescriptionList1.getParent()).thenReturn(mockDocument1);
        when(mockDescriptionList1.getContext()).thenReturn("dlist");
        when(mockDescriptionList1.getDocument()).thenReturn(mockDocument1);
        when(mockDescriptionList1.isInline()).thenReturn(false);
        when(mockDescriptionList1.isBlock()).thenReturn(true);
        when(mockDescriptionList1.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockDescriptionList1.getRoles()).thenReturn(Collections.emptyList());
        when(mockDescriptionList1.isReftext()).thenReturn(false);
        when(mockDescriptionList1.getReftext()).thenReturn(null);
        when(mockDescriptionList1.getTitle()).thenReturn(null);
        when(mockDescriptionList1.getStyle()).thenReturn(null);
        when(mockDescriptionList1.getLevel()).thenReturn(0);
        when(mockDescriptionList1.getContentModel()).thenReturn("compound");
        when(mockDescriptionList1.getSourceLocation()).thenReturn(null);
        when(mockDescriptionList1.getSubstitutions()).thenReturn(Collections.emptyList());
        when(mockDescriptionList1.getBlocks()).thenReturn(null);
        DescriptionListEntry mockDescriptionListEntry1 = mock(DescriptionListEntry.class);
        ListItem mockListItem1 = mock(ListItem.class);
        when(mockListItem1.getId()).thenReturn(null);
        when(mockListItem1.getNodeName()).thenReturn("list_item");
        when(mockListItem1.getParent()).thenReturn(mockDescriptionList1);
        when(mockListItem1.getContext()).thenReturn("list_item");
        when(mockListItem1.getDocument()).thenReturn(mockDocument1);
        when(mockListItem1.isInline()).thenReturn(false);
        when(mockListItem1.isBlock()).thenReturn(true);
        when(mockListItem1.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockListItem1.getRoles()).thenReturn(Collections.emptyList());
        when(mockListItem1.isReftext()).thenReturn(false);
        when(mockListItem1.getReftext()).thenReturn(null);
        when(mockListItem1.getTitle()).thenReturn(null);
        when(mockListItem1.getStyle()).thenReturn(null);
        when(mockListItem1.getLevel()).thenReturn(0);
        when(mockListItem1.getContentModel()).thenReturn("compound");
        when(mockListItem1.getSourceLocation()).thenReturn(null);
        when(mockListItem1.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockListItem1.getBlocks()).thenReturn(Collections.emptyList());
        when(mockListItem1.getMarker()).thenReturn(null);
        when(mockListItem1.getText()).thenReturn("lorem ipsum.");
        when(mockListItem1.getSource()).thenReturn("lorem ipsum.");
        when(mockListItem1.hasText()).thenReturn(true);
        when(mockDescriptionListEntry1.getDescription()).thenReturn(mockListItem1);
        ListItem mockListItem2 = mock(ListItem.class);
        when(mockListItem2.getId()).thenReturn(null);
        when(mockListItem2.getNodeName()).thenReturn("list_item");
        when(mockListItem2.getParent()).thenReturn(mockDescriptionList1);
        when(mockListItem2.getContext()).thenReturn("list_item");
        when(mockListItem2.getDocument()).thenReturn(mockDocument1);
        when(mockListItem2.isInline()).thenReturn(false);
        when(mockListItem2.isBlock()).thenReturn(true);
        when(mockListItem2.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockListItem2.getRoles()).thenReturn(Collections.emptyList());
        when(mockListItem2.isReftext()).thenReturn(false);
        when(mockListItem2.getReftext()).thenReturn(null);
        when(mockListItem2.getTitle()).thenReturn(null);
        when(mockListItem2.getStyle()).thenReturn(null);
        when(mockListItem2.getLevel()).thenReturn(0);
        when(mockListItem2.getContentModel()).thenReturn("compound");
        when(mockListItem2.getSourceLocation()).thenReturn(null);
        when(mockListItem2.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockListItem2.getBlocks()).thenReturn(Collections.emptyList());
        when(mockListItem2.getMarker()).thenReturn(null);
        when(mockListItem2.getText()).thenReturn("ONE");
        when(mockListItem2.getSource()).thenReturn("ONE");
        when(mockListItem2.hasText()).thenReturn(true);
        when(mockDescriptionListEntry1.getTerms()).thenReturn(Collections.singletonList(mockListItem2));
        DescriptionListEntry mockDescriptionListEntry2 = mock(DescriptionListEntry.class);
        ListItem mockListItem3 = mock(ListItem.class);
        when(mockListItem3.getId()).thenReturn(null);
        when(mockListItem3.getNodeName()).thenReturn("list_item");
        when(mockListItem3.getParent()).thenReturn(mockDescriptionList1);
        when(mockListItem3.getContext()).thenReturn("list_item");
        when(mockListItem3.getDocument()).thenReturn(mockDocument1);
        when(mockListItem3.isInline()).thenReturn(false);
        when(mockListItem3.isBlock()).thenReturn(true);
        when(mockListItem3.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockListItem3.getRoles()).thenReturn(Collections.emptyList());
        when(mockListItem3.isReftext()).thenReturn(false);
        when(mockListItem3.getReftext()).thenReturn(null);
        when(mockListItem3.getTitle()).thenReturn(null);
        when(mockListItem3.getStyle()).thenReturn(null);
        when(mockListItem3.getLevel()).thenReturn(0);
        when(mockListItem3.getContentModel()).thenReturn("compound");
        when(mockListItem3.getSourceLocation()).thenReturn(null);
        when(mockListItem3.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockListItem3.getBlocks()).thenReturn(Collections.emptyList());
        when(mockListItem3.getMarker()).thenReturn(null);
        when(mockListItem3.getText()).thenReturn("abc def.");
        when(mockListItem3.getSource()).thenReturn("abc def.");
        when(mockListItem3.hasText()).thenReturn(true);
        when(mockDescriptionListEntry2.getDescription()).thenReturn(mockListItem3);
        ListItem mockListItem4 = mock(ListItem.class);
        when(mockListItem4.getId()).thenReturn(null);
        when(mockListItem4.getNodeName()).thenReturn("list_item");
        when(mockListItem4.getParent()).thenReturn(mockDescriptionList1);
        when(mockListItem4.getContext()).thenReturn("list_item");
        when(mockListItem4.getDocument()).thenReturn(mockDocument1);
        when(mockListItem4.isInline()).thenReturn(false);
        when(mockListItem4.isBlock()).thenReturn(true);
        when(mockListItem4.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockListItem4.getRoles()).thenReturn(Collections.emptyList());
        when(mockListItem4.isReftext()).thenReturn(false);
        when(mockListItem4.getReftext()).thenReturn(null);
        when(mockListItem4.getTitle()).thenReturn(null);
        when(mockListItem4.getStyle()).thenReturn(null);
        when(mockListItem4.getLevel()).thenReturn(0);
        when(mockListItem4.getContentModel()).thenReturn("compound");
        when(mockListItem4.getSourceLocation()).thenReturn(null);
        when(mockListItem4.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockListItem4.getBlocks()).thenReturn(Collections.emptyList());
        when(mockListItem4.getMarker()).thenReturn(null);
        when(mockListItem4.getText()).thenReturn("TWO");
        when(mockListItem4.getSource()).thenReturn("TWO");
        when(mockListItem4.hasText()).thenReturn(true);
        when(mockDescriptionListEntry2.getTerms()).thenReturn(Collections.singletonList(mockListItem4));
        DescriptionListEntry mockDescriptionListEntry3 = mock(DescriptionListEntry.class);
        ListItem mockListItem5 = mock(ListItem.class);
        when(mockListItem5.getId()).thenReturn(null);
        when(mockListItem5.getNodeName()).thenReturn("list_item");
        when(mockListItem5.getParent()).thenReturn(mockDescriptionList1);
        when(mockListItem5.getContext()).thenReturn("list_item");
        when(mockListItem5.getDocument()).thenReturn(mockDocument1);
        when(mockListItem5.isInline()).thenReturn(false);
        when(mockListItem5.isBlock()).thenReturn(true);
        when(mockListItem5.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockListItem5.getRoles()).thenReturn(Collections.emptyList());
        when(mockListItem5.isReftext()).thenReturn(false);
        when(mockListItem5.getReftext()).thenReturn(null);
        when(mockListItem5.getTitle()).thenReturn(null);
        when(mockListItem5.getStyle()).thenReturn(null);
        when(mockListItem5.getLevel()).thenReturn(0);
        when(mockListItem5.getContentModel()).thenReturn("compound");
        when(mockListItem5.getSourceLocation()).thenReturn(null);
        when(mockListItem5.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockListItem5.getBlocks()).thenReturn(Collections.emptyList());
        when(mockListItem5.getMarker()).thenReturn(null);
        when(mockListItem5.getText()).thenReturn("lorem.");
        when(mockListItem5.getSource()).thenReturn("lorem.");
        when(mockListItem5.hasText()).thenReturn(true);
        when(mockDescriptionListEntry3.getDescription()).thenReturn(mockListItem5);
        ListItem mockListItem6 = mock(ListItem.class);
        when(mockListItem6.getId()).thenReturn(null);
        when(mockListItem6.getNodeName()).thenReturn("list_item");
        when(mockListItem6.getParent()).thenReturn(mockDescriptionList1);
        when(mockListItem6.getContext()).thenReturn("list_item");
        when(mockListItem6.getDocument()).thenReturn(mockDocument1);
        when(mockListItem6.isInline()).thenReturn(false);
        when(mockListItem6.isBlock()).thenReturn(true);
        when(mockListItem6.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockListItem6.getRoles()).thenReturn(Collections.emptyList());
        when(mockListItem6.isReftext()).thenReturn(false);
        when(mockListItem6.getReftext()).thenReturn(null);
        when(mockListItem6.getTitle()).thenReturn(null);
        when(mockListItem6.getStyle()).thenReturn(null);
        when(mockListItem6.getLevel()).thenReturn(0);
        when(mockListItem6.getContentModel()).thenReturn("compound");
        when(mockListItem6.getSourceLocation()).thenReturn(null);
        when(mockListItem6.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockListItem6.getBlocks()).thenReturn(Collections.emptyList());
        when(mockListItem6.getMarker()).thenReturn(null);
        when(mockListItem6.getText()).thenReturn("THREE");
        when(mockListItem6.getSource()).thenReturn("THREE");
        when(mockListItem6.hasText()).thenReturn(true);
        when(mockDescriptionListEntry3.getTerms()).thenReturn(Collections.singletonList(mockListItem6));
        when(mockDescriptionList1.getItems()).thenReturn(Arrays.asList(mockDescriptionListEntry1, mockDescriptionListEntry2, mockDescriptionListEntry3));
        when(mockDocument1.getBlocks()).thenReturn(Collections.singletonList(mockDescriptionList1));
        when(mockDocument1.getStructuredDoctitle()).thenReturn(null);
        when(mockDocument1.getDoctitle()).thenReturn(null);
        Map<Object, Object> map2 = new HashMap<>();
        map2.put("attributes", "{}");
        map2.put("header_footer", false);
        when(mockDocument1.getOptions()).thenReturn(map2);
        return mockDocument1;
    }
    // end::mock-code[]
}