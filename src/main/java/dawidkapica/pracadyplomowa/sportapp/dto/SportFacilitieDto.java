package dawidkapica.pracadyplomowa.sportapp.dto;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractGeneratedIdDto;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.PersistableDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SportFacilitieDto extends AbstractGeneratedIdDto<Integer> implements PersistableDto<Integer> {


    private boolean isPaid;

    private Double parallel;

    private Double equator;

    //godziny otwarcia

    @NotNull
    @Size(max = 255)
    private String name;

    @NotNull
    private SportFacilitiesCategoryDto sportFacilitiesCategory;


}
