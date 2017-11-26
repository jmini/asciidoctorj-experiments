package fr.jmini.asciidoctorj.converter.mockcode;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.Title;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class MockCodeConverterTitleTest {

    @Test
    public void testTitle() throws Exception {
        Title mockTitle = createMock();
        when(mockTitle.getMain()).thenReturn("main");
        when(mockTitle.getSubtitle()).thenReturn("subt");
        when(mockTitle.getCombined()).thenReturn("comb");
        when(mockTitle.isSanitized()).thenReturn(true);

        MockCodeConverter converter = new MockCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createTitleCode(sb, mockTitle);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public Title createMock() {
        Title mockTitle1 = mock(Title.class);
        when(mockTitle1.getMain()).thenReturn("main");
        when(mockTitle1.getSubtitle()).thenReturn("subt");
        when(mockTitle1.getCombined()).thenReturn("comb");
        when(mockTitle1.isSanitized()).thenReturn(true);
        return mockTitle1;
    }
    // end::generated-code[]
}
