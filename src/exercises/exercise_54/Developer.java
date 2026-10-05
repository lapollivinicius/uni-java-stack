package src.exercises.exercise_54;

public class Developer extends Employer {

    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return this.getSalary() * 0.20;
    }
}
