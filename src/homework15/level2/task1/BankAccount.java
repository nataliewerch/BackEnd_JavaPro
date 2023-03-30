package homework15.level2.task1;

import homework15.level2.task1.Person;

import java.util.Objects;

public final class BankAccount {
    private final double invoiceAmount;
   private final Person person;
    private final Payment payment;

    public BankAccount(double invoiceAmount, Person person, Payment payment) {
        this.invoiceAmount = invoiceAmount;
        this.person = person;
        this.payment = payment;
    }

    public double getInvoiceAmount() {
        return invoiceAmount;
    }

    public Person getPerson() {
        return person;
    }

    public Payment getPayment() {
        return payment;
    }

    public static BankAccount createBankAccount(Bank bank, double invoiceAmount, String name, String surname, double amountPayment, PaymentType paymentType) {
        Person person = new Person(name, surname);
        Payment payment = new Payment(amountPayment, paymentType);
        BankAccount bankAccount = new BankAccount(invoiceAmount, person, payment);
        bank.add(bankAccount);
        return bankAccount;

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Double.compare(that.invoiceAmount, invoiceAmount) == 0 && Objects.equals(person, that.person) && Objects.equals(payment, that.payment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invoiceAmount, person, payment);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "invoiceAmount=" + invoiceAmount +
                ", person=" + person +
                ", payment=" + payment +
                '}';
    }
}
