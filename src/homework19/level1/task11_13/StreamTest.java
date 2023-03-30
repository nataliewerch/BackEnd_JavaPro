package homework19.level1.task11_13;

import java.util.*;

public class StreamTest {
    public static void main(String[] args) {
        //task 11
        List<String> listBig = Arrays.asList("BigBen", "BigBob", "Big", "Ben", "Big Bob");
        long count = listBig.stream()
                .filter(s -> s.contains("Big"))
                .count();
        System.out.println(count);

        //task 12
        List<String> listMaxMin = Arrays.asList("House", "Little", "Big", "Boss", "Bon");
        Optional<String> maxString = listMaxMin.stream()
                .max(Comparator.comparing(String::length));
        System.out.println(maxString);
        Optional<String> minString = listMaxMin.stream()
                .min(Comparator.comparing(String::length));
        System.out.println(minString);

        //task 13
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            integerList.add(new Random().nextInt(50));
        }
        System.out.println(integerList);
        int integers =  integerList.stream()
                .filter(s -> s < 25)
                .map(s -> s + 10)
                .map(s -> s * s)
                .filter(s -> s < 100)
                .findFirst()
                .orElse(-1);
        System.out.println(integers);
    }
}
