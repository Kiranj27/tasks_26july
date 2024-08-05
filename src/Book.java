import java.util.ArrayList;
import java.util.Iterator;

public class Book {
    private String title;
    private String author;
    private boolean isExpired;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isExpired = false;
    }

    public String getTitle() {
        return title;
    }

    public void setExpired(boolean isExpired) {
        this.isExpired = isExpired;
    }

    public boolean isExpired() {
        return isExpired;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isExpired=" + isExpired +
                '}';
    }
}

class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added to the library.");
    }

    public void removeExpiredBooks() {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.isExpired()) {
                System.out.println(book.getTitle() + " removed from the library.");
                iterator.remove();
            }
        }
    }

    public void printBooks() {
        System.out.println("Books available in the library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Java Programming", "Author A");
        Book book2 = new Book("Data Structures", "Author B");

        library.addBook(book1);
        library.addBook(book2);

        library.printBooks();

        book1.setExpired(true);

        library.removeExpiredBooks();
        library.printBooks();
    }
}
