package fr.jmini.asciidoctorj.converter.mockcode;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.asciidoctor.ast.DescriptionListEntry;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class MockCodeConverterDescriptionListEntryTest {

    @Test
    public void testDescriptionListEntry() throws Exception {
        DescriptionListEntry mockDescriptionListEntry = createMock();

        MockCodeConverter converter = new MockCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createDescriptionListEntryCode(sb, mockDescriptionListEntry);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public DescriptionListEntry createMock() {
        DescriptionListEntry mockDescriptionListEntry1 = mock(DescriptionListEntry.class);
        when(mockDescriptionListEntry1.getDescription()).thenReturn(null);
        when(mockDescriptionListEntry1.getTerms()).thenReturn(Collections.emptyList());
        return mockDescriptionListEntry1;
    }
    // end::generated-code[]
}