package homework24.level1.task12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StringBuilder {
    public static void main(String[] args) {
    String file = "/Users/Natalie/Desktop/BackEnd/BackEnd/src/homework22/level1/task8/table.txt";

        java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
      String str;
       while ((str = reader.readLine()) != null) {
           stringBuilder.append(str);
       }
    } catch (IOException e) {
        throw new RuntimeException(e);
    }

        String strResult = stringBuilder.toString();
        System.out.println(strResult);


    }
}
