import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Book {
    private String title;
    private int pageCount;
    private String author;
    private String publicationDate;

    public Book(String title, int pageCount, String author, String publicationDate) {
        this.title = title;
        this.pageCount = pageCount;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublicationDate() {
        return publicationDate;
    }
}

public class BookCase {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Great Gatsby", 11, "F. Scott Fitzgerald", "1925-04-10"));
        books.add(new Book("To Kill a Mockingbird", 22, "Harper Lee", "1960-07-11"));
        books.add(new Book("1984", 328, "George Orwell", "1949-06-08"));
        books.add(new Book("Pride and Prejudice", 22, "Jane Austen", "1813-01-28"));
        books.add(new Book("The Catcher in the Rye", 33, "J.D. Salinger", "1951-07-16"));
        books.add(new Book("Moby-Dick", 576, "Herman Melville", "1851-10-18"));
        books.add(new Book("Brave New World", 311, "Aldous Huxley", "1932-12-01"));
        books.add(new Book("The Hobbit", 33, "J.R.R. Tolkien", "1937-09-21"));
        books.add(new Book("War and Peace", 33, "Leo Tolstoy", "1869-01-20"));
        books.add(new Book("The Lord of the Rings", 1178, "J.R.R. Tolkien", "1954-07-29"));

        // Kitap ismi ile yazar ismi eşleştiren bir Map oluşturma
        Map<String, String> titleToAuthorMap = books.stream()
                .collect(Collectors.toMap(Book::getTitle, Book::getAuthor));

        // Sayfa sayısı 100'den fazla olan kitapları filtreleme
        List<Book> booksWithMoreThan100Pages = books.stream()
                .filter(book -> book.getPageCount() > 100)
                .collect(Collectors.toList());

        // Sonuçları yazdırma
        System.out.println("Kitap İsmi ile Yazar İsmi Eşleştiren Map:");
        titleToAuthorMap.forEach((title, author) -> System.out.println(title + " -> " + author));

        System.out.println("\n100'den Fazla Sayfa İçeren Kitaplar:");
        booksWithMoreThan100Pages.forEach(book -> System.out.println(book.getTitle()));
    }
}
