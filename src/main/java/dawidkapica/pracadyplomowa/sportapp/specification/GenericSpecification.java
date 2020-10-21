package dawidkapica.pracadyplomowa.sportapp.specification;

import org.springframework.data.jpa.domain.Specification;

import java.time.LocalDate;

public abstract class GenericSpecification<T> {

    public Specification<T> intEqual (Integer value, String entityValue) {

        return (root, criteriaQuery, criteriaBuilder) ->{
            return criteriaBuilder.equal(root.get(entityValue), value);
        };

    }

    public Specification<T> idEqual (Integer value, String entityValue) {

        return (root, criteriaQuery, criteriaBuilder) ->{
            return criteriaBuilder.equal(root.get(entityValue).get("id"), value);
        };

    }

    public Specification<T> minVal (Integer minVal, String entityValue) {

        return (root, criteriaQuery, criteriaBuilder) ->{
            return criteriaBuilder.greaterThanOrEqualTo(root.get(entityValue), minVal);
        };

    }

    public Specification<T> maxVal(Integer maxVal, String entityValue) {

        return (root, criteriaQuery, criteriaBuilder) ->{
            return criteriaBuilder.lessThanOrEqualTo(root.get(entityValue), maxVal);
        };

    }

    public Specification<T> stringEqual(String inscription, String entityValue) {

        return (root, criteriaQuery, criteriaBuilder) ->{
            return criteriaBuilder.equal(root.get(entityValue), inscription);
        };

    }

    public Specification<T> stringContain(String inscription, String entityValue) {

        return (root, criteriaQuery, criteriaBuilder) ->{
            return criteriaBuilder.like(root.get(entityValue), inscription);
        };

    }

    public Specification<T> minDate (LocalDate minDate, String entityValue) {

        return (root, criteriaQuery, criteriaBuilder) ->{
            return criteriaBuilder.greaterThanOrEqualTo(root.get(entityValue), minDate);
        };

    }

    public Specification<T> maxDate (LocalDate maxDate, String entityValue) {

        return (root, criteriaQuery, criteriaBuilder) ->{
            return criteriaBuilder.greaterThanOrEqualTo(root.get(entityValue), maxDate);
        };

    }
}
