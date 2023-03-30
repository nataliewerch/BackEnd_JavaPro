package homework10.level2.task1;

import java.util.Comparator;

public class BookTittleComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getBookTittle().compareTo(o2.getBookTittle());
    }
}
