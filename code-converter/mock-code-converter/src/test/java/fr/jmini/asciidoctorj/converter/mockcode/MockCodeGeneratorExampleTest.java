package fr.jmini.asciidoctorj.converter.mockcode;

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

/*
Input AciiDoc Text:
----
// tag::input[]
= My page

Some text
// end::input[]
----
 */
public class MockCodeGeneratorExampleTest {

    @Test
    public void testAst() throws Exception {
        Document mockDocument = createMock();

        MockCodeGenerator generator = new MockCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createDocumentCode(sb, mockDocument);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
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
                .put("tip-caption", "Tip")
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
    // end::generated-code[]
}
