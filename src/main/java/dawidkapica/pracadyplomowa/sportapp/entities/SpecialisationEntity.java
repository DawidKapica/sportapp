package dawidkapica.pracadyplomowa.sportapp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Specialisation")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpecialisationEntity extends AbstractPersistable<Integer> {

    private String name;
}
