package fr.jmini.asciidoctorj.converter.html;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.asciidoctor.ast.Block;
import org.asciidoctor.ast.Document;

import fr.jmini.asciidoctorj.converter.html.testing.AbstractListingCustomCounterTesting;

public class ListingCustomCounterTest extends AbstractListingCustomCounterTesting {

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
        Map<String, Object> map1 = new HashMap<>();
        map1.put("doctype", "article");
        map1.put("example-caption", "Example");
        map1.put("filetype", "html");
        map1.put("listing-caption", "Listing");
        map1.put("listing-number", "10");
        map1.put("notitle", "");
        map1.put("prewrap", "");
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
        Block mockBlock1 = mock(Block.class);
        when(mockBlock1.getId()).thenReturn(null);
        when(mockBlock1.getNodeName()).thenReturn("listing");
        when(mockBlock1.getContext()).thenReturn("listing");
        when(mockBlock1.getDocument()).thenReturn(mockDocument1);
        when(mockBlock1.isInline()).thenReturn(false);
        when(mockBlock1.isBlock()).thenReturn(true);
        Map<String, Object> map2 = new HashMap<>();
        map2.put("style", "listing");
        map2.put("title", "first caption");
        when(mockBlock1.getAttributes()).thenReturn(map2);
        when(mockBlock1.getRoles()).thenReturn(Collections.emptyList());
        when(mockBlock1.isReftext()).thenReturn(false);
        when(mockBlock1.getReftext()).thenReturn(null);
        when(mockBlock1.getTitle()).thenReturn("first caption");
        when(mockBlock1.getStyle()).thenReturn("listing");
        when(mockBlock1.getLevel()).thenReturn(0);
        when(mockBlock1.getContentModel()).thenReturn("verbatim");
        when(mockBlock1.getSourceLocation()).thenReturn(null);
        when(mockBlock1.getSubstitutions()).thenReturn(Collections.singletonList("specialcharacters"));
        when(mockBlock1.getBlocks()).thenReturn(Collections.emptyList());
        when(mockBlock1.getLines()).thenReturn(Collections.singletonList("First listing"));
        when(mockBlock1.getSource()).thenReturn("First listing");
        Block mockBlock2 = mock(Block.class);
        when(mockBlock2.getId()).thenReturn(null);
        when(mockBlock2.getNodeName()).thenReturn("listing");
        when(mockBlock2.getContext()).thenReturn("listing");
        when(mockBlock2.getDocument()).thenReturn(mockDocument1);
        when(mockBlock2.isInline()).thenReturn(false);
        when(mockBlock2.isBlock()).thenReturn(true);
        Map<String, Object> map3 = new HashMap<>();
        map3.put("style", "listing");
        map3.put("title", "second caption");
        when(mockBlock2.getAttributes()).thenReturn(map3);
        when(mockBlock2.getRoles()).thenReturn(Collections.emptyList());
        when(mockBlock2.isReftext()).thenReturn(false);
        when(mockBlock2.getReftext()).thenReturn(null);
        when(mockBlock2.getTitle()).thenReturn("second caption");
        when(mockBlock2.getStyle()).thenReturn("listing");
        when(mockBlock2.getLevel()).thenReturn(0);
        when(mockBlock2.getContentModel()).thenReturn("verbatim");
        when(mockBlock2.getSourceLocation()).thenReturn(null);
        when(mockBlock2.getSubstitutions()).thenReturn(Collections.singletonList("specialcharacters"));
        when(mockBlock2.getBlocks()).thenReturn(Collections.emptyList());
        when(mockBlock2.getLines()).thenReturn(Collections.singletonList("Second listing"));
        when(mockBlock2.getSource()).thenReturn("Second listing");
        when(mockDocument1.getBlocks()).thenReturn(Arrays.asList(mockBlock1, mockBlock2));
        when(mockDocument1.getStructuredDoctitle()).thenReturn(null);
        when(mockDocument1.getDoctitle()).thenReturn(null);
        Map<Object, Object> map4 = new HashMap<>();
        map4.put("attributes", "{}");
        map4.put("header_footer", false);
        when(mockDocument1.getOptions()).thenReturn(map4);
        return mockDocument1;
    }
    // end::mock-code[]
}