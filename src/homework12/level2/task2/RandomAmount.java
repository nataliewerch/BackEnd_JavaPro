package homework12.level2.task2;

import java.util.*;

public class RandomAmount {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        fillArray(list);
        Collections.shuffle(list);
        randomAmount(list);
    }

    public static void fillArray(List<Integer> list) {
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }
    }

    public static void randomAmount (List<Integer> list){
        Random random = new Random();
        int k = random.nextInt(1000);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : list) {
            int different = k - i;
            if (map.containsKey(different)){
                System.out.println(i + " + " + different + " = " + k);
            }else {
                map.put(i, different);
            }
        }
    }
}
