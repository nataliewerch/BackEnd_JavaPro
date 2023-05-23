package homework110523;

import java.util.HashMap;
import java.util.Map;

public class Storage {
    private Map<String, Double> accountBalances;
    public static final double TRANSFER_LIMIT = 1000.0;

    public Storage() {
        accountBalances = new HashMap<>();
    }

    public double getBalance(String iban) {
        return accountBalances.getOrDefault(iban, 0.0);
    }

    public void deposit(String iban, double amount) {
        double currentBalance = getBalance(iban);
        double newBalance = currentBalance + amount;
        accountBalances.put(iban, newBalance);
    }

    public boolean withdraw(String iban, double amount) {
        double currentBalance = getBalance(iban);
        if (currentBalance >= amount) {
            double newBalance = currentBalance - amount;
            accountBalances.put(iban, newBalance);
            return true;
        }
        return false;
    }

    public void addCode(String iban, double balance) {
        accountBalances.put(iban, balance);
    }

    public void transferFunds(String fromIban, String toIban, double amount) throws NotEnoughFunds, TransferLimitException {
        double fromBalance = accountBalances.get(fromIban);
        double toBalance = accountBalances.get(toIban);

        if (fromBalance < amount) {
            throw new NotEnoughFunds("Недостаточно средств на счете " + fromIban);
        }

        if (amount > TRANSFER_LIMIT) {
            throw new TransferLimitException("Превышен лимит перевода в размере " + TRANSFER_LIMIT);
        }
        accountBalances.put(fromIban, fromBalance - amount);
        accountBalances.put(toIban, toBalance + amount);
        System.out.println("Перевод выполнен успешно: " + accountBalances);
    }


    @Override
    public String toString() {
        return " Баланс:" + accountBalances;
    }
}