package homework15.level2.task2;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class CharIterator implements Iterator<Character> {
    private final String word;
    private int index = 0;

    public CharIterator(String word) {

        this.word = word;
    }

    @Override
    public boolean hasNext() {
        return index < word.length();
    }

    @Override
    public Character next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return word.charAt(index++);
    }
}
