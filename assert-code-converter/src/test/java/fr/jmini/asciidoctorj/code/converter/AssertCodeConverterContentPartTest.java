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
        when(mockContentPart.getParent()).thenReturn(null);

        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createContentPartCode(sb, mockContentPart);
        System.out.println(sb);

        checkAst(mockContentPart);
    }

    // tag::generated-code[]
    public void checkAst(ContentPart astContentPart) {
        ContentPart a1 = astContentPart;
        assertThat(a1).isEqualTo("TODO");
    }
    // end::generated-code[]
}
