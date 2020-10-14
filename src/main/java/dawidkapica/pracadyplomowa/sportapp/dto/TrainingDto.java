package dawidkapica.pracadyplomowa.sportapp.dto;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractGeneratedIdDto;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.PersistableDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrainingDto extends AbstractGeneratedIdDto<Integer> implements PersistableDto<Integer> {

    @NotNull
    @Size(max = 255)
    private String name;

    @NotNull
    private Integer userId;

    @NotNull
    private Integer exerciseId;

    private LocalDate trainingDate;

}
