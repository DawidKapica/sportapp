package dawidkapica.pracadyplomowa.sportapp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "UserDetail")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDetailEntity extends AbstractPersistable<Integer> {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private  UserEntity user;

    @Column(name = "circumference_abdomen")
    private Integer circumferenceAbdomen;

    @Column(name = "value_date")
    private LocalDate valueDate;

    //nowe
    private Double weight;

    @Column(name = "biceps_circumference")
    private Double bicepsCircumference;

    @Column(name = "forearm_circumference")
    private Double forearmCircumference;

    @Column(name = "chest_circumference")
    private Double chestCircumference;

    @Column(name = "hip_circumference")
    private Double hipCircumference;

    @Column(name = "thigh_circumference")
    private Double thighCircumference;

    @Column(name = "calf_circumference")
    private Double calfCircumference;

    @Column(name = "neck_circumference")
    private Double neckCircumference;

}
