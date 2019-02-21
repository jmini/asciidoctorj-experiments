package adoc.misc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import fr.jmini.utils.substringfinder.Range;
import fr.jmini.utils.substringfinder.SubstringFinder;

public class CreateInit {

    private static final String START = "//references start";
    private static final String END = "//references end";

    private static final Pattern TITLE_REGEX = Pattern.compile("==(.+)");
    private static final Pattern ALIAS_REGEX = Pattern.compile("// *ALIAS:(.+)");

    public static void updateInit(Path docsFolder, List<InitInput> initInputs) throws IOException {
        List<AdocFile> adocFiles = Files.walk(docsFolder)
                .filter(f -> f.toFile()
                        .isFile()
                        && f.toFile()
                                .getName()
                                .endsWith("adoc"))
                .map(f -> createAdocFile(f))
                .filter(a -> a.isPresent())
                .map(Optional::get)
                .collect(Collectors.toList());
        initInputs.forEach(i -> replaceReferences(docsFolder, i, adocFiles));
    }

    private static void replaceReferences(Path docsFolder, InitInput initInput, List<AdocFile> adocFiles) {
        String content = Util.readFile(initInput.getInitFile());

        SubstringFinder finder = SubstringFinder.define(START, END);
        Optional<Range> findRange = finder.nextRange(content);
        if (findRange.isPresent()) {
            Range range = findRange.get();

            String referencesContent = createReferences(docsFolder, adocFiles, initInput.getMode());
            String newContent = content.substring(0, range.getRangeStart()) + referencesContent + content.substring(range.getRangeEnd());
            Util.writeFile(initInput.getInitFile(), newContent);
        } else {
            throw new IllegalStateException("Could not find range delimited by '" + START + "' and '" + END + "' ");
        }
    }

    static Optional<AdocFile> createAdocFile(Path file) {
        String content = Util.readFile(file);

        Matcher titleMatcher = TITLE_REGEX.matcher(content);
        if (!titleMatcher.find()) {
            return Optional.empty();
        }
        String title = titleMatcher.group(1)
                .trim();
        int titleStart = titleMatcher.start();

        List<String> aliases = new ArrayList<>();
        Matcher aliasMatcher = ALIAS_REGEX.matcher(content);
        while (aliasMatcher.find() && aliasMatcher.start() < titleStart) {
            String alias = aliasMatcher.group(1)
                    .trim();
            aliases.add(alias);
        }

        return Optional.of(new AdocFile(file, title, aliases));
    }

    static String createReferences(Path docsFolder, List<AdocFile> files, InitInput.Mode mode) {
        StringBuilder sb = new StringBuilder();
        sb.append(START + "\n");
        Map<String, List<TitleAndFileHolder>> titles = files.stream()
                .flatMap(a -> {
                    return a.getAllTitles()
                            .stream()
                            .map(t -> new TitleAndFileHolder(t, a.getFile()));
                })
                .collect(Collectors.groupingBy(h -> toName(h.title)));

        titles.entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .forEach(entry -> {
                    List<TitleAndFileHolder> list = entry.getValue()
                            .stream()
                            .sorted(Comparator.comparing(TitleAndFileHolder::getTitle)
                                    .thenComparing(TitleAndFileHolder::getFile))
                            .collect(Collectors.toList());
                    int i = 0;
                    for (TitleAndFileHolder element : list) {
                        Path subPath = docsFolder.relativize(element.file);
                        String key;
                        switch (i) {
                        case 0:
                            key = entry.getKey();
                            break;
                        case 1:
                            key = "_" + entry.getKey();
                            break;
                        default:
                            key = "_" + "_" + entry.getKey() + "_" + i;
                            break;
                        }
                        String value;
                        switch (mode) {
                        case TEXT:
                            value = element.title;
                            break;
                        default:
                        case LINK:
                            value = "<<{root}" + subPath + "#, " + element.title + ">>";
                            break;
                        }
                        sb.append(toReferenceDefinition(key, value));
                        i = i + 1;
                    }
                });
        sb.append(END);
        return sb.toString();
    }

    private static String toReferenceDefinition(String key, String value) {
        return ":" + key + ": " + value + "\n";
    }

    static String toName(String title) {
        String name = title;
        name = name.replace("&", "");
        name = name.replace("-", "");
        name = name.replace("'", "");
        name = name.replace("(", " ");
        name = name.replace(")", " ");
        name = name.replaceAll(" +", " ");
        name = name.trim();
        name = name.replace(" ", "-");
        return name.toLowerCase();
    }

    private static class TitleAndFileHolder {
        private String title;
        private Path file;

        public TitleAndFileHolder(String title, Path file) {
            this.title = title;
            this.file = file;
        }

        public String getTitle() {
            return title;
        }

        public Path getFile() {
            return file;
        }

    }
}
