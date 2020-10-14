package dawidkapica.pracadyplomowa.sportapp.specification;

import dawidkapica.pracadyplomowa.sportapp.entities.PersonEntity;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;


@And({
        @Spec(path = "firstName", params = "firstName", spec = Like.class),
        @Spec(path = "lastName", params = "lastName", spec = Like.class),
        @Spec(path = "birthdate", params = "birthdate", spec = Like.class)
})
public interface PersonSpecification extends Specification<PersonEntity> {
}
