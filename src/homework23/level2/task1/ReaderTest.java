package homework23.level2.task1;

import java.io.*;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ReaderTest {
    public static void main(String[] args) throws IOException {
      // task 1
  /*     try(Reader reader = new FileReader("/Users/Natalie/Desktop/BackEnd/BackEnd/src/homework22/level1/task8/matches.txt")) {
          int ch;
          int count = 0;
          while ((ch = reader.read()) != -1) {
              if (ch == ',') {
                  count++;
              }
          }
           System.out.println(count);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }

*/
       //task 2

      /*  try (Reader reader = new BufferedReader(new FileReader("/Users/Natalie/Desktop/BackEnd/BackEnd/src/homework22/level1/task8/matches.txt"));
            Writer writer = new BufferedWriter(new FileWriter("/Users/Natalie/Desktop/BackEnd/BackEnd/src/homework23/level2/task1/task2.txt"))) {
           char[] buffer = new char[200];
            reader.skip(100);
            reader.read(buffer, 0, 200);
            writer.write(buffer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        //task 3
     /*   try (InputStream inputStream = new BufferedInputStream(new FileInputStream("/Users/Natalie/Desktop/BackEnd/BackEnd/src/homework22/level1/task8/matches.txt"))){
        byte[] bytes = inputStream.readAllBytes();
            System.out.println(Arrays.toString(bytes));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        //task 4
        String file1 = "src/homework23/level2/task1/task4_1.txt";
        String file2 = "src/homework23/level2/task1/task4_2.txt";
       /* try (FileOutputStream fos = new FileOutputStream(file1)){
           String str = "Привет мир";
            fos.write(str.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (FileInputStream fis = new FileInputStream(file1);
            ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            byte[] bytes = fis.readAllBytes();
            bos.write(bytes);
            byte[] bytes2 = bos.toByteArray();
            ByteArrayInputStream bis = new ByteArrayInputStream(bytes2);
       try(FileOutputStream fos = new FileOutputStream(file2)) {
           fos.write(bis.readAllBytes());
       }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        // task 5
        Map<Character, Integer> count = new HashMap<>();
        String str;
        try (Reader reader = new BufferedReader(new FileReader(file2))) {
            char[] buffer = new char[file1.length()];
            reader.read(buffer);
            str = new String(buffer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (count.containsKey(ch)) {
                count.put(ch, count.get(ch) + 1);
            }else {
                count.put(ch, 1);
            }
        }
        try(Writer writer = new BufferedWriter(new FileWriter("src/homework23/level2/task1/task5.txt"))) {
            for (char c : count.keySet()) {
                writer.write(c + ": " + count.get(c) + "\n");
            }
        }
    }
}
