package homework17.level1.task8;

public class QuadraticTest {
    public static void main(String[] args) {
        Quadratic qu1 = x -> x * x - 8 * x + 12;
        Quadratic qu2 = x -> 5 * (x * x) + 3 * x + 7;
        Quadratic qu3 = x -> x * x - 6 * x + 9;

        for (double i = 0; i <= 10; i++) {
            System.out.printf("qu1(%.1f) = %.1f, qu2(%.1f) = %.1f, qu3(%.1f) = %.1f\n",
                    i, qu1.quadratic(i), i, qu2.quadratic(i), i, qu3.quadratic(i));
        }

        // Level_2_task1

        Quadratic func1 = x -> Math.pow(x, 2) / 2 - 2 * x / 3 - (x - 2) / 6;
        System.out.println(func1.quadratic(5));

        Quadratic func2 = x -> Math.pow((x - 1 / x), 0.5) + Math.pow((1 - 1 / x), 0.5);
        System.out.println(func2.quadratic(5));

        Quadratic func3 = x -> Math.sqrt((3 * x - 1)) + Math.pow((1 + x), 2);
        System.out.println(func3.quadratic(5));
    }
}
