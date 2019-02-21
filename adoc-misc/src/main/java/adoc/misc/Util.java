package adoc.misc;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Util {

    static String readFile(Path file) {
        String content;
        try {
            content = new String(Files.readAllBytes(file));
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalStateException("Could not read file: " + file, e);
        }
        return content;
    }

    static void writeFile(Path file, String content) {
        try {
            Files.write(file, content.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalStateException("Could not write file: " + file, e);
        }
    }

}
