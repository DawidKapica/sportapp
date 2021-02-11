package dawidkapica.pracadyplomowa.sportapp.dto.search;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchSpecialisation implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull
    private Integer specialisationId;

    @NotNull
    private Integer experienceYear;

}
