public class Main {

    static Author[] initAuthors() {
        Author[] authors = new Author[4];
        authors[0] = new Author("Вася", "Пупкин");
        authors[1] = new Author("Василий", "Петров");
        authors[2] = new Author("Петр", "Васечкин");
        authors[3] = new Author("Марья", "Леданова");
        return authors;
    }

    public static void main(String[] args) {
        Author[] authors = initAuthors();
        int min = 1700;
        int max = 2025;
        int randomNumber = (int) (Math.random() * 4);
        int randomYear = (int) (Math.random() * (max - min + 1)) + min;
        Book sunrise = new Book("Sunrise", randomYear, authors[randomNumber]);
        Book lighthouse = new Book("Lighthouse", randomYear, authors[randomNumber]);
        Book space = new Book("New Space", randomYear, authors[randomNumber]);
        Book nightmares = new Book("Nightmares", randomYear, authors[randomNumber]);
        sunrise.setYear(2000);



    }



}