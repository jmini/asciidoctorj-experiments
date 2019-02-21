/**
 *
 */
package adoc.misc;

import static org.assertj.core.api.Assertions.assertThat;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

import org.junit.jupiter.api.Test;

class CreateInitTest {

    private static final Path DOCS = Paths.get("src/test/resources/example-setup/docs");
    private static final Path LOREM_FILE = DOCS.resolve("concepts/lorem.adoc");
    private static final Path IPSUM_FILE = DOCS.resolve("concepts/ipsum.adoc");

    @Test
    void testCreateAdocFile() {
        Optional<AdocFile> optLorem = CreateInit.createAdocFile(LOREM_FILE);
        assertThat(optLorem).isPresent();

        AdocFile lorem = optLorem.get();
        assertThat(lorem).isNotNull();
        assertThat(lorem.getFile()).isEqualTo(LOREM_FILE);
        assertThat(lorem.getTitle()).isEqualTo("Lorem");
        assertThat(lorem.getAliases()).containsExactly("lorem", "finibus lorem");

        Optional<AdocFile> optIpsum = CreateInit.createAdocFile(IPSUM_FILE);
        assertThat(optIpsum).isPresent();

        AdocFile ipsum = optIpsum.get();
        assertThat(ipsum).isNotNull();
        assertThat(ipsum.getFile()).isEqualTo(IPSUM_FILE);
        assertThat(ipsum.getTitle()).isEqualTo("Ipsum");
        assertThat(ipsum.getAliases()).isEmpty();
    }

    @Test
    void testCreateReferences() {
        AdocFile lorem = new AdocFile(LOREM_FILE, "Lorem", Arrays.asList("lorem", "finibus lorem"));
        AdocFile ipsum = new AdocFile(IPSUM_FILE, "Ipsum", Collections.emptyList());

        String referencesLinkDocs = CreateInit.createReferences(DOCS, Arrays.asList(lorem, ipsum), InitInput.Mode.LINK);
        assertThat(referencesLinkDocs).isEqualTo("//references start\n" +
                ":finibus-lorem: <<{root}concepts/lorem.adoc#, finibus lorem>>\n" +
                ":ipsum: <<{root}concepts/ipsum.adoc#, Ipsum>>\n" +
                ":lorem: <<{root}concepts/lorem.adoc#, Lorem>>\n" +
                ":_lorem: <<{root}concepts/lorem.adoc#, lorem>>\n" +
                "//references end");
        String referencesTextDocs = CreateInit.createReferences(DOCS, Arrays.asList(lorem, ipsum), InitInput.Mode.TEXT);
        assertThat(referencesTextDocs).isEqualTo("//references start\n" +
                ":finibus-lorem: finibus lorem\n" +
                ":ipsum: Ipsum\n" +
                ":lorem: Lorem\n" +
                ":_lorem: lorem\n" +
                "//references end");

        AdocFile file2 = new AdocFile(DOCS.resolve("file2.adoc"), "Title", Collections.emptyList());
        AdocFile file1 = new AdocFile(DOCS.resolve("file1.adoc"), "Title", Arrays.asList("title"));

        String references = CreateInit.createReferences(DOCS, Arrays.asList(file1, file2), InitInput.Mode.LINK);
        assertThat(references).isEqualTo("//references start\n" +
                ":title: <<{root}file1.adoc#, Title>>\n" +
                ":_title: <<{root}file2.adoc#, Title>>\n" +
                ":__title_2: <<{root}file1.adoc#, title>>\n" +
                "//references end");
    }

    @Test
    void testUpdateInit() throws Exception {
        Path initFile = DOCS.resolve("_init.adoc");
        String previousContent = Util.readFile(initFile);

        InitInput input = new InitInput(initFile, InitInput.Mode.LINK);
        CreateInit.updateInit(DOCS, Collections.singletonList(input));

        String newContent = Util.readFile(initFile);
        assertThat(newContent).isEqualTo(previousContent);
    }

    @Test
    void testToName() throws Exception {
        assertThat(CreateInit.toName("'Join' (PIN)")).isEqualTo("join-pin");
        assertThat(CreateInit.toName("visitor(s)")).isEqualTo("visitor-s");
    }

}
