package dawidkapica.pracadyplomowa.sportapp.dto.request;

import lombok.Data;

@Data
public class NutritionalProductRequest implements RequestInterface {

    private Integer minCal = Integer.MIN_VALUE;
    private Integer maxCal = Integer.MAX_VALUE;
    private String search;
    private String name;
    private Integer calorificValue;
    private String category;
}
