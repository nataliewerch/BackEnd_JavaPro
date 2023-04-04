package homework22.level2.task1;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TerminalTest {
    public static void main(String[] args) throws IOException {
        Path dirName = Paths.get("src/homework22/level2/task1");
        Terminal terminal = new Terminal(dirName);
        terminal.run();
    }
}
