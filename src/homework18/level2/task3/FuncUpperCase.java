package homework18.level2.task3;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FuncUpperCase {
    public static void main(String[] args) {
        String str = "test test";
        System.out.println(charUpperCase(str));

    }

    public static String charUpperCase(String str) {
        return Stream.of(str)
                .map(FuncUpperCase::capitalizeWord)
                .collect(Collectors.joining(" "));
    }
    private static String capitalizeWord(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
