package fr.jmini.asciidoctorj.converter.html;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;

import org.asciidoctor.ast.DescriptionList;
import org.asciidoctor.ast.DescriptionListEntry;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.ListItem;

import com.google.common.collect.ImmutableMap;

import fr.jmini.asciidoctorj.converter.html.testing.AbstractListLabeledTesting;

public class ListLabeledTest extends AbstractListLabeledTesting {

    @Override
    protected Document createAstDocument(String asciiDoc) {
        Document mock = createMock();
        return mock;
    }

    @Override
    protected String convertToHtml(Document astDocument) {
        return HtmlConverterTestUtility.convertToHtml(astDocument);
    }

    // tag::mock-code[]
    public Document createMock() {
        Document mockDocument1 = mock(Document.class);
        when(mockDocument1.getId()).thenReturn(null);
        when(mockDocument1.getNodeName()).thenReturn("document");
        when(mockDocument1.getContext()).thenReturn("document");
        when(mockDocument1.getDocument()).thenReturn(mockDocument1);
        when(mockDocument1.isInline()).thenReturn(false);
        when(mockDocument1.isBlock()).thenReturn(true);
        ImmutableMap<String, Object> map1 = ImmutableMap.<String, Object>builder()
                .put("doctype", "article")
                .put("example-caption", "Example")
                .put("filetype", "html")
                .put("notitle", "")
                .put("prewrap", "")
                .build();
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
        ImmutableMap<Object, Object> map2 = ImmutableMap.<Object, Object>builder()
                .put("attributes", "{}")
                .put("header_footer", false)
                .build();
        when(mockDocument1.getOptions()).thenReturn(map2);
        return mockDocument1;
    }
    // end::mock-code[]
}
