package dawidkapica.pracadyplomowa.sportapp.repositories;

import dawidkapica.pracadyplomowa.sportapp.entities.NutritionalProductCategoryEntity;
import dawidkapica.pracadyplomowa.sportapp.entities.NutritionalProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface NutritionalProductCategoryRepository extends JpaRepository<NutritionalProductCategoryEntity, Integer>, JpaSpecificationExecutor<NutritionalProductCategoryEntity> {
}
