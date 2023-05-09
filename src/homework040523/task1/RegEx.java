package homework040523.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

    public static void main(String[] args) {
        String phoneNumber = "1234567";
        System.out.println(isValidatePhoneNumber(phoneNumber));

        String email = "asdjkl@jdsncjl.com";
        System.out.println(isValidateEmail(email));
    }

    //task 1
    public static boolean isValidatePhoneNumber(String phoneNumber) {
        String regex = "(\\d{7})|(\\d{3}\\s\\d{4})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    // task 2
    public static boolean isValidateEmail(String email) {
        String regex = "([^@ \n]+)@([^@ \n]+)\\.[a-z]{2,3}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    // task 3
    public static boolean isValidateIp (String ip) {
        String regDigit = "(\\d{1,2}|(0|1)\\d{2}|2[0-4][0-9]|25[0-5])";
        String regex = regDigit + "\\." + regDigit + "\\." + regDigit + "\\." + regDigit;
        String s =  regDigit + "\\.";
        String regexRef = "(" + s + "){3}" + regDigit;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }
}
