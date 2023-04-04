package homework22.level1.task7;

import java.io.*;

public class FileTest {
    public static void main(String[] args) throws IOException {
        String poem = "Бывает — проснешься, как птица,\nкрылатой пружиной на взводе,\nи хочется жить и трудиться;\nно к завтраку это проходит.";
        File file = new File("src/homework22/level1/task7/poem.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(poem);
        writer.close();
    }

}
