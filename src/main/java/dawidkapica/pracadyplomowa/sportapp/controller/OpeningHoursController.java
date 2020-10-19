package dawidkapica.pracadyplomowa.sportapp.controller;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractCrudController;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.RestMappings;
import dawidkapica.pracadyplomowa.sportapp.dto.OpeningHoursDto;
import dawidkapica.pracadyplomowa.sportapp.service.OpeningHoursService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.OPENING_HOURS)
public class OpeningHoursController extends AbstractCrudController<OpeningHoursDto, Integer> {

    public OpeningHoursController(OpeningHoursService openingHoursService) {
        super(openingHoursService);
    }
    
}
