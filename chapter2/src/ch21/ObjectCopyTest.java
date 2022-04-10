package ch21;

public class ObjectCopyTest {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] shallowLibrary = new Book[5];
        Book[] deepLibrary = {new Book("", ""), new Book("", ""), new Book("", ""), new Book("", ""), new Book("", "")};

        library[0] = new Book("First book", "Byeon");
        library[1] = new Book("Second book", "Kim");
        library[2] = new Book("Third book", "Park");
        library[3] = new Book("Fourth book", "Lee");
        library[4] = new Book("Fifth book", "Oh");

        System.arraycopy(library, 0, shallowLibrary, 0, 5);

        System.out.println("Origin");
        for (Book book : library) {
            book.showInfo();
        }

        System.out.println("Copied");
        for (Book book : shallowLibrary) {
            book.showInfo();
        }

        library[0].setAuthor("Jo");
        library[0].setTitle("Sixth book");

        library[0].showInfo();
        shallowLibrary[0].showInfo();

        for (int i = 0; i < library.length; i++) {
            deepLibrary[i].setAuthor(library[i].getAuthor());
            deepLibrary[i].setTitle(library[i].getTitle());
        }

        library[0].setAuthor("Ha");
        library[0].setTitle("Seventh book");

        library[0].showInfo();
        deepLibrary[0].showInfo();
    }
}
