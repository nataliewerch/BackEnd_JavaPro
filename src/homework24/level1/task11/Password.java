package homework24.level1.task11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    public static void main(String[] args) {
        String password = "Qbc12345!";
        boolean isValid = validate(password);
        System.out.println("Пароль: " + password + " является надежным: " + isValid);
    }

    public static boolean validate (String password) {
        String string = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!\"#$%&'()*+,-./:;<=>?@\\[\\\\\\]^_{|}~]).{8,}$";
        Pattern pattern = Pattern.compile(string);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
