package dawidkapica.pracadyplomowa.sportapp.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;

@Entity
@Table(name = "Exercise")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExerciseEntity extends AbstractPersistable<Integer> {

    private String name;

    @Column(name = "calories_burned_in_minute")
    private Integer caloriesBurnedInMinute;

    @ManyToOne
    @JoinColumn(name = "exercise_category")
    private ExerciseCategoryEntity exerciseCategory;

    private String exerciseDescription;


}
