package homework17.level1.task7;
import java.util.function.Function;


public class FunctionSquare {
    public static void main(String[] args) {
  /*  Square sq = new Square() {
         @Override
         public int square(int x) {
             return x * x;
         }
     };*/

       // Square sq = x -> x * x;

       Function<Integer, Integer> sqFunc = x -> x * x;
        for (int i = 0; i <=10; i++) {
            // System.out.println("Квадрат числа " + i + " равен: " + sq.square(i));
            System.out.println("Квадрат числа " + i + " равен: " + sqFunc.apply(i));
        }
    }
}
