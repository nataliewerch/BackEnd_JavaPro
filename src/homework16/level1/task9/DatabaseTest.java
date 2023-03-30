package homework16.level1.task9;

public class DatabaseTest {
    public static void main(String[] args) {
        Database<Integer, String> database= new Database<>();
        database.put(1, "Ivan Ivanov");
        database.put(2, "Stepan Petrov");
        System.out.println(database.get(1));
        System.out.println(database.containsKey(3));
        System.out.println(database.containsKey(2));
        System.out.println(database.isEmpty());
    }
}
