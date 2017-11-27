package fr.jmini.asciidoctorj.converter.mockcode;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.ContentPart;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class MockCodeConverterContentPartTest {

    @Test
    public void testContentPart() throws Exception {
        ContentPart mockContentPart = createMock();

        MockCodeConverter converter = new MockCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createContentPartCode(sb, mockContentPart);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public ContentPart createMock() {
        ContentPart mockContentPart1 = mock(ContentPart.class);
        when(mockContentPart1.getId()).thenReturn("id");
        when(mockContentPart1.getLevel()).thenReturn(3);
        when(mockContentPart1.getContext()).thenReturn("ctxt");
        when(mockContentPart1.getStyle()).thenReturn("stle");
        when(mockContentPart1.getRole()).thenReturn("role");
        when(mockContentPart1.getTitle()).thenReturn("some-title");
        when(mockContentPart1.getAttributes()).thenReturn(null);
        when(mockContentPart1.getParts()).thenReturn(null);
        return mockContentPart1;
    }
    // end::generated-code[]
}
