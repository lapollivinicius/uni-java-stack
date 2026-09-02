package oop;

public class Classes {

  // type attribute = value (or nothing)
  String name = "John";
  int age;
  double height;
  double weight;

  // constructor function
  Classes(String name, int age) {

    // "this" is a ref to class
    this.name = name_;
    this.age = age_;
  }

  public static void main(String[] args) {

    // to instance a class use new
    Classes Person = new Classes("John", 20);

  }

}
