package homework270423.task2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FileTest {

    public static void main(String[] args) {

        String message = "This is my first experience when I myself work with IO API";
        String directoryPath = "/Users/Natalie/Desktop/test";
        List<String> messages = Arrays.asList(message.split(" "));
        Map<String, String> fileMap = messages.stream().collect(Collectors.toMap(s -> s + ".txt", s -> s.toLowerCase()));
        try {
            Files.createDirectory(Paths.get(directoryPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        fileMap.forEach((filename, text) -> generateFile(directoryPath, filename, text));
    }
    private static void generateFile(String directoryPath, String filename, String text) {
        File directory = new File(directoryPath);
        String filePath = directoryPath + "/" + filename;
        try (FileWriter writer = new FileWriter(filePath)) {
          writer.write(text);
            } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}