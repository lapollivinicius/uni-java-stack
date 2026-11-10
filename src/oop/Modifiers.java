package src.oop;

// abstract is a base to other classes
abstract class Modifiers {

  public String name; // it can be accessed in own class, package, subclass and any class
  private int age; // it can be accessed only in own class
  protected double height; // it can be accessed in own class, package and subclass

  public int showAge() {
    return this.age;
  }

}
