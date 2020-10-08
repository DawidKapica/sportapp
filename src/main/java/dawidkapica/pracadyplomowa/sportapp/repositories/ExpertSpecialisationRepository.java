package dawidkapica.pracadyplomowa.sportapp.repositories;

import dawidkapica.pracadyplomowa.sportapp.entities.ExpertSpecialisationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpertSpecialisationRepository extends JpaRepository<ExpertSpecialisationEntity, Integer>, JpaSpecificationExecutor<ExpertSpecialisationEntity> {
}
