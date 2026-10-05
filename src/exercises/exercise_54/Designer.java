package src.exercises.exercise_54;

public class Designer extends Employer {

    public Designer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return this.getSalary() * 0.10;
    }
}
