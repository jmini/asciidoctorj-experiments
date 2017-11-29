package fr.jmini.asciidoctorj.converter.mockcode;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.asciidoctor.ast.DescriptionListEntry;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class MockCodeGeneratorDescriptionListEntryTest {

    @Test
    public void testDescriptionListEntry() throws Exception {
        DescriptionListEntry mockDescriptionListEntry = createMock();

        MockCodeGenerator generator = new MockCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createDescriptionListEntryCode(sb, mockDescriptionListEntry);
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