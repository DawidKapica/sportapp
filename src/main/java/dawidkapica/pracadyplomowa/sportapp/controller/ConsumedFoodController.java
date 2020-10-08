package dawidkapica.pracadyplomowa.sportapp.controller;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.BaseCrudController;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.RestMappings;
import dawidkapica.pracadyplomowa.sportapp.dto.ConsumedFoodDto;
import dawidkapica.pracadyplomowa.sportapp.service.ConsumedFoodService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.CONSUMED_FOOD)
public class ConsumedFoodController extends BaseCrudController<ConsumedFoodDto, Integer> {

    public ConsumedFoodController(ConsumedFoodService consumedFoodService) {
        super(consumedFoodService);
    }
}
