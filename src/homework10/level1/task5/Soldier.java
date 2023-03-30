package homework10.level1.task5;

import org.jetbrains.annotations.NotNull;

public class Soldier implements Comparable<Soldier>{
    private String name;
    private int height;

    public String getName() {
        return name;
    }

    public Soldier(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return " "+ name + ":  " + height;
    }

    @Override
    public int compareTo(@NotNull Soldier o) {
        int result = Integer.compare(o.getHeight(), this.getHeight());
        if ( result == 0){
            result = this.getName().compareTo(o.getName());
        }
        return result;
    }

    // Я выбрала Comparable, так как мне нужно сравнивать объекты только по одному
    //параметру и в одном порядке.
}
