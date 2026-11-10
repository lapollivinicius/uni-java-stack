package src.exercises.exercise_60;

public class Main {

    public static void main(String[] args) {

        Role role = Role.ADMIN;
        User user = new User("John", role);

        user.delete();
        user.managerUsers();

        System.out.println(user.getName());
        user.changeName("Mary");
        System.out.println(user.getName());

    }

}
