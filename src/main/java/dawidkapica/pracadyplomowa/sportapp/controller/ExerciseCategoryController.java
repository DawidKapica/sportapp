package dawidkapica.pracadyplomowa.sportapp.controller;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractCrudController;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.RestMappings;
import dawidkapica.pracadyplomowa.sportapp.dto.ExerciseCategoryDto;
import dawidkapica.pracadyplomowa.sportapp.service.ExerciseCategoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.EXERCISE_CATEGORY)
public class ExerciseCategoryController extends AbstractCrudController<ExerciseCategoryDto, Integer> {

    public ExerciseCategoryController(ExerciseCategoryService exerciseCategoryService) {
        super(exerciseCategoryService);
    }
}
