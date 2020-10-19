package dawidkapica.pracadyplomowa.sportapp.specification;

import dawidkapica.pracadyplomowa.sportapp.entities.OpinionEntity;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;


@And({
        @Spec(path = "content", params = "content", spec = Like.class),
        @Spec(path = "userId", params = "userId", spec = Like.class),
        @Spec(path = "expertId", params = "expertId", spec = Like.class),
        @Spec(path = "rate", params = "rate", spec = Like.class),

})
public interface OpinionSpecification extends Specification<OpinionEntity> {
}
