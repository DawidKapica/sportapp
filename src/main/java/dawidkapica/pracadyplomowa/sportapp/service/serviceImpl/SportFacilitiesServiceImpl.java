package dawidkapica.pracadyplomowa.sportapp.service.serviceImpl;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractSpecificationCrudService;
import dawidkapica.pracadyplomowa.sportapp.dto.SportFacilitieDto;
import dawidkapica.pracadyplomowa.sportapp.entities.SportFacilitiesEntity;
import dawidkapica.pracadyplomowa.sportapp.mapper.SportFacilitiesMapper;
import dawidkapica.pracadyplomowa.sportapp.repositories.SportFacilitiesRepository;
import dawidkapica.pracadyplomowa.sportapp.service.SportFacilitiesService;
import org.springframework.stereotype.Service;

@Service
public class SportFacilitiesServiceImpl extends AbstractSpecificationCrudService<SportFacilitieDto, SportFacilitiesEntity, Integer, SportFacilitiesRepository>
        implements SportFacilitiesService {

    public SportFacilitiesServiceImpl(SportFacilitiesRepository repository, SportFacilitiesMapper mapper) {
        super(repository, mapper);
    }
}
