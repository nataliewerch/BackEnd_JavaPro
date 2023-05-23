package homework110523;

public class Client {
    private AccountData accountData;
    private Storage storage;

    public Client(AccountData accountData, Storage storage) {
        this.accountData = accountData;
        this.storage = storage;
    }

    public AccountData getAccountData() {
        return accountData;
    }
}