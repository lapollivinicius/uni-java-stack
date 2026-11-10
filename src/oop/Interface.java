package src.oop;

// interface is an abstract class with only abstract methods
// it is used to implements behavior to classes (more once)
// interfaces can have multiple extensions (with extends)
public interface Interface {

    // any attribute is a constant (public static final)
    String CONSTANT = "CONSTANT VALUE";

    // this is an abstract method that must be implemented
    void checkTax();

    // use default to implements a method in interface (>v8)
    default void myMethod() {
        System.out.println("my method is running");
    }

    // it can implement a static method and ca be executed everywhere
    static int count() {
        return 10;
    }

    // diamond problem - it needs to implement the method in class

}
