package dawidkapica.pracadyplomowa.sportapp.controller;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.BaseCrudController;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.RestMappings;
import dawidkapica.pracadyplomowa.sportapp.dto.ExerciseDto;
import dawidkapica.pracadyplomowa.sportapp.service.ExerciseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.EXERCISE)
public class ExerciseController extends BaseCrudController<ExerciseDto, Integer> {

    public ExerciseController(ExerciseService exerciseService) {
        super(exerciseService);
    }
}
