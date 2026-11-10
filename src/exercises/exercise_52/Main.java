package src.exercises.exercise_52;

public class Main {

    public static void main(String[] args) {

        Library lib = new Library();

        Author author = new Author("CS LEWIS");

        Book b1 = new Book("CHRONICS", "123", true, author);
        Book b2 = new Book("SCREWTAPE", "321", true, author);
        Book b3 = new Book("PRINCE", "231", true, author);

        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);

        lib.lendBook(b2);

        lib.listBooks();

    }

}
