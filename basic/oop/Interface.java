package oop;

// interface is an abstract class with only abstract methods
// it is used to implements behavior to classes (more once)
// interfaces can have multiple extensions (with extends)
public interface Interface {

    // any attribute is a constant (public static final)
    String CONSTANT = "CONSTANT VALUE";

    // this is an abstract method that must be implemented
    void checkTax();

}
