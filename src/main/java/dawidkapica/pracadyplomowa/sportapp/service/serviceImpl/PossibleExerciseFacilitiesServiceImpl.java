package dawidkapica.pracadyplomowa.sportapp.service.serviceImpl;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractCrudService;
import dawidkapica.pracadyplomowa.sportapp.dto.PossibleExerciseFacilitiesDto;
import dawidkapica.pracadyplomowa.sportapp.entities.PossibleExerciseFacilitiesEntity;
import dawidkapica.pracadyplomowa.sportapp.mapper.PossibleExerciseFacilitiesMapper;
import dawidkapica.pracadyplomowa.sportapp.repositories.PossibleExerciseFacilitiesRepository;
import dawidkapica.pracadyplomowa.sportapp.service.PossibleExerciseFacilitiesService;
import org.springframework.stereotype.Service;

@Service
public class PossibleExerciseFacilitiesServiceImpl extends AbstractCrudService<PossibleExerciseFacilitiesDto, PossibleExerciseFacilitiesEntity, Integer, PossibleExerciseFacilitiesRepository>
        implements PossibleExerciseFacilitiesService {

    public PossibleExerciseFacilitiesServiceImpl(PossibleExerciseFacilitiesRepository repository, PossibleExerciseFacilitiesMapper mapper) {
        super(repository, mapper);
    }
    
}
