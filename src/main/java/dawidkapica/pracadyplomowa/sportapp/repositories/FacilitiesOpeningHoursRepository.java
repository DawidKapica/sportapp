package dawidkapica.pracadyplomowa.sportapp.repositories;

import dawidkapica.pracadyplomowa.sportapp.entities.FacilitiesOpeningHoursEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface FacilitiesOpeningHoursRepository extends JpaRepository<FacilitiesOpeningHoursEntity, Integer>, JpaSpecificationExecutor<FacilitiesOpeningHoursEntity> {
}
