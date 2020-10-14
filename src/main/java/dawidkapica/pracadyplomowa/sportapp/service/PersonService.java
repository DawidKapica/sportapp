package dawidkapica.pracadyplomowa.sportapp.service;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.SpecificationCrudServiceInterface;
import dawidkapica.pracadyplomowa.sportapp.dto.PersonDto;
import dawidkapica.pracadyplomowa.sportapp.entities.PersonEntity;

public interface PersonService extends SpecificationCrudServiceInterface<PersonDto, PersonEntity, Integer> {
}
