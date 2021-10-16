package pdp.uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pdp.uz.entity.USSDCodes;

@Repository
public interface USSDRepo extends JpaRepository<USSDCodes, Long> {
}
