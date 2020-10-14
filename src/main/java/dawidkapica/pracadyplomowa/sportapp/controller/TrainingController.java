package dawidkapica.pracadyplomowa.sportapp.controller;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractCrudControllerWithSpecification;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.RestMappings;
import dawidkapica.pracadyplomowa.sportapp.dto.TrainingDto;
import dawidkapica.pracadyplomowa.sportapp.entities.TrainingEntity;
import dawidkapica.pracadyplomowa.sportapp.service.TrainingService;
import dawidkapica.pracadyplomowa.sportapp.specification.TrainingSpecification;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.TRAINING)
public class TrainingController extends AbstractCrudControllerWithSpecification<TrainingDto, Integer, TrainingEntity, TrainingSpecification> {

    public TrainingController(TrainingService trainingService) {
        super(trainingService);
    }
}
