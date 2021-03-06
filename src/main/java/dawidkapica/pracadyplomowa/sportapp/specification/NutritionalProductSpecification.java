package dawidkapica.pracadyplomowa.sportapp.specification;
//


import dawidkapica.pracadyplomowa.sportapp.entities.NutritionalProductEntity;
import net.kaczmarzyk.spring.data.jpa.domain.Between;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

@And({
        @Spec(path = "name", params = "name", spec = Like.class),
        @Spec(
                path = "calorificValue",
                params = {"calorificValueMin", "calorificValueMax"},
                spec = Between.class)
})
public interface NutritionalProductSpecification extends Specification<NutritionalProductEntity> {

}
