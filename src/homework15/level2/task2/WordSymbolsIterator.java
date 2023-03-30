package homework15.level2.task2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class WordSymbolsIterator implements Iterator <Character>{
    private Iterator<String> wordIterator;
    private Iterator<Character> charIterator;


    public WordSymbolsIterator(String str) {
        wordIterator = new WordIterator(str);
        charIterator = new CharIterator(wordIterator.next());
    }


    @Override
    public boolean hasNext() {

        return wordIterator.hasNext() || charIterator.hasNext();
    }

    @Override
    public Character next() {
        if (!charIterator.hasNext() && wordIterator.hasNext()) {
           String word = wordIterator.next();
           charIterator = new CharIterator(word);
        }
        if (charIterator.hasNext()) {
           return charIterator.next();
        }
        return null;
    }


}
