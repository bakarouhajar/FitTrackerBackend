package ma.emsi.fittracker.repositories;

import ma.emsi.fittracker.entities.Recorde;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Recorde, Long> {
}

