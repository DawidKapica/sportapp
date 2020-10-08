package dawidkapica.pracadyplomowa.sportapp.controller;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.BaseCrudController;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.RestMappings;
import dawidkapica.pracadyplomowa.sportapp.dto.ExpertSpecialisationDto;
import dawidkapica.pracadyplomowa.sportapp.service.ExpertSpecialisationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.EXPERT_SPECIALISATION)
public class ExpertSpecialisationController extends BaseCrudController<ExpertSpecialisationDto, Integer> {

    public ExpertSpecialisationController(ExpertSpecialisationService expertSpecialisationService) {
        super(expertSpecialisationService);
    }
}
