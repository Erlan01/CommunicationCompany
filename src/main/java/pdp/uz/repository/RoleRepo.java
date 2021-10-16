package pdp.uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pdp.uz.entity.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {
}
