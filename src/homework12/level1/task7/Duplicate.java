package homework12.level1.task7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Duplicate {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        addRandomElement(list);
        findDuplicates(list);
    }

    public static List<Integer> addRandomElement(List<Integer> list){
        for (int i = 0; i < 1000; i++) {
            list.add((int) (Math.random() * 1000) + 1);
        }return list;
    }

    public static void findDuplicates(List<Integer> list){
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : list) {
            Integer value = map.get(num);
            if (value == null){
                map.put(num, 1);
            }else {
                System.out.println("Дубликат: " + num);
                map.put(num, value + 1);
            }
        }
    }
}
