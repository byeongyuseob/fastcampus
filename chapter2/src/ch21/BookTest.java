package ch21;

public class BookTest {
    public static void main(String[] args) {
        Book[] library = new Book[5];

        library[0] = new Book("First book", "Byeon");
        library[1] = new Book("Second book", "Kim");
        library[2] = new Book("Third book", "Park");
        library[3] = new Book("Fourth book", "Lee");
        library[4] = new Book("Fifth book", "Oh");

        for (Book book : library) {
            System.out.println(book);
        }
    }
}
