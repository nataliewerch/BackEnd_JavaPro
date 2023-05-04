package homework270423.lesson;

import java.io.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeFiles {

    public static void main(String[] args) {

        String data = "A_B_C_D";
        String path = "/Users/Natalie/Desktop/BackEnd/BackEnd/src/homework270423/lesson/files";
        String resultPath = path + "/result.txt";
        String[] inputData = data.split("_");
       for (String str : inputData){
           createFile(path + "/" + str + ".txt", str);
       }
        mergeAllChars(path,resultPath);
    }

    private static void createFile(String path, String content) {
        try(FileWriter fileWriter = new FileWriter(path)){
            fileWriter.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getDataFromFile(String path) {
        try(FileReader reader = new FileReader(path)) {
            StringBuilder sb = new StringBuilder();
            while (reader.ready()) {
                sb.append((char) reader.read());
            }
            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void mergeAllChars(String path, String resultPath) {
        File dir = new File(path);
        File[] files = dir.listFiles();
        if(files == null) {
            System.out.println("Директории не существует");
            return;
        }
        String data = Stream.of(files)
                .filter(file -> !file.isDirectory())
                .map(File::getPath)
                .map(MergeFiles::getDataFromFile)
                .collect(Collectors.joining());
        createFile(resultPath, data);
    }
}
