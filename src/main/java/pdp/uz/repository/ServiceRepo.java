package pdp.uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pdp.uz.entity.Services;

@Repository
public interface ServiceRepo extends JpaRepository<Services, Long> {
}
