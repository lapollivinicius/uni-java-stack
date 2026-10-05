package src.exercises.exercise_54;

public class Main {

    public static void main(String[] args) {

        Manager manager = new Manager("John", 5000.00);
        Developer developer = new Developer("Abby", 3000.00);
        Designer designer = new Designer("George", 2000.00);

        System.out.printf("%s \n%s \n%s", manager, developer, designer);

        manager.setSalary(manager.getSalary() + manager.calculateBonus());

        System.out.printf("\n%s \n%s \n%s", manager, developer, designer);

    }
}
