package dawidkapica.pracadyplomowa.sportapp.repositories;

import dawidkapica.pracadyplomowa.sportapp.entities.SportFacilitiesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SportFacilitiesRepository extends JpaRepository<SportFacilitiesEntity, Integer>, JpaSpecificationExecutor<SportFacilitiesEntity> {
}
