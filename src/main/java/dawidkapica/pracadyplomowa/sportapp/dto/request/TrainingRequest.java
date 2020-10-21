package dawidkapica.pracadyplomowa.sportapp.dto.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class TrainingRequest implements RequestInterface {

    private String name;
    private Integer userId;
    private Integer exerciseId;
    private LocalDate trainingDateMin = LocalDate.of(1970,1,1);
    private LocalDate trainingDateMax = LocalDate.now();


}
