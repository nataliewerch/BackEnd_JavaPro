package homework20.level1.task6_8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SteamTest {
    public static void main(String[] args) {
        // task 6
        List<String> arrayList = Arrays.asList("f10", "f15", "f2", "f4", "f4");
        List<String> sortedList = arrayList.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .toList();
        System.out.println("Отсортированный уникальный лист: ");
        System.out.println(sortedList);
        System.out.println("_______________________________________________");


        // task 7
        List<String> stringList =  Arrays.asList("Highload", "High", "Load", "Highload");
        long count = stringList.stream()
                .filter(s -> s.contains("High"))
                .count();
        System.out.println("Объект «High» встречается в коллекции: " + count + " раза.");

        String firstElement = stringList.stream()
                .findFirst()
                .orElse(String.valueOf(0));
        System.out.println("Первый элемент в коллекции: " + firstElement);
        System.out.println("_______________________________________________");
        System.out.println();

        // task 8
        List<Integer> integerList = IntStream.rangeClosed(-40, 40)
                .map(i -> i * i)
                .filter(i -> i > 100)
                .boxed()
                .toList();
        System.out.println("List: " + integerList);
        System.out.println();

        Set<Integer> integerSet = IntStream.rangeClosed(-40, 40)
                .map(i -> i * i)
                .filter(i -> i > 100)
                .boxed()
                .collect(Collectors.toSet());
        System.out.println("Set: " + integerSet);
        System.out.println();

        LinkedList<Integer> integerLinkedList = IntStream.rangeClosed(-40, 40)
                .map(i -> i * i)
                .filter(i -> i > 100)
                .boxed()
                .collect(Collectors.toCollection(LinkedList::new));
        System.out.println("LinkedList: " + integerLinkedList);

    }
}
