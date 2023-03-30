package homework15.level2.task1;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        BankAccount.createBankAccount(bank, 30000.0, "Ivan", "Ivanov", 1000.0, PaymentType.CASH);
        BankAccount.createBankAccount(bank, 90000.0, "Stepan", "Petrov", 2000.0, PaymentType.CARD);
        Person person1 = new Person("Ivan", "Ivanov");
        Person person2 = new Person("Stepan", "Petrov");
        BankAccount bankAccount1 = bank.getBankAccount(person1);
        BankAccount bankAccount2 = bank.getBankAccount(person2);
        System.out.println(bankAccount1);
        System.out.println(bankAccount2);



    }
}
