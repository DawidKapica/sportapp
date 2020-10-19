package dawidkapica.pracadyplomowa.sportapp.specification;

import dawidkapica.pracadyplomowa.sportapp.entities.NutritionalProductEntity;
import dawidkapica.pracadyplomowa.sportapp.entities.NutritionalProductEntity_;
import org.springframework.data.jpa.domain.Specification;



//Alternative version of specification search
public class NutritionalProductSpecificationAlternative<T> {

    public Specification<NutritionalProductEntity> minCal(Integer minCal) {


        return (root, criteriaQuery, criteriaBuilder) ->{
            return criteriaBuilder.greaterThanOrEqualTo(root.get(NutritionalProductEntity_.CALORIFIC_VALUE), minCal);
        };

    }

    public Specification<NutritionalProductEntity> maxCal(Integer maxCal) {


        return (root, criteriaQuery, criteriaBuilder) ->{
            return criteriaBuilder.lessThanOrEqualTo(root.get(NutritionalProductEntity_.CALORIFIC_VALUE), maxCal);
        };

    }
}
