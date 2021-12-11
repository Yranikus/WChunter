package pack.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pack.entity.ToiletEntity;

@Repository
public interface ToiletRepo extends JpaRepository<ToiletEntity, Long> {

}
