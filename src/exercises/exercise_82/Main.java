package src.Advanced.exercises.exercise_82;

import java.util.List;

public class Main {

    static void main() {

        UserRepository ur = new UserRepository();
        UserApp user = ur.findById(1).orElseThrow();

        System.out.println(user);
        user.setEmail("abbie@gmail.com");

        ur.save(user);

        List<UserApp> users = ur.findAll();

        System.out.println(users);

    }

}
