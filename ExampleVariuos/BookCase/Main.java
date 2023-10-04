package BookCase;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Kitapları isme göre sıralayan Set
        Set<Book> bookSetByName = new TreeSet<>();

        // Kitapları isme göre sıralayan Set'e kitapları ekleyelim
        bookSetByName.add(new Book("Harry Potter", 400, "J.K. Rowling", "2001-07-08"));
        bookSetByName.add(new Book("The Great Gatsby", 250, "F. Scott Fitzgerald", "1925-04-10"));
        bookSetByName.add(new Book("To Kill a Mockingbird", 320, "Harper Lee", "1960-07-11"));
        bookSetByName.add(new Book("1984", 328, "George Orwell", "1949-06-08"));
        bookSetByName.add(new Book("Pride and Prejudice", 279, "Jane Austen", "1813-01-28"));

        System.out.println("Kitapları İsme Göre Sırala:");
        for (Book book : bookSetByName) {
            System.out.println(book.getTitle());
        }

        // Kitapları sayfa sayısına göre sıralayan Set
        Set<Book> bookSetByPageCount = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                // Kitapları sayfa sayısına göre sırala
                return Integer.compare(book1.getPageCount(), book2.getPageCount());
            }
        });

        // Kitapları sayfa sayısına göre sıralayan Set'e kitapları ekleyelim
        bookSetByPageCount.add(new Book("Harry Potter", 400, "J.K. Rowling", "2001-07-08"));
        bookSetByPageCount.add(new Book("The Great Gatsby", 250, "F. Scott Fitzgerald", "1925-04-10"));
        bookSetByPageCount.add(new Book("To Kill a Mockingbird", 320, "Harper Lee", "1960-07-11"));
        bookSetByPageCount.add(new Book("1984", 328, "George Orwell", "1949-06-08"));
        bookSetByPageCount.add(new Book("Pride and Prejudice", 279, "Jane Austen", "1813-01-28"));

        System.out.println("\nKitapları Sayfa Sayısına Göre Sırala:");
        for (Book book : bookSetByPageCount) {
            System.out.println(book.getTitle() + " - Sayfa Sayısı: " + book.getPageCount());
        }
    }
}
