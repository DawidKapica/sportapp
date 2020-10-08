package dawidkapica.pracadyplomowa.sportapp.service.serviceImpl;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.BaseCrudService;
import dawidkapica.pracadyplomowa.sportapp.dto.PersonDto;
import dawidkapica.pracadyplomowa.sportapp.entities.PersonEntity;
import dawidkapica.pracadyplomowa.sportapp.mapper.PersonMapper;
import dawidkapica.pracadyplomowa.sportapp.repositories.PersonRepository;
import dawidkapica.pracadyplomowa.sportapp.service.PersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl extends BaseCrudService<PersonDto, PersonEntity, Integer, PersonRepository>
        implements PersonService {

    public PersonServiceImpl(PersonRepository repository, PersonMapper mapper) {
        super(repository, mapper);
    }
}
