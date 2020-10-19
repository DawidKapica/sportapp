package dawidkapica.pracadyplomowa.sportapp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.Duration;

@Entity
@Table(name = "TrainingValues")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrainingValuesEntity extends AbstractPersistable<Integer> {

    @ManyToOne
    @JoinColumn(name = "parameter_id")
    private ParameterEntity parameter;

    private Integer value;

    private Duration duration;
}
