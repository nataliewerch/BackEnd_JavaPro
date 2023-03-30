package homework12.level1.task5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountingCharInString {
    public static void main(String[] args) {
        String str = "Aaaa aBBbbbc> bcbcb";
        countingChar(str);

    }
    public static void countingChar(String str){
        Map<Character, Integer> charVolume = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
            }
                int value = charVolume.getOrDefault(ch, 0);
                charVolume.put(ch, value + 1);
        }
        for (Map.Entry<Character, Integer> entry : charVolume.entrySet()) {
            Character key = entry.getKey();
            int value = entry.getValue();
            if (key == ' ') {
                System.out.println("Символ: пробел/ space встречается: " + value + " раза.");
            } else {
                System.out.println("Символ: " + key + " встречается: " + value + " раз.");
            }
        }
    }
}
