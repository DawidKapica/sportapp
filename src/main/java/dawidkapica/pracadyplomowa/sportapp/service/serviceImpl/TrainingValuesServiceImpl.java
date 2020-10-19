package dawidkapica.pracadyplomowa.sportapp.service.serviceImpl;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractSpecificationCrudService;
import dawidkapica.pracadyplomowa.sportapp.dto.TrainingValuesDto;
import dawidkapica.pracadyplomowa.sportapp.entities.TrainingValuesEntity;
import dawidkapica.pracadyplomowa.sportapp.mapper.TrainingValuesMapper;
import dawidkapica.pracadyplomowa.sportapp.repositories.TrainingValuesRepository;
import dawidkapica.pracadyplomowa.sportapp.service.TrainingValuesService;
import org.springframework.stereotype.Service;

@Service
public class TrainingValuesServiceImpl extends AbstractSpecificationCrudService<TrainingValuesDto, TrainingValuesEntity, Integer, TrainingValuesRepository>
        implements TrainingValuesService {

    public TrainingValuesServiceImpl(TrainingValuesRepository repository, TrainingValuesMapper mapper) {
        super(repository, mapper);
    }
    
}
