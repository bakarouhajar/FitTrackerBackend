package ma.emsi.fittracker.repositories;

import ma.emsi.fittracker.entities.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealRepository extends JpaRepository<Meal, Long> {
    // Additional methods if needed
}

