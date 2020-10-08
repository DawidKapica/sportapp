package dawidkapica.pracadyplomowa.sportapp.service.serviceImpl;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.BaseCrudService;
import dawidkapica.pracadyplomowa.sportapp.dto.ExerciseCategoryDto;
import dawidkapica.pracadyplomowa.sportapp.entities.ExerciseCategoryEntity;
import dawidkapica.pracadyplomowa.sportapp.mapper.ExerciseCategoryMapper;
import dawidkapica.pracadyplomowa.sportapp.repositories.ExerciseCategoryRepository;
import dawidkapica.pracadyplomowa.sportapp.service.ExerciseCategoryService;
import org.springframework.stereotype.Service;

@Service
public class ExerciseCategoryServiceImpl extends BaseCrudService<ExerciseCategoryDto, ExerciseCategoryEntity, Integer, ExerciseCategoryRepository>
        implements ExerciseCategoryService {

    public ExerciseCategoryServiceImpl(ExerciseCategoryRepository repository, ExerciseCategoryMapper mapper) {
        super(repository, mapper);
    }
}
