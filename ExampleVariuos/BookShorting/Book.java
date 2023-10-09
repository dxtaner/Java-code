package BookShorting;

import java.util.Set;
import java.util.TreeSet;

public class Book implements Comparable<Book> {
    private String title;
    private int pageCount;
    private String authorName;
    private String publicationDate;

    public Book(String title, int pageCount, String authorName, String publicationDate) {
        this.title = title;
        this.pageCount = pageCount;
        this.authorName = authorName;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    @Override
    public int compareTo(Book otherBook) {
        return this.title.compareTo(otherBook.title);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageCount=" + pageCount +
                ", authorName='" + authorName + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // İsimlere göre sıralama için Set oluşturma
        Set<Book> bookSetByName = new TreeSet<>();
        bookSetByName.add(new Book("The Catcher in the Rye", 224, "J.D. Salinger", "July 1951"));
        bookSetByName.add(new Book("To Kill a Mockingbird", 336, "Harper Lee", "July 1960"));
        bookSetByName.add(new Book("1984", 328, "George Orwell", "June 1949"));
        bookSetByName.add(new Book("Pride and Prejudice", 279, "Jane Austen", "January 1813"));
        bookSetByName.add(new Book("The Great Gatsby", 180, "F. Scott Fitzgerald", "April 1925"));

        System.out.println("Kitaplar İsme Göre Sıralandı:");
        for (Book book : bookSetByName) {
            System.out.println(book);
        }

        // Sayfa sayısına göre sıralama için başka bir Set oluşturma
        Set<Book> bookSetByPageCount = new TreeSet<>(new PageCountComparator());
        bookSetByPageCount.addAll(bookSetByName);

        System.out.println("\nKitaplar Sayfa Sayısına Göre Sıralandı:");
        for (Book book : bookSetByPageCount) {
            System.out.println(book);
        }
    }
}

class PageCountComparator implements java.util.Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return Integer.compare(book1.getPageCount(), book2.getPageCount());
    }
}
