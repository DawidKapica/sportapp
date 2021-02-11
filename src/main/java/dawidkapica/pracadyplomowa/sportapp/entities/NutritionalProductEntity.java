package dawidkapica.pracadyplomowa.sportapp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;

@Entity
@Table(name = "NutritionalProduct")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NutritionalProductEntity extends AbstractPersistable<Integer> {

    private String name;

    @Column(name = "calorific_value")
    private Integer calorificValue;

    @Column(name = "carbohydrates_value")
    private Integer carbohydratesValue;

    @Column(name = "protein_value")
    private Integer proteinValue;

    @Column(name = "fat_value")
    private Integer fatValue;

    @ManyToOne
    @JoinColumn(name = "nutritional_category")
    private  NutritionalProductCategoryEntity nutritionalProductCategory;

}
