package homework020523;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;


public class MergeFilesWithPath {

    public static void main(String[] args) {
        String data = "A_B_C_D";
        Path path = Path.of("/Users/Natalie/Desktop/BackEnd/BackEnd/src/homework020523/files");
        Path resultPath = path.resolve("result.txt");
        String[] inputData = data.split("_");
        for (String str : inputData){
            createFile(path.resolve(str + ".txt"), str);
        }
        mergeAllChars(path,resultPath);
    }

    private static void createFile(Path path, String content) {
        try{
            Files.writeString(path, content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getDataFromFile(Path path) {
        try {
            return Files.readString(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void mergeAllChars(Path path, Path resultPath) {
        String data = null;
        try {
            data = Files.list(path)
                    .filter(path1 -> !Files.isDirectory(path1))
                    .map(MergeFilesWithPath::getDataFromFile)
                    .collect(Collectors.joining());
        } catch (IOException e) {
            e.printStackTrace();
        }
        createFile(resultPath, data);
    }
}
