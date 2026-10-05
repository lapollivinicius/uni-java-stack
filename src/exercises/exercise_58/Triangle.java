package src.exercises.exercise_58;

public class Triangle implements Shape {

    double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        System.out.println((base * height) / 2);
    }

    @Override
    public void calculatePerimeter() {
        double hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        System.out.println(base + height + hypotenuse);
    }
}
