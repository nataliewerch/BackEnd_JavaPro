package homework15.level2.task2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class WordIterator implements Iterator<String> {


    private final String[] words;
    private int index;


    public WordIterator(String str) {
        words = str.split(" ");
    }
    @Override
    public boolean hasNext() {
        return index < words.length;

    }
    @Override
    public String next() {
        return words[index++];
    }
}
