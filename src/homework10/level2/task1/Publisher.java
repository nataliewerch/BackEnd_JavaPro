package homework10.level2.task1;

public class Publisher{
    private String title;
    private int yearOfFoundation;

    public Publisher (String title, int yearOfFoundation) {
        this.title = title;
        this.yearOfFoundation = yearOfFoundation;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

  /*  @Override
    public int compareTo(@NotNull Publisher o) {
        return this.title.compareTo(o.title);
    }*/

    @Override
    public String toString() {
        return "Издательство: " + title + "; Год образования: " + yearOfFoundation;
    }
}
