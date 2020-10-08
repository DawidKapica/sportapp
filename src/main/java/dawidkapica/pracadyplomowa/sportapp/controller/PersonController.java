package dawidkapica.pracadyplomowa.sportapp.controller;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.BaseCrudController;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.RestMappings;
import dawidkapica.pracadyplomowa.sportapp.dto.PersonDto;
import dawidkapica.pracadyplomowa.sportapp.service.PersonService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.PERSON)
public class PersonController extends BaseCrudController<PersonDto, Integer> {

    public PersonController(PersonService personService) {
        super(personService);
    }
}
