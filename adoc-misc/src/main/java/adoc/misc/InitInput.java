/**
 *
 */
package adoc.misc;

import java.nio.file.Path;

/**
 * @author jbr
 *
 */
public class InitInput {

    private Path initFile;
    private Mode mode;

    public InitInput(Path initFile, Mode mode) {
        this.initFile = initFile;
        this.mode = mode;
    }

    public static enum Mode {
        LINK, TEXT
    }

    public Path getInitFile() {
        return initFile;
    }

    public Mode getMode() {
        return mode;
    }
}
