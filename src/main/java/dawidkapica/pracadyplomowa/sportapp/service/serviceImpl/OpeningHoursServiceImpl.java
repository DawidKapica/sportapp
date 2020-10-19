package dawidkapica.pracadyplomowa.sportapp.service.serviceImpl;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractCrudService;
import dawidkapica.pracadyplomowa.sportapp.dto.OpeningHoursDto;
import dawidkapica.pracadyplomowa.sportapp.entities.OpeningHoursEntity;
import dawidkapica.pracadyplomowa.sportapp.mapper.OpeningHoursMapper;
import dawidkapica.pracadyplomowa.sportapp.repositories.OpeningHoursRepository;
import dawidkapica.pracadyplomowa.sportapp.service.OpeningHoursService;
import org.springframework.stereotype.Service;

@Service
public class OpeningHoursServiceImpl extends AbstractCrudService<OpeningHoursDto, OpeningHoursEntity, Integer, OpeningHoursRepository>
        implements OpeningHoursService {

    public OpeningHoursServiceImpl(OpeningHoursRepository repository, OpeningHoursMapper mapper) {
        super(repository, mapper);
    }
    
}
