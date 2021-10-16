package pdp.uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pdp.uz.entity.Subscriber;

@Repository
public interface SubscriberRepo extends JpaRepository<Subscriber, Long> {
}
