package homework15.level1.task6;

public class ArchiveTest {
    public static void main(String[] args) {
        Archive archive = new Archive();
        archive.addEmployee(1, 1990, Gender.MALE, new Person("Ivan", "Ivanov", 1990, "Sysadmin"));
        archive.addEmployee(2, 1988, Gender.FEMALE, new Person("Anna", "Scmidt", 1988, "Manager"));
        archive.addEmployee(3, 1988, Gender.FEMALE, new Person("Anna", "Bord", 1988, "Economist"));
        archive.addEmployee(4, 1984, Gender.FEMALE, new Person("Inna", "Klint", 1984, "Bookkeeper"));
        archive.addEmployee(5, 1986, Gender.MALE, new Person("Anton", "Glebov", 1986, "Superintendent"));
        archive.addEmployee(6, 1992, Gender.MALE, new Person("Ruslan", "Shwarz", 1992, "Director"));
        archive.addEmployee(7, 1997, Gender.MALE, new Person("Artur", "Shmel", 1997, "Manager"));
        archive.addEmployee(8, 2000, Gender.FEMALE, new Person("Laura", "Borken", 2000, "Developer"));
        archive.addEmployee(9, 2000, Gender.MALE, new Person("Gleb", "Glebov", 2000, "Developer"));
        archive.addEmployee(10, 2000, Gender.FEMALE, new Person("Anna", "Klopp", 2000, "Developer"));

        Person ivanIvanov = archive.getEmployee(1, 1990, Gender.MALE);
        Person annaSchmidt = archive.getEmployee(2, 1988, Gender.FEMALE);
        Person annaBord = archive.getEmployee(3, 1988, Gender.FEMALE);
        Person innaKlint = archive.getEmployee(4, 1984, Gender.FEMALE);
        Person antonGlebov = archive.getEmployee(5, 1986, Gender.MALE);
        Person ruslanScwarz = archive.getEmployee(6, 1992, Gender.MALE);
        Person arturSchmel = archive.getEmployee(7, 1997, Gender.MALE);
        Person lauraBorken = archive.getEmployee(8, 2000, Gender.FEMALE);
        Person glebGlebow = archive.getEmployee(9, 2000, Gender.MALE);
        Person annaKlopp = archive.getEmployee(10, 2000, Gender.FEMALE);

        System.out.println(annaSchmidt.getSurname());

    }
}
