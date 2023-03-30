package homework16.level2.task1_4;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class MaxFinder{

    public <T> T findMax(List<T> list, Comparator<T> comparator) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        T max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            T current = list.get(i);
            if (comparator.compare(current, max) > 0) {
                max = current;
            }

        }return max;
    }

    public static <T extends Comparable<T>> T findMax(List<T> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        T max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            T current = list.get(i);
            if (current.compareTo(max) > 0) {
                max = current;
            }
        }
        return max;
    }

    public static <T> T findMax(Collection<T> collection, Comparator<T> comparator) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        T max = collection.iterator().next();
        for (T current : collection) {
            if (comparator.compare(current, max) > 0) {
                max = current;
            }
        }
        return max;
    }

    public static <T extends Comparable<T>> T findMax(Collection<T> collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        T max = collection.iterator().next();
        for (T current : collection) {
            if (max == null || current.compareTo(max) > 0) {
                max = current;
            }
        }
        return max;
    }



}
