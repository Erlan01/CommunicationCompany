package pdp.uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pdp.uz.entity.Activity;

@Repository
public interface ActivityRepo extends JpaRepository<Activity, Long> {
}
