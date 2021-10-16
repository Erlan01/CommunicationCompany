package pdp.uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pdp.uz.entity.Branch;

@Repository
public interface BranchRepo extends JpaRepository<Branch, Long> {
}
