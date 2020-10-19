package dawidkapica.pracadyplomowa.sportapp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PossibleExerciseFacilities")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PossibleExerciseFacilitiesEntity extends AbstractPersistable<Integer> {

    @ManyToOne
    @JoinColumn(name = "sports_facilities_id")
    private SportFacilitiesEntity sportFacilities;

    @ManyToOne
    @JoinColumn(name = "exercise_id")
    private ExerciseEntity exercise;

}
