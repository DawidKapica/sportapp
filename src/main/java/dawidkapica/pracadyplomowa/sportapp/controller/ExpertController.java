package dawidkapica.pracadyplomowa.sportapp.controller;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.BaseCrudController;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.RestMappings;
import dawidkapica.pracadyplomowa.sportapp.dto.ExpertDto;
import dawidkapica.pracadyplomowa.sportapp.service.ExpertService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.EXPERT)
public class ExpertController extends BaseCrudController<ExpertDto, Integer> {

    public ExpertController(ExpertService expertService) {
        super(expertService);
    }
}
