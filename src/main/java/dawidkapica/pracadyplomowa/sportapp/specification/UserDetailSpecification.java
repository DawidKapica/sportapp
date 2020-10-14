package dawidkapica.pracadyplomowa.sportapp.specification;

import dawidkapica.pracadyplomowa.sportapp.entities.UserDetailEntity;
import net.kaczmarzyk.spring.data.jpa.domain.Between;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

@And({
        @Spec(path = "circumferenceAbdomen", params = "circumferenceAbdomen", spec = Like.class),
        @Spec(path = "userId", params = "userId", spec = Like.class),
        @Spec(
                path = "valueDate",
                params = {"valueDateMin", "valueDateMax"},
                spec = Between.class)


})
public interface UserDetailSpecification extends Specification<UserDetailEntity> {
}
