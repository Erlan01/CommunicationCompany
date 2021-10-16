package pdp.uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pdp.uz.entity.Activity;

public interface ActivityRepo extends JpaRepository<Activity, Long> {
}
