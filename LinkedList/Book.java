package LinkedList;

public class Book {
    int price;
    String author;
    String publication;
    String title;

    @Override
    public String toString() {
        return "Book{" +
                "price=" + price +
                ", author='" + author + '\'' +
                ", publication='" + publication + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public Book(int price, String author, String publication, String title) {
        this.price = price;
        this.author = author;
        this.publication = publication;
        this.title = title;


    }
}
