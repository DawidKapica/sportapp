package dawidkapica.pracadyplomowa.sportapp.controller;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.BaseCrudController;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.RestMappings;
import dawidkapica.pracadyplomowa.sportapp.dto.NutritionalProductCategoryDto;
import dawidkapica.pracadyplomowa.sportapp.service.NutritionalProductCategoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.NUTRITIONAL_PRODUCT_CATEGORY)
public class NutritionalProductCategoryController extends BaseCrudController<NutritionalProductCategoryDto, Integer> {

    public NutritionalProductCategoryController(NutritionalProductCategoryService nutritionalProductCategoryService) {
        super(nutritionalProductCategoryService);
    }
}
