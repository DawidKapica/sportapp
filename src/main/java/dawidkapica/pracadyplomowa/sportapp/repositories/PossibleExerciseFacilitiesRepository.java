package dawidkapica.pracadyplomowa.sportapp.repositories;

import dawidkapica.pracadyplomowa.sportapp.entities.PossibleExerciseFacilitiesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PossibleExerciseFacilitiesRepository extends JpaRepository<PossibleExerciseFacilitiesEntity, Integer>, JpaSpecificationExecutor<PossibleExerciseFacilitiesEntity> {
}
