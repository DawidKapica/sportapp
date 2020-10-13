package dawidkapica.pracadyplomowa.sportapp.dto.request;

import lombok.Data;

@Data
public class NutritionalProductListRequest {

    public Integer minCal;
    public Integer maxCal;
    public String search;
    public String name;
    public Integer calorificValue;
    public String nutritionalProductCategory;
}
