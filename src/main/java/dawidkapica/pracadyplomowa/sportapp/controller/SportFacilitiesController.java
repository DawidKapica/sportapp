package dawidkapica.pracadyplomowa.sportapp.controller;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractCrudControllerWithSpecification;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.RestMappings;
import dawidkapica.pracadyplomowa.sportapp.dto.SportFacilitieDto;
import dawidkapica.pracadyplomowa.sportapp.entities.SportFacilitiesEntity;
import dawidkapica.pracadyplomowa.sportapp.service.SportFacilitiesService;
import dawidkapica.pracadyplomowa.sportapp.specification.SportFacilitiesSpecification;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.SPORT_FACILITY)
public class SportFacilitiesController extends AbstractCrudControllerWithSpecification<SportFacilitieDto, Integer, SportFacilitiesEntity, SportFacilitiesSpecification> {

    public SportFacilitiesController(SportFacilitiesService sportFacilitiesService) {
        super(sportFacilitiesService);
    }
}
