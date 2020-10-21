package dawidkapica.pracadyplomowa.sportapp.controller;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractCrudControllerCustomSpecification;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.RestMappings;
import dawidkapica.pracadyplomowa.sportapp.dto.ExerciseDto;
import dawidkapica.pracadyplomowa.sportapp.dto.request.ExerciseRequest;
import dawidkapica.pracadyplomowa.sportapp.entities.ExerciseEntity;
import dawidkapica.pracadyplomowa.sportapp.entities.ExerciseEntity_;
import dawidkapica.pracadyplomowa.sportapp.service.ExerciseService;
import dawidkapica.pracadyplomowa.sportapp.specification.ExerciseSpecificationCustom;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.EXERCISE)
public class ExerciseController extends AbstractCrudControllerCustomSpecification<ExerciseDto, Integer, ExerciseEntity, ExerciseRequest> {

    private ExerciseService exerciseService;
    private ExerciseSpecificationCustom exerciseSpec;

    public ExerciseController(ExerciseService exerciseService) {
        super(exerciseService);
        this.exerciseService = exerciseService;
    }

    @Override
    @GetMapping(RestMappings.SEARCH)
    public Page<ExerciseDto> getAllWithGivenParametersAlt (@ModelAttribute ExerciseRequest request, Pageable pageable) {
        Specification specification = Specification.where(null);

        specification = specification.and(exerciseSpec.minVal(request.getCaloriesBurnedMin(), ExerciseEntity_.CALORIES_BURNED_IN_MINUTE));
        specification = specification.and(exerciseSpec.maxVal(request.getCaloriesBurnedMax(), ExerciseEntity_.CALORIES_BURNED_IN_MINUTE));

        if (request.getName() != null) {
            specification = specification.and(exerciseSpec.stringEqual(request.getName(), ExerciseEntity_.NAME));
        }
        if (request.getExerciseCategory() != null) {
            specification = specification.and(exerciseSpec.stringEqual(request.getExerciseCategory(), ExerciseEntity_.EXERCISE_CATEGORY));
        }
        if (request.getExerciseDescription() != null) {
            specification = specification.and(exerciseSpec.stringContain(request.getExerciseDescription(), ExerciseEntity_.EXERCISE_DESCRIPTION));

        }
        return exerciseService.findAll(specification, pageable);



    }
}
