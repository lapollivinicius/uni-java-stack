package src.exercises.exercise_oop_02;

import java.util.Objects;

public class Book {

    private String title;
    private String isbn;
    private Author author;
    private boolean isAvailable = true;

    public Book(String title, String isbn, boolean isAvailable, Author author) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean equalsIsbn(String isbn) {
        return Objects.equals(isbn, this.isbn);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", author=" + author +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
