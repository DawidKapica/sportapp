package dawidkapica.pracadyplomowa.sportapp.controller;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractCrudControllerWithSpecification;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.RestMappings;
import dawidkapica.pracadyplomowa.sportapp.dto.TrainingValuesDto;
import dawidkapica.pracadyplomowa.sportapp.entities.TrainingValuesEntity;
import dawidkapica.pracadyplomowa.sportapp.service.TrainingValuesService;
import dawidkapica.pracadyplomowa.sportapp.specification.TrainingValuesSpecification;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.TRAINING_VALUES)
public class TrainingValuesController extends AbstractCrudControllerWithSpecification<TrainingValuesDto, Integer, TrainingValuesEntity, TrainingValuesSpecification> {

    public TrainingValuesController(TrainingValuesService trainingValuesService) {
        super(trainingValuesService);
    }
    
}
