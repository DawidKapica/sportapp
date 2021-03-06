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
public class UserDetailDto extends AbstractGeneratedIdDto<Integer> implements PersistableDto<Integer> {

    @Size(max = 255)
    private Integer circumferenceAbdomen;

    //nowe
    private Double weight;
    private Double bicepsCircumference;
    private Double forearmCircumference;
    private Double chestCircumference;
    private Double hipCircumference;
    private Double thighCircumference;
    private Double calfCircumference;
    private Double neckCircumference;


    @NotNull
    private Integer userId;

    private LocalDate valueDate;



}
