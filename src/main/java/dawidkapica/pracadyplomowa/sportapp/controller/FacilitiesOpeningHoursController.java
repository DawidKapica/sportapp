package dawidkapica.pracadyplomowa.sportapp.controller;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractCrudController;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.RestMappings;
import dawidkapica.pracadyplomowa.sportapp.dto.FacilitiesOpeningHoursDto;
import dawidkapica.pracadyplomowa.sportapp.service.FacilitiesOpeningHoursService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.FACILITIES_OPENING_HOURS)
public class FacilitiesOpeningHoursController extends AbstractCrudController<FacilitiesOpeningHoursDto, Integer> {

    public FacilitiesOpeningHoursController(FacilitiesOpeningHoursService facilitiesOpeningHoursService) {
        super(facilitiesOpeningHoursService);
    }
}
