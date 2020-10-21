package dawidkapica.pracadyplomowa.sportapp.specification;

import dawidkapica.pracadyplomowa.sportapp.entities.ExerciseEntity;
import dawidkapica.pracadyplomowa.sportapp.entities.NutritionalProductCategoryEntity_;
import dawidkapica.pracadyplomowa.sportapp.entities.NutritionalProductEntity;
import dawidkapica.pracadyplomowa.sportapp.entities.NutritionalProductEntity_;
import org.springframework.data.jpa.domain.Specification;

public class ExerciseSpecificationCustom extends GenericSpecification<ExerciseEntity> {

    public Specification<NutritionalProductEntity> category(String category) {
        return (root, criteriaQuery, criteriaBuilder) ->{

            return criteriaBuilder.equal(root.get(NutritionalProductEntity_.NUTRITIONAL_PRODUCT_CATEGORY).get(NutritionalProductCategoryEntity_.NAME), category);
        };

    }

}
