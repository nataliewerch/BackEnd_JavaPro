package homework23.level1.task11;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class GameTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File file = new File("src/homework23/level1/task11/result.txt");
        GameSaveResult result = GameSaveResult.readResult(file);

        if (result == null) {
            result = new GameSaveResult("", 0, 0);
            result.saveResult(file);
        } else {
            System.out.println("Прошлый результат " + result);
        }

        System.out.println("Введите ваше имя ");
        String name = scanner.nextLine();
        if (!result.getName().equals(name)) {
            result = new GameSaveResult(name, 0, 0);
        }

        boolean isWin = Math.random() < 0.5;

        if (isWin) {
            result.winCounter();
            System.out.println("Победа");
        } else {
            result.loseCounter();
            System.out.println("Проиграли");
        }

        result.saveResult(file);
        System.out.println("Результаты " + result);



     /*   if (!file.exists()) {
            try {
                file.createNewFile();
                result = new GameSaveResult("", 0, 0);
                result.saveResult(file, result);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                result = (GameSaveResult) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("ВВедите ваше имя: ");
        String name = scanner.nextLine();
        if (!result.getName().equals(name)) {
           result = new GameSaveResult(result.getName(), 0, 0);

        }else  {
            result.setName(name);
        }

        Random random = new Random();
        boolean isWin = random.nextBoolean();
        if (isWin) {
            result.winCounter();
            System.out.println("Вы победили!!!");
        } else {
            result.loseCounter();
            System.out.println("Вы проиграли!!!");
        }

        result.saveResult(file, result);
        System.out.println("Результаты: " + result);*/



    }
}
