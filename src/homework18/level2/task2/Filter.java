package homework18.level2.task2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        List<String> surnames = Arrays.asList("Petrov", "Ivanov", "Join", "James", "Step", "Jan");
        filter(surnames);

    }

    public static <T extends List<String>> void filter(T lastName) {
        lastName.stream()
                .filter(name -> name.startsWith("J"))
                .forEach(System.out::println);
    }
}
