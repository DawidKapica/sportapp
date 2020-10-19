package dawidkapica.pracadyplomowa.sportapp.controller;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractCrudController;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.RestMappings;
import dawidkapica.pracadyplomowa.sportapp.dto.PossibleExerciseFacilitiesDto;
import dawidkapica.pracadyplomowa.sportapp.service.PossibleExerciseFacilitiesService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.POSSIBLE_EXERCISE_FACILITIES)
public class PossibleExerciseFacilitiesController extends AbstractCrudController<PossibleExerciseFacilitiesDto, Integer> {

    public PossibleExerciseFacilitiesController(PossibleExerciseFacilitiesService possibleExerciseFacilitiesService) {
        super(possibleExerciseFacilitiesService);
    }
    
}
