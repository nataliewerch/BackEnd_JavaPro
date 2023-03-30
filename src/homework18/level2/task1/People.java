package homework18.level2.task1;

public class People {
    private int age;
    private String firstName;
    private String lastName;
    private double weight;
    private int high;

    public People(int age, String firstName, String lastName, double weight, int high) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.weight = weight;
        this.high = high;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getWeight() {
        return weight;
    }

    public int getHigh() {
        return high;
    }

    @Override
    public String toString() {
        return " " +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", weight=" + weight +
                ", high=" + high +
                ' ';
    }
}
