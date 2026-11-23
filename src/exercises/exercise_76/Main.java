package src.exercises.exercise_76;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        User user = new User("John", 11, "john@email.com", true);

        UserValidation highAge = _user -> _user.getAge() >= 18;
        UserValidation isActive = _user -> _user.isActive();
        UserValidation validEmail = _user -> _user.getEmail().contains("@");

        System.out.println(validateUser(user, validEmail.and(isActive)));

        List<User> users = new ArrayList<>(List.of(
                new User("John", 19, "john@email.com", true),
                new User("Mary", 11, "mary@email.com", true),
                new User("Lane", 21, "lane@email.com", false),
                new User("Abby", 15, "abby@email.com", true),
                new User("Pete", 20, "pete@email.com", true)
        ));

        validateUsers(users, highAge).forEach(System.out::println);

    }

    public static boolean validateUser(User user, UserValidation validation) {
        return validation.validate(user);
    }

    public static List<User> validateUsers(List<User> users, UserValidation validation) {
        return users.stream().filter(user -> validation.validate(user)).toList();
    }

    @FunctionalInterface
    interface UserValidation {
        boolean validate(User user);

        default UserValidation and(UserValidation uv) {
            return user -> validate(user) && uv.validate(user);
        }

        default UserValidation negate() {
            return user -> !validate(user);
        }
    }

}
