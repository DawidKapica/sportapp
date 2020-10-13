package dawidkapica.pracadyplomowa.sportapp.specification;

import dawidkapica.pracadyplomowa.sportapp.entities.NutritionalProductEntity;
import dawidkapica.pracadyplomowa.sportapp.entities.NutritionalProductEntity_;
import lombok.Data;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.security.core.parameters.P;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;


@Data
public class NutritionalProductSpecification implements Specification<NutritionalProductEntity> {


    private final Integer minCal;
    private final Integer maxCal;



    @Override
    public Predicate toPredicate (Root<NutritionalProductEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
        List<Predicate> predicates = new ArrayList<>();

        if(minCal != null && maxCal != null) {
            criteriaQuery.where(
                    criteriaBuilder.and(
                            criteriaBuilder.greaterThanOrEqualTo(
                                    root.get(
                                            NutritionalProductEntity_.calorificValue), minCal), criteriaBuilder.lessThanOrEqualTo(root.get(NutritionalProductEntity_.calorificValue), maxCal)));

        } else if (minCal == null) {
            criteriaQuery.where(
                    criteriaBuilder.lessThanOrEqualTo(root.get(NutritionalProductEntity_.calorificValue), maxCal));
        } else if (maxCal == null) {
            criteriaQuery.where(
                    criteriaBuilder.greaterThanOrEqualTo(root.get(
                            NutritionalProductEntity_.calorificValue), minCal));
        }
        return criteriaQuery.getRestriction();
    }
}
