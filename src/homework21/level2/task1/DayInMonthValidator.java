package homework21.level2.task1;

public class DayInMonthValidator {
    public static void main(String[] args) throws InvalidDayException, InvalidMonthException {
        validate(12, 24);
    }

    public static int daysInMonth(int month) {
        return switch (month) {
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };
    }

    public static void validate(int month, int day) throws InvalidMonthException, InvalidDayException {
        if (month < 1 || month > 12) {
            throw new InvalidMonthException("Некорректно указан месяц: " + month + "!!! Месяц должен быть в диапазоне от 1 до 12 ");
        }
        int maxDay = daysInMonth(month);
        if (day < 1 || day > maxDay) {
            throw new InvalidDayException("Некорректное количество дней: " + day + " для месяца: " + month + "!!! В месяце " + month + " - " +  maxDay + " дней");
        }
    }
}
