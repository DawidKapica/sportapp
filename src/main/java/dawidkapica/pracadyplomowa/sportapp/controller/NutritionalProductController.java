package dawidkapica.pracadyplomowa.sportapp.controller;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.BaseCrudController;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.RestMappings;
import dawidkapica.pracadyplomowa.sportapp.dto.NutritionalProductDto;
import dawidkapica.pracadyplomowa.sportapp.service.NutritionalProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.NUTRITIONAL_PRODUCT)
public class NutritionalProductController extends BaseCrudController<NutritionalProductDto, Integer> {

    public NutritionalProductController(NutritionalProductService nutritionalProductService) {
        super(nutritionalProductService);
    }
}
