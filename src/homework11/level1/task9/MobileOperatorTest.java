package homework11.level1.task9;

public class MobileOperatorTest {
    public static void main(String[] args) {
        MobileOperator queue = new MobileOperator();
        queue.addClient(new Client("Ivan Ivanov ", true));
        queue.addClient(new Client("Ivan Petrov ", false));
        queue.addClient(new Client("Stepan Ivanov ", true));
        queue.addClient(new Client("Piter Step ", false));
        queue.addClient(new Client("Anna Klopp ", true));
        queue.addClient(new Client("Inna Ivanko ", false));
        queue.addClient(new Client("Karl Ruhr ", false));
        queue.addClient(new Client("Ivan Vedlo ", true));

        while (!queue.isEmpty()){
            Client client = queue.getNextClient();
            System.out.println(client);
        }

    }
}
