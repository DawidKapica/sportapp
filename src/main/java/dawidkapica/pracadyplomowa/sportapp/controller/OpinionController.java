package dawidkapica.pracadyplomowa.sportapp.controller;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractCrudControllerWithSpecification;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.RestMappings;
import dawidkapica.pracadyplomowa.sportapp.dto.OpinionDto;
import dawidkapica.pracadyplomowa.sportapp.entities.OpinionEntity;
import dawidkapica.pracadyplomowa.sportapp.service.OpinionService;
import dawidkapica.pracadyplomowa.sportapp.specification.OpinionSpecification;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.OPINION)
public class OpinionController extends AbstractCrudControllerWithSpecification<OpinionDto, Integer, OpinionEntity, OpinionSpecification> {

    public OpinionController(OpinionService opinionService) {
        super(opinionService);
    }
}
