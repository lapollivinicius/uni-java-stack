package src.oop;

// STACK - storage refs to objects, values, anything
//   |
//   V
// HEAP - storage the objs, values, anything

// to import external classes (use * to import all class from package)
import java.lang.*; // package default to java

// to import static methods or class use static keyword
import static java.lang.Math.pow;

public class Classes {

    // type attribute = value (or nothing)
    // if attribute is empty - it is null (with class)
    String name = "John";
    int age;
    double height;
    double weight;



    // constructor function
    Classes(String name, int age) {
        // "this" is a ref to class
        this.name = name;
        this.age = age;

        // use this() to call the constructor
    }

    public static void main(String[] args) {
        // to instance a class use new
        Classes Person = new Classes("John", 20);

        // implement external class use package.class (fully qualified name)
        // basic.HelloWorld hello = new basic.HelloWorld();
        // HelloWorld hello = new HelloWorld();

        // use the method static without class
        double n = pow(10, 2);
        System.out.println(n); // 100
    }
}
