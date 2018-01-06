package fr.jmini.asciidoctorj.converter.html;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.asciidoctor.ast.Block;
import org.asciidoctor.ast.Document;

import fr.jmini.asciidoctorj.converter.html.testing.AbstractExampleNestedTesting;

public class ExampleNestedTest extends AbstractExampleNestedTesting {

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
        Block mockBlock1 = mock(Block.class);
        when(mockBlock1.getId()).thenReturn(null);
        when(mockBlock1.getNodeName()).thenReturn("example");
        when(mockBlock1.getContext()).thenReturn("example");
        when(mockBlock1.getDocument()).thenReturn(mockDocument1);
        when(mockBlock1.isInline()).thenReturn(false);
        when(mockBlock1.isBlock()).thenReturn(true);
        Map<String, Object> map2 = new HashMap<>();
        map2.put("style", "example");
        map2.put("title", "Sample document");
        when(mockBlock1.getAttributes()).thenReturn(map2);
        when(mockBlock1.getRoles()).thenReturn(Collections.emptyList());
        when(mockBlock1.isReftext()).thenReturn(false);
        when(mockBlock1.getReftext()).thenReturn(null);
        when(mockBlock1.getTitle()).thenReturn("Sample document");
        when(mockBlock1.getStyle()).thenReturn("example");
        when(mockBlock1.getLevel()).thenReturn(0);
        when(mockBlock1.getContentModel()).thenReturn("compound");
        when(mockBlock1.getSourceLocation()).thenReturn(null);
        when(mockBlock1.getSubstitutions()).thenReturn(Collections.emptyList());
        Block mockBlock2 = mock(Block.class);
        when(mockBlock2.getId()).thenReturn(null);
        when(mockBlock2.getNodeName()).thenReturn("paragraph");
        when(mockBlock2.getContext()).thenReturn("paragraph");
        when(mockBlock2.getDocument()).thenReturn(mockDocument1);
        when(mockBlock2.isInline()).thenReturn(false);
        when(mockBlock2.isBlock()).thenReturn(true);
        when(mockBlock2.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockBlock2.getRoles()).thenReturn(Collections.emptyList());
        when(mockBlock2.isReftext()).thenReturn(false);
        when(mockBlock2.getReftext()).thenReturn(null);
        when(mockBlock2.getTitle()).thenReturn(null);
        when(mockBlock2.getStyle()).thenReturn(null);
        when(mockBlock2.getLevel()).thenReturn(0);
        when(mockBlock2.getContentModel()).thenReturn("simple");
        when(mockBlock2.getSourceLocation()).thenReturn(null);
        when(mockBlock2.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockBlock2.getBlocks()).thenReturn(Collections.emptyList());
        when(mockBlock2.getLines()).thenReturn(Collections.singletonList("Here is a sample AsciiDoc document:"));
        when(mockBlock2.getSource()).thenReturn("Here is a sample AsciiDoc document:");
        Block mockBlock3 = mock(Block.class);
        when(mockBlock3.getId()).thenReturn(null);
        when(mockBlock3.getNodeName()).thenReturn("listing");
        when(mockBlock3.getContext()).thenReturn("listing");
        when(mockBlock3.getDocument()).thenReturn(mockDocument1);
        when(mockBlock3.isInline()).thenReturn(false);
        when(mockBlock3.isBlock()).thenReturn(true);
        Map<String, Object> map3 = new HashMap<>();
        map3.put("1", "listing");
        map3.put("style", "listing");
        when(mockBlock3.getAttributes()).thenReturn(map3);
        when(mockBlock3.getRoles()).thenReturn(Collections.emptyList());
        when(mockBlock3.isReftext()).thenReturn(false);
        when(mockBlock3.getReftext()).thenReturn(null);
        when(mockBlock3.getTitle()).thenReturn(null);
        when(mockBlock3.getStyle()).thenReturn("listing");
        when(mockBlock3.getLevel()).thenReturn(0);
        when(mockBlock3.getContentModel()).thenReturn("verbatim");
        when(mockBlock3.getSourceLocation()).thenReturn(null);
        when(mockBlock3.getSubstitutions()).thenReturn(Collections.singletonList("specialcharacters"));
        when(mockBlock3.getBlocks()).thenReturn(Collections.emptyList());
        when(mockBlock3.getLines()).thenReturn(Arrays.asList("= Title of Document", "Doc Writer", ":toc:", "", "This guide provides..."));
        when(mockBlock3.getSource()).thenReturn("= Title of Document\n" +
                "Doc Writer\n" +
                ":toc:\n" +
                "\n" +
                "This guide provides...");
        Block mockBlock4 = mock(Block.class);
        when(mockBlock4.getId()).thenReturn(null);
        when(mockBlock4.getNodeName()).thenReturn("paragraph");
        when(mockBlock4.getContext()).thenReturn("paragraph");
        when(mockBlock4.getDocument()).thenReturn(mockDocument1);
        when(mockBlock4.isInline()).thenReturn(false);
        when(mockBlock4.isBlock()).thenReturn(true);
        when(mockBlock4.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockBlock4.getRoles()).thenReturn(Collections.emptyList());
        when(mockBlock4.isReftext()).thenReturn(false);
        when(mockBlock4.getReftext()).thenReturn(null);
        when(mockBlock4.getTitle()).thenReturn(null);
        when(mockBlock4.getStyle()).thenReturn(null);
        when(mockBlock4.getLevel()).thenReturn(0);
        when(mockBlock4.getContentModel()).thenReturn("simple");
        when(mockBlock4.getSourceLocation()).thenReturn(null);
        when(mockBlock4.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockBlock4.getBlocks()).thenReturn(Collections.emptyList());
        when(mockBlock4.getLines()).thenReturn(Collections.singletonList("The document header is useful, but not required."));
        when(mockBlock4.getSource()).thenReturn("The document header is useful, but not required.");
        when(mockBlock1.getBlocks()).thenReturn(Arrays.asList(mockBlock2, mockBlock3, mockBlock4));
        when(mockBlock1.getLines()).thenReturn(Collections.emptyList());
        when(mockBlock1.getSource()).thenReturn("");
        when(mockDocument1.getBlocks()).thenReturn(Collections.singletonList(mockBlock1));
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
