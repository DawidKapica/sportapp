package dawidkapica.pracadyplomowa.sportapp.controller;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.BaseCrudController;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.RestMappings;
import dawidkapica.pracadyplomowa.sportapp.dto.OpinionDto;
import dawidkapica.pracadyplomowa.sportapp.service.OpinionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.OPINION)
public class OpinionController extends BaseCrudController<OpinionDto, Integer> {

    public OpinionController(OpinionService opinionService) {
        super(opinionService);
    }
}
