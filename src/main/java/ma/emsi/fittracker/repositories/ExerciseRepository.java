package ma.emsi.fittracker.repositories;

import ma.emsi.fittracker.entities.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
}
