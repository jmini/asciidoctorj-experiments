package adoc.misc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

import fr.jmini.utils.substringfinder.PositionFinder;
import fr.jmini.utils.substringfinder.Range;
import fr.jmini.utils.substringfinder.SubstringFinder;

public class SearchUnresolvedAttributes {

    public static void searchInFolder(Path buildFolder) throws IOException {
        Files.walk(buildFolder)
                .filter(f -> f.toFile()
                        .isFile()
                        && f.toFile()
                                .getName()
                                .endsWith("html"))
                .forEach(f -> searchInFile(f));
    }

    static void searchInFile(Path file) {
        String content = Util.readFile(file);
        searchInContent(content, file);
    }

    static void searchInContent(String content, Path file) {
        SubstringFinder finder = SubstringFinder.define("<body", "</body>");
        Optional<Range> findRange = finder.nextRange(content);
        if (!findRange.isPresent()) {
            throw new IllegalStateException("Could not find body range");
        }

        Range range = findRange.get();
        String bodyContent = content.substring(range.getContentStart(), range.getContentEnd());

        PositionFinder bracketFinder = PositionFinder.define("{", "<svg", "</svg>");
        List<Integer> positions = bracketFinder.indexesOf(bodyContent);

        if (!positions.isEmpty()) {
            System.out.println("Found in: " + file);
        }
    }

}
