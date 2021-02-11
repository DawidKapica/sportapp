package dawidkapica.pracadyplomowa.sportapp.dto.search;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import java.util.LinkedList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExpertSearchList {
    private List<@Valid SearchSpecialisation> searchSpecialisations = new LinkedList<>();

}
