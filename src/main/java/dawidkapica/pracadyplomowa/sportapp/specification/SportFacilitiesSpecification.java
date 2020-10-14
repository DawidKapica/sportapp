package dawidkapica.pracadyplomowa.sportapp.specification;

import dawidkapica.pracadyplomowa.sportapp.entities.SportFacilitiesEntity;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

@And({
        @Spec(path = "isPaid", params = "isPaid", spec = Like.class),
        @Spec(path = "parallel", params = "parallel", spec = Like.class),
        @Spec(path = "equator", params = "equator", spec = Like.class),
        @Spec(path = "name", params = "name", spec = Like.class),
        @Spec(path = "sportFacilitiesCategory.name", params = "sportFacilitiesCategory", spec = Like.class),

})
public interface SportFacilitiesSpecification extends Specification<SportFacilitiesEntity> {
}
