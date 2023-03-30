package homework11.level1.task8;

import java.util.*;

public class StackDequeSpeedTest {
    static final int SIZE = 1000000;
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Deque<String> linkedDeque = new LinkedList<>();
        Deque<String> arrayDeque = new ArrayDeque<>();
        System.out.println("Время заполнения Stack: " + addStackMethod(stack));
        System.out.println("Время заполнения LinkedDeque: " + addDequeMethod(linkedDeque));
        System.out.println("Время заполнения ArrayDeque: " + addDequeMethod(arrayDeque));
        System.out.println("_________________________");
        System.out.println("Время извлечения Stack: " + popStackMethod(stack));
        System.out.println("Время извлечения LinkedDeque: " + pollDequeMethod(linkedDeque));
        System.out.println("Время извлечения ArrayDeque: " + pollDequeMethod(arrayDeque));





    }

    public static long addStackMethod (Stack<String> stack){
        long before = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            String str = "String " + i;
           stack.push(str);
        }
        long after = System.currentTimeMillis();
        return after - before;
    }

    public static long addDequeMethod (Deque<String> deque){
        long before = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            String str = "String " + i;
            deque.push(str);
        }
        long after = System.currentTimeMillis();
        return after - before;
    }

    public static long popStackMethod(Stack<String> stack) {
        long before = System.currentTimeMillis();
        while (!stack.isEmpty()) {
            stack.pop();
        }
        long after = System.currentTimeMillis();
        return after - before;
    }
    public static long pollDequeMethod(Deque<String> deque) {
        long before = System.currentTimeMillis();
        while (!deque.isEmpty()) {
            deque.poll();
        }
        long after = System.currentTimeMillis();
        return after - before;
    }

}



