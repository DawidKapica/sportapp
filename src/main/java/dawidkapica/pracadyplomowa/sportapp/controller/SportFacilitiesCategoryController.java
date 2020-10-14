package dawidkapica.pracadyplomowa.sportapp.controller;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractCrudController;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.RestMappings;
import dawidkapica.pracadyplomowa.sportapp.dto.SportFacilitiesCategoryDto;
import dawidkapica.pracadyplomowa.sportapp.service.SportFacilitiesCategoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.SPORT_FACILITY_CATEGORY)
public class SportFacilitiesCategoryController extends AbstractCrudController<SportFacilitiesCategoryDto, Integer> {

    public SportFacilitiesCategoryController(SportFacilitiesCategoryService sportFacilitiesCategoryService) {
        super(sportFacilitiesCategoryService);
    }
}
