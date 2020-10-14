package dawidkapica.pracadyplomowa.sportapp.controller;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractCrudController;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.RestMappings;
import dawidkapica.pracadyplomowa.sportapp.dto.SpecialisationDto;
import dawidkapica.pracadyplomowa.sportapp.service.SpecialisationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.SPECIALISATION)
public class SpecialisationController extends AbstractCrudController<SpecialisationDto, Integer> {

    public SpecialisationController(SpecialisationService specialisationService) {
        super(specialisationService);
    }
}
