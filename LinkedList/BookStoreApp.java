package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class BookStoreApp {
    public static void main(String[] args) {
        List<Book> bookList = new LinkedList<>();

        Book b1 = new Book(250, "Yashwant Kanetkar", "BPB", "Let us C");
        Book b2 = new Book(350, "Uncle BOB", "Unknown", "Clean Code");
        Book b3 = new Book(375, "Joshua Bloch", "Unknown", "Effective Java");

        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);

        for (Book book:bookList) {
            System.out.println(book);
        }
    }
}

