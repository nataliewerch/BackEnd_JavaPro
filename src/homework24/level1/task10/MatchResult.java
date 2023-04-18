package homework24.level1.task10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchResult {
    public static void main(String[] args) {
        String file = "/Users/Natalie/Desktop/BackEnd/BackEnd/src/homework22/level1/task8/matches.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
        Pattern pattern = Pattern.compile("\\b\\p{Lu}{1}[\\p{L}]+\\s\\p{Lu}{1}[\\p{L}]+\\b");
        String str;
        while ((str = reader.readLine()) != null){
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
