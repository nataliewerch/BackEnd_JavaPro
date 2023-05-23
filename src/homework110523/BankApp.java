package homework110523;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        AccountData accountClient1 = new AccountData();
        accountClient1.addCode("DE111", "123456");
        accountClient1.addCode("DE222", "012345");
        Storage storageClient1 = new Storage();
        storageClient1.addCode("DE111", 15000.00);
        storageClient1.addCode("DE222", 25000.00);
        Client client = new Client(accountClient1, storageClient1);

        AccountService accountService = new AccountService(client.getAccountData(), storageClient1);
        accountService.ibanAuthorization();
    }
}