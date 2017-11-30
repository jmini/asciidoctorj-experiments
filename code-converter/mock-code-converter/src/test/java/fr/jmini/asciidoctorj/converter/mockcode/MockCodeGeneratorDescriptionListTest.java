package fr.jmini.asciidoctorj.converter.mockcode;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.asciidoctor.ast.DescriptionList;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class MockCodeGeneratorDescriptionListTest {

    @Test
    public void testDescriptionList() throws Exception {
        DescriptionList mockDescriptionList = createMock();

        MockCodeGenerator generator = new MockCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createDescriptionListCode(sb, mockDescriptionList);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public DescriptionList createMock() {
        DescriptionList mockDescriptionList1 = mock(DescriptionList.class);
        when(mockDescriptionList1.getId()).thenReturn(null);
        when(mockDescriptionList1.getNodeName()).thenReturn(null);
        when(mockDescriptionList1.getContext()).thenReturn(null);
        when(mockDescriptionList1.getDocument()).thenReturn(null);
        when(mockDescriptionList1.isInline()).thenReturn(false);
        when(mockDescriptionList1.isBlock()).thenReturn(false);
        when(mockDescriptionList1.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockDescriptionList1.getRoles()).thenReturn(Collections.emptyList());
        when(mockDescriptionList1.isReftext()).thenReturn(false);
        when(mockDescriptionList1.getTitle()).thenReturn(null);
        when(mockDescriptionList1.getStyle()).thenReturn(null);
        when(mockDescriptionList1.getLevel()).thenReturn(0);
        when(mockDescriptionList1.getContentModel()).thenReturn(null);
        when(mockDescriptionList1.getSourceLocation()).thenReturn(null);
        when(mockDescriptionList1.getSubstitutions()).thenReturn(Collections.emptyList());
        when(mockDescriptionList1.getBlocks()).thenReturn(Collections.emptyList());
        when(mockDescriptionList1.getItems()).thenReturn(Collections.emptyList());
        return mockDescriptionList1;
    }
    // end::generated-code[]
}
