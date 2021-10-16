package pdp.uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pdp.uz.entity.Tariff;

@Repository
public interface TariffRepo extends JpaRepository<Tariff, Long> {
}
