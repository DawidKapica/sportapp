package dawidkapica.pracadyplomowa.sportapp.dto;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractGeneratedIdDto;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.PersistableDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsumedFoodDto extends AbstractGeneratedIdDto<Integer> implements PersistableDto<Integer> {

    @NotNull
    private Integer quantity;

    @NotNull
    private Integer userId;

    @NotNull Integer nutritionalProductId;

    private LocalDate consumedFoodDate;

    private LocalTime consumeFoodTime;

}
