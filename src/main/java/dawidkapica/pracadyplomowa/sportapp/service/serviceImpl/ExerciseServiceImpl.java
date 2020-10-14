package dawidkapica.pracadyplomowa.sportapp.service.serviceImpl;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractSpecificationCrudService;
import dawidkapica.pracadyplomowa.sportapp.dto.ExerciseDto;
import dawidkapica.pracadyplomowa.sportapp.entities.ExerciseEntity;
import dawidkapica.pracadyplomowa.sportapp.mapper.ExerciseMapper;
import dawidkapica.pracadyplomowa.sportapp.repositories.ExerciseRepository;
import dawidkapica.pracadyplomowa.sportapp.service.ExerciseService;
import org.springframework.stereotype.Service;

@Service
public class ExerciseServiceImpl extends AbstractSpecificationCrudService<ExerciseDto, ExerciseEntity, Integer, ExerciseRepository>
        implements ExerciseService {

    public ExerciseServiceImpl(ExerciseRepository repository, ExerciseMapper mapper) {
        super(repository, mapper);
    }
}
