package dawidkapica.pracadyplomowa.sportapp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;

@Entity
@Table(name = "User")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity extends PersonEntity {

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "login_id")
    private LoginEntity login;

    @OneToMany
    private Collection<ConsumedFoodEntity> consumedFoods;

    @OneToMany
    private Collection<UserPlanEntity> userPlans;

    @OneToMany
    private Collection<TrainingEntity> trainings;

    @OneToMany Collection<OpinionEntity> opinions;
}
