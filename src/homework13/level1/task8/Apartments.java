package homework13.level1.task8;

import java.util.Map;
import java.util.TreeMap;

public class Apartments {
     public static void main(String[] args) {
        Map<Integer, People> keys = new TreeMap<>();
        Map<Integer, People> keysReverse = new TreeMap<>(new ReverseComparator());
         keys.put(10, new People("Ivan", "Ivanov"));
         keys.put(11, new People("Stepan", "Shmidt"));
         keys.put(17, new People("Anton", "Gerdt"));
         keys.put(13, new People("Artur", "Shvarz"));
         keys.put(22, new People("Anton", "Gleb"));
         keys.put(15, new People("Ivan", "Antonin"));
         keys.put(45, new People("Ivan", "Stepko"));
         keys.put(27, new People("Renat", "Shmel"));
         keys.put(77, new People("Ruslan", "Liviy"));
         keys.put(14, new People("Ivan", "Gramm"));
         keysReverse.putAll(keys);
         printApartments(keys);
         System.out.println("Обратная сортировка ");
         printApartments(keysReverse);

     }


     public static void printApartments(Map<Integer, People> map){
         for (Integer apartmentNumber : map.keySet()) {
             System.out.println("Номер квартиры: " + apartmentNumber + ": владелец: " + map.get(apartmentNumber));
         }


     }

}