package dawidkapica.pracadyplomowa.sportapp.controller;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractCrudControllerWithSpecification;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.RestMappings;
import dawidkapica.pracadyplomowa.sportapp.dto.ExpertDto;
import dawidkapica.pracadyplomowa.sportapp.entities.ExpertEntity;
import dawidkapica.pracadyplomowa.sportapp.service.ExpertService;
import dawidkapica.pracadyplomowa.sportapp.specification.ExpertSpecification;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.EXPERT)
public class ExpertController extends AbstractCrudControllerWithSpecification<ExpertDto, Integer, ExpertEntity, ExpertSpecification> {

    public ExpertController(ExpertService expertService) {
        super(expertService);
    }
}
