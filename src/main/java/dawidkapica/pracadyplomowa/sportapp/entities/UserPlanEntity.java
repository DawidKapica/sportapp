package dawidkapica.pracadyplomowa.sportapp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "UserPlan")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserPlanEntity extends AbstractPersistable<Integer> {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    private String description;
    private Integer goal;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;
}
