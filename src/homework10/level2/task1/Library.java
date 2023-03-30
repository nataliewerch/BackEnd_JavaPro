package homework10.level2.task1;

import java.util.*;

public class Library {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
    books.add(new Book(new Author("Эрих Мария", "Ремарк", 1898),
                1962, "Ночь в Лиссабоне",
                new Publisher("Кипенхойер и Вич", 1951)));
        books.add(new Book(new Author("Александр", "Дюма", 1802),
                1846, "Граф Монте-Кристо",
                new Publisher("Петион", 1946)));
        books.add(new Book(new Author("Антуан", "де Сент-Экзюпери", 1900),
                1943, "Маленький принц",
                new Publisher("Галлимард", 1911)));
        books.add(new Book(new Author("Борис", "Акунин", 1956),
                2002, "Алмазная колесница",
                new Publisher("Захаров", 2002)));
        books.add(new Book(new Author("Борис", "Акунин", 1956),
                2015, "Планета Вода",
                new Publisher("Захаров", 1998)));
        books.sort(new YearOfPublicationComparator());
        books.sort(new AuthorComparator());
        books.sort(new BookTittleComparator());
        books.sort(new PublisherComparator());
        Comparator<Book> comparator = new NameComparator()
                .thenComparing(new AuthorComparator().reversed());
       Comparator<Book> birthAndSurnameComparator = new YearsOfBirthComparator()
               .thenComparing(new SurnameComparator());

        BookSort bookSort = new BookSort();
        bookSort.bookSort(books);
    }
}