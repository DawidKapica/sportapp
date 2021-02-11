package dawidkapica.pracadyplomowa.sportapp.controller;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractCrudControllerWithSpecification;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.RestMappings;
import dawidkapica.pracadyplomowa.sportapp.dto.ExpertSpecialisationDto;
import dawidkapica.pracadyplomowa.sportapp.entities.ExpertSpecialisationEntity;
import dawidkapica.pracadyplomowa.sportapp.service.ExpertSpecialisationService;
import dawidkapica.pracadyplomowa.sportapp.specification.ExpertSpecialisationSpecification;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.EXPERT_SPECIALISATION)
public class ExpertSpecialisationController extends AbstractCrudControllerWithSpecification<ExpertSpecialisationDto, Integer, ExpertSpecialisationEntity, ExpertSpecialisationSpecification> {

    public ExpertSpecialisationController(ExpertSpecialisationService expertSpecialisationService) {
        super(expertSpecialisationService);
    }
}
