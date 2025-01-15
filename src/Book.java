public class Book {
    private String title;
    private int year;
    public Author author;

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


}
