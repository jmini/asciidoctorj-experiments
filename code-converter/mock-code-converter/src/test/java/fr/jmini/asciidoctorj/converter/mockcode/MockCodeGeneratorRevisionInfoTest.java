package fr.jmini.asciidoctorj.converter.mockcode;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.RevisionInfo;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class MockCodeGeneratorRevisionInfoTest {

    @Test
    public void testRevisionInfo() throws Exception {
        RevisionInfo mockRevisionInfo = createMock();

        MockCodeGenerator generator = new MockCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createRevisionInfoCode(sb, mockRevisionInfo);
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
