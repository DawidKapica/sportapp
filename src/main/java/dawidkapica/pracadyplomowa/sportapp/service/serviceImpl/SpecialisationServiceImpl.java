package dawidkapica.pracadyplomowa.sportapp.service.serviceImpl;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.BaseCrudService;
import dawidkapica.pracadyplomowa.sportapp.dto.SpecialisationDto;
import dawidkapica.pracadyplomowa.sportapp.entities.SpecialisationEntity;
import dawidkapica.pracadyplomowa.sportapp.mapper.SpecialisationMapper;
import dawidkapica.pracadyplomowa.sportapp.repositories.SpecialisationRepository;
import dawidkapica.pracadyplomowa.sportapp.service.SpecialisationService;
import org.springframework.stereotype.Service;

@Service
public class SpecialisationServiceImpl extends BaseCrudService<SpecialisationDto, SpecialisationEntity, Integer, SpecialisationRepository>
        implements SpecialisationService {

    public SpecialisationServiceImpl(SpecialisationRepository repository, SpecialisationMapper mapper) {
        super(repository, mapper);
    }
}
