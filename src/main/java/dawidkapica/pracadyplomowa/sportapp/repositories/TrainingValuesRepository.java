package dawidkapica.pracadyplomowa.sportapp.repositories;

import dawidkapica.pracadyplomowa.sportapp.entities.TrainingValuesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingValuesRepository extends JpaRepository<TrainingValuesEntity, Integer>, JpaSpecificationExecutor<TrainingValuesEntity> {
}
