package dawidkapica.pracadyplomowa.sportapp.controller;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractCrudControllerWithSpecification;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.RestMappings;
import dawidkapica.pracadyplomowa.sportapp.dto.ExerciseDto;
import dawidkapica.pracadyplomowa.sportapp.entities.ExerciseEntity;
import dawidkapica.pracadyplomowa.sportapp.service.ExerciseService;
import dawidkapica.pracadyplomowa.sportapp.specification.ExerciseSpecification;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.EXERCISE)
public class ExerciseController extends AbstractCrudControllerWithSpecification<ExerciseDto, Integer, ExerciseEntity, ExerciseSpecification> {

    public ExerciseController(ExerciseService exerciseService) {
        super(exerciseService);
    }
}
