package dawidkapica.pracadyplomowa.sportapp.specification;

import dawidkapica.pracadyplomowa.sportapp.entities.TrainingEntity;
import net.kaczmarzyk.spring.data.jpa.domain.Between;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

@And({
        @Spec(path = "name", params = "name", spec = Like.class),
        @Spec(path = "userId", params = "userId", spec = Like.class),
        @Spec(path = "exerciseId", params = "exerciseId", spec = Like.class),
        @Spec(
                path = "trainingDate",
                params = {"trainingDateMin", "trainingDateMax"},
                spec = Between.class)


})
public interface TrainingSpecification extends Specification<TrainingEntity> {
}
