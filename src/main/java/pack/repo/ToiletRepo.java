package pack.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pack.entity.CommentEntity;
import pack.entity.ToiletEntity;

import java.util.List;

@Repository
public interface ToiletRepo extends JpaRepository<ToiletEntity, Long> {

    ToiletEntity findAllByName(String name);
    ToiletEntity findByName(String name);
}
