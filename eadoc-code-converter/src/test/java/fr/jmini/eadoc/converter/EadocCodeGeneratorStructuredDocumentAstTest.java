package fr.jmini.eadoc.converter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;

import org.asciidoctor.ast.Author;
import org.asciidoctor.ast.ContentPart;
import org.asciidoctor.ast.DocumentHeader;
import org.asciidoctor.ast.RevisionInfo;
import org.asciidoctor.ast.StructuredDocument;
import org.asciidoctor.ast.Title;
import org.junit.Test;

import com.google.common.collect.ImmutableMap;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.eadoc.EContentPart;
import fr.jmini.eadoc.EDocumentHeader;
import fr.jmini.eadoc.ERevisionInfo;
import fr.jmini.eadoc.EStructuredDocument;
import fr.jmini.eadoc.ETitle;
import fr.jmini.eadoc.EadocFactory;

public class EadocCodeGeneratorStructuredDocumentAstTest {

    @Test
    public void testAst() throws Exception {
        StructuredDocument mockStructuredDocument1 = createMock();

        EadocCodeGenerator generator = new EadocCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createStructuredDocumentCode(sb, mockStructuredDocument1);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());

        EStructuredDocument eStructuredDocument = createEadoc();
        checkAst(eStructuredDocument);
    }

    private StructuredDocument createMock() {
        StructuredDocument mockStructuredDocument1 = mock(StructuredDocument.class);
        ContentPart mockContentPart1 = mock(ContentPart.class);
        when(mockContentPart1.getId()).thenReturn(null);
        when(mockContentPart1.getLevel()).thenReturn(1);
        when(mockContentPart1.getContext()).thenReturn("preamble");
        when(mockContentPart1.getStyle()).thenReturn(null);
        when(mockContentPart1.getRole()).thenReturn(null);
        when(mockContentPart1.getTitle()).thenReturn(null);
        when(mockContentPart1.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockContentPart1.getParts()).thenReturn(null);
        ContentPart mockContentPart2 = mock(ContentPart.class);
        when(mockContentPart2.getId()).thenReturn("_an_header");
        when(mockContentPart2.getLevel()).thenReturn(1);
        when(mockContentPart2.getContext()).thenReturn("section");
        when(mockContentPart2.getStyle()).thenReturn(null);
        when(mockContentPart2.getRole()).thenReturn(null);
        when(mockContentPart2.getTitle()).thenReturn("An header");
        when(mockContentPart2.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockContentPart2.getParts()).thenReturn(null);
        when(mockStructuredDocument1.getParts()).thenAnswer(i -> {
            return Arrays.asList(mockContentPart1, mockContentPart2);
        });
        DocumentHeader mockDocumentHeader1 = mock(DocumentHeader.class);
        when(mockDocumentHeader1.getAuthors()).thenReturn(Collections.emptyList());
        Title mockTitle1 = mock(Title.class);
        when(mockTitle1.getMain()).thenReturn("My page");
        when(mockTitle1.getSubtitle()).thenReturn(null);
        when(mockTitle1.getCombined()).thenReturn("My page");
        when(mockTitle1.isSanitized()).thenReturn(false);
        when(mockDocumentHeader1.getDocumentTitle()).thenReturn(mockTitle1);
        when(mockDocumentHeader1.getPageTitle()).thenReturn("My page");
        Author mockAuthor1 = mock(Author.class);
        when(mockAuthor1.getEmail()).thenReturn(null);
        when(mockAuthor1.getFullName()).thenReturn(null);
        when(mockAuthor1.getFirstName()).thenReturn(null);
        when(mockAuthor1.getLastName()).thenReturn(null);
        when(mockAuthor1.getMiddleName()).thenReturn(null);
        when(mockAuthor1.getInitials()).thenReturn(null);
        when(mockDocumentHeader1.getAuthor()).thenReturn(mockAuthor1);
        RevisionInfo mockRevisionInfo1 = mock(RevisionInfo.class);
        when(mockRevisionInfo1.getDate()).thenReturn(null);
        when(mockRevisionInfo1.getNumber()).thenReturn(null);
        when(mockRevisionInfo1.getRemark()).thenReturn(null);
        when(mockDocumentHeader1.getRevisionInfo()).thenReturn(mockRevisionInfo1);
        when(mockDocumentHeader1.getPageTitle()).thenReturn("My page");
        ImmutableMap<String, Object> map1 = ImmutableMap.<String, Object>builder()
                .put("filetype", "html")
                .put("docdir", "")
                .put("attribute-undefined", "drop-line")
                .build();
        when(mockDocumentHeader1.getAttributes()).thenReturn(map1);
        when(mockStructuredDocument1.getHeader()).thenReturn(mockDocumentHeader1);
        return mockStructuredDocument1;
    }

    public void checkAst(StructuredDocument astStructuredDocument) {
        StructuredDocument structuredDocument1 = astStructuredDocument;
        assertThat(structuredDocument1.getParts()).hasSize(2);
        ContentPart contentPart1 = (ContentPart) structuredDocument1.getParts()
                .get(0);
        assertThat(contentPart1.getId()).isNull();
        assertThat(contentPart1.getLevel()).isEqualTo(1);
        assertThat(contentPart1.getContext()).isEqualTo("preamble");
        assertThat(contentPart1.getStyle()).isNull();
        assertThat(contentPart1.getRole()).isNull();
        assertThat(contentPart1.getTitle()).isNull();
        assertThat(contentPart1.getAttributes()).isEmpty();
        assertThat(contentPart1.getParts()).isNullOrEmpty();
        ContentPart contentPart2 = (ContentPart) structuredDocument1.getParts()
                .get(1);
        assertThat(contentPart2.getId()).isEqualTo("_an_header");
        assertThat(contentPart2.getLevel()).isEqualTo(1);
        assertThat(contentPart2.getContext()).isEqualTo("section");
        assertThat(contentPart2.getStyle()).isNull();
        assertThat(contentPart2.getRole()).isNull();
        assertThat(contentPart2.getTitle()).isEqualTo("An header");
        assertThat(contentPart2.getAttributes()).isEmpty();
        assertThat(contentPart2.getParts()).isNullOrEmpty();
        DocumentHeader documentHeader1 = structuredDocument1.getHeader();
        assertThat(documentHeader1.getAuthors()).isEmpty();
        Title title1 = documentHeader1.getDocumentTitle();
        assertThat(title1.getMain()).isEqualTo("My page");
        assertThat(title1.getSubtitle()).isNull();
        assertThat(title1.getCombined()).isEqualTo("My page");
        assertThat(title1.isSanitized()).isFalse();
        assertThat(documentHeader1.getPageTitle()).isEqualTo("My page");
        Author author1 = documentHeader1.getAuthor();
        assertThat(author1.getEmail()).isNull();
        assertThat(author1.getFullName()).isNull();
        assertThat(author1.getFirstName()).isNull();
        assertThat(author1.getLastName()).isNull();
        assertThat(author1.getMiddleName()).isNull();
        assertThat(author1.getInitials()).isNull();
        RevisionInfo revisionInfo1 = documentHeader1.getRevisionInfo();
        assertThat(revisionInfo1.getDate()).isNull();
        assertThat(revisionInfo1.getNumber()).isNull();
        assertThat(revisionInfo1.getRemark()).isNull();
        assertThat(documentHeader1.getPageTitle()).isEqualTo("My page");
        assertThat(documentHeader1.getAttributes()).containsEntry("docdir", "")
                .containsEntry("filetype", "html")
                .containsEntry("attribute-undefined", "drop-line");
    }

    // tag::generated-code[]
    public EStructuredDocument createEadoc() {
        EStructuredDocument eStructuredDocument1 = EadocFactory.eINSTANCE.createEStructuredDocument();
        EContentPart eContentPart1 = EadocFactory.eINSTANCE.createEContentPart();
        eContentPart1.setId(null);
        eContentPart1.setLevel(1);
        eContentPart1.setContext("preamble");
        eContentPart1.setStyle(null);
        eContentPart1.setRole(null);
        eContentPart1.setTitle(null);
        eContentPart1.setAttributes(Collections.emptyMap());
        eStructuredDocument1.getParts()
                .add(eContentPart1);
        EContentPart eContentPart2 = EadocFactory.eINSTANCE.createEContentPart();
        eContentPart2.setId("_an_header");
        eContentPart2.setLevel(1);
        eContentPart2.setContext("section");
        eContentPart2.setStyle(null);
        eContentPart2.setRole(null);
        eContentPart2.setTitle("An header");
        eContentPart2.setAttributes(Collections.emptyMap());
        eStructuredDocument1.getParts()
                .add(eContentPart2);
        EDocumentHeader eDocumentHeader1 = EadocFactory.eINSTANCE.createEDocumentHeader();
        ETitle eTitle1 = EadocFactory.eINSTANCE.createETitle();
        eTitle1.setMain("My page");
        eTitle1.setSubtitle(null);
        eTitle1.setCombined("My page");
        eTitle1.setSanitized(false);
        eDocumentHeader1.setDocumentTitle(eTitle1);
        eDocumentHeader1.setPageTitle("My page");
        ERevisionInfo eRevisionInfo1 = EadocFactory.eINSTANCE.createERevisionInfo();
        eRevisionInfo1.setDate(null);
        eRevisionInfo1.setNumber(null);
        eRevisionInfo1.setRemark(null);
        eDocumentHeader1.setRevisionInfo(eRevisionInfo1);
        eDocumentHeader1.setPageTitle("My page");
        ImmutableMap<String, Object> map1 = ImmutableMap.<String, Object>builder()
                .put("filetype", "html")
                .put("docdir", "")
                .put("attribute-undefined", "drop-line")
                .build();
        eDocumentHeader1.setAttributes(map1);
        eStructuredDocument1.setHeader(eDocumentHeader1);
        return eStructuredDocument1;
    }
    // end::generated-code[]
}
