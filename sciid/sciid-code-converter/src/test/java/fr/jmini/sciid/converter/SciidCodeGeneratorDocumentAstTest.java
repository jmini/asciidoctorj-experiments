package fr.jmini.sciid.converter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;

import org.asciidoctor.ast.Block;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.ListItem;
import org.asciidoctor.ast.Section;
import org.asciidoctor.ast.Title;
import org.junit.Test;

import com.google.common.collect.ImmutableMap;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.sciid.SBlock;
import fr.jmini.sciid.SDocument;
import fr.jmini.sciid.SList;
import fr.jmini.sciid.SListItem;
import fr.jmini.sciid.SSection;
import fr.jmini.sciid.STitle;
import fr.jmini.sciid.SciidFactory;

/* tag::input-asciidoc[]
== A small List

Lorem ipsum dolor sit amet:

* First item
* Second item

Ut commodo lorem nec lacinia finibus.

end::input-asciidoc[] */
public class SciidCodeGeneratorDocumentAstTest {

    @Test
    public void testAst() throws Exception {
        Document mockDocument1 = createMock();
        checkAst(mockDocument1);

        SciidCodeGenerator generator = new SciidCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createDocumentCode(sb, mockDocument1);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());

        SDocument eDocument = createSciidObject();
        checkAst(eDocument);
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
        when(mockSection1.getId()).thenReturn("_a_small_list");
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
        when(mockSection1.getTitle()).thenReturn("A small List");
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
        when(mockBlock1.getLines()).thenReturn(Collections.singletonList("Lorem ipsum dolor sit amet:"));
        when(mockBlock1.getSource()).thenReturn("Lorem ipsum dolor sit amet:");
        org.asciidoctor.ast.List mockList1 = mock(org.asciidoctor.ast.List.class);
        when(mockList1.getId()).thenReturn(null);
        when(mockList1.getNodeName()).thenReturn("ulist");
        when(mockList1.getParent()).thenReturn(mockSection1);
        when(mockList1.getContext()).thenReturn("ulist");
        when(mockList1.getDocument()).thenReturn(mockDocument1);
        when(mockList1.isInline()).thenReturn(false);
        when(mockList1.isBlock()).thenReturn(true);
        when(mockList1.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockList1.getRoles()).thenReturn(Collections.emptyList());
        when(mockList1.isReftext()).thenReturn(false);
        when(mockList1.getReftext()).thenReturn(null);
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
        when(mockListItem1.getTitle()).thenReturn(null);
        when(mockListItem1.getStyle()).thenReturn(null);
        when(mockListItem1.getLevel()).thenReturn(1);
        when(mockListItem1.getContentModel()).thenReturn("compound");
        when(mockListItem1.getSourceLocation()).thenReturn(null);
        when(mockListItem1.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockListItem1.getBlocks()).thenReturn(Collections.emptyList());
        when(mockListItem1.getMarker()).thenReturn("*");
        when(mockListItem1.getText()).thenReturn("First item");
        when(mockListItem1.getSource()).thenReturn("First item");
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
        when(mockListItem2.getTitle()).thenReturn(null);
        when(mockListItem2.getStyle()).thenReturn(null);
        when(mockListItem2.getLevel()).thenReturn(1);
        when(mockListItem2.getContentModel()).thenReturn("compound");
        when(mockListItem2.getSourceLocation()).thenReturn(null);
        when(mockListItem2.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockListItem2.getBlocks()).thenReturn(Collections.emptyList());
        when(mockListItem2.getMarker()).thenReturn("*");
        when(mockListItem2.getText()).thenReturn("Second item");
        when(mockListItem2.getSource()).thenReturn("Second item");
        when(mockListItem2.hasText()).thenReturn(true);
        when(mockList1.getItems()).thenReturn(Arrays.asList(mockListItem1, mockListItem2));
        when(mockList1.hasItems()).thenReturn(true);
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
        when(mockBlock2.getLines()).thenReturn(Collections.singletonList("Ut commodo lorem nec lacinia finibus."));
        when(mockBlock2.getSource()).thenReturn("Ut commodo lorem nec lacinia finibus.");
        when(mockSection1.getBlocks()).thenReturn(Arrays.asList(mockBlock1, mockList1, mockBlock2));
        when(mockSection1.getIndex()).thenReturn(0);
        when(mockSection1.getNumber()).thenReturn(1);
        when(mockSection1.getSectionName()).thenReturn("section");
        when(mockSection1.isSpecial()).thenReturn(false);
        when(mockSection1.isNumbered()).thenReturn(false);
        when(mockDocument1.getBlocks()).thenReturn(Collections.singletonList(mockSection1));
        Title mockTitle1 = mock(Title.class);
        when(mockTitle1.getMain()).thenReturn("A small List");
        when(mockTitle1.getSubtitle()).thenReturn(null);
        when(mockTitle1.getCombined()).thenReturn("A small List");
        when(mockTitle1.isSanitized()).thenReturn(false);
        when(mockDocument1.getStructuredDoctitle()).thenReturn(mockTitle1);
        when(mockDocument1.getDoctitle()).thenReturn("A small List");
        ImmutableMap<Object, Object> map2 = ImmutableMap.<Object, Object>builder()
                .put("attributes", "{}")
                .put("header_footer", false)
                .build();
        when(mockDocument1.getOptions()).thenReturn(map2);
        return mockDocument1;
    }
    // end::mock-code[]

    // tag::assert-code[]
    public void checkAst(Document astDocument) {
        Document document1 = astDocument;
        assertThat(document1.getId()).isNull();
        assertThat(document1.getNodeName()).isEqualTo("document");
        assertThat(document1.getContext()).isEqualTo("document");
        assertThat(document1.getDocument()).isSameAs(document1);
        assertThat(document1.isInline()).isFalse();
        assertThat(document1.isBlock()).isTrue();
        assertThat(document1.getAttributes()).containsEntry("doctype", "article")
                .containsEntry("filetype", "html")
                .containsEntry("notitle", "");
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
        Section section1 = (Section) document1.getBlocks()
                .get(0);
        assertThat(section1.getId()).isEqualTo("_a_small_list");
        assertThat(section1.getNodeName()).isEqualTo("section");
        assertThat(section1.getParent()).isSameAs(document1);
        assertThat(section1.getContext()).isEqualTo("section");
        assertThat(section1.getDocument()).isSameAs(document1);
        assertThat(section1.isInline()).isFalse();
        assertThat(section1.isBlock()).isTrue();
        assertThat(section1.getAttributes()).isNullOrEmpty();
        assertThat(section1.getRoles()).isNullOrEmpty();
        assertThat(section1.isReftext()).isFalse();
        assertThat(section1.getReftext()).isNull();
        assertThat(section1.getTitle()).isEqualTo("A small List");
        assertThat(section1.getStyle()).isNull();
        assertThat(section1.getLevel()).isEqualTo(1);
        assertThat(section1.getContentModel()).isEqualTo("compound");
        assertThat(section1.getSourceLocation()).isNull();
        assertThat(section1.getSubstitutions()).isNullOrEmpty();
        assertThat(section1.getBlocks()).hasSize(3);
        Block block1 = (Block) section1.getBlocks()
                .get(0);
        assertThat(block1.getId()).isNull();
        assertThat(block1.getNodeName()).isEqualTo("paragraph");
        assertThat(block1.getParent()).isSameAs(section1);
        assertThat(block1.getContext()).isEqualTo("paragraph");
        assertThat(block1.getDocument()).isSameAs(document1);
        assertThat(block1.isInline()).isFalse();
        assertThat(block1.isBlock()).isTrue();
        assertThat(block1.getAttributes()).isNullOrEmpty();
        assertThat(block1.getRoles()).isNullOrEmpty();
        assertThat(block1.isReftext()).isFalse();
        assertThat(block1.getReftext()).isNull();
        assertThat(block1.getTitle()).isNull();
        assertThat(block1.getStyle()).isNull();
        assertThat(block1.getLevel()).isEqualTo(1);
        assertThat(block1.getContentModel()).isEqualTo("simple");
        assertThat(block1.getSourceLocation()).isNull();
        assertThat(block1.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(block1.getBlocks()).isNullOrEmpty();
        assertThat(block1.getLines()).containsExactly("Lorem ipsum dolor sit amet:");
        assertThat(block1.getSource()).isEqualTo("Lorem ipsum dolor sit amet:");
        org.asciidoctor.ast.List list1 = (org.asciidoctor.ast.List) section1.getBlocks()
                .get(1);
        assertThat(list1.getId()).isNull();
        assertThat(list1.getNodeName()).isEqualTo("ulist");
        assertThat(list1.getParent()).isSameAs(section1);
        assertThat(list1.getContext()).isEqualTo("ulist");
        assertThat(list1.getDocument()).isSameAs(document1);
        assertThat(list1.isInline()).isFalse();
        assertThat(list1.isBlock()).isTrue();
        assertThat(list1.getAttributes()).isNullOrEmpty();
        assertThat(list1.getRoles()).isNullOrEmpty();
        assertThat(list1.isReftext()).isFalse();
        assertThat(list1.getReftext()).isNull();
        assertThat(list1.getTitle()).isNull();
        assertThat(list1.getStyle()).isNull();
        assertThat(list1.getLevel()).isEqualTo(1);
        assertThat(list1.getContentModel()).isEqualTo("compound");
        assertThat(list1.getSourceLocation()).isNull();
        assertThat(list1.getSubstitutions()).isNullOrEmpty();
        assertThat(list1.getBlocks()).isNullOrEmpty();
        assertThat(list1.getItems()).hasSize(2);
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
        assertThat(listItem1.getTitle()).isNull();
        assertThat(listItem1.getStyle()).isNull();
        assertThat(listItem1.getLevel()).isEqualTo(1);
        assertThat(listItem1.getContentModel()).isEqualTo("compound");
        assertThat(listItem1.getSourceLocation()).isNull();
        assertThat(listItem1.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(listItem1.getBlocks()).isNullOrEmpty();
        assertThat(listItem1.getMarker()).isEqualTo("*");
        assertThat(listItem1.getText()).isEqualTo("First item");
        assertThat(listItem1.getSource()).isEqualTo("First item");
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
        assertThat(listItem2.getTitle()).isNull();
        assertThat(listItem2.getStyle()).isNull();
        assertThat(listItem2.getLevel()).isEqualTo(1);
        assertThat(listItem2.getContentModel()).isEqualTo("compound");
        assertThat(listItem2.getSourceLocation()).isNull();
        assertThat(listItem2.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(listItem2.getBlocks()).isNullOrEmpty();
        assertThat(listItem2.getMarker()).isEqualTo("*");
        assertThat(listItem2.getText()).isEqualTo("Second item");
        assertThat(listItem2.getSource()).isEqualTo("Second item");
        assertThat(listItem2.hasText()).isTrue();
        assertThat(list1.hasItems()).isTrue();
        Block block2 = (Block) section1.getBlocks()
                .get(2);
        assertThat(block2.getId()).isNull();
        assertThat(block2.getNodeName()).isEqualTo("paragraph");
        assertThat(block2.getParent()).isSameAs(section1);
        assertThat(block2.getContext()).isEqualTo("paragraph");
        assertThat(block2.getDocument()).isSameAs(document1);
        assertThat(block2.isInline()).isFalse();
        assertThat(block2.isBlock()).isTrue();
        assertThat(block2.getAttributes()).isNullOrEmpty();
        assertThat(block2.getRoles()).isNullOrEmpty();
        assertThat(block2.isReftext()).isFalse();
        assertThat(block2.getReftext()).isNull();
        assertThat(block2.getTitle()).isNull();
        assertThat(block2.getStyle()).isNull();
        assertThat(block2.getLevel()).isEqualTo(1);
        assertThat(block2.getContentModel()).isEqualTo("simple");
        assertThat(block2.getSourceLocation()).isNull();
        assertThat(block2.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(block2.getBlocks()).isNullOrEmpty();
        assertThat(block2.getLines()).containsExactly("Ut commodo lorem nec lacinia finibus.");
        assertThat(block2.getSource()).isEqualTo("Ut commodo lorem nec lacinia finibus.");
        assertThat(section1.getIndex()).isEqualTo(0);
        assertThat(section1.getNumber()).isEqualTo(1);
        assertThat(section1.getSectionName()).isEqualTo("section");
        assertThat(section1.isSpecial()).isFalse();
        assertThat(section1.isNumbered()).isFalse();
        Title title1 = document1.getStructuredDoctitle();
        assertThat(title1.getMain()).isEqualTo("A small List");
        assertThat(title1.getSubtitle()).isNull();
        assertThat(title1.getCombined()).isEqualTo("A small List");
        assertThat(title1.isSanitized()).isFalse();
        assertThat(document1.getDoctitle()).isEqualTo("A small List");
        assertThat(document1.getOptions()).containsEntry("header_footer", false);
    }
    // end::assert-code[]

    // tag::generated-code[]
    public SDocument createSciidObject() {
        SDocument sDocument1 = SciidFactory.eINSTANCE.createSDocument();
        sDocument1.setId(null);
        sDocument1.setNodeName("document");
        sDocument1.setContext("document");
        sDocument1.setDocument(sDocument1);
        sDocument1.setInline(false);
        sDocument1.setBlock(true);
        ImmutableMap<String, Object> map1 = ImmutableMap.<String, Object>builder()
                .put("doctype", "article")
                .put("filetype", "html")
                .put("notitle", "")
                .build();
        sDocument1.setAttributes(map1);
        sDocument1.setRoles(Collections.emptyList());
        sDocument1.setReftext(null);
        sDocument1.setCaption(null);
        sDocument1.setTitle(null);
        sDocument1.setStyle(null);
        sDocument1.setLevel(0);
        sDocument1.setContentModel("compound");
        sDocument1.setSourceLocation(null);
        SSection sSection1 = SciidFactory.eINSTANCE.createSSection();
        sSection1.setId("_a_small_list");
        sSection1.setNodeName("section");
        sSection1.setParent(sDocument1);
        sSection1.setContext("section");
        sSection1.setDocument(sDocument1);
        sSection1.setInline(false);
        sSection1.setBlock(true);
        sSection1.setAttributes(Collections.emptyMap());
        sSection1.setRoles(Collections.emptyList());
        sSection1.setReftext(null);
        sSection1.setCaption(null);
        sSection1.setTitle("A small List");
        sSection1.setStyle(null);
        sSection1.setLevel(1);
        sSection1.setContentModel("compound");
        sSection1.setSourceLocation(null);
        SBlock sBlock1 = SciidFactory.eINSTANCE.createSBlock();
        sBlock1.setId(null);
        sBlock1.setNodeName("paragraph");
        sBlock1.setParent(sSection1);
        sBlock1.setContext("paragraph");
        sBlock1.setDocument(sDocument1);
        sBlock1.setInline(false);
        sBlock1.setBlock(true);
        sBlock1.setAttributes(Collections.emptyMap());
        sBlock1.setRoles(Collections.emptyList());
        sBlock1.setReftext(null);
        sBlock1.setCaption(null);
        sBlock1.setTitle(null);
        sBlock1.setStyle(null);
        sBlock1.setLevel(1);
        sBlock1.setContentModel("simple");
        sBlock1.setSourceLocation(null);
        sBlock1.getSubstitutions()
                .add("specialcharacters");
        sBlock1.getSubstitutions()
                .add("quotes");
        sBlock1.getSubstitutions()
                .add("attributes");
        sBlock1.getSubstitutions()
                .add("replacements");
        sBlock1.getSubstitutions()
                .add("macros");
        sBlock1.getSubstitutions()
                .add("post_replacements");
        sBlock1.setLines(Collections.singletonList("Lorem ipsum dolor sit amet:"));
        sBlock1.setSource("Lorem ipsum dolor sit amet:");
        sSection1.getBlocks()
                .add(sBlock1);
        SList sList1 = SciidFactory.eINSTANCE.createSList();
        sList1.setId(null);
        sList1.setNodeName("ulist");
        sList1.setParent(sSection1);
        sList1.setContext("ulist");
        sList1.setDocument(sDocument1);
        sList1.setInline(false);
        sList1.setBlock(true);
        sList1.setAttributes(Collections.emptyMap());
        sList1.setRoles(Collections.emptyList());
        sList1.setReftext(null);
        sList1.setCaption(null);
        sList1.setTitle(null);
        sList1.setStyle(null);
        sList1.setLevel(1);
        sList1.setContentModel("compound");
        sList1.setSourceLocation(null);
        SListItem sListItem1 = SciidFactory.eINSTANCE.createSListItem();
        sListItem1.setId(null);
        sListItem1.setNodeName("list_item");
        sListItem1.setParent(sList1);
        sListItem1.setContext("list_item");
        sListItem1.setDocument(sDocument1);
        sListItem1.setInline(false);
        sListItem1.setBlock(true);
        sListItem1.setAttributes(Collections.emptyMap());
        sListItem1.setRoles(Collections.emptyList());
        sListItem1.setReftext(null);
        sListItem1.setCaption(null);
        sListItem1.setTitle(null);
        sListItem1.setStyle(null);
        sListItem1.setLevel(1);
        sListItem1.setContentModel("compound");
        sListItem1.setSourceLocation(null);
        sListItem1.getSubstitutions()
                .add("specialcharacters");
        sListItem1.getSubstitutions()
                .add("quotes");
        sListItem1.getSubstitutions()
                .add("attributes");
        sListItem1.getSubstitutions()
                .add("replacements");
        sListItem1.getSubstitutions()
                .add("macros");
        sListItem1.getSubstitutions()
                .add("post_replacements");
        sListItem1.setMarker("*");
        sListItem1.setText("First item");
        sListItem1.setSource("First item");
        sList1.getItems()
                .add(sListItem1);
        SListItem sListItem2 = SciidFactory.eINSTANCE.createSListItem();
        sListItem2.setId(null);
        sListItem2.setNodeName("list_item");
        sListItem2.setParent(sList1);
        sListItem2.setContext("list_item");
        sListItem2.setDocument(sDocument1);
        sListItem2.setInline(false);
        sListItem2.setBlock(true);
        sListItem2.setAttributes(Collections.emptyMap());
        sListItem2.setRoles(Collections.emptyList());
        sListItem2.setReftext(null);
        sListItem2.setCaption(null);
        sListItem2.setTitle(null);
        sListItem2.setStyle(null);
        sListItem2.setLevel(1);
        sListItem2.setContentModel("compound");
        sListItem2.setSourceLocation(null);
        sListItem2.getSubstitutions()
                .add("specialcharacters");
        sListItem2.getSubstitutions()
                .add("quotes");
        sListItem2.getSubstitutions()
                .add("attributes");
        sListItem2.getSubstitutions()
                .add("replacements");
        sListItem2.getSubstitutions()
                .add("macros");
        sListItem2.getSubstitutions()
                .add("post_replacements");
        sListItem2.setMarker("*");
        sListItem2.setText("Second item");
        sListItem2.setSource("Second item");
        sList1.getItems()
                .add(sListItem2);
        sSection1.getBlocks()
                .add(sList1);
        SBlock sBlock2 = SciidFactory.eINSTANCE.createSBlock();
        sBlock2.setId(null);
        sBlock2.setNodeName("paragraph");
        sBlock2.setParent(sSection1);
        sBlock2.setContext("paragraph");
        sBlock2.setDocument(sDocument1);
        sBlock2.setInline(false);
        sBlock2.setBlock(true);
        sBlock2.setAttributes(Collections.emptyMap());
        sBlock2.setRoles(Collections.emptyList());
        sBlock2.setReftext(null);
        sBlock2.setCaption(null);
        sBlock2.setTitle(null);
        sBlock2.setStyle(null);
        sBlock2.setLevel(1);
        sBlock2.setContentModel("simple");
        sBlock2.setSourceLocation(null);
        sBlock2.getSubstitutions()
                .add("specialcharacters");
        sBlock2.getSubstitutions()
                .add("quotes");
        sBlock2.getSubstitutions()
                .add("attributes");
        sBlock2.getSubstitutions()
                .add("replacements");
        sBlock2.getSubstitutions()
                .add("macros");
        sBlock2.getSubstitutions()
                .add("post_replacements");
        sBlock2.setLines(Collections.singletonList("Ut commodo lorem nec lacinia finibus."));
        sBlock2.setSource("Ut commodo lorem nec lacinia finibus.");
        sSection1.getBlocks()
                .add(sBlock2);
        sSection1.setIndex(0);
        sSection1.setNumber(1);
        sSection1.setSectionName("section");
        sSection1.setSpecial(false);
        sSection1.setNumbered(false);
        sDocument1.getBlocks()
                .add(sSection1);
        STitle sTitle1 = SciidFactory.eINSTANCE.createSTitle();
        sTitle1.setMain("A small List");
        sTitle1.setSubtitle(null);
        sTitle1.setCombined("A small List");
        sTitle1.setSanitized(false);
        sDocument1.setStructuredDoctitle(sTitle1);
        sDocument1.setDoctitle("A small List");
        ImmutableMap<Object, Object> map2 = ImmutableMap.<Object, Object>builder()
                .put("attributes", "{}")
                .put("header_footer", false)
                .build();
        sDocument1.setOptions(map2);
        return sDocument1;
    }
    // end::generated-code[]
}
