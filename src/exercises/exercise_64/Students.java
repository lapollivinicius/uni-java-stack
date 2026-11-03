package src.exercises.exercise_64;

import java.util.Objects;

public class Students implements Comparable<Students> {

    private String name;
    private int age;
    private double grade;

    public Students(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Students students)) return false;
        return Objects.equals(name, students.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return name + " is " + age + " years old with grade " + grade;
    }

    @Override
    public int compareTo(Students o) {
        return -Double.compare(this.grade, o.grade);
    }
}
