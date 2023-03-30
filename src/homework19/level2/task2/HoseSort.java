package homework19.level2.task2;

import java.util.*;
import java.util.stream.Collectors;

public class HoseSort {
    public static void main(String[] args) {
        List<House> houseList = new ArrayList<>();
        houseList.add(new House("Peter street", 132, 250_000, 2001));
        houseList.add(new House("Max Platz", 12, 180_000, 1998));
        houseList.add(new House("Peter street", 131, 110_000, 1950));
        houseList.add(new House("Max Platz", 87, 130_000, 1964));
        houseList.add(new House("Garden street", 7, 280_000, 2005));
        houseList.add(new House("Max Platz", 25, 530_000, 2022));
        houseList.add(new House("Max Platz", 66, 195_000, 1999));
        houseList.add(new House("Garden street", 18, 230_000, 2001));
        houseList.add(new House("Garden street", 23, 350_000, 2019));
        houseList.add(new House("Max Platz", 113, 150_000, 1987));

        //дом с максимальной ценой, иначе вернуть -1
        House maxPrice =  houseList.stream()
                .max(Comparator.comparing(House::getPrice))
                .orElse(new House("", -1, -1, -1));
        System.out.println("Дом с максимальной ценой: " + maxPrice);

        //дом с минимальной ценой и имеющий нечетный номер
        Optional<House> minPrice = houseList.stream()
                .filter(number -> number.getNumber() % 2 != 0)
                .min(Comparator.comparing(House::getPrice));
        System.out.println("Дом с минимальной ценой и имеющий нечетный номер: " + minPrice);

        //все дома с ценой меньше 200_000 и больше 100_000 и выбрать только 2 из них
        List<House> twoHouse = houseList.stream()
                .filter(price -> price.getPrice() < 200_000 && price.getPrice() > 100_000)
                .limit(2)
                .toList();
        System.out.println("Два дома с ценой меньше 200_000 и больше 100_000: " + twoHouse);

        //цены домов, находящихся на улице Max Platz
        double[] housePriceMaxPlatz = houseList.stream()
                .filter(street -> street.getStreet().equals("Max Platz"))
                .mapToDouble(House::getPrice)
                .toArray();
        System.out.println("Цены домов, находящихся на улице Max Platz: " + Arrays.toString(housePriceMaxPlatz));

        //количество нечетных домов
        long numberOfOddHouses = houseList.stream()
                .filter(s -> s.getNumber() % 2 != 0)
                .count();
        System.out.println("Количество нечетных домов: " + numberOfOddHouses);

        //стоимость всех домов на улице Max Platz
        double costOfAllHouses = houseList.stream()
                .filter(street -> street.getStreet().equals("Max Platz"))
                .mapToDouble(House::getPrice)
                .sum();
        System.out.println("Стоимость всех домов на улице Max Platz: " + costOfAllHouses);
    }
}
