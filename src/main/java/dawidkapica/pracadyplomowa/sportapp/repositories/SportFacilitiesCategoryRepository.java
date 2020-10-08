package dawidkapica.pracadyplomowa.sportapp.repositories;

import dawidkapica.pracadyplomowa.sportapp.entities.SportFacilitiesCategoryEntity;
import dawidkapica.pracadyplomowa.sportapp.entities.SportFacilitiesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SportFacilitiesCategoryRepository extends JpaRepository<SportFacilitiesCategoryEntity, Integer>, JpaSpecificationExecutor<SportFacilitiesCategoryEntity> {
}
