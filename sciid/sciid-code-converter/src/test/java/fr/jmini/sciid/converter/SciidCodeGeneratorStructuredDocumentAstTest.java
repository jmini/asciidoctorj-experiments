package fr.jmini.sciid.converter;

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
import fr.jmini.sciid.SContentPart;
import fr.jmini.sciid.SDocumentHeader;
import fr.jmini.sciid.SRevisionInfo;
import fr.jmini.sciid.SStructuredDocument;
import fr.jmini.sciid.STitle;
import fr.jmini.sciid.SciidFactory;

/* tag::input-asciidoc[]
= My page

Some text

== An header

What does it mean?

end::input-asciidoc[] */
public class SciidCodeGeneratorStructuredDocumentAstTest {

    @Test
    public void testAst() throws Exception {
        StructuredDocument mockStructuredDocument1 = createMock();

        SciidCodeGenerator generator = new SciidCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createStructuredDocumentCode(sb, mockStructuredDocument1);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());

        StructuredDocument sStructuredDocument = createSciidObject();
        checkAst(sStructuredDocument);
    }

    // tag::mock-code[]
    public StructuredDocument createMock() {
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
        when(mockStructuredDocument1.getParts()).thenReturn(Arrays.asList(mockContentPart1, mockContentPart2));
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
                .put("doctitle", "My page")
                .put("doctype", "article")
                .put("filetype", "html")
                .put("notitle", "")
                .build();
        when(mockDocumentHeader1.getAttributes()).thenReturn(map1);
        when(mockStructuredDocument1.getHeader()).thenReturn(mockDocumentHeader1);
        return mockStructuredDocument1;
    }
    // end::mock-code[]

    // tag::assert-code[]
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
        assertThat(contentPart1.getAttributes()).isNullOrEmpty();
        assertThat(contentPart1.getParts()).isNullOrEmpty();
        ContentPart contentPart2 = (ContentPart) structuredDocument1.getParts()
                .get(1);
        assertThat(contentPart2.getId()).isEqualTo("_an_header");
        assertThat(contentPart2.getLevel()).isEqualTo(1);
        assertThat(contentPart2.getContext()).isEqualTo("section");
        assertThat(contentPart2.getStyle()).isNull();
        assertThat(contentPart2.getRole()).isNull();
        assertThat(contentPart2.getTitle()).isEqualTo("An header");
        assertThat(contentPart2.getAttributes()).isNullOrEmpty();
        assertThat(contentPart2.getParts()).isNullOrEmpty();
        DocumentHeader documentHeader1 = structuredDocument1.getHeader();
        assertThat(documentHeader1.getAuthors()).isNullOrEmpty();
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
        assertThat(documentHeader1.getAttributes()).containsEntry("doctitle", "My page")
                .containsEntry("doctype", "article")
                .containsEntry("filetype", "html")
                .containsEntry("notitle", "");
    }
    // end::assert-code[]

    // tag::generated-code[]
    public SStructuredDocument createSciidObject() {
        SStructuredDocument sStructuredDocument1 = SciidFactory.eINSTANCE.createSStructuredDocument();
        SContentPart sContentPart1 = SciidFactory.eINSTANCE.createSContentPart();
        sContentPart1.setId(null);
        sContentPart1.setLevel(1);
        sContentPart1.setContext("preamble");
        sContentPart1.setStyle(null);
        sContentPart1.setRole(null);
        sContentPart1.setTitle(null);
        sContentPart1.setAttributes(Collections.emptyMap());
        sStructuredDocument1.getParts()
                .add(sContentPart1);
        SContentPart sContentPart2 = SciidFactory.eINSTANCE.createSContentPart();
        sContentPart2.setId("_an_header");
        sContentPart2.setLevel(1);
        sContentPart2.setContext("section");
        sContentPart2.setStyle(null);
        sContentPart2.setRole(null);
        sContentPart2.setTitle("An header");
        sContentPart2.setAttributes(Collections.emptyMap());
        sStructuredDocument1.getParts()
                .add(sContentPart2);
        SDocumentHeader sDocumentHeader1 = SciidFactory.eINSTANCE.createSDocumentHeader();
        STitle sTitle1 = SciidFactory.eINSTANCE.createSTitle();
        sTitle1.setMain("My page");
        sTitle1.setSubtitle(null);
        sTitle1.setCombined("My page");
        sTitle1.setSanitized(false);
        sDocumentHeader1.setDocumentTitle(sTitle1);
        sDocumentHeader1.setPageTitle("My page");
        SRevisionInfo sRevisionInfo1 = SciidFactory.eINSTANCE.createSRevisionInfo();
        sRevisionInfo1.setDate(null);
        sRevisionInfo1.setNumber(null);
        sRevisionInfo1.setRemark(null);
        sDocumentHeader1.setRevisionInfo(sRevisionInfo1);
        sDocumentHeader1.setPageTitle("My page");
        ImmutableMap<String, Object> map1 = ImmutableMap.<String, Object>builder()
                .put("doctitle", "My page")
                .put("doctype", "article")
                .put("filetype", "html")
                .put("notitle", "")
                .build();
        sDocumentHeader1.setAttributes(map1);
        sStructuredDocument1.setHeader(sDocumentHeader1);
        return sStructuredDocument1;
    }
    // end::generated-code[]
}
