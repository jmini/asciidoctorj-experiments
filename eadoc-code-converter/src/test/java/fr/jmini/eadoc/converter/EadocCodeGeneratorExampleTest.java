package fr.jmini.eadoc.converter;

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
import fr.jmini.eadoc.EBlock;
import fr.jmini.eadoc.EDocument;
import fr.jmini.eadoc.ETitle;
import fr.jmini.eadoc.EadocFactory;

/*
See Input AciiDoc Text in @link{fr.jmini.asciidoctorj.converter.mockcode.MockCodeGeneratorExampleTest}
 */
public class EadocCodeGeneratorExampleTest {

    @Test
    public void testAst() throws Exception {
        Document mockDocument = createMock();
        checkAst(mockDocument);

        EadocCodeGenerator generator = new EadocCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createDocumentCode(sb, mockDocument);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());

        EDocument eDocument = createEadoc();
        checkAst(eDocument);
    }

    public Document createMock() {
        Document mockDocument1 = mock(Document.class);
        when(mockDocument1.getId()).thenReturn(null);
        when(mockDocument1.getNodeName()).thenReturn("document");
        when(mockDocument1.getContext()).thenReturn("document");
        when(mockDocument1.getDocument()).thenReturn(mockDocument1);
        when(mockDocument1.isInline()).thenReturn(false);
        when(mockDocument1.isBlock()).thenReturn(true);
        ImmutableMap<String, Object> map1 = ImmutableMap.<String, Object>builder()
                .put("tip-caption", "Tip")
                .put("filetype", "html")
                .put("doctitle", "My page")
                .put("doctype", "article")
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
        when(mockDocument1.getBlocks()).thenAnswer(i -> {
            return Collections.singletonList(mockBlock1);
        });
        Title mockTitle1 = mock(Title.class);
        when(mockTitle1.getMain()).thenReturn("My page");
        when(mockTitle1.getSubtitle()).thenReturn(null);
        when(mockTitle1.getCombined()).thenReturn("My page");
        when(mockTitle1.isSanitized()).thenReturn(false);
        when(mockDocument1.getStructuredDoctitle()).thenReturn(mockTitle1);
        when(mockDocument1.getDoctitle()).thenReturn("My page");
        ImmutableMap<Object, Object> map2 = ImmutableMap.<Object, Object>builder()
                .put("header_footer", false)
                .put("attributes", "{}")
                .build();
        when(mockDocument1.getOptions()).thenReturn(map2);
        return mockDocument1;
    }

    public void checkAst(Document astDocument) {
        Document document1 = astDocument;
        assertThat(document1.getId()).isNull();
        assertThat(document1.getNodeName()).isEqualTo("document");
        assertThat(document1.getContext()).isEqualTo("document");
        assertThat(document1.getDocument()).isSameAs(document1);
        assertThat(document1.isInline()).isFalse();
        assertThat(document1.isBlock()).isTrue();
        assertThat(document1.getAttributes()).containsEntry("tip-caption", "Tip")
                .containsEntry("filetype", "html")
                .containsEntry("doctitle", "My page")
                .containsEntry("doctype", "article");
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
        assertThat(document1.getOptions()).containsEntry("header_footer", false)
                .containsEntry("attributes", "{}");
    }

    // tag::generated-code[]
    public EDocument createEadoc() {
        EDocument eDocument1 = EadocFactory.eINSTANCE.createEDocument();
        eDocument1.setId(null);
        eDocument1.setNodeName("document");
        eDocument1.setContext("document");
        eDocument1.setDocument(eDocument1);
        eDocument1.setInline(false);
        eDocument1.setBlock(true);
        ImmutableMap<String, Object> map1 = ImmutableMap.<String, Object>builder()
                .put("tip-caption", "Tip")
                .put("filetype", "html")
                .put("doctitle", "My page")
                .put("doctype", "article")
                .build();
        eDocument1.setAttributes(map1);
        eDocument1.setRoles(Collections.emptyList());
        eDocument1.setReftext(null);
        eDocument1.setTitle(null);
        eDocument1.setStyle(null);
        eDocument1.setLevel(0);
        eDocument1.setContentModel("compound");
        eDocument1.setSourceLocation(null);
        EBlock eBlock1 = EadocFactory.eINSTANCE.createEBlock();
        eBlock1.setId(null);
        eBlock1.setNodeName("paragraph");
        eBlock1.setContext("paragraph");
        eBlock1.setDocument(eDocument1);
        eBlock1.setInline(false);
        eBlock1.setBlock(true);
        eBlock1.setAttributes(Collections.emptyMap());
        eBlock1.setRoles(Collections.emptyList());
        eBlock1.setReftext(null);
        eBlock1.setTitle(null);
        eBlock1.setStyle(null);
        eBlock1.setLevel(0);
        eBlock1.setContentModel("simple");
        eBlock1.setSourceLocation(null);
        eBlock1.getSubstitutions()
                .add("specialcharacters");
        eBlock1.getSubstitutions()
                .add("quotes");
        eBlock1.getSubstitutions()
                .add("attributes");
        eBlock1.getSubstitutions()
                .add("replacements");
        eBlock1.getSubstitutions()
                .add("macros");
        eBlock1.getSubstitutions()
                .add("post_replacements");
        eBlock1.setLines(Collections.singletonList("Some text"));
        eBlock1.setSource("Some text");
        eDocument1.getBlocks()
                .add(eBlock1);
        ETitle eTitle1 = EadocFactory.eINSTANCE.createETitle();
        eTitle1.setMain("My page");
        eTitle1.setSubtitle(null);
        eTitle1.setCombined("My page");
        eTitle1.setSanitized(false);
        eDocument1.setStructuredDoctitle(eTitle1);
        eDocument1.setDoctitle("My page");
        ImmutableMap<Object, Object> map2 = ImmutableMap.<Object, Object>builder()
                .put("header_footer", false)
                .put("attributes", "{}")
                .build();
        eDocument1.setOptions(map2);
        return eDocument1;
    }
    // end::generated-code[]
}
