package fr.jmini.asciidoctorj.converter.mockcode;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.asciidoctor.ast.Document;
import org.junit.Test;

import com.google.common.collect.ImmutableMap;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class MockCodeGeneratorDocumentTest {

    @Test
    public void testDocument() throws Exception {
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
        when(mockDocument1.getNodeName()).thenReturn(null);
        when(mockDocument1.getContext()).thenReturn(null);
        when(mockDocument1.getDocument()).thenReturn(null);
        when(mockDocument1.isInline()).thenReturn(false);
        when(mockDocument1.isBlock()).thenReturn(false);
        ImmutableMap<String, Object> map1 = ImmutableMap.<String, Object>builder()
                .put("one", 1)
                .put("two", 2)
                .put("three", 3)
                .build();
        when(mockDocument1.getAttributes()).thenReturn(map1);
        when(mockDocument1.getRoles()).thenReturn(Collections.emptyList());
        when(mockDocument1.isReftext()).thenReturn(false);
        when(mockDocument1.getTitle()).thenReturn(null);
        when(mockDocument1.getStyle()).thenReturn(null);
        when(mockDocument1.getLevel()).thenReturn(0);
        when(mockDocument1.getContentModel()).thenReturn(null);
        when(mockDocument1.getSourceLocation()).thenReturn(null);
        when(mockDocument1.getSubstitutions()).thenReturn(Collections.emptyList());
        when(mockDocument1.getBlocks()).thenReturn(Collections.emptyList());
        when(mockDocument1.getStructuredDoctitle()).thenReturn(null);
        when(mockDocument1.getDoctitle()).thenReturn("this is a doc title");
        ImmutableMap<Object, Object> map2 = ImmutableMap.<Object, Object>builder()
                .put("lorem", true)
                .put("ipsum", false)
                .build();
        when(mockDocument1.getOptions()).thenReturn(map2);
        return mockDocument1;
    }
    // end::generated-code[]
}
