package dawidkapica.pracadyplomowa.sportapp.controller;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.BaseCrudController;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.RestMappings;
import dawidkapica.pracadyplomowa.sportapp.dto.SportFacilitieDto;
import dawidkapica.pracadyplomowa.sportapp.service.SportFacilitiesService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.SPORT_FACILITY)
public class SportFacilitiesController extends BaseCrudController<SportFacilitieDto, Integer> {

    public SportFacilitiesController(SportFacilitiesService sportFacilitiesService) {
        super(sportFacilitiesService);
    }
}
