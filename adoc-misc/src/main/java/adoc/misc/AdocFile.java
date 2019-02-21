package adoc.misc;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class AdocFile {

    private Path file;
    private String title;
    private List<String> aliases;

    public AdocFile(Path file, String title, List<String> aliases) {
        this.file = file;
        this.title = title;
        this.aliases = aliases;
    }

    public Path getFile() {
        return file;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getAliases() {
        return aliases;
    }

    public List<String> getAllTitles() {
        List<String> list = new ArrayList<>();
        list.add(title);
        list.addAll(aliases);
        return list;
    }
}
