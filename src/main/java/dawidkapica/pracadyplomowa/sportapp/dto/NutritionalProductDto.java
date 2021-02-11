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
public class NutritionalProductDto extends AbstractGeneratedIdDto<Integer> implements PersistableDto<Integer> {

    @NotNull
    @Size(max = 255)
    private String name;

    @NotNull
    private Integer calorificValue;

    @NotNull
    private Integer carbohydratesValue;

    @NotNull
    private Integer proteinValue;

    @NotNull
    private Integer fatValue;

    @NotNull
    private NutritionalProductCategoryDto nutritionalProductCategory;
}
