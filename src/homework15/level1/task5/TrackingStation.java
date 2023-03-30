package homework15.level1.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TrackingStation {
    private int magnitude;
    private int signal;


    public void pushCounter() {
        List<Integer> magnitudes = new ArrayList<>();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true) {
            signal = scanner.nextInt();
            if (signal == -97) {
                System.out.println("Рабочий день окончен");
                break;
            }
            magnitude = random.nextInt(12);
            if (magnitude >= 3) {
                count++;
                magnitudes.add(magnitude);
            }
        }
            if (count >= 5) {
                System.out.println("Возможно произошло землетрясение  ");
                System.out.println("Магнитуда колебаний ");
                for (int i : magnitudes) {
                    System.out.println(i);
                }
            }
        }
    }


