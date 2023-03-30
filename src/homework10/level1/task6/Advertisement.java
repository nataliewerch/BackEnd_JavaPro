package homework10.level1.task6;

import org.jetbrains.annotations.NotNull;

public class Advertisement implements Comparable<Advertisement> {
    private String title;
    private String description;
    private String author;
    private int yearOfPublication;
    private int price;

    public Advertisement(String title, String description, String author, int yearOfPublication, int price) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public int getPrice() {
        return price;
    }





    @Override
    public int compareTo(@NotNull Advertisement o) {
       int yearsCompare = Integer.compare(this.getYearOfPublication(), o.getYearOfPublication());
       if (yearsCompare == 0){
           int titleCompare = this.title.compareTo(o.title);
           if (titleCompare == 0){
               int authorCompare = this.author.compareTo(o.author);
           if (authorCompare == 0){
               int descCompare = this.description.compareTo(o.description);
               if (descCompare == 0){
                   int priceCompare = Integer.compare(this.getPrice(), o.getPrice());
               }return descCompare;

               }return authorCompare;
           }return titleCompare;
       }
        return yearsCompare;
    }

    @Override
    public String toString() {
        return "  " +
                "Название:  " + title + ";  " +
                "Описание: " + description + ";  " +
                "Автор: " + author + ";  " +
                "Год публикации: " + yearOfPublication + ";  " +
                "Цена: " + price + System.lineSeparator();
    }
}
