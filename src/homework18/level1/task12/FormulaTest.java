package homework18.level1.task12;

public class FormulaTest {
    public static void main(String[] args) {
        Formula formula = (a, b, c, d) -> (a * b) / (c + d);
        System.out.println(formula.calculate(2,2, 2, 2));
    }
}
