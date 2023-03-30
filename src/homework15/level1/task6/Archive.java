package homework15.level1.task6;

import java.util.HashMap;
import java.util.HashSet;

public class Archive {
    HashMap<String, Person> employees;
    private int id;
    Gender gender;

    public Archive() {
        this.employees = new HashMap<String, Person>();
    }

    public void addEmployee(int id, int birthYear, Gender gender, Person person){
        String key = id + "_" + birthYear + "_" + gender;
        employees.put(key, person);
    }

    public Person getEmployee(int id, int yearOfBirth, Gender gender){
        String key = id + "_" + yearOfBirth + "_" + gender ;
        return employees.get(key);
    }

}
