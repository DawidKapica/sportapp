package dawidkapica.pracadyplomowa.sportapp.specification;

import dawidkapica.pracadyplomowa.sportapp.entities.ExpertEntity_;
import dawidkapica.pracadyplomowa.sportapp.entities.OpinionEntity;
import dawidkapica.pracadyplomowa.sportapp.entities.OpinionEntity_;
import lombok.Data;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

@Data
public class OpinionSpecification implements Specification<OpinionEntity> {

    private final Integer expertId;

    @Override
    public Predicate toPredicate (Root<OpinionEntity> root, CriteriaQuery<?> cq, CriteriaBuilder cb) {
        if (expertId != null) {
            cq.where(
                    cb.and(
                            cb.equal(root.get(OpinionEntity_.expert).get(ExpertEntity_.id), expertId)));
        }

        return cq.getRestriction();
    }
}
