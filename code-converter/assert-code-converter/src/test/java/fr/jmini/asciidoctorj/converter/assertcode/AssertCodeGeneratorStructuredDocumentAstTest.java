package fr.jmini.asciidoctorj.converter.assertcode;

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

public class AssertCodeGeneratorStructuredDocumentAstTest {

    @Test
    public void testAst() throws Exception {
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
                .put("localtime", "18:46:11 CET")
                .put("tip-caption", "Tip")
                .put("filetype", "html")
                .put("appendix-caption", "Appendix")
                .put("asciidoctor-version", "1.5.6.1")
                .put("doctime", "18:46:11 CET")
                .put("appendix-refsig", "Appendix")
                .put("safe-mode-secure", "")
                .put("localyear", "2017")
                .put("toc-title", "Table of Contents")
                .put("backend-html5-doctype-article", "")
                .put("docdate", "2017-11-26")
                .put("manname-title", "NAME")
                .put("basebackend-html", "")
                .put("stylesheet", "")
                .put("iconsdir", "./images/icons")
                .put("localdate", "2017-11-26")
                .put("doctype-article", "")
                .put("warning-caption", "Warning")
                .put("figure-caption", "Figure")
                .put("attribute-missing", "skip")
                .put("section-refsig", "Section")
                .put("outfilesuffix", ".html")
                .put("basebackend-html-doctype-article", "")
                .put("docdir", "")
                .put("localdatetime", "2017-11-26 18:46:11 CET")
                .put("toc-placement", "auto")
                .put("webfonts", "")
                .put("htmlsyntax", "html")
                .put("docdatetime", "2017-11-26 18:46:11 CET")
                .put("important-caption", "Important")
                .put("note-caption", "Note")
                .put("stylesdir", ".")
                .put("untitled-label", "Untitled")
                .put("linkcss", "")
                .put("max-include-depth", "64")
                .put("caution-caption", "Caution")
                .put("user-home", ".")
                .put("filetype-html", "")
                .put("max-attribute-value-size", "4096")
                .put("safe-mode-level", "20")
                .put("backend", "html5")
                .put("safe-mode-name", "secure")
                .put("notitle", "")
                .put("table-caption", "Table")
                .put("example-caption", "Example")
                .put("embedded", "")
                .put("basebackend", "html")
                .put("prewrap", "")
                .put("version-label", "Version")
                .put("asciidoctor", "")
                .put("last-update-label", "Last updated")
                .put("doctitle", "My page")
                .put("doctype", "article")
                .put("docyear", "2017")
                .put("chapter-refsig", "Chapter")
                .put("backend-html5", "")
                .put("iconfont-remote", "")
                .put("sectids", "")
                .put("attribute-undefined", "drop-line")
                .build();
        when(mockDocumentHeader1.getAttributes()).thenReturn(map1);
        when(mockStructuredDocument1.getHeader()).thenReturn(mockDocumentHeader1);

        AssertCodeGenerator generator = new AssertCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createStructuredDocumentCode(sb, mockStructuredDocument1);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());

        checkAst(mockStructuredDocument1);
    }

    // tag::generated-code[]
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
        assertThat(documentHeader1.getAttributes()).containsEntry("appendix-caption", "Appendix")
                .containsEntry("appendix-refsig", "Appendix")
                .containsEntry("asciidoctor", "")
                .containsEntry("asciidoctor-version", "1.5.6.1")
                .containsEntry("attribute-missing", "skip")
                .containsEntry("attribute-undefined", "drop-line")
                .containsEntry("backend", "html5")
                .containsEntry("backend-html5", "")
                .containsEntry("backend-html5-doctype-article", "")
                .containsEntry("basebackend", "html")
                .containsEntry("basebackend-html", "")
                .containsEntry("basebackend-html-doctype-article", "")
                .containsEntry("caution-caption", "Caution")
                .containsEntry("chapter-refsig", "Chapter")
                .containsEntry("docdate", "2017-11-26")
                .containsEntry("docdatetime", "2017-11-26 18:46:11 CET")
                .containsEntry("docdir", "")
                .containsEntry("doctime", "18:46:11 CET")
                .containsEntry("doctitle", "My page")
                .containsEntry("doctype", "article")
                .containsEntry("doctype-article", "")
                .containsEntry("docyear", "2017")
                .containsEntry("embedded", "")
                .containsEntry("example-caption", "Example")
                .containsEntry("figure-caption", "Figure")
                .containsEntry("filetype", "html")
                .containsEntry("filetype-html", "")
                .containsEntry("htmlsyntax", "html")
                .containsEntry("iconfont-remote", "")
                .containsEntry("iconsdir", "./images/icons")
                .containsEntry("important-caption", "Important")
                .containsEntry("last-update-label", "Last updated")
                .containsEntry("linkcss", "")
                .containsEntry("localdate", "2017-11-26")
                .containsEntry("localdatetime", "2017-11-26 18:46:11 CET")
                .containsEntry("localtime", "18:46:11 CET")
                .containsEntry("localyear", "2017")
                .containsEntry("manname-title", "NAME")
                .containsEntry("max-attribute-value-size", "4096")
                .containsEntry("max-include-depth", "64")
                .containsEntry("note-caption", "Note")
                .containsEntry("notitle", "")
                .containsEntry("outfilesuffix", ".html")
                .containsEntry("prewrap", "")
                .containsEntry("safe-mode-level", "20")
                .containsEntry("safe-mode-name", "secure")
                .containsEntry("safe-mode-secure", "")
                .containsEntry("sectids", "")
                .containsEntry("section-refsig", "Section")
                .containsEntry("stylesdir", ".")
                .containsEntry("stylesheet", "")
                .containsEntry("table-caption", "Table")
                .containsEntry("tip-caption", "Tip")
                .containsEntry("toc-placement", "auto")
                .containsEntry("toc-title", "Table of Contents")
                .containsEntry("untitled-label", "Untitled")
                .containsEntry("user-home", ".")
                .containsEntry("version-label", "Version")
                .containsEntry("warning-caption", "Warning")
                .containsEntry("webfonts", "");
    }
    // end::generated-code[]
}
