package dawidkapica.pracadyplomowa.sportapp.specification;

import dawidkapica.pracadyplomowa.sportapp.entities.UserDetailEntity;
import net.kaczmarzyk.spring.data.jpa.domain.Between;
import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

@And({
        @Spec(path = "circumferenceAbdomen", params = "circumferenceAbdomen", spec = Like.class),
        @Spec(path = "weight", params = "weight", spec = Like.class),
        @Spec(path = "biceps_circumference", params = "biceps_circumference", spec = Like.class),
        @Spec(path = "forearm_circumference", params = "forearm_circumference", spec = Like.class),
        @Spec(path = "chest_circumference", params = "chest_circumference", spec = Like.class),
        @Spec(path = "hip_circumference", params = "hip_circumference", spec = Like.class),
        @Spec(path = "thigh_circumference", params = "thigh_circumference", spec = Like.class),
        @Spec(path = "calf_circumference", params = "calf_circumference", spec = Like.class),
        @Spec(path = "neck_circumference", params = "neck_circumference", spec = Like.class),
        @Spec(path = "userId", params = "user_id", spec = Equal.class),
        @Spec(
                path = "valueDate",
                params = {"valueDateMin", "valueDateMax"},
                spec = Between.class)


})
public interface UserDetailSpecification extends Specification<UserDetailEntity> {
}
