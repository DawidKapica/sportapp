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
@Table(name = "FaclitiesOpeningHours")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FacilitiesOpeningHoursEntity extends AbstractPersistable<Integer> {

    @ManyToOne
    @JoinColumn(name = "sports_facilities_id")
    private SportFacilitiesEntity sportFacilities;

    @ManyToOne
    @JoinColumn(name = "opening_hours_id")
    private OpeningHoursEntity openingHours;

}
