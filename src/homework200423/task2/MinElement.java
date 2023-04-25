package homework200423.task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinElement {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1", "b5", "a2", "b4");
        String min = list.stream()
                .min(Comparator.naturalOrder())
                .orElse(null);
        System.out.println("Минимальный элемент: " + min);
    }
}
