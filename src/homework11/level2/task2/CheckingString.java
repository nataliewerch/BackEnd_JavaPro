package homework11.level2.task2;

public class CheckingString {
    public static void main(String[] args) {
        String str = "))))((((";
        String str2 = "()()()";
        String str3 = ")()()(";
        System.out.println(isValid(str));
        System.out.println(isValid(str2));
        System.out.println(isValid(str3));


    }

    public static boolean isValid(String str) {
        int volume = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                volume++;

            } else if (ch == ')') {
                volume--;
                if (volume < 0) {
                    return false;
                }

            }
        }return volume == 0;
    }
}
