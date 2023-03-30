package homework16.level2.task1_4;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 5, 3, 8, 2);
        Comparator<Integer> comparator = Comparator.naturalOrder();
        MaxFinder maxFinder = new MaxFinder();
        Integer max = maxFinder.findMax(integers, comparator);
        System.out.println(max);

        List<String> strings = List.of("apple", "house", "cherry", "game", "baum");
        String maxStr = MaxFinder.findMax(strings);
        System.out.println(maxStr);

        Collection<Double> doubles = Set.of(3.14, 2.718, 1.618, 4.669);
        Comparator<Double> comparator1 = Comparator.reverseOrder();
        Double maxDouble = MaxFinder.findMax(doubles, comparator1);
        System.out.println(maxDouble);


        Collection<Integer> integers1 = List.of(6, 9, 3, 7, 1);
        Integer maxInt = MaxFinder.findMax(integers1);
        System.out.println(maxInt);


    }
}
