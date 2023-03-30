package homework18.level1.task8_11;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntSupplier;


public class FunctionTest {
    public static void main(String[] args) {
        printer("Hello");
        printer(29);
        printer(33.87);

        List<Integer> list = Arrays.asList(5, 56, 3, 34, 45, 12);
        sort(Integer::compareTo).accept(list);
        System.out.println(list);

        System.out.println(stringTransform("Home"));

        //Task 11
        Random random = new Random();
        IntSupplier supplier = random::nextInt;
        System.out.println(supplier.getAsInt());
    }
            //Task 8
    public static <T> void printer(T value) {
        Consumer<T> print = System.out::println;
        print.accept(value);
    }

         //Task 9
    public static <T> Consumer<List<T>> sort(Comparator<T> comparator) {
        return list -> list.sort(comparator);
    }

    //Task 10
    public static String stringTransform (String str) {
        return ((Function<String, String>) s -> s + "Test" )
                .andThen(s -> s.substring(3))
                .andThen(s -> s + ".")
                .apply(str);
    }


}