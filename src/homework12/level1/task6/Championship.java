package homework12.level1.task6;

import java.util.HashMap;
import java.util.Map;

public class Championship {
    public static void main(String[] args) {
        String[] goals = {"BW", "FM", "BW", "DW", "BW"};
        System.out.println("Команда-победитель: " + findWinner(goals));
    }

    public static String findWinner(String[] goals){
        Map<String, Integer> goalCount = new HashMap<>();
        String winner = " ";
        for (String goal : goals) {
            goalCount.put(goal, goalCount.getOrDefault(goal, 0) + 1);
        }
        int max = 0;
        for (Map.Entry<String, Integer> entry : goalCount.entrySet()){
            if (entry.getValue() > max){
                winner = entry.getKey();
                max = entry.getValue();
            }
        }return winner;
    }
}
