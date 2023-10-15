import java.util.*;

class Book {
    String title;
    String author;
    String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

}

class Bookstore {
    private static ArrayList<Book> bookCollection = new ArrayList<Book>();

    public Bookstore() {
        bookCollection = new ArrayList<Book>();
    }

    public void add_Book(Book book) {
        bookCollection.add(book);
    }

    public void remove_Book(Book book) {
        bookCollection.remove(book);
    }

    public void searchByTitle(String title) {
        for (Book book : bookCollection) {
            if (book.getTitle().equals(title)) {
                System.out.println(book.getTitle() + " " + book.getAuthor() + " " + book.getISBN());
            }
        }
    }

    public void searchByAuthor(String author) {
        for (Book book : bookCollection) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book.getTitle() + " " + book.getAuthor() + " " + book.getISBN());
            }
        }
    }

    public void searchByISBN(String ISBN) {
        for (Book book : bookCollection) {
            if (book.getISBN().equals(ISBN)) {
                System.out.println(book.getTitle() + " " + book.getAuthor() + " " + book.getISBN());
            }
        }
    }

    public ArrayList<Book> getBookCollection() {
        return bookCollection;
    }
}

public class problem5 {
    public static void main(String[] args) {
        Book book1 = new Book("Tahzibut Tahzib", "Ibnu Hajar", "123456789");
        Book book2 = new Book("Al minhaj sharh sahih muslim", "Imam nawawi", "987654321");
        Book book3 = new Book("Tahzibul Kamal", "Jamaluddin al Mizzi", "123456789");
        Book book4 = new Book("Musnade Ahmad", "Imam Ahmad", "987654321");
        Book book5 = new Book("Zadul Ma'ad", "Ibnu Qayyim", "123456789");
        Book book6 = new Book("Al Bidayah wan Nihayah", "Ibnu Katsir", "987654321");
        Bookstore bookstore = new Bookstore();
        bookstore.add_Book(book1);
        bookstore.add_Book(book2);
        bookstore.add_Book(book3);
        bookstore.add_Book(book4);
        bookstore.add_Book(book5);
        bookstore.add_Book(book6);
        System.out.println("Search by Title");
        bookstore.searchByTitle("Tahzibut Tahzib");

        bookstore.remove_Book(book4);
        ArrayList<Book> bookCollection = bookstore.getBookCollection();
        bookCollection.get(0).setTitle("Fatul Bari");
        bookCollection.get(0).setAuthor("Ibnu Hajar");
        bookCollection.get(0).setISBN("123456789");
        System.out.println("Search by Author");
        bookstore.searchByAuthor("Ibnu Hajar");
        System.out.println("After removing and updating");
        bookCollection
                .forEach((book) -> System.out.println(book.getTitle() + " " + book.getAuthor() + " " + book.getISBN()));

    }
}