package homework13.level1.task8;

public class People {
    private String firstName;
    private String lastname;

    public People(String firstName, String lastname) {
        this.firstName = firstName;
        this.lastname = lastname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public String toString() {
        return " " + firstName + " " + lastname;
    }
}
