package homework15.level2.task2;

import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        String str = "Мама мыла раму";
        Iterator<Character> wordSymbolsIterator = new WordSymbolsIterator(str);
        while (wordSymbolsIterator.hasNext()) {
            System.out.println(wordSymbolsIterator.next());
        }
    }
}
