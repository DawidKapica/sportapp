package dawidkapica.pracadyplomowa.sportapp.specification;

import dawidkapica.pracadyplomowa.sportapp.dto.search.SearchSpecialisation;
import dawidkapica.pracadyplomowa.sportapp.entities.*;
import lombok.Data;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Data
public class ExpertWithRequiredSpecialisationSpecification implements Specification<ExpertEntity> {

//    private final Integer specialisationId;


    private final Collection<SearchSpecialisation> searchSpecialisations;

    @Override
    public Predicate toPredicate (Root<ExpertEntity> root, CriteriaQuery<?> cq, CriteriaBuilder cb) {

        CollectionJoin<ExpertEntity, ExpertSpecialisationEntity> specialisationJoin =
                root.join(ExpertEntity_.expertSpecialisation);

        List<Predicate> predicates = new ArrayList<>();
        for (SearchSpecialisation searchSpecialisation : searchSpecialisations) {
            Predicate specialisationIdPredicate =
                    cb.equal(
                            specialisationJoin.get(ExpertSpecialisationEntity_.specialisation).get(SpecialisationEntity_.id),
                            searchSpecialisation.getSpecialisationId());
            Predicate experienceYearPredcate =
                    cb.greaterThanOrEqualTo(
                            specialisationJoin
                                    .get(ExpertSpecialisationEntity_.experienceYear),
                            searchSpecialisation.getExperienceYear());

            predicates.add(cb.and(specialisationIdPredicate, experienceYearPredcate));
        }

        return cq.where(cb.or(predicates.toArray(new Predicate[0]))).having(
                        cb.equal(
                                cb.countDistinct(
                                        specialisationJoin.get(ExpertSpecialisationEntity_.specialisation).get(SpecialisationEntity_.id)),
                                searchSpecialisations.size())).distinct(true)
                .getRestriction();

//        return cq.where(cb.or(predicates.toArray(new Predicate[0])))
//                .groupBy(specialisationJoin.get(ExpertSpecialisationEntity_.expert))
//                .having(
//                        cb.equal(
//                                cb.countDistinct(
//                                        specialisationJoin.get(ExpertSpecialisationEntity_.specialisation).get(SpecialisationEntity_.id)),
//                                searchSpecialisations.size()))
//                .getRestriction();


//        if (specialisationId != null) {
//            cq.where(
//                    cb.and(
//                            cb.equal(root.get(ExpertSpecialisationEntity_.specialisation).get(SpecialisationEntity_.id), specialisationId)));
//        }
//
//        return cq.getRestriction();
    }

//return null;
}
