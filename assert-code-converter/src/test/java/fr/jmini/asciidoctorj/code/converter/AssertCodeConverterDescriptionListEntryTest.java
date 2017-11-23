package fr.jmini.asciidoctorj.code.converter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.asciidoctor.ast.DescriptionListEntry;
import org.junit.Test;

public class AssertCodeConverterDescriptionListEntryTest {

    @Test
    public void testDescriptionListEntry() throws Exception {
        DescriptionListEntry mockDescriptionListEntry = mock(DescriptionListEntry.class);
        when(mockDescriptionListEntry.getDescription()).thenReturn(null);
        when(mockDescriptionListEntry.getTerms()).thenReturn(Collections.emptyList());

        // TODO replace System.out.println with a check:
        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createDescriptionListEntryCode(sb, mockDescriptionListEntry);
        System.out.println(sb);

        checkAst(mockDescriptionListEntry);
    }

    // tag::generated-code[]
    public void checkAst(DescriptionListEntry astDescriptionListEntry) {
        DescriptionListEntry e1 = astDescriptionListEntry;
        assertThat(e1.getDescription()).isNull();
        assertThat(e1.getTerms()).isEmpty();
    }
    // end::generated-code[]
}