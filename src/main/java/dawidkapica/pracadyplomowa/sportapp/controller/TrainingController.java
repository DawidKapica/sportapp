package dawidkapica.pracadyplomowa.sportapp.controller;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.BaseCrudController;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.RestMappings;
import dawidkapica.pracadyplomowa.sportapp.dto.TrainingDto;
import dawidkapica.pracadyplomowa.sportapp.service.TrainingService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.TRAINING)
public class TrainingController extends BaseCrudController<TrainingDto, Integer> {

    public TrainingController(TrainingService trainingService) {
        super(trainingService);
    }
}
