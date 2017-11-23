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

        // TODO replace System.out.println with a check:
        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createContentPartCode(sb, mockContentPart);
        System.out.println(sb);

        checkAst(mockContentPart);
    }

    // tag::generated-code[]
    public void checkAst(ContentPart astContentPart) {
        ContentPart p1 = astContentPart;
        assertThat(p1.getId()).isEqualTo("id");
        assertThat(p1.getLevel()).isEqualTo(3);
        assertThat(p1.getContext()).isEqualTo("ctxt");
        assertThat(p1.getStyle()).isEqualTo("stle");
        assertThat(p1.getRole()).isEqualTo("role");
        assertThat(p1.getTitle()).isEqualTo("some-title");
    }

    // end::generated-code[]
}
