package ch23;

import ch21.Book;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();

        library.add(new Book("first", "byeon"));
        library.add(new Book("second", "lee"));
        library.add(new Book("third", "park"));
        library.add(new Book("fourth", "lim"));
        library.add(new Book("fifth", "jo"));

        for (Book book : library) book.showInfo();
    }
}
