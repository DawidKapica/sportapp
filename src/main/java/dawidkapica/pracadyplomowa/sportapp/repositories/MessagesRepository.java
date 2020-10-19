package dawidkapica.pracadyplomowa.sportapp.repositories;

import dawidkapica.pracadyplomowa.sportapp.entities.MessagesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface MessagesRepository extends JpaRepository<MessagesEntity, Integer>, JpaSpecificationExecutor<MessagesEntity> {
}
