package fr.jmini.asciidoctorj.converter.html;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.asciidoctor.ast.Block;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.Section;
import org.asciidoctor.ast.Title;

import fr.jmini.asciidoctorj.converter.html.testing.AbstractSectionTesting;

public class SectionTest extends AbstractSectionTesting {

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
        Section mockSection1 = mock(Section.class);
        when(mockSection1.getId()).thenReturn("_first_section");
        when(mockSection1.getNodeName()).thenReturn("section");
        when(mockSection1.getParent()).thenReturn(mockDocument1);
        when(mockSection1.getContext()).thenReturn("section");
        when(mockSection1.getDocument()).thenReturn(mockDocument1);
        when(mockSection1.isInline()).thenReturn(false);
        when(mockSection1.isBlock()).thenReturn(true);
        when(mockSection1.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockSection1.getRoles()).thenReturn(Collections.emptyList());
        when(mockSection1.isReftext()).thenReturn(false);
        when(mockSection1.getReftext()).thenReturn(null);
        when(mockSection1.getTitle()).thenReturn("First Section");
        when(mockSection1.getStyle()).thenReturn(null);
        when(mockSection1.getLevel()).thenReturn(1);
        when(mockSection1.getContentModel()).thenReturn("compound");
        when(mockSection1.getSourceLocation()).thenReturn(null);
        when(mockSection1.getSubstitutions()).thenReturn(Collections.emptyList());
        Block mockBlock1 = mock(Block.class);
        when(mockBlock1.getId()).thenReturn(null);
        when(mockBlock1.getNodeName()).thenReturn("paragraph");
        when(mockBlock1.getParent()).thenReturn(mockSection1);
        when(mockBlock1.getContext()).thenReturn("paragraph");
        when(mockBlock1.getDocument()).thenReturn(mockDocument1);
        when(mockBlock1.isInline()).thenReturn(false);
        when(mockBlock1.isBlock()).thenReturn(true);
        when(mockBlock1.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockBlock1.getRoles()).thenReturn(Collections.emptyList());
        when(mockBlock1.isReftext()).thenReturn(false);
        when(mockBlock1.getReftext()).thenReturn(null);
        when(mockBlock1.getTitle()).thenReturn(null);
        when(mockBlock1.getStyle()).thenReturn(null);
        when(mockBlock1.getLevel()).thenReturn(1);
        when(mockBlock1.getContentModel()).thenReturn("simple");
        when(mockBlock1.getSourceLocation()).thenReturn(null);
        when(mockBlock1.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockBlock1.getBlocks()).thenReturn(Collections.emptyList());
        when(mockBlock1.getLines()).thenReturn(Collections.singletonList("Some text for 1."));
        when(mockBlock1.getSource()).thenReturn("Some text for 1.");
        Block mockBlock2 = mock(Block.class);
        when(mockBlock2.getId()).thenReturn(null);
        when(mockBlock2.getNodeName()).thenReturn("paragraph");
        when(mockBlock2.getParent()).thenReturn(mockSection1);
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
        when(mockBlock2.getLevel()).thenReturn(1);
        when(mockBlock2.getContentModel()).thenReturn("simple");
        when(mockBlock2.getSourceLocation()).thenReturn(null);
        when(mockBlock2.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockBlock2.getBlocks()).thenReturn(Collections.emptyList());
        when(mockBlock2.getLines()).thenReturn(Collections.singletonList("Additional text for 1."));
        when(mockBlock2.getSource()).thenReturn("Additional text for 1.");
        when(mockSection1.getBlocks()).thenReturn(Arrays.asList(mockBlock1, mockBlock2));
        when(mockSection1.getIndex()).thenReturn(0);
        when(mockSection1.getNumber()).thenReturn(1);
        when(mockSection1.getSectionName()).thenReturn("section");
        when(mockSection1.isSpecial()).thenReturn(false);
        when(mockSection1.isNumbered()).thenReturn(false);
        Section mockSection2 = mock(Section.class);
        when(mockSection2.getId()).thenReturn("someid");
        when(mockSection2.getNodeName()).thenReturn("section");
        when(mockSection2.getParent()).thenReturn(mockDocument1);
        when(mockSection2.getContext()).thenReturn("section");
        when(mockSection2.getDocument()).thenReturn(mockDocument1);
        when(mockSection2.isInline()).thenReturn(false);
        when(mockSection2.isBlock()).thenReturn(true);
        Map<String, Object> map2 = new HashMap<>();
        map2.put("1", "#someid.somerole");
        map2.put("id", "someid");
        map2.put("role", "somerole");
        when(mockSection2.getAttributes()).thenReturn(map2);
        when(mockSection2.getRoles()).thenReturn(Collections.singletonList("somerole"));
        when(mockSection2.isReftext()).thenReturn(false);
        when(mockSection2.getReftext()).thenReturn(null);
        when(mockSection2.getTitle()).thenReturn("Second Section");
        when(mockSection2.getStyle()).thenReturn(null);
        when(mockSection2.getLevel()).thenReturn(1);
        when(mockSection2.getContentModel()).thenReturn("compound");
        when(mockSection2.getSourceLocation()).thenReturn(null);
        when(mockSection2.getSubstitutions()).thenReturn(Collections.emptyList());
        Block mockBlock3 = mock(Block.class);
        when(mockBlock3.getId()).thenReturn(null);
        when(mockBlock3.getNodeName()).thenReturn("paragraph");
        when(mockBlock3.getParent()).thenReturn(mockSection2);
        when(mockBlock3.getContext()).thenReturn("paragraph");
        when(mockBlock3.getDocument()).thenReturn(mockDocument1);
        when(mockBlock3.isInline()).thenReturn(false);
        when(mockBlock3.isBlock()).thenReturn(true);
        when(mockBlock3.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockBlock3.getRoles()).thenReturn(Collections.emptyList());
        when(mockBlock3.isReftext()).thenReturn(false);
        when(mockBlock3.getReftext()).thenReturn(null);
        when(mockBlock3.getTitle()).thenReturn(null);
        when(mockBlock3.getStyle()).thenReturn(null);
        when(mockBlock3.getLevel()).thenReturn(1);
        when(mockBlock3.getContentModel()).thenReturn("simple");
        when(mockBlock3.getSourceLocation()).thenReturn(null);
        when(mockBlock3.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockBlock3.getBlocks()).thenReturn(Collections.emptyList());
        when(mockBlock3.getLines()).thenReturn(Collections.singletonList("Some text for 2."));
        when(mockBlock3.getSource()).thenReturn("Some text for 2.");
        when(mockSection2.getBlocks()).thenReturn(Collections.singletonList(mockBlock3));
        when(mockSection2.getIndex()).thenReturn(1);
        when(mockSection2.getNumber()).thenReturn(1);
        when(mockSection2.getSectionName()).thenReturn("section");
        when(mockSection2.isSpecial()).thenReturn(false);
        when(mockSection2.isNumbered()).thenReturn(false);
        when(mockDocument1.getBlocks()).thenReturn(Arrays.asList(mockSection1, mockSection2));
        Title mockTitle1 = mock(Title.class);
        when(mockTitle1.getMain()).thenReturn("First Section");
        when(mockTitle1.getSubtitle()).thenReturn(null);
        when(mockTitle1.getCombined()).thenReturn("First Section");
        when(mockTitle1.isSanitized()).thenReturn(false);
        when(mockDocument1.getStructuredDoctitle()).thenReturn(mockTitle1);
        when(mockDocument1.getDoctitle()).thenReturn("First Section");
        Map<Object, Object> map3 = new HashMap<>();
        map3.put("attributes", "{}");
        map3.put("header_footer", false);
        when(mockDocument1.getOptions()).thenReturn(map3);
        return mockDocument1;
    }
    // end::mock-code[]
}
