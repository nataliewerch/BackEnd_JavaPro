package homework110523;

import java.util.Scanner;
import java.util.regex.Pattern;

public class AccountService {
    private final static Scanner SCANNER = new Scanner(System.in);
    private AccountData accountData;
    private Storage storage;
    private int ibanAttempts = 0;
    private int codeAttempts = 0;

    public AccountService(AccountData accountData, Storage storage) {
        this.accountData = accountData;
        this.storage = storage;
    }

    public void ibanAuthorization() {
        while (ibanAttempts < 3) {
            System.out.print("Введите номер банковского счета (IBAN): ");
            String iban = SCANNER.nextLine();

            try {
                if (!isValidIban(iban)) {
                    throw new IncorrectIbanNumber("Некорректный номер банковского счета (IBAN): " + iban);
                }

                String accessCode = accountData.getCode(iban);

                if (accessCode == null) {
                    System.out.println("Данный номер банковского счета (IBAN) не существует.");
                    System.out.print("Хотите повторить ввод? (да/нет): ");
                    String choice = SCANNER.nextLine();
                    if (!choice.equalsIgnoreCase("да")) {
                        ibanAttempts = 3;
                    }
                } else {
                    codeAuthorization(iban, accessCode);
                    resetAttempts();
                    if (codeAttempts >= 3) {
                        System.out.println("Превышено количество попыток ввода кода. Попробуйте позже.");
                    }
                }
            } catch (IncorrectIbanNumber e) {
                System.out.println(e.getMessage());
                System.out.print("Хотите повторить ввод? (да/нет): ");
                String choice = SCANNER.nextLine();
                if (!choice.equalsIgnoreCase("да")) {
                    ibanAttempts = 3;
                }
            }
        }

        System.out.println("Превышено количество попыток ввода IBAN. Попробуйте позже.");
    }

    private void codeAuthorization(String iban, String accessCode) {
        while (codeAttempts < 3) {
            System.out.print("Введите код подтверждения (6 цифр): ");
            String code = SCANNER.nextLine();
            try {
                if (!isValidCode(code)) {
                    throw new IncorrectCodeNTemplate("Некорректный код подтверждения: " + code);
                }
                if (!code.equals(accessCode)) {
                    throw new WrongAccessCode("Неверный код подтверждения.");
                }
                System.out.println("Авторизация успешна. Добро пожаловать, клиент!");
                displayMenu(iban);
                resetAttempts();
                return;
            } catch (IncorrectCodeNTemplate | WrongAccessCode e) {
                System.out.println(e.getMessage());
                codeAttempts++;
                if (codeAttempts >= 3) {
                    System.out.println("Превышено количество попыток ввода кода. Попробуйте позже.");
                    resetAttempts();
                    return;
                }
            }
        }
    }

    private boolean isValidIban(String iban) {
        String regex = "[A-Z]{2}[0-9]{1,32}";
        return Pattern.matches(regex, iban);
    }

    private boolean isValidCode(String code) {
        String regex = "\\d{6}";
        return Pattern.matches(regex, code);
    }

    private void resetAttempts() {
        ibanAttempts = 0;
        codeAttempts = 0;
    }

    public void displayMenu(String iban) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("\nМеню:");
            System.out.println("1. Показать баланс");
            System.out.println("2. Пополнить счет");
            System.out.println("3. Снять деньги");
            System.out.println("4. Перевести средства");
            System.out.println("5. Выйти");

            System.out.print("Выберите пункт меню: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    double balance = storage.getBalance(iban);
                    System.out.println("Баланс на счету: " + balance);
                    System.out.println("Вывести баланс всех счетов? да/нет");
                    String nextChoice = SCANNER.nextLine().toLowerCase();
                    if (nextChoice.equals("да")) {
                        System.out.println("Состояние счетов: " + storage);
                    }
                    break;
                case 2:
                    System.out.print("Введите сумму для пополнения: ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine();
                    storage.deposit(iban, depositAmount);
                    System.out.println("Счет успешно пополнен.");
                    break;
                case 3:
                    System.out.print("Введите сумму для снятия: ");
                    double withdrawalAmount = scanner.nextDouble();
                    scanner.nextLine();
                    boolean success = storage.withdraw(iban, withdrawalAmount);
                    if (success) {
                        System.out.println("Сумма успешно снята.");
                    } else {
                        System.out.println("Недостаточно средств на счете.");
                    }
                    break;
                case 4:
                    System.out.print("Введите номер счета получателя: ");
                    String toIban = scanner.nextLine();
                    System.out.print("Введите сумму перевода: ");
                    double transferAmount = scanner.nextDouble();
                    scanner.nextLine();
                    performTransfer(iban, toIban, transferAmount);
                    displayMenu(iban);
                    break;
                case 5:
                    System.out.println("Прогамма завершена!");
                    System.out.println("\nДля продолжения: ");
                    return;
                default:
                    try {
                        throw new InvalidMenuChoice("Некорректный выбор меню");
                    } catch (InvalidMenuChoice e) {
                        System.out.println(e.getMessage());
                    }
            }
        }
    }

    private void performTransfer(String fromIban, String toIban, double amount) {
        try {
            storage.transferFunds(fromIban, toIban, amount);
        } catch (NotEnoughFunds | TransferLimitException e) {
            System.out.println(e.getMessage());
            System.out.print("Хотите повторить попытку перевода? (да/нет): ");
            String choice = SCANNER.nextLine();
            if (choice.equalsIgnoreCase("да")) {
                System.out.print("Введите номер счета получателя: ");
                toIban = SCANNER.nextLine();
                System.out.print("Введите сумму перевода: ");
                double transferAmount = SCANNER.nextDouble();
                SCANNER.nextLine();
                performTransfer(fromIban, toIban, transferAmount);
            }
        }
    }
}

