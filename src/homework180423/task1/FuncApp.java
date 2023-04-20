package homework180423.task1;

import java.util.function.Function;

public class FuncApp {
    public static void main(String[] args) {
        // (((3 * 10) + 1) + 3) * 2 = 68
        Function<Integer, Integer> func1 = x -> x * 10;
        Function<Integer, Integer> func2 = x -> x + 1;
        Function<Integer, Integer> func3 = x -> x + 3;
        Function<Integer, Integer> func4 = x -> x * 2;
        Function<Integer, Integer> result = func1.andThen(func2).andThen(func3).andThen(func4);
        System.out.println("(((3 * 10) + 1) + 3) * 2 = " + result.apply(3));
    }
}
