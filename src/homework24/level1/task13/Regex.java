package homework24.level1.task13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
      // task 13
        String str = "Carrot Collapse /\\ Criteria, Avatar. Sort][Cabbage";
        String regex = "\\bC\\w*[te]\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        System.out.println("Все слова начинающиеся на C и заканчивающийся на t или e:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        System.out.println("_____________________");

        // task 14
        String regex2 = "[^\\p{L}]";
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(str);
        System.out.println("Индексы небуквенных симвлов:");
        while (matcher2.find()) {
            System.out.println(matcher2.start());
        }
        System.out.println("_____________________");

        // task 15
        String str3 = "01111000201010101701";
        String regex3 = "[^01]";
        Pattern pattern3 = Pattern.compile(regex3);
        Matcher matcher3 = pattern3.matcher(str3);
        System.out.println("Индексы ошибочных символов:");
        while (matcher3.find()) {
            System.out.println(matcher3.start());
        }

    }
}
