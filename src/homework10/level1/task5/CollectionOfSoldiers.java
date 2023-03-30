package homework10.level1.task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionOfSoldiers {
    public static void main(String[] args) {
        List<Soldier> soldiers = new ArrayList<>();
        soldiers.add(new Soldier("Gleb", 180));
        soldiers.add(new Soldier("Anton", 185));
        soldiers.add(new Soldier("Andrew", 180));
        soldiers.add(new Soldier("Alex", 168));
        soldiers.add(new Soldier("Oleg", 188));
        soldiers.add(new Soldier("Kai", 190));
        soldiers.add(new Soldier("Leo", 177));
        soldiers.add(new Soldier("Ivo", 166));
        System.out.println(soldiers);
        Collections.sort(soldiers);
        System.out.println("Сортировка солдат по убыванию: ");
        System.out.println(soldiers);



    }
}
