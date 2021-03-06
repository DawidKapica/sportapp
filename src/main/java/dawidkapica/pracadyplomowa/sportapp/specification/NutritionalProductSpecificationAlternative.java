package dawidkapica.pracadyplomowa.sportapp.specification;

import dawidkapica.pracadyplomowa.sportapp.entities.NutritionalProductCategoryEntity_;
import dawidkapica.pracadyplomowa.sportapp.entities.NutritionalProductEntity;
import dawidkapica.pracadyplomowa.sportapp.entities.NutritionalProductEntity_;
import org.springframework.data.jpa.domain.Specification;


//Alternative version of specification search
public class NutritionalProductSpecificationAlternative extends GenericSpecification<NutritionalProductEntity> {

    public Specification<NutritionalProductEntity> category(String category) {
        return (root, criteriaQuery, criteriaBuilder) ->{

            return criteriaBuilder.equal(root.get(NutritionalProductEntity_.NUTRITIONAL_PRODUCT_CATEGORY).get(NutritionalProductCategoryEntity_.NAME), category);
        };

    }

}
