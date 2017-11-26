package fr.jmini.asciidoctorj.converter.mockcode;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.RevisionInfo;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class MockCodeConverterRevisionInfoTest {

    @Test
    public void testRevisionInfo() throws Exception {
        RevisionInfo mockRevisionInfo = createMock();

        MockCodeConverter converter = new MockCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createRevisionInfoCode(sb, mockRevisionInfo);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public RevisionInfo createMock() {
        RevisionInfo mockRevisionInfo1 = mock(RevisionInfo.class);
        when(mockRevisionInfo1.getDate()).thenReturn("2018-01-01");
        when(mockRevisionInfo1.getNumber()).thenReturn("3");
        when(mockRevisionInfo1.getRemark()).thenReturn("rem");
        return mockRevisionInfo1;
    }
    // end::generated-code[]
}
