package dawidkapica.pracadyplomowa.sportapp.service.serviceImpl;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractCrudService;
import dawidkapica.pracadyplomowa.sportapp.dto.ExpertSpecialisationDto;
import dawidkapica.pracadyplomowa.sportapp.entities.ExpertSpecialisationEntity;
import dawidkapica.pracadyplomowa.sportapp.mapper.ExpertSpecialisationMapper;
import dawidkapica.pracadyplomowa.sportapp.repositories.ExpertSpecialisationRepository;
import dawidkapica.pracadyplomowa.sportapp.service.ExpertSpecialisationService;
import org.springframework.stereotype.Service;

@Service
public class ExpertSpecialisationServiceImpl extends AbstractCrudService<ExpertSpecialisationDto, ExpertSpecialisationEntity, Integer, ExpertSpecialisationRepository>
        implements ExpertSpecialisationService {

    public ExpertSpecialisationServiceImpl(ExpertSpecialisationRepository repository, ExpertSpecialisationMapper mapper) {
        super(repository, mapper);
    }
}
