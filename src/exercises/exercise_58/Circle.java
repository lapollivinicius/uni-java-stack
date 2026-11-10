package src.exercises.exercise_58;

public class Circle implements Shape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println(Math.PI * (radius * radius));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println(2 * Math.PI * radius);
    }
}
