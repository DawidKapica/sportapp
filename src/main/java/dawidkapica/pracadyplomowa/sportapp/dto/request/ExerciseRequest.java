package dawidkapica.pracadyplomowa.sportapp.dto.request;

import lombok.Data;

@Data
public class ExerciseRequest implements RequestInterface {

    private String name;
    private Integer caloriesBurnedMin = Integer.MIN_VALUE;
    private Integer caloriesBurnedMax = Integer.MAX_VALUE;
    private String exerciseDescription;
    private String exerciseCategory;

}
