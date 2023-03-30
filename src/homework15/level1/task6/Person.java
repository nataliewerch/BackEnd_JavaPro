package homework15.level1.task6;

public class Person {
    private final String name;
    private final String surname;
    private final int yearOfBirth;
    private String position;

    public Person(String name, String surname, int yearOfBirth, String position) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.position = position;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getPosition() {
        return position;
    }
}
