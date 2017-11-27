package fr.jmini.asciidoctorj.converter.assertcode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.asciidoctor.ast.DescriptionListEntry;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.assertcode.AssertCodeConverter;
import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class AssertCodeConverterDescriptionListEntryTest {

    @Test
    public void testDescriptionListEntry() throws Exception {
        DescriptionListEntry mockDescriptionListEntry = mock(DescriptionListEntry.class);
        when(mockDescriptionListEntry.getDescription()).thenReturn(null);
        when(mockDescriptionListEntry.getTerms()).thenReturn(Collections.emptyList());

        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createDescriptionListEntryCode(sb, mockDescriptionListEntry);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());

        checkAst(mockDescriptionListEntry);
    }

    // tag::generated-code[]
    public void checkAst(DescriptionListEntry astDescriptionListEntry) {
        DescriptionListEntry descriptionListEntry1 = astDescriptionListEntry;
        assertThat(descriptionListEntry1.getDescription()).isNull();
        assertThat(descriptionListEntry1.getTerms()).isEmpty();
    }
    // end::generated-code[]
}