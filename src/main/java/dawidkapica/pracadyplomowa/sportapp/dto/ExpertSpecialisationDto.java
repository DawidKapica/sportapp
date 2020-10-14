package dawidkapica.pracadyplomowa.sportapp.dto;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractGeneratedIdDto;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.PersistableDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExpertSpecialisationDto extends AbstractGeneratedIdDto<Integer> implements PersistableDto<Integer> {

    private Integer experienceYear;

    @NotNull
    private Integer expertId;

    @NotNull
    private Integer specialisationId;
}
