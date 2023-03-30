package homework16.level1.task6;

public class MyLinkedList <T>{
    private Node<T> nodeHead;
    private int size;

    private class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public MyLinkedList() {
        this.nodeHead = null;
        this.size = 0;
    }
    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = nodeHead;
        nodeHead = newNode;
        size++;
    }

    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);
        if (nodeHead == null) {
            nodeHead = newNode;
        } else {
            Node<T> current = nodeHead;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void printList() {
        Node<T> current = nodeHead;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}
