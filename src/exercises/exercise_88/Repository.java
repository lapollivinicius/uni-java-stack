package exercises.exercise_88;

import java.util.List;

public class Repository {

    List<String> database = List.of("john", "mary", "lane", "pete");

    @Transactional(rollback = false)
    public Repository(final List<String> database) {
        this.database = database;
    }

    @Transactional(rollback = true)
    public String getItem(int index) {
        return database.get(index);
    }
}
