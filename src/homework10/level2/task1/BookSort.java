package homework10.level2.task1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BookSort {
    boolean sortByTittle = false;
    boolean sortByYearOfPublication = false;
    boolean sortByAuthor = false;
    boolean sortByPublisher = false;
    boolean ascendingSort = false;
    int input;
    Comparator<Book> comparator = null;

    public void bookSort(List<Book> books) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сортировать по названию книги? Введите: 1 - если ДА или 2 - если НЕТ ");
        input = scanner.nextInt();
        if (input == 1) {
            sortByTittle = true;
            System.out.println("В каком порядке сортировать? Введите: 1 -  если по ВОЗРАСТАНИЮ или 2 - если по УБЫВАНИЮ ");
            input = scanner.nextInt();
            if (input == 1) {
                ascendingSort = true;
            }
        }

        System.out.println("Сортировать по году публикации? Введите: 1 - если ДА или 2 - если НЕТ ");
        input = scanner.nextInt();
        if (input == 1) {
            sortByYearOfPublication = true;
            System.out.println("В каком порядке сортировать? Введите: 1 -  если по ВОЗРАСТАНИЮ или 2 - если по УБЫВАНИЮ ");
            input = scanner.nextInt();
            if (input == 1) {
                ascendingSort = true;
            }
        }
        System.out.println("Сортировать по автору? Введите: 1 - если ДА или 2 - если НЕТ ");
        input = scanner.nextInt();
        if (input == 1) {
            sortByAuthor = true;
            System.out.println("В каком порядке сортировать? Введите: 1 -  если по ВОЗРАСТАНИЮ или 2 - если по УБЫВАНИЮ ");
            input = scanner.nextInt();
            if (input == 1) {
                ascendingSort = true;
            }
        }

        System.out.println("Сортировать по издательству? Введите: 1 - если ДА или 2 - если НЕТ ");
        input = scanner.nextInt();
        if (input == 1) {
            sortByPublisher = true;
            System.out.println("В каком порядке сортировать? Введите: 1 -  если по ВОЗРАСТАНИЮ или 2 - если по УБЫВАНИЮ ");
            input = scanner.nextInt();
            if (input == 1) {
                ascendingSort = true;
            }
        }

        if (sortByTittle) {
            comparator = new BookTittleComparator();
        }
        if (sortByYearOfPublication) {
            if (comparator == null) {
                comparator = new YearOfPublicationComparator();
            } else {
                comparator = comparator.thenComparing(new YearOfPublicationComparator());
            }
        }

        if (sortByAuthor) {
            if (comparator == null) {
                comparator = new AuthorComparator();
            } else {
                comparator = comparator.thenComparing(new AuthorComparator());
            }
        }
            if (sortByPublisher){
                if (comparator == null){
                    comparator = new PublisherComparator();
                }else {
                    comparator = comparator.thenComparing(new PublisherComparator());
                }
            }
            if (comparator != null){
                if (!ascendingSort){
                    comparator = comparator.reversed();
                }
                Collections.sort(books, comparator);
                System.out.println(books);
            }
        }

    }




