package homework200423.task1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortApp {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");
        List<String> sortedList = list.stream()
                .distinct()
                .sorted()
                .toList();
        System.out.println("Список без дубликатов, отсортированный в прямом порядке: " + sortedList);
        List<String> reservedSortedList = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Список без дубликатов, отсортированный в обратном порядке: " + reservedSortedList);
    }
}
