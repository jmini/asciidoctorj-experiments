package fr.jmini.asciidoctorj.converter.html;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;

import org.asciidoctor.ast.Block;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.Section;
import org.asciidoctor.ast.Title;

import com.google.common.collect.ImmutableMap;

import fr.jmini.asciidoctorj.converter.html.testing.AbstractSectionAllTesting;

public class SectionAllTest extends AbstractSectionAllTesting {

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
        Section mockSection1 = mock(Section.class);
        when(mockSection1.getId()).thenReturn("_section_1");
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
        when(mockSection1.getTitle()).thenReturn("Section 1");
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
        Section mockSection2 = mock(Section.class);
        when(mockSection2.getId()).thenReturn("_section_2");
        when(mockSection2.getNodeName()).thenReturn("section");
        when(mockSection2.getParent()).thenReturn(mockSection1);
        when(mockSection2.getContext()).thenReturn("section");
        when(mockSection2.getDocument()).thenReturn(mockDocument1);
        when(mockSection2.isInline()).thenReturn(false);
        when(mockSection2.isBlock()).thenReturn(true);
        when(mockSection2.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockSection2.getRoles()).thenReturn(Collections.emptyList());
        when(mockSection2.isReftext()).thenReturn(false);
        when(mockSection2.getReftext()).thenReturn(null);
        when(mockSection2.getTitle()).thenReturn("Section 2");
        when(mockSection2.getStyle()).thenReturn(null);
        when(mockSection2.getLevel()).thenReturn(2);
        when(mockSection2.getContentModel()).thenReturn("compound");
        when(mockSection2.getSourceLocation()).thenReturn(null);
        when(mockSection2.getSubstitutions()).thenReturn(Collections.emptyList());
        Block mockBlock2 = mock(Block.class);
        when(mockBlock2.getId()).thenReturn(null);
        when(mockBlock2.getNodeName()).thenReturn("paragraph");
        when(mockBlock2.getParent()).thenReturn(mockSection2);
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
        when(mockBlock2.getLevel()).thenReturn(2);
        when(mockBlock2.getContentModel()).thenReturn("simple");
        when(mockBlock2.getSourceLocation()).thenReturn(null);
        when(mockBlock2.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockBlock2.getBlocks()).thenReturn(Collections.emptyList());
        when(mockBlock2.getLines()).thenReturn(Collections.singletonList("Some text for 2."));
        when(mockBlock2.getSource()).thenReturn("Some text for 2.");
        Section mockSection3 = mock(Section.class);
        when(mockSection3.getId()).thenReturn("somesec");
        when(mockSection3.getNodeName()).thenReturn("section");
        when(mockSection3.getParent()).thenReturn(mockSection2);
        when(mockSection3.getContext()).thenReturn("section");
        when(mockSection3.getDocument()).thenReturn(mockDocument1);
        when(mockSection3.isInline()).thenReturn(false);
        when(mockSection3.isBlock()).thenReturn(true);
        when(mockSection3.getAttributes()).thenReturn(Collections.singletonMap("id", "somesec"));
        when(mockSection3.getRoles()).thenReturn(Collections.emptyList());
        when(mockSection3.isReftext()).thenReturn(false);
        when(mockSection3.getReftext()).thenReturn(null);
        when(mockSection3.getTitle()).thenReturn("Section 3");
        when(mockSection3.getStyle()).thenReturn(null);
        when(mockSection3.getLevel()).thenReturn(3);
        when(mockSection3.getContentModel()).thenReturn("compound");
        when(mockSection3.getSourceLocation()).thenReturn(null);
        when(mockSection3.getSubstitutions()).thenReturn(Collections.emptyList());
        Block mockBlock3 = mock(Block.class);
        when(mockBlock3.getId()).thenReturn(null);
        when(mockBlock3.getNodeName()).thenReturn("paragraph");
        when(mockBlock3.getParent()).thenReturn(mockSection3);
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
        when(mockBlock3.getLevel()).thenReturn(3);
        when(mockBlock3.getContentModel()).thenReturn("simple");
        when(mockBlock3.getSourceLocation()).thenReturn(null);
        when(mockBlock3.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockBlock3.getBlocks()).thenReturn(Collections.emptyList());
        when(mockBlock3.getLines()).thenReturn(Collections.singletonList("Some text for 3."));
        when(mockBlock3.getSource()).thenReturn("Some text for 3.");
        Section mockSection4 = mock(Section.class);
        when(mockSection4.getId()).thenReturn("_section_4");
        when(mockSection4.getNodeName()).thenReturn("section");
        when(mockSection4.getParent()).thenReturn(mockSection3);
        when(mockSection4.getContext()).thenReturn("section");
        when(mockSection4.getDocument()).thenReturn(mockDocument1);
        when(mockSection4.isInline()).thenReturn(false);
        when(mockSection4.isBlock()).thenReturn(true);
        when(mockSection4.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockSection4.getRoles()).thenReturn(Collections.emptyList());
        when(mockSection4.isReftext()).thenReturn(false);
        when(mockSection4.getReftext()).thenReturn(null);
        when(mockSection4.getTitle()).thenReturn("Section 4");
        when(mockSection4.getStyle()).thenReturn(null);
        when(mockSection4.getLevel()).thenReturn(4);
        when(mockSection4.getContentModel()).thenReturn("compound");
        when(mockSection4.getSourceLocation()).thenReturn(null);
        when(mockSection4.getSubstitutions()).thenReturn(Collections.emptyList());
        Block mockBlock4 = mock(Block.class);
        when(mockBlock4.getId()).thenReturn(null);
        when(mockBlock4.getNodeName()).thenReturn("paragraph");
        when(mockBlock4.getParent()).thenReturn(mockSection4);
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
        when(mockBlock4.getLevel()).thenReturn(4);
        when(mockBlock4.getContentModel()).thenReturn("simple");
        when(mockBlock4.getSourceLocation()).thenReturn(null);
        when(mockBlock4.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockBlock4.getBlocks()).thenReturn(Collections.emptyList());
        when(mockBlock4.getLines()).thenReturn(Collections.singletonList("Some text for 4."));
        when(mockBlock4.getSource()).thenReturn("Some text for 4.");
        Section mockSection5 = mock(Section.class);
        when(mockSection5.getId()).thenReturn("_section_5");
        when(mockSection5.getNodeName()).thenReturn("section");
        when(mockSection5.getParent()).thenReturn(mockSection4);
        when(mockSection5.getContext()).thenReturn("section");
        when(mockSection5.getDocument()).thenReturn(mockDocument1);
        when(mockSection5.isInline()).thenReturn(false);
        when(mockSection5.isBlock()).thenReturn(true);
        when(mockSection5.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockSection5.getRoles()).thenReturn(Collections.emptyList());
        when(mockSection5.isReftext()).thenReturn(false);
        when(mockSection5.getReftext()).thenReturn(null);
        when(mockSection5.getTitle()).thenReturn("Section 5");
        when(mockSection5.getStyle()).thenReturn(null);
        when(mockSection5.getLevel()).thenReturn(5);
        when(mockSection5.getContentModel()).thenReturn("compound");
        when(mockSection5.getSourceLocation()).thenReturn(null);
        when(mockSection5.getSubstitutions()).thenReturn(Collections.emptyList());
        Block mockBlock5 = mock(Block.class);
        when(mockBlock5.getId()).thenReturn(null);
        when(mockBlock5.getNodeName()).thenReturn("paragraph");
        when(mockBlock5.getParent()).thenReturn(mockSection5);
        when(mockBlock5.getContext()).thenReturn("paragraph");
        when(mockBlock5.getDocument()).thenReturn(mockDocument1);
        when(mockBlock5.isInline()).thenReturn(false);
        when(mockBlock5.isBlock()).thenReturn(true);
        when(mockBlock5.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockBlock5.getRoles()).thenReturn(Collections.emptyList());
        when(mockBlock5.isReftext()).thenReturn(false);
        when(mockBlock5.getReftext()).thenReturn(null);
        when(mockBlock5.getTitle()).thenReturn(null);
        when(mockBlock5.getStyle()).thenReturn(null);
        when(mockBlock5.getLevel()).thenReturn(5);
        when(mockBlock5.getContentModel()).thenReturn("simple");
        when(mockBlock5.getSourceLocation()).thenReturn(null);
        when(mockBlock5.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockBlock5.getBlocks()).thenReturn(Collections.emptyList());
        when(mockBlock5.getLines()).thenReturn(Collections.singletonList("Some text for 5."));
        when(mockBlock5.getSource()).thenReturn("Some text for 5.");
        when(mockSection5.getBlocks()).thenReturn(Collections.singletonList(mockBlock5));
        when(mockSection5.getIndex()).thenReturn(0);
        when(mockSection5.getNumber()).thenReturn(1);
        when(mockSection5.getSectionName()).thenReturn("section");
        when(mockSection5.isSpecial()).thenReturn(false);
        when(mockSection5.isNumbered()).thenReturn(false);
        when(mockSection4.getBlocks()).thenReturn(Arrays.asList(mockBlock4, mockSection5));
        when(mockSection4.getIndex()).thenReturn(0);
        when(mockSection4.getNumber()).thenReturn(1);
        when(mockSection4.getSectionName()).thenReturn("section");
        when(mockSection4.isSpecial()).thenReturn(false);
        when(mockSection4.isNumbered()).thenReturn(false);
        when(mockSection3.getBlocks()).thenReturn(Arrays.asList(mockBlock3, mockSection4));
        when(mockSection3.getIndex()).thenReturn(0);
        when(mockSection3.getNumber()).thenReturn(1);
        when(mockSection3.getSectionName()).thenReturn("section");
        when(mockSection3.isSpecial()).thenReturn(false);
        when(mockSection3.isNumbered()).thenReturn(false);
        when(mockSection2.getBlocks()).thenReturn(Arrays.asList(mockBlock2, mockSection3));
        when(mockSection2.getIndex()).thenReturn(0);
        when(mockSection2.getNumber()).thenReturn(1);
        when(mockSection2.getSectionName()).thenReturn("section");
        when(mockSection2.isSpecial()).thenReturn(false);
        when(mockSection2.isNumbered()).thenReturn(false);
        when(mockSection1.getBlocks()).thenReturn(Arrays.asList(mockBlock1, mockSection2));
        when(mockSection1.getIndex()).thenReturn(0);
        when(mockSection1.getNumber()).thenReturn(1);
        when(mockSection1.getSectionName()).thenReturn("section");
        when(mockSection1.isSpecial()).thenReturn(false);
        when(mockSection1.isNumbered()).thenReturn(false);
        when(mockDocument1.getBlocks()).thenReturn(Collections.singletonList(mockSection1));
        Title mockTitle1 = mock(Title.class);
        when(mockTitle1.getMain()).thenReturn("Section 1");
        when(mockTitle1.getSubtitle()).thenReturn(null);
        when(mockTitle1.getCombined()).thenReturn("Section 1");
        when(mockTitle1.isSanitized()).thenReturn(false);
        when(mockDocument1.getStructuredDoctitle()).thenReturn(mockTitle1);
        when(mockDocument1.getDoctitle()).thenReturn("Section 1");
        ImmutableMap<Object, Object> map2 = ImmutableMap.<Object, Object>builder()
                .put("attributes", "{}")
                .put("header_footer", false)
                .build();
        when(mockDocument1.getOptions()).thenReturn(map2);
        return mockDocument1;
    }
    // end::mock-code[]
}
