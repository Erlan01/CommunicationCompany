package pdp.uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pdp.uz.entity.Employee;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    boolean existsByUsernameAndActiveTrue(String username);

    Optional<Employee> findByUsernameAndActiveTrue(String username);
}
