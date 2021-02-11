package dawidkapica.pracadyplomowa.sportapp.specification;

import dawidkapica.pracadyplomowa.sportapp.entities.ConsumedFoodEntity;
import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

//@Join(path = "user", alias = "user")
@And({
        @Spec(path = "quantity", params = "quantity", spec = Equal.class),
//        @Spec(path = "id", params = "userId", spec = Equal.class),
        @Spec(path = "nutritionalProductId", params = "nutritionalProductId", spec = Like.class),
        @Spec(path = "consumedFoodDate", params = "consumedFoodDate", spec = Equal.class),
//        @Spec(
//                path = "consumedFoodDate",
//                params = {"consumedFoodDateMin", "consumedFoodDateMax"},
//                spec = Between.class),
        @Spec(path = "consumeFoodTime", params = "consumeFoodTime", spec = Like.class),


})
public interface ConsumedFoodSpecification extends Specification<ConsumedFoodEntity> {
}
