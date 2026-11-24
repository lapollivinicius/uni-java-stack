package src.exercises.exercise_75;

public class Employee {

    private String name;
    private double wage;
    private Position position;

    public Employee(String name, double wage, Position position) {
        this.name = name;
        this.wage = wage;
        this.position = position;
    }

    public String getName() {
        return this.name;
    }

    public void setName() {
        this.name = name;
    }

    public double getWage() {
        return this.wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public Position getPosition() {
        return this.position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "name='" + name + '\'' +
                ", wage=" + wage +
                ", position=" + position +
                '}';
    }
}
