package homework11.level1.task7;

import java.util.HashSet;
import java.util.List;

public class ArrayWithDuplicates {
    public static void main(String[] args) {
        Integer[] array = {1,2,3,6,8,9,23,45,23,12};
        findDuplicates(array);




    }

    public static void findDuplicates(Integer[] array){
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if (!hashSet.add(array[i])) {
                int duplicateNumber = i + 1;
                System.out.println("Дубликат находится на позиции: " + duplicateNumber + " и имеет значение: " + array[i]);

            }
        }
    }
}
