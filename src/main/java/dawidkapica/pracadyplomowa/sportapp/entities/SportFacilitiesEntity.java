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
@Table(name = "SportFacilities")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SportFacilitiesEntity extends AbstractPersistable<Integer> {

    private String name;
    private boolean isPaid;
    private Double parallel;
    private Double equator;

    @ManyToOne
    @JoinColumn(name = "sport_facilities_category_id")
    private SportFacilitiesCategoryEntity sportFacilitiesCategory;

}
