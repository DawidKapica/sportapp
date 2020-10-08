package dawidkapica.pracadyplomowa.sportapp.repositories;

import dawidkapica.pracadyplomowa.sportapp.entities.ConsumedFoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumedFoodRepository extends JpaRepository<ConsumedFoodEntity, Integer>, JpaSpecificationExecutor<ConsumedFoodEntity> {
}
