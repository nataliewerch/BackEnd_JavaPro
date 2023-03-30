package homework18.level2.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PeopleTest {
    public static void main(String[] args) {
        List<People> list = new ArrayList<>();
        list.add(new People(17, "Ivan", "Ivanov", 65.200, 175));
        list.add(new People(27, "Anton", "Ivanov", 88.000, 177));
        list.add(new People(18, "Stepan", "Step", 77.300, 180));
        list.add(new People(15, "Andrey", "Step", 50.000, 164));
        list.add(new People(44, "Iliyas", "Arank", 105.000, 192));
        list.add(new People(38, "Anna", "Frank", 57.000, 166));
        list.add(new People(10, "Inna", "Schwarz", 38.700, 135));
        list.add(new People(4, "Ivan", "Schwarz", 18.200, 110));
        list.add(new People(77, "Andrew", "Andreew", 88.900, 178));
        list.add(new People(35, "Igor", "Turin", 98.300, 192));

        List<People> filteredList = list.stream()
                .filter(people -> people.getAge() > 18 && people.getHigh() < 180 && people.getFirstName().startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(filteredList);

        List<String> lastNameList = list.stream()
                .filter(people -> people.getAge() > 30)
                .filter(people -> people.getLastName().startsWith("A"))
                .filter(people -> people.getFirstName().length() > 5)
                .map(People::getLastName).toList();
        System.out.println(lastNameList);



    }
}
