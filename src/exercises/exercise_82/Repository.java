package src.Advanced.exercises.exercise_82;

import java.util.List;
import java.util.Optional;

public interface Repository<T> {
    Optional<T> findById(int id);
    List<T> findAll();
    void save(T r);
}
