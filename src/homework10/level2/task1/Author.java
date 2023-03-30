package homework10.level2.task1;

public class Author{
    private String name;
    private String surname;
    private int yearsOfBirth;

    public Author(String name, String surname, int yearsOfBirth) {
        this.name = name;
        this.surname = surname;
        this.yearsOfBirth = yearsOfBirth;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYearsOfBirth() {
        return yearsOfBirth;
    }



    @Override
    public String toString() {
        return "Автор: " + name +" " + surname + "; Год рождения: " + yearsOfBirth;
    }
}
