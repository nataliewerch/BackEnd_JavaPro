package homework23.level1.task9_10;

import java.io.*;

public class StreamTest {
    public static void main(String[] args)  {
        String str = "Привет! Привет!";
        writeToFile(str);
        readString("/Users/Natalie/Desktop/BackEnd/BackEnd/src/homework22/level1/task7/poem.txt");

    }
    //task 10
    public static void writeToFile(String str) {
        try (Writer writer = new FileWriter("/Users/Natalie/Desktop/BackEnd/BackEnd/src/homework22/level1/task7/poem.txt")) {
            writer.write(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // task 9
    public static void readString(String fileName) {
        try (
                Reader reader = new BufferedReader(new FileReader(fileName))) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
