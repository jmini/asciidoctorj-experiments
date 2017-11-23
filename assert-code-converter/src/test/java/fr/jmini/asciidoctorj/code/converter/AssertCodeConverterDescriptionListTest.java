package fr.jmini.asciidoctorj.code.converter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.DescriptionListEntry;
import org.junit.Test;

public class AssertCodeConverterDescriptionListTest {

    @Test
    public void testDescriptionListEntry() throws Exception {
        DescriptionListEntry mockDescriptionListEntry = mock(DescriptionListEntry.class);
        when(mockDescriptionListEntry.getParent()).thenReturn(null);

        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createDescriptionListEntryCode(sb, mockDescriptionListEntry);
        System.out.println(sb);

        checkAst(mockDescriptionListEntry);
    }

    // tag::generated-code[]
    public void checkAst(DescriptionListEntry astDescriptionListEntry) {
        DescriptionListEntry a1 = astDescriptionListEntry;
        assertThat(a1).isEqualTo("TODO");
    }
    // end::generated-code[]
}
