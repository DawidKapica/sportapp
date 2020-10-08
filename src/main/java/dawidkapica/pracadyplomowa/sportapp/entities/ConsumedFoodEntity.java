package dawidkapica.pracadyplomowa.sportapp.entities;


import dawidkapica.pracadyplomowa.sportapp.coreLibrary.BaseGeneratedIdEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ConsumedFood")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsumedFoodEntity extends AbstractPersistable<Integer> {

    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "nutritional_product_id")
    private NutritionalProductEntity nutritionalProduct;
}
