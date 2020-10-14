package dawidkapica.pracadyplomowa.sportapp.specification;

import dawidkapica.pracadyplomowa.sportapp.entities.ExerciseEntity;
import net.kaczmarzyk.spring.data.jpa.domain.Between;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;


@And({
        @Spec(path = "name", params = "name", spec = Like.class),
        @Spec(
                path = "caloriesBurnedInMinute",
                params = {"caloriesBurnedInMinuteMin", "caloriesBurnedInMinuteMax"},
                spec = Between.class),
        @Spec(path = "exerciseCategory.name", params = "exerciseCategory", spec = Like.class),

})
public interface ExerciseSpecification extends Specification<ExerciseEntity> {
}
