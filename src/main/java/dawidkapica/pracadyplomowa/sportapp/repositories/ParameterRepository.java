package dawidkapica.pracadyplomowa.sportapp.repositories;

import dawidkapica.pracadyplomowa.sportapp.entities.ParameterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ParameterRepository extends JpaRepository<ParameterEntity, Integer>, JpaSpecificationExecutor<ParameterEntity> {
}
