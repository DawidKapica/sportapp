package dawidkapica.pracadyplomowa.sportapp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;

@Entity
@Table(name = "Expert")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExpertSpecialisationEntity  extends AbstractPersistable<Integer> {

    @Column(name = "experience_year")
    private Integer experienceYear;

    @ManyToOne
    @JoinColumn(name = "expert_id")
    private ExpertEntity expert;

    @ManyToOne
    @JoinColumn(name = "specialisation_id")
    private SpecialisationEntity specialisation;
}
