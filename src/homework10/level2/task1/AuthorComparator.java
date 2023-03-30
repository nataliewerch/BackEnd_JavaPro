package homework10.level2.task1;

import java.util.Comparator;

public class AuthorComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        int surnameCompare = o1.getAuthor().getSurname().compareTo(o2.getAuthor().getSurname());
        if (surnameCompare != 0){
            return surnameCompare;
        }
        return o1.getAuthor().getName().compareTo(o2.getAuthor().getName());
    }
}
