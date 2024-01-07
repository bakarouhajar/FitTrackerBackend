package ma.emsi.fittracker.repositories;

import ma.emsi.fittracker.entities.Diet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DietRepository extends JpaRepository<Diet, Long> {
}
