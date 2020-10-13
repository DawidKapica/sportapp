package dawidkapica.pracadyplomowa.sportapp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Training")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrainingEntity extends AbstractPersistable<Integer> {

    private String name;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "exercise_id")
    private ExerciseEntity exercise;

    @Column(name = "date")
    private LocalDate trainingDate;

}
