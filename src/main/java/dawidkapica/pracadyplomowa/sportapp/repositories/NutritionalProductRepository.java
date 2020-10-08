package dawidkapica.pracadyplomowa.sportapp.repositories;

import dawidkapica.pracadyplomowa.sportapp.entities.NutritionalProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface NutritionalProductRepository extends JpaRepository<NutritionalProductEntity, Integer>, JpaSpecificationExecutor<NutritionalProductEntity> {
}
