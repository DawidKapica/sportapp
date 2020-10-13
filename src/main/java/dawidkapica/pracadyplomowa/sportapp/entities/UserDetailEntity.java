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

}
