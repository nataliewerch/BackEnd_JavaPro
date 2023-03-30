package homework13.level1.task8;

import java.util.Comparator;

public class ReverseComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }
}
