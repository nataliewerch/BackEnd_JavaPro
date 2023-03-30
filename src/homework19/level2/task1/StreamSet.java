package homework19.level2.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamSet {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add((int) (Math.random() * 201 - 100));
        }

        Set<Integer> filteredList = list.stream()
                .filter(s -> Math.abs(s) < 50)
                .map(s -> s + 20)
                .sorted()
                .skip(5)
                .limit(5)
                .collect(Collectors.toSet());
        System.out.println(filteredList);
    }
}
