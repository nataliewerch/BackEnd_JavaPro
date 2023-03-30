package homework15.level2.task1;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    Map<Person, BankAccount> customerBase = new HashMap<>();

    public void add( BankAccount bankAccount){
       customerBase.put(bankAccount.getPerson(), bankAccount);
    }

    public BankAccount getBankAccount(Person person){
        return customerBase.get(person);
    }

}
