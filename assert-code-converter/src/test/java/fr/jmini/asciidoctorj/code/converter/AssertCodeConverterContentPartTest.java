package fr.jmini.asciidoctorj.code.converter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.ContentPart;
import org.junit.Test;

public class AssertCodeConverterContentPartTest {

    @Test
    public void testContentPart() throws Exception {
        ContentPart mockContentPart = mock(ContentPart.class);
        when(mockContentPart.getId()).thenReturn("id");
        when(mockContentPart.getLevel()).thenReturn(3);
        when(mockContentPart.getContext()).thenReturn("ctxt");
        when(mockContentPart.getStyle()).thenReturn("stle");
        when(mockContentPart.getRole()).thenReturn("role");
        when(mockContentPart.getTitle()).thenReturn("some-title");
        when(mockContentPart.getAttributes()).thenReturn(null);
        when(mockContentPart.getContent()).thenReturn("content");
        when(mockContentPart.getParts()).thenReturn(null);

        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createContentPartCode(sb, mockContentPart);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());

        checkAst(mockContentPart);
    }

    // tag::generated-code[]
    public void checkAst(ContentPart astContentPart) {
        ContentPart contentPart1 = astContentPart;
        assertThat(contentPart1.getId()).isEqualTo("id");
        assertThat(contentPart1.getLevel()).isEqualTo(3);
        assertThat(contentPart1.getContext()).isEqualTo("ctxt");
        assertThat(contentPart1.getStyle()).isEqualTo("stle");
        assertThat(contentPart1.getRole()).isEqualTo("role");
        assertThat(contentPart1.getTitle()).isEqualTo("some-title");
        assertThat(contentPart1.getAttributes()).isNull();
        assertThat(contentPart1.getParts()).isNull();
    }
    // end::generated-code[]
}
