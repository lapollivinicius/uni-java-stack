package src.exercises.exercise_58;

public class Rectangle implements Shape {

    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        System.out.println(width * height);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println((width + height) * 2);
    }
}
