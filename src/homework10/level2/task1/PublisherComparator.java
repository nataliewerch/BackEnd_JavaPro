package homework10.level2.task1;

import java.util.Comparator;

public class PublisherComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getPublisher().getTitle().compareTo(o2.getPublisher().getTitle());
    }
}
