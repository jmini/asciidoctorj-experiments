package fr.jmini.asciidoctorj.converter.mockcode;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.asciidoctor.ast.Document;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class MockCodeGeneratorDocumentTest {

    @Test
    public void testDocument() throws Exception {
        Document mockDocument = createMock();
        Map<Object, Object> options = new HashMap<>();
        options.put("base_dir", "b");
        options.put("ipsum", false);
        options.put("lorem", 1L);
        when(mockDocument.getOptions()).thenReturn(options);

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
        when(mockDocument1.getParent()).thenReturn(null);
        when(mockDocument1.getContext()).thenReturn(null);
        when(mockDocument1.getDocument()).thenReturn(null);
        when(mockDocument1.isInline()).thenReturn(false);
        when(mockDocument1.isBlock()).thenReturn(false);
        Map<String, Object> map1 = new HashMap<>();
        map1.put("one", 1);
        map1.put("three", 3);
        map1.put("two", 2);
        when(mockDocument1.getAttributes()).thenReturn(map1);
        when(mockDocument1.getRoles()).thenReturn(Collections.emptyList());
        when(mockDocument1.isReftext()).thenReturn(false);
        when(mockDocument1.getReftext()).thenReturn(null);
        when(mockDocument1.getCaption()).thenReturn(null);
        when(mockDocument1.getTitle()).thenReturn(null);
        when(mockDocument1.getStyle()).thenReturn(null);
        when(mockDocument1.getLevel()).thenReturn(0);
        when(mockDocument1.getContentModel()).thenReturn(null);
        when(mockDocument1.getSourceLocation()).thenReturn(null);
        when(mockDocument1.getSubstitutions()).thenReturn(Collections.emptyList());
        when(mockDocument1.getBlocks()).thenReturn(Collections.emptyList());
        when(mockDocument1.getStructuredDoctitle()).thenReturn(null);
        when(mockDocument1.getDoctitle()).thenReturn("this is a doc title");
        Map<Object, Object> map2 = new HashMap<>();
        map2.put("ipsum", false);
        map2.put("lorem", 1L);
        when(mockDocument1.getOptions()).thenReturn(map2);
        return mockDocument1;
    }
    // end::generated-code[]
}
