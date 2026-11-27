package exercises.exercise_90;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {

    @SuppressWarnings("unchecked")
    static void main() throws IOException, ClassNotFoundException {

        List<ApplicationUser> users = List.of(
                new ApplicationUser("john", 23, "john@email.com", "123john"),
                new ApplicationUser("mary", 23, "mary@email.com", "123mary"),
                new ApplicationUser("anna", 23, "anna@email.com", "123anna")
        );

        Path file = Path.of( "src", "exercises", "exercise_90", "bin").resolve("users.bin");

        // ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(file));
        // oos.writeObject(users);
        // oos.close();

        ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(file));

        if (!Files.exists(file)) {
            System.out.println("the file doesn't exists");
            System.exit(1);
        }

        List<ApplicationUser> _users = (List<ApplicationUser>) ois.readObject();
        ois.close();

        _users.forEach(user -> System.out.println(user.name));

    }
}
