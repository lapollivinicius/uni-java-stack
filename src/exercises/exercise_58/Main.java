package src.exercises.exercise_58;

public class Main {

    public static void main(String[] args) {

        Triangle t = new Triangle(10, 2.1);
        t.calculatePerimeter();
        t.calculateArea();

        Circle c = new Circle(29.3);
        c.calculatePerimeter();
        c.calculateArea();

        Rectangle r = new Rectangle(21, 23.40);
        r.calculatePerimeter();
        r.calculateArea();

    }

}
