package src.exercises.exercise_oop_02;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private final List<Book> books = new ArrayList<>();
    private final List<Book> borrowed = new ArrayList<>();

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void listBooks() {
        System.out.println("AVAILABLE");
        for(Book book: this.books) {
            System.out.println(book.toString());
        };
        System.out.println("BORROWED");
        for(Book book: this.borrowed) {
            System.out.println(book.toString());
        };
    }

    public void lendBook(Book book) {
        book.setAvailable(false);
        this.books.remove(book);
        this.borrowed.add(book);
    }

    public void returnBook(Book book) {
        book.setAvailable(true);
        this.books.add(book);
        this.borrowed.remove(book);
    }

    public void searchByIsbn(String isbn) {
        for(Book book: this.books) {
            if(book.equalsIsbn(isbn)) {
                System.out.println(book);
            }
        }
    }

}
