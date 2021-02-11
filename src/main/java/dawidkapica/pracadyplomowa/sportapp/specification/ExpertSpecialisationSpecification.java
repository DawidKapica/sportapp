package dawidkapica.pracadyplomowa.sportapp.specification;

import dawidkapica.pracadyplomowa.sportapp.entities.ExpertEntity_;
import dawidkapica.pracadyplomowa.sportapp.entities.ExpertSpecialisationEntity;
import dawidkapica.pracadyplomowa.sportapp.entities.ExpertSpecialisationEntity_;
import lombok.Data;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

@Data
public class ExpertSpecialisationSpecification implements Specification<ExpertSpecialisationEntity> {

    private final Integer expertId;

    @Override
    public Predicate toPredicate (Root<ExpertSpecialisationEntity> root, CriteriaQuery<?> cq, CriteriaBuilder cb) {
        if (expertId != null) {
            cq.where(
                    cb.and(
                            cb.equal(root.get(ExpertSpecialisationEntity_.expert).get(ExpertEntity_.id), expertId)));
        }

        return cq.getRestriction();
    }
}
