package src.exercises.exercise_54;

public class Manager extends Employer {

    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return this.getSalary() * 0.30;
    }
}
