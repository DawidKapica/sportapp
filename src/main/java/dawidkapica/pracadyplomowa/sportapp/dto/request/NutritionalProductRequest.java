package dawidkapica.pracadyplomowa.sportapp.dto.request;

import lombok.Data;

@Data
public class NutritionalProductRequest {

    public Integer minCal = Integer.MIN_VALUE;
    public Integer maxCal = Integer.MAX_VALUE;
    public String search;
    public String name;
    public Integer calorificValue;
    public String nutritionalProductCategory;
}
