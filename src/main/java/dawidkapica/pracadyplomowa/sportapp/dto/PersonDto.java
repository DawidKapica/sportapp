package dawidkapica.pracadyplomowa.sportapp.dto;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractGeneratedIdDto;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.PersistableDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonDto extends AbstractGeneratedIdDto<Integer> implements PersistableDto<Integer> {

    @NotNull
    @Size(max = 255)
    private String firstName;

    @NotNull
    @Size(max = 255)
    private String lastName;

    @Past
    private LocalDate birthdate;

}
