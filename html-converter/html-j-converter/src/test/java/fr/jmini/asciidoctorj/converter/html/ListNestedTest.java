package fr.jmini.asciidoctorj.converter.html;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;

import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.ListItem;

import com.google.common.collect.ImmutableMap;

import fr.jmini.asciidoctorj.converter.html.testing.AbstractListNestedTesting;

public class ListNestedTest extends AbstractListNestedTesting {

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
        org.asciidoctor.ast.List mockList1 = mock(org.asciidoctor.ast.List.class);
        when(mockList1.getId()).thenReturn(null);
        when(mockList1.getNodeName()).thenReturn("ulist");
        when(mockList1.getParent()).thenReturn(mockDocument1);
        when(mockList1.getContext()).thenReturn("ulist");
        when(mockList1.getDocument()).thenReturn(mockDocument1);
        when(mockList1.isInline()).thenReturn(false);
        when(mockList1.isBlock()).thenReturn(true);
        ImmutableMap<String, Object> map2 = ImmutableMap.<String, Object>builder()
                .put("1", "square")
                .put("style", "square")
                .build();
        when(mockList1.getAttributes()).thenReturn(map2);
        when(mockList1.getRoles()).thenReturn(Collections.emptyList());
        when(mockList1.isReftext()).thenReturn(false);
        when(mockList1.getReftext()).thenReturn(null);
        when(mockList1.getTitle()).thenReturn(null);
        when(mockList1.getStyle()).thenReturn("square");
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
        when(mockListItem1.getTitle()).thenReturn(null);
        when(mockListItem1.getStyle()).thenReturn(null);
        when(mockListItem1.getLevel()).thenReturn(1);
        when(mockListItem1.getContentModel()).thenReturn("compound");
        when(mockListItem1.getSourceLocation()).thenReturn(null);
        when(mockListItem1.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        org.asciidoctor.ast.List mockList2 = mock(org.asciidoctor.ast.List.class);
        when(mockList2.getId()).thenReturn(null);
        when(mockList2.getNodeName()).thenReturn("ulist");
        when(mockList2.getParent()).thenReturn(mockListItem1);
        when(mockList2.getContext()).thenReturn("ulist");
        when(mockList2.getDocument()).thenReturn(mockDocument1);
        when(mockList2.isInline()).thenReturn(false);
        when(mockList2.isBlock()).thenReturn(true);
        when(mockList2.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockList2.getRoles()).thenReturn(Collections.emptyList());
        when(mockList2.isReftext()).thenReturn(false);
        when(mockList2.getReftext()).thenReturn(null);
        when(mockList2.getTitle()).thenReturn(null);
        when(mockList2.getStyle()).thenReturn(null);
        when(mockList2.getLevel()).thenReturn(1);
        when(mockList2.getContentModel()).thenReturn("compound");
        when(mockList2.getSourceLocation()).thenReturn(null);
        when(mockList2.getSubstitutions()).thenReturn(Collections.emptyList());
        when(mockList2.getBlocks()).thenReturn(null);
        ListItem mockListItem2 = mock(ListItem.class);
        when(mockListItem2.getId()).thenReturn(null);
        when(mockListItem2.getNodeName()).thenReturn("list_item");
        when(mockListItem2.getParent()).thenReturn(mockList2);
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
        when(mockListItem2.getLevel()).thenReturn(1);
        when(mockListItem2.getContentModel()).thenReturn("compound");
        when(mockListItem2.getSourceLocation()).thenReturn(null);
        when(mockListItem2.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockListItem2.getBlocks()).thenReturn(Collections.emptyList());
        when(mockListItem2.getMarker()).thenReturn("**");
        when(mockListItem2.getText()).thenReturn("lorem");
        when(mockListItem2.getSource()).thenReturn("lorem");
        when(mockListItem2.hasText()).thenReturn(true);
        ListItem mockListItem3 = mock(ListItem.class);
        when(mockListItem3.getId()).thenReturn(null);
        when(mockListItem3.getNodeName()).thenReturn("list_item");
        when(mockListItem3.getParent()).thenReturn(mockList2);
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
        when(mockListItem3.getLevel()).thenReturn(1);
        when(mockListItem3.getContentModel()).thenReturn("compound");
        when(mockListItem3.getSourceLocation()).thenReturn(null);
        when(mockListItem3.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockListItem3.getBlocks()).thenReturn(Collections.emptyList());
        when(mockListItem3.getMarker()).thenReturn("**");
        when(mockListItem3.getText()).thenReturn("ipsum");
        when(mockListItem3.getSource()).thenReturn("ipsum");
        when(mockListItem3.hasText()).thenReturn(true);
        when(mockList2.getItems()).thenReturn(Arrays.asList(mockListItem2, mockListItem3));
        when(mockList2.hasItems()).thenReturn(true);
        when(mockListItem1.getBlocks()).thenReturn(Collections.singletonList(mockList2));
        when(mockListItem1.getMarker()).thenReturn("*");
        when(mockListItem1.getText()).thenReturn("Main 1");
        when(mockListItem1.getSource()).thenReturn("Main 1");
        when(mockListItem1.hasText()).thenReturn(true);
        ListItem mockListItem4 = mock(ListItem.class);
        when(mockListItem4.getId()).thenReturn(null);
        when(mockListItem4.getNodeName()).thenReturn("list_item");
        when(mockListItem4.getParent()).thenReturn(mockList1);
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
        when(mockListItem4.getLevel()).thenReturn(1);
        when(mockListItem4.getContentModel()).thenReturn("compound");
        when(mockListItem4.getSourceLocation()).thenReturn(null);
        when(mockListItem4.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        org.asciidoctor.ast.List mockList3 = mock(org.asciidoctor.ast.List.class);
        when(mockList3.getId()).thenReturn(null);
        when(mockList3.getNodeName()).thenReturn("olist");
        when(mockList3.getParent()).thenReturn(mockListItem4);
        when(mockList3.getContext()).thenReturn("olist");
        when(mockList3.getDocument()).thenReturn(mockDocument1);
        when(mockList3.isInline()).thenReturn(false);
        when(mockList3.isBlock()).thenReturn(true);
        when(mockList3.getAttributes()).thenReturn(Collections.singletonMap("style", "arabic"));
        when(mockList3.getRoles()).thenReturn(Collections.emptyList());
        when(mockList3.isReftext()).thenReturn(false);
        when(mockList3.getReftext()).thenReturn(null);
        when(mockList3.getTitle()).thenReturn(null);
        when(mockList3.getStyle()).thenReturn("arabic");
        when(mockList3.getLevel()).thenReturn(1);
        when(mockList3.getContentModel()).thenReturn("compound");
        when(mockList3.getSourceLocation()).thenReturn(null);
        when(mockList3.getSubstitutions()).thenReturn(Collections.emptyList());
        when(mockList3.getBlocks()).thenReturn(null);
        ListItem mockListItem5 = mock(ListItem.class);
        when(mockListItem5.getId()).thenReturn(null);
        when(mockListItem5.getNodeName()).thenReturn("list_item");
        when(mockListItem5.getParent()).thenReturn(mockList3);
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
        when(mockListItem5.getLevel()).thenReturn(1);
        when(mockListItem5.getContentModel()).thenReturn("compound");
        when(mockListItem5.getSourceLocation()).thenReturn(null);
        when(mockListItem5.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockListItem5.getBlocks()).thenReturn(Collections.emptyList());
        when(mockListItem5.getMarker()).thenReturn(".");
        when(mockListItem5.getText()).thenReturn("one");
        when(mockListItem5.getSource()).thenReturn("one");
        when(mockListItem5.hasText()).thenReturn(true);
        ListItem mockListItem6 = mock(ListItem.class);
        when(mockListItem6.getId()).thenReturn(null);
        when(mockListItem6.getNodeName()).thenReturn("list_item");
        when(mockListItem6.getParent()).thenReturn(mockList3);
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
        when(mockListItem6.getLevel()).thenReturn(1);
        when(mockListItem6.getContentModel()).thenReturn("compound");
        when(mockListItem6.getSourceLocation()).thenReturn(null);
        when(mockListItem6.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockListItem6.getBlocks()).thenReturn(Collections.emptyList());
        when(mockListItem6.getMarker()).thenReturn(".");
        when(mockListItem6.getText()).thenReturn("two");
        when(mockListItem6.getSource()).thenReturn("two");
        when(mockListItem6.hasText()).thenReturn(true);
        when(mockList3.getItems()).thenReturn(Arrays.asList(mockListItem5, mockListItem6));
        when(mockList3.hasItems()).thenReturn(true);
        when(mockListItem4.getBlocks()).thenReturn(Collections.singletonList(mockList3));
        when(mockListItem4.getMarker()).thenReturn("*");
        when(mockListItem4.getText()).thenReturn("Main 2");
        when(mockListItem4.getSource()).thenReturn("Main 2");
        when(mockListItem4.hasText()).thenReturn(true);
        ListItem mockListItem7 = mock(ListItem.class);
        when(mockListItem7.getId()).thenReturn(null);
        when(mockListItem7.getNodeName()).thenReturn("list_item");
        when(mockListItem7.getParent()).thenReturn(mockList1);
        when(mockListItem7.getContext()).thenReturn("list_item");
        when(mockListItem7.getDocument()).thenReturn(mockDocument1);
        when(mockListItem7.isInline()).thenReturn(false);
        when(mockListItem7.isBlock()).thenReturn(true);
        when(mockListItem7.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockListItem7.getRoles()).thenReturn(Collections.emptyList());
        when(mockListItem7.isReftext()).thenReturn(false);
        when(mockListItem7.getReftext()).thenReturn(null);
        when(mockListItem7.getTitle()).thenReturn(null);
        when(mockListItem7.getStyle()).thenReturn(null);
        when(mockListItem7.getLevel()).thenReturn(1);
        when(mockListItem7.getContentModel()).thenReturn("compound");
        when(mockListItem7.getSourceLocation()).thenReturn(null);
        when(mockListItem7.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        org.asciidoctor.ast.List mockList4 = mock(org.asciidoctor.ast.List.class);
        when(mockList4.getId()).thenReturn(null);
        when(mockList4.getNodeName()).thenReturn("ulist");
        when(mockList4.getParent()).thenReturn(mockListItem7);
        when(mockList4.getContext()).thenReturn("ulist");
        when(mockList4.getDocument()).thenReturn(mockDocument1);
        when(mockList4.isInline()).thenReturn(false);
        when(mockList4.isBlock()).thenReturn(true);
        when(mockList4.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockList4.getRoles()).thenReturn(Collections.emptyList());
        when(mockList4.isReftext()).thenReturn(false);
        when(mockList4.getReftext()).thenReturn(null);
        when(mockList4.getTitle()).thenReturn(null);
        when(mockList4.getStyle()).thenReturn(null);
        when(mockList4.getLevel()).thenReturn(1);
        when(mockList4.getContentModel()).thenReturn("compound");
        when(mockList4.getSourceLocation()).thenReturn(null);
        when(mockList4.getSubstitutions()).thenReturn(Collections.emptyList());
        when(mockList4.getBlocks()).thenReturn(null);
        ListItem mockListItem8 = mock(ListItem.class);
        when(mockListItem8.getId()).thenReturn(null);
        when(mockListItem8.getNodeName()).thenReturn("list_item");
        when(mockListItem8.getParent()).thenReturn(mockList4);
        when(mockListItem8.getContext()).thenReturn("list_item");
        when(mockListItem8.getDocument()).thenReturn(mockDocument1);
        when(mockListItem8.isInline()).thenReturn(false);
        when(mockListItem8.isBlock()).thenReturn(true);
        when(mockListItem8.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockListItem8.getRoles()).thenReturn(Collections.emptyList());
        when(mockListItem8.isReftext()).thenReturn(false);
        when(mockListItem8.getReftext()).thenReturn(null);
        when(mockListItem8.getTitle()).thenReturn(null);
        when(mockListItem8.getStyle()).thenReturn(null);
        when(mockListItem8.getLevel()).thenReturn(1);
        when(mockListItem8.getContentModel()).thenReturn("compound");
        when(mockListItem8.getSourceLocation()).thenReturn(null);
        when(mockListItem8.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        org.asciidoctor.ast.List mockList5 = mock(org.asciidoctor.ast.List.class);
        when(mockList5.getId()).thenReturn(null);
        when(mockList5.getNodeName()).thenReturn("ulist");
        when(mockList5.getParent()).thenReturn(mockListItem8);
        when(mockList5.getContext()).thenReturn("ulist");
        when(mockList5.getDocument()).thenReturn(mockDocument1);
        when(mockList5.isInline()).thenReturn(false);
        when(mockList5.isBlock()).thenReturn(true);
        when(mockList5.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockList5.getRoles()).thenReturn(Collections.emptyList());
        when(mockList5.isReftext()).thenReturn(false);
        when(mockList5.getReftext()).thenReturn(null);
        when(mockList5.getTitle()).thenReturn(null);
        when(mockList5.getStyle()).thenReturn(null);
        when(mockList5.getLevel()).thenReturn(1);
        when(mockList5.getContentModel()).thenReturn("compound");
        when(mockList5.getSourceLocation()).thenReturn(null);
        when(mockList5.getSubstitutions()).thenReturn(Collections.emptyList());
        when(mockList5.getBlocks()).thenReturn(null);
        ListItem mockListItem9 = mock(ListItem.class);
        when(mockListItem9.getId()).thenReturn(null);
        when(mockListItem9.getNodeName()).thenReturn("list_item");
        when(mockListItem9.getParent()).thenReturn(mockList5);
        when(mockListItem9.getContext()).thenReturn("list_item");
        when(mockListItem9.getDocument()).thenReturn(mockDocument1);
        when(mockListItem9.isInline()).thenReturn(false);
        when(mockListItem9.isBlock()).thenReturn(true);
        when(mockListItem9.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockListItem9.getRoles()).thenReturn(Collections.emptyList());
        when(mockListItem9.isReftext()).thenReturn(false);
        when(mockListItem9.getReftext()).thenReturn(null);
        when(mockListItem9.getTitle()).thenReturn(null);
        when(mockListItem9.getStyle()).thenReturn(null);
        when(mockListItem9.getLevel()).thenReturn(1);
        when(mockListItem9.getContentModel()).thenReturn("compound");
        when(mockListItem9.getSourceLocation()).thenReturn(null);
        when(mockListItem9.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        org.asciidoctor.ast.List mockList6 = mock(org.asciidoctor.ast.List.class);
        when(mockList6.getId()).thenReturn(null);
        when(mockList6.getNodeName()).thenReturn("ulist");
        when(mockList6.getParent()).thenReturn(mockListItem9);
        when(mockList6.getContext()).thenReturn("ulist");
        when(mockList6.getDocument()).thenReturn(mockDocument1);
        when(mockList6.isInline()).thenReturn(false);
        when(mockList6.isBlock()).thenReturn(true);
        when(mockList6.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockList6.getRoles()).thenReturn(Collections.emptyList());
        when(mockList6.isReftext()).thenReturn(false);
        when(mockList6.getReftext()).thenReturn(null);
        when(mockList6.getTitle()).thenReturn(null);
        when(mockList6.getStyle()).thenReturn(null);
        when(mockList6.getLevel()).thenReturn(1);
        when(mockList6.getContentModel()).thenReturn("compound");
        when(mockList6.getSourceLocation()).thenReturn(null);
        when(mockList6.getSubstitutions()).thenReturn(Collections.emptyList());
        when(mockList6.getBlocks()).thenReturn(null);
        ListItem mockListItem10 = mock(ListItem.class);
        when(mockListItem10.getId()).thenReturn(null);
        when(mockListItem10.getNodeName()).thenReturn("list_item");
        when(mockListItem10.getParent()).thenReturn(mockList6);
        when(mockListItem10.getContext()).thenReturn("list_item");
        when(mockListItem10.getDocument()).thenReturn(mockDocument1);
        when(mockListItem10.isInline()).thenReturn(false);
        when(mockListItem10.isBlock()).thenReturn(true);
        when(mockListItem10.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockListItem10.getRoles()).thenReturn(Collections.emptyList());
        when(mockListItem10.isReftext()).thenReturn(false);
        when(mockListItem10.getReftext()).thenReturn(null);
        when(mockListItem10.getTitle()).thenReturn(null);
        when(mockListItem10.getStyle()).thenReturn(null);
        when(mockListItem10.getLevel()).thenReturn(1);
        when(mockListItem10.getContentModel()).thenReturn("compound");
        when(mockListItem10.getSourceLocation()).thenReturn(null);
        when(mockListItem10.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockListItem10.getBlocks()).thenReturn(Collections.emptyList());
        when(mockListItem10.getMarker()).thenReturn("****");
        when(mockListItem10.getText()).thenReturn("z");
        when(mockListItem10.getSource()).thenReturn("z");
        when(mockListItem10.hasText()).thenReturn(true);
        when(mockList6.getItems()).thenReturn(Collections.singletonList(mockListItem10));
        when(mockList6.hasItems()).thenReturn(true);
        when(mockListItem9.getBlocks()).thenReturn(Collections.singletonList(mockList6));
        when(mockListItem9.getMarker()).thenReturn("***");
        when(mockListItem9.getText()).thenReturn("y");
        when(mockListItem9.getSource()).thenReturn("y");
        when(mockListItem9.hasText()).thenReturn(true);
        when(mockList5.getItems()).thenReturn(Collections.singletonList(mockListItem9));
        when(mockList5.hasItems()).thenReturn(true);
        when(mockListItem8.getBlocks()).thenReturn(Collections.singletonList(mockList5));
        when(mockListItem8.getMarker()).thenReturn("**");
        when(mockListItem8.getText()).thenReturn("x");
        when(mockListItem8.getSource()).thenReturn("x");
        when(mockListItem8.hasText()).thenReturn(true);
        when(mockList4.getItems()).thenReturn(Collections.singletonList(mockListItem8));
        when(mockList4.hasItems()).thenReturn(true);
        when(mockListItem7.getBlocks()).thenReturn(Collections.singletonList(mockList4));
        when(mockListItem7.getMarker()).thenReturn("*");
        when(mockListItem7.getText()).thenReturn("Main 3");
        when(mockListItem7.getSource()).thenReturn("Main 3");
        when(mockListItem7.hasText()).thenReturn(true);
        ListItem mockListItem11 = mock(ListItem.class);
        when(mockListItem11.getId()).thenReturn(null);
        when(mockListItem11.getNodeName()).thenReturn("list_item");
        when(mockListItem11.getParent()).thenReturn(mockList1);
        when(mockListItem11.getContext()).thenReturn("list_item");
        when(mockListItem11.getDocument()).thenReturn(mockDocument1);
        when(mockListItem11.isInline()).thenReturn(false);
        when(mockListItem11.isBlock()).thenReturn(true);
        when(mockListItem11.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockListItem11.getRoles()).thenReturn(Collections.emptyList());
        when(mockListItem11.isReftext()).thenReturn(false);
        when(mockListItem11.getReftext()).thenReturn(null);
        when(mockListItem11.getTitle()).thenReturn(null);
        when(mockListItem11.getStyle()).thenReturn(null);
        when(mockListItem11.getLevel()).thenReturn(1);
        when(mockListItem11.getContentModel()).thenReturn("compound");
        when(mockListItem11.getSourceLocation()).thenReturn(null);
        when(mockListItem11.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockListItem11.getBlocks()).thenReturn(Collections.emptyList());
        when(mockListItem11.getMarker()).thenReturn("*");
        when(mockListItem11.getText()).thenReturn("Main 4");
        when(mockListItem11.getSource()).thenReturn("Main 4");
        when(mockListItem11.hasText()).thenReturn(true);
        when(mockList1.getItems()).thenReturn(Arrays.asList(mockListItem1, mockListItem4, mockListItem7, mockListItem11));
        when(mockList1.hasItems()).thenReturn(true);
        when(mockDocument1.getBlocks()).thenReturn(Collections.singletonList(mockList1));
        when(mockDocument1.getStructuredDoctitle()).thenReturn(null);
        when(mockDocument1.getDoctitle()).thenReturn(null);
        ImmutableMap<Object, Object> map3 = ImmutableMap.<Object, Object>builder()
                .put("attributes", "{}")
                .put("header_footer", false)
                .build();
        when(mockDocument1.getOptions()).thenReturn(map3);
        return mockDocument1;
    }
    // end::mock-code[]
}