package homework10.level2.task1;

public class Book {
    private Author author;
    private int yearOfPublication;
    private String bookTittle;
    private Publisher publisher;

    public Book(Author author, int yearOfPublication, String bookTittle, Publisher publisher) {
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.bookTittle = bookTittle;
        this.publisher = publisher;
    }



    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getBookTittle() {
        return bookTittle;
    }

    public Publisher getPublisher() {
        return publisher;
    }



    @Override
    public String toString() {
        return author + "  /  Год публикации: "+ yearOfPublication + "; Название: "+ bookTittle + "  /  " + publisher + System.lineSeparator();
    }
}
