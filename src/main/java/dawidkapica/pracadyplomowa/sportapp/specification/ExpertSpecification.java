package dawidkapica.pracadyplomowa.sportapp.specification;

import dawidkapica.pracadyplomowa.sportapp.entities.ExpertEntity;
import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

@And({
        @Spec(path = "education", params = "education", spec = Like.class),
        @Spec(path = "description", params = "description", spec = Like.class),
        @Spec(path = "mail", params = "mail", spec = Like.class),
        @Spec(path = "phone", params = "phone", spec = Equal.class),
})

public interface ExpertSpecification extends Specification<ExpertEntity> {
}
