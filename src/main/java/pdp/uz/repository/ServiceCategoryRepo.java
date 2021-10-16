package pdp.uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pdp.uz.entity.ServiceCategory;

@Repository
public interface ServiceCategoryRepo extends JpaRepository<ServiceCategory, Long> {
}
