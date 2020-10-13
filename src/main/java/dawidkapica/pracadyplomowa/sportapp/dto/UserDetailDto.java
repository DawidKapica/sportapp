package dawidkapica.pracadyplomowa.sportapp.dto;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.BaseGeneratedIdDto;
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
public class UserDetailDto extends BaseGeneratedIdDto<Integer> implements PersistableDto<Integer> {

    @Size(max = 255)
    private Integer circumferenceAbdomen;

    @NotNull
    private Integer userId;

    private LocalDate valueDate;

}
