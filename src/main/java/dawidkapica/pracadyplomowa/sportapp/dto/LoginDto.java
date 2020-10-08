package dawidkapica.pracadyplomowa.sportapp.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.BaseGeneratedIdDto;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.PersistableDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginDto extends BaseGeneratedIdDto<Integer> implements PersistableDto<Integer> {

    @NotNull
    @Size(max = 255)
    private String email;

    @NotNull
    @Size(max = 30)
    private String password;
}
