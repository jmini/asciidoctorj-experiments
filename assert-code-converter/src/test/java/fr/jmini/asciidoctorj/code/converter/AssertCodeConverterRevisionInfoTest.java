package fr.jmini.asciidoctorj.code.converter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.asciidoctor.ast.RevisionInfo;
import org.junit.Test;

public class AssertCodeConverterRevisionInfoTest {

    @Test
    public void testRevisionInfo() throws Exception {
        RevisionInfo mockRevisionInfo = mock(RevisionInfo.class);
        when(mockRevisionInfo.getDate()).thenReturn("2018-01-01");
        when(mockRevisionInfo.getNumber()).thenReturn("3");
        when(mockRevisionInfo.getRemark()).thenReturn("rem");

        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createRevisionInfoCode(sb, mockRevisionInfo);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());

        checkAst(mockRevisionInfo);
    }

    // tag::generated-code[]
    public void checkAst(RevisionInfo astRevisionInfo) {
        RevisionInfo revisionInfo1 = astRevisionInfo;
        assertThat(revisionInfo1.getDate()).isEqualTo("2018-01-01");
        assertThat(revisionInfo1.getNumber()).isEqualTo("3");
        assertThat(revisionInfo1.getRemark()).isEqualTo("rem");
    }
    // end::generated-code[]
}
