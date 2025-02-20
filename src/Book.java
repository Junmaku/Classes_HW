import java.util.Objects;

public class Book {
    private String title;
    private int year;
    public Author author;
    private int year;

    public Book(Author author, String title) {
        this.author = author;
        this.title = title;
    }

    public Book(int year, String title) {
        this.year = year;
        this.title = title;
    }

    public Book(String title, int year, Author author) {
        setTitle(title);
        setYear(year);
        setAuthor(author);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getAuthorsName() {
        String fullname = "";
        fullname += getAuthor().getFirstName();
        fullname += " ";
        fullname += getAuthor().getLastName();
        return fullname;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book book)) return false;
        return getYear() == book.getYear() && Objects.equals(getTitle(), book.getTitle()) && Objects.equals(getAuthor(), book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getYear(), getAuthor());
    }

    @Override
    public String toString() {
        return String.format("%s. %s\n", this.title, this.author.toString());
    }
}
