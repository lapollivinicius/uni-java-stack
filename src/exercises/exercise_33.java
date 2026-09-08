package src.Advanced.exercises;

import java.util.Arrays;

public class exercise_33 {

  int registration;
  String name;
  String course;
  String[] modules;

  public void register(int registration_, String name_, String course_, String[] modules_) {
    registration = registration_;
    name = name_;
    course = course_;
    modules = modules_;
  }

  public String informations() {
    return registration + "\n" + name + "\n" + course + "\n" + Arrays.toString(modules);
  }

  public static void main(String[] args) {
    exercise_33 student = new exercise_33();
    String[] modules = {"plants", "animals"};
    student.register(123456, "john", "Biology", modules);
    String info = student.informations();
    System.out.println(info);
  }
}
