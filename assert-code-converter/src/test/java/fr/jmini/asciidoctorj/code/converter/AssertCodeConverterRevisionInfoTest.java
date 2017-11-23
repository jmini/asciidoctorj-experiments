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
        when(mockRevisionInfo.getParent()).thenReturn(null);

        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createRevisionInfoCode(sb, mockRevisionInfo);
        System.out.println(sb);

        checkAst(mockRevisionInfo);
    }

    // tag::generated-code[]
    public void checkAst(RevisionInfo astRevisionInfo) {
        RevisionInfo a1 = astRevisionInfo;
        assertThat(a1).isEqualTo("TODO");
    }
    // end::generated-code[]
}
