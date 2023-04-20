package homework180423.task2;

import java.util.function.Function;


public class FactorialCalculating {
    public static void main(String[] args) {
        Function<Integer,Long> factorial = x -> {
            if (x < 0) {
              throw new IllegalArgumentException("Число не должно быть отрицательным!!!");
            }else {
                long fact = 1;
                for (int i = x; i > 0; i--) {
                    fact = fact * i;
                }
                return fact;
            }
        };
        System.out.println(factorial.apply(10));
    }
}
