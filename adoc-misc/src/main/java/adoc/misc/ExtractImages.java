package adoc.misc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ExtractImages {

    public static Set<String> analyze(Path folder) throws IOException {
        Set<String> images = Files.walk(folder)
                .filter(f -> f.toFile()
                        .isFile()
                        && f.toFile()
                                .getName()
                                .endsWith("html"))
                .flatMap(f -> analyzeFile(f).stream())
                .collect(Collectors.toSet());
        return images;
    }

    public static void printHtmlPage(Set<String> images) {
        StringBuilder sb = new StringBuilder();
        sb.append("<html lang=\"en\">\n");
        sb.append("<body>\n");
        images.stream()
                .sorted()
                .forEach(file -> {
                    sb.append("<p>" + file + "</p>\n");
                    sb.append("<img src=\"" + file + "\" />\n");
                });
        sb.append("</body>\n");
        sb.append("</html>\n");
        System.out.println(sb.toString());
    }

    public static List<String> analyzeFile(Path file) {
        List<String> result = new ArrayList<>();

        String html = Util.readFile(file);
        Document doc = Jsoup.parse(html);

        Elements elements = doc.getElementsByTag("img");
        for (Element element : elements) {
            String src = element.attr("src")
                    .replace("%20", " ");
            if (src != null) {
                //consider that the src attribute is relative to the inFolder:
                Path imgFile = file.getParent()
                        .resolve(src);
                //if no file exists at this location, consider that the src attribute contains an absolute path to the image:
                if (!Files.exists(imgFile) || !Files.isRegularFile(imgFile)) {
                    imgFile = Paths.get(src);
                }
                result.add(imgFile.normalize()
                        .toString());
            }
        }

        return result;
    }
}
