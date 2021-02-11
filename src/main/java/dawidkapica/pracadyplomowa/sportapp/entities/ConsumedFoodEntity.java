package dawidkapica.pracadyplomowa.sportapp.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

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

    @Column(name = "date")
    private LocalDate consumedFoodDate;

    @Column(name = "time")
    private LocalTime consumedFoodTime;

}
