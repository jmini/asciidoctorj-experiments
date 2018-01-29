package fr.jmini.sciid.converter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;

import org.asciidoctor.ast.Block;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.Title;
import org.junit.Test;

import com.google.common.collect.ImmutableMap;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.sciid.SBlock;
import fr.jmini.sciid.SDocument;
import fr.jmini.sciid.STitle;
import fr.jmini.sciid.SciidFactory;

/* tag::input-asciidoc[]
= My page

Some text

end::input-asciidoc[] */
public class SciidCodeGeneratorExampleTest {

    @Test
    public void testAst() throws Exception {
        Document mockDocument = createMock();
        checkAst(mockDocument);

        SciidCodeGenerator generator = new SciidCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createDocumentCode(sb, mockDocument);
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
                .put("doctitle", "My page")
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
        Block mockBlock1 = mock(Block.class);
        when(mockBlock1.getId()).thenReturn(null);
        when(mockBlock1.getNodeName()).thenReturn("paragraph");
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
        when(mockBlock1.getLevel()).thenReturn(0);
        when(mockBlock1.getContentModel()).thenReturn("simple");
        when(mockBlock1.getSourceLocation()).thenReturn(null);
        when(mockBlock1.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockBlock1.getBlocks()).thenReturn(Collections.emptyList());
        when(mockBlock1.getLines()).thenReturn(Collections.singletonList("Some text"));
        when(mockBlock1.getSource()).thenReturn("Some text");
        when(mockDocument1.getBlocks()).thenReturn(Collections.singletonList(mockBlock1));
        Title mockTitle1 = mock(Title.class);
        when(mockTitle1.getMain()).thenReturn("My page");
        when(mockTitle1.getSubtitle()).thenReturn(null);
        when(mockTitle1.getCombined()).thenReturn("My page");
        when(mockTitle1.isSanitized()).thenReturn(false);
        when(mockDocument1.getStructuredDoctitle()).thenReturn(mockTitle1);
        when(mockDocument1.getDoctitle()).thenReturn("My page");
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
        assertThat(document1.getAttributes()).containsEntry("doctitle", "My page")
                .containsEntry("doctype", "article")
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
        Block block1 = (Block) document1.getBlocks()
                .get(0);
        assertThat(block1.getId()).isNull();
        assertThat(block1.getNodeName()).isEqualTo("paragraph");
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
        assertThat(block1.getLevel()).isEqualTo(0);
        assertThat(block1.getContentModel()).isEqualTo("simple");
        assertThat(block1.getSourceLocation()).isNull();
        assertThat(block1.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(block1.getBlocks()).isNullOrEmpty();
        assertThat(block1.getLines()).containsExactly("Some text");
        assertThat(block1.getSource()).isEqualTo("Some text");
        Title title1 = document1.getStructuredDoctitle();
        assertThat(title1.getMain()).isEqualTo("My page");
        assertThat(title1.getSubtitle()).isNull();
        assertThat(title1.getCombined()).isEqualTo("My page");
        assertThat(title1.isSanitized()).isFalse();
        assertThat(document1.getDoctitle()).isEqualTo("My page");
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
                .put("doctitle", "My page")
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
        SBlock sBlock1 = SciidFactory.eINSTANCE.createSBlock();
        sBlock1.setId(null);
        sBlock1.setNodeName("paragraph");
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
        sBlock1.setLevel(0);
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
        sBlock1.setLines(Collections.singletonList("Some text"));
        sBlock1.setSource("Some text");
        sDocument1.getBlocks()
                .add(sBlock1);
        STitle sTitle1 = SciidFactory.eINSTANCE.createSTitle();
        sTitle1.setMain("My page");
        sTitle1.setSubtitle(null);
        sTitle1.setCombined("My page");
        sTitle1.setSanitized(false);
        sDocument1.setStructuredDoctitle(sTitle1);
        sDocument1.setDoctitle("My page");
        ImmutableMap<Object, Object> map2 = ImmutableMap.<Object, Object>builder()
                .put("attributes", "{}")
                .put("header_footer", false)
                .build();
        sDocument1.setOptions(map2);
        return sDocument1;
    }
    // end::generated-code[]
}
