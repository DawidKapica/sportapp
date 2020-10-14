package dawidkapica.pracadyplomowa.sportapp.service.serviceImpl;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractSpecificationCrudService;
import dawidkapica.pracadyplomowa.sportapp.dto.TrainingDto;
import dawidkapica.pracadyplomowa.sportapp.entities.TrainingEntity;
import dawidkapica.pracadyplomowa.sportapp.mapper.TrainingMapper;
import dawidkapica.pracadyplomowa.sportapp.repositories.TrainingRepository;
import dawidkapica.pracadyplomowa.sportapp.service.TrainingService;
import org.springframework.stereotype.Service;

@Service
public class TrainingServiceImpl extends AbstractSpecificationCrudService<TrainingDto, TrainingEntity, Integer, TrainingRepository>
        implements TrainingService {

    public TrainingServiceImpl(TrainingRepository repository, TrainingMapper mapper) {
        super(repository, mapper);
    }
}
