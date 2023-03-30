package homework12.level2.task1;

import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class UsersTest {
    static Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) throws NoSuchAlgorithmException {
        UserService userService = new UserService();
        usersRegistration(userService);
        usersRegistration(userService);
        usersRegistration(userService);
        usersRegistration(userService);
        logIn(userService);


    }

    public static void usersRegistration(UserService userService) throws NoSuchAlgorithmException {
        System.out.println("Введите логин ");
        String login = SCANNER.nextLine();
        System.out.println("Введите пароль ");
        String password = SCANNER.nextLine();
        User newUser = userService.signUp(login, password);
        if (newUser != null) {
            System.out.println("Пользователь " + newUser.getLogin() + " успешно зарегистрирован");
        } else {
            System.out.println("Не удалось зарегистрировать пользователя ");
        }
    }

    public static void logIn (UserService userService) throws NoSuchAlgorithmException {
        boolean isVerify = false;
        while (!isVerify){
            System.out.println("Введите логин ");
            String login = SCANNER.nextLine();
            System.out.println("Введите пароль ");
            String password = SCANNER.nextLine();
            isVerify = userService.signIn(login, password);

            if (isVerify){
                System.out.println("Пользователь " + login + " успешно авторизован ");
            }else {
                System.out.println("Не удалось авторизоваться! Попробуйте еще раз");
            }


        }
    }
}
