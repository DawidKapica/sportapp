package dawidkapica.pracadyplomowa.sportapp.controller;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractCrudControllerWithSpecification;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.RestMappings;
import dawidkapica.pracadyplomowa.sportapp.dto.PersonDto;
import dawidkapica.pracadyplomowa.sportapp.entities.PersonEntity;
import dawidkapica.pracadyplomowa.sportapp.service.PersonService;
import dawidkapica.pracadyplomowa.sportapp.specification.PersonSpecification;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.PERSON)
public class PersonController extends AbstractCrudControllerWithSpecification<PersonDto, Integer, PersonEntity, PersonSpecification> {

    public PersonController(PersonService personService) {
        super(personService);
    }
}
