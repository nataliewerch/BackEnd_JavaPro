package homework18.level2.task4;

import java.util.Optional;
import java.util.function.Function;

public class OptionalTest {
    public static void main(String[] args) {
        Function<Integer, Integer> square = x-> x + x;

        System.out.println(returnNull(square, null));
        System.out.println(returnNull(square, 4));

        System.out.println(returnIfFour(square, 4));
        System.out.println(returnIfFour(square, 6));
        System.out.println(returnIfFour(square, 2));

        System.out.println(returnIfGreaterThanSix(square, 7));
        System.out.println(returnIfGreaterThanSix(square, 3));
        System.out.println(returnIfGreaterThanSix(square, 0));

    }
    public static int returnNull(Function<Integer, Integer> function, Integer x) {
            return Optional.ofNullable(x)
                    .map(function)
                    .orElse(0);
    }

    public static int returnIfFour(Function<Integer, Integer> function, Integer x) {
        return Optional.ofNullable(x)
                .filter(number -> number > 4)
                .map(function)
                .orElse(0);
    }

    public static int returnIfGreaterThanSix(Function<Integer, Integer> function, Integer x) {
        return Optional.ofNullable(x)
                .filter(number -> number > 6)
                .map(number -> number - 6)
                .orElseGet(() -> Optional.ofNullable(x)
                        .map(number -> number * number)
                        .orElse(0));
    }
}
