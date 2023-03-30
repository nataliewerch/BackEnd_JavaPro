package homework16.level1.task6;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> listInteger = new MyLinkedList<>();
        listInteger.addLast(3);
        listInteger.addLast(4);
        listInteger.addLast(5);
        listInteger.addFirst(6);
        listInteger.printList();
        MyLinkedList<String> listString = new MyLinkedList<>();
        listString.addLast("House");
        listString.addLast("Laptop");
        listString.addFirst("Pencil");
        listString.printList();
    }
}
