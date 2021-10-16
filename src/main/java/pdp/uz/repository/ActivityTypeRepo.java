package pdp.uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pdp.uz.entity.ActivityType;

@Repository
public interface ActivityTypeRepo extends JpaRepository<ActivityType, Long> {
}
