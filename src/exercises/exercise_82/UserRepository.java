package src.Advanced.exercises.exercise_82;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository implements Repository<UserApp> {

    List<UserApp> database = new ArrayList<>(List.of(
            new UserApp("john@email.com", "john123"),
            new UserApp("abby@email.com", "abby123"),
            new UserApp("jane@email.com", "jane123"),
            new UserApp("mary@email.com", "mary123")
    ));

    @Override
    public Optional<UserApp> findById(int id) {
        UserApp user;
        try {
            user = database.get(id);
        } catch (IndexOutOfBoundsException err) {
            return Optional.empty();
        }
        return Optional.of(user);
    }

    @Override
    public List<UserApp> findAll() {
        return database;
    }

    @Override
    public void save(UserApp r) {
        database.add(r);
    }
}
