package homework110523;

import java.util.HashMap;
import java.util.Map;


public class AccountData {
    private Map<String, String> ibanCodeMap;

    public AccountData() {
        ibanCodeMap = new HashMap<>();
    }

    public void addCode(String iban, String code) {
        ibanCodeMap.put(iban, code);
    }

    public String getCode(String iban) {
        return ibanCodeMap.get(iban);
    }
}
