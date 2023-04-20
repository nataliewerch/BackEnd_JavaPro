package homework180423.task3;

public enum HttpCodes {
    INFORMATIONAL(100, 199, ((code, d) -> System.out.println("http code: " + code + " : " + d.name()))),
    SUCCESS(200, 299, ((code, d) -> System.out.println("http code: " + code + " : " + d.name()))),
    REDIRECTION(300, 399, ((code, d) -> System.out.println("http code: " + code + " : " + d.name()))),
    CLIENTERROR(400, 499, ((code, d) -> System.out.println("http code: " + code + " : " + d.name()))),
    SERVERERROR(500, 599, ((code, d) -> System.out.println("http code: " + code + " : " + d.name())));

    private final int minValue;
    private final int maxValue;
    private final Action action;

    HttpCodes(int minValue, int maxValue, Action action) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.action = action;
    }

   public static void findValueByCode(int code) {
        for (HttpCodes httpCodes : values()) {
            if (code >= httpCodes.minValue && code <= httpCodes.maxValue) {
                httpCodes.action.action(code, httpCodes);
                return;
            }
        }
        System.out.println("http code: " + code + ": " + " not found");
    }
}
