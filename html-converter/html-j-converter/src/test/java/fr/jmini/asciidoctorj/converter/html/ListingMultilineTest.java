package fr.jmini.asciidoctorj.converter.html;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;

import org.asciidoctor.ast.Block;
import org.asciidoctor.ast.Document;

import com.google.common.collect.ImmutableMap;

import fr.jmini.asciidoctorj.converter.html.testing.AbstractListingMultilineTesting;

public class ListingMultilineTest extends AbstractListingMultilineTesting {

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
        Block mockBlock1 = mock(Block.class);
        when(mockBlock1.getId()).thenReturn("lstsome");
        when(mockBlock1.getNodeName()).thenReturn("listing");
        when(mockBlock1.getContext()).thenReturn("listing");
        when(mockBlock1.getDocument()).thenReturn(mockDocument1);
        when(mockBlock1.isInline()).thenReturn(false);
        when(mockBlock1.isBlock()).thenReturn(true);
        ImmutableMap<String, Object> map2 = ImmutableMap.<String, Object>builder()
                .put("id", "lstsome")
                .put("reftext", "some listing")
                .put("style", "listing")
                .put("title", "this is a caption")
                .build();
        when(mockBlock1.getAttributes()).thenReturn(map2);
        when(mockBlock1.getRoles()).thenReturn(Collections.emptyList());
        when(mockBlock1.isReftext()).thenReturn(true);
        when(mockBlock1.getReftext()).thenReturn("some listing");
        when(mockBlock1.getTitle()).thenReturn("this is a caption");
        when(mockBlock1.getStyle()).thenReturn("listing");
        when(mockBlock1.getLevel()).thenReturn(0);
        when(mockBlock1.getContentModel()).thenReturn("verbatim");
        when(mockBlock1.getSourceLocation()).thenReturn(null);
        when(mockBlock1.getSubstitutions()).thenReturn(Collections.singletonList("specialcharacters"));
        when(mockBlock1.getBlocks()).thenReturn(Collections.emptyList());
        when(mockBlock1.getLines()).thenReturn(Arrays.asList("Line one", "Line two"));
        when(mockBlock1.getSource()).thenReturn("Line one\n" +
                "Line two");
        when(mockDocument1.getBlocks()).thenReturn(Collections.singletonList(mockBlock1));
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
