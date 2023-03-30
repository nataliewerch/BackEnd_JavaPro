package homework10.level2.task1;

import java.util.Comparator;

public class YearOfPublicationComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return Integer.compare(o1.getYearOfPublication(), o2.getYearOfPublication());
    }
}
