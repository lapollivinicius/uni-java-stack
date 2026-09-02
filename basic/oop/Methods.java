package oop;

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

  // methods with params
  String hello(String message) {
    return message + ", " + name;
  }

}
