package dawidkapica.pracadyplomowa.sportapp.specification;

import dawidkapica.pracadyplomowa.sportapp.entities.UserPlanEntity;
import net.kaczmarzyk.spring.data.jpa.domain.Between;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

@And({
        @Spec(path = "userId", params = "userId", spec = Like.class),
        @Spec(path = "description", params = "description", spec = Like.class),
        @Spec(path = "goal", params = "goal", spec = Like.class),
        @Spec(
                path = "startDate",
                params = {"startDateMin", "startDateMax"},
                spec = Between.class),
        @Spec(
                path = "endDate",
                params = {"endDateMin", "endDateMax"},
                spec = Between.class)

})
public interface UserPlanSpecification extends Specification<UserPlanEntity> {
}
