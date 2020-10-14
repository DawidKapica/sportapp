package dawidkapica.pracadyplomowa.sportapp.controller;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractCrudControllerWithSpecification;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.RestMappings;
import dawidkapica.pracadyplomowa.sportapp.dto.ConsumedFoodDto;
import dawidkapica.pracadyplomowa.sportapp.entities.ConsumedFoodEntity;
import dawidkapica.pracadyplomowa.sportapp.service.ConsumedFoodService;
import dawidkapica.pracadyplomowa.sportapp.specification.ConsumedFoodSpecification;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.CONSUMED_FOOD)
public class ConsumedFoodController extends AbstractCrudControllerWithSpecification<ConsumedFoodDto, Integer, ConsumedFoodEntity, ConsumedFoodSpecification> {

    public ConsumedFoodController(ConsumedFoodService consumedFoodService) {
        super(consumedFoodService);
    }
}
