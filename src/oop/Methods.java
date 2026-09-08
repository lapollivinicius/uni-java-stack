package src.oop;

public class Methods {

  String name;

  // type and name_method()
  void action() {
    System.out.println(name + " is acting");
  }

  // return methods
  String information() {
    return name;
  }

  // overloading
  String method(String msg) {
    return "your message is " + msg;
  }

  String method(int msg) {
    return "your param is an int";
  }

  // methods with params
  String hello(String message) {
    return message + ", " + name;
  }

}
