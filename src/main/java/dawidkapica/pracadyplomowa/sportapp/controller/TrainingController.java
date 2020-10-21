package dawidkapica.pracadyplomowa.sportapp.controller;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractCrudControllerCustomSpecification;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.RestMappings;
import dawidkapica.pracadyplomowa.sportapp.dto.TrainingDto;
import dawidkapica.pracadyplomowa.sportapp.dto.request.TrainingRequest;
import dawidkapica.pracadyplomowa.sportapp.entities.TrainingEntity;
import dawidkapica.pracadyplomowa.sportapp.entities.TrainingEntity_;
import dawidkapica.pracadyplomowa.sportapp.service.TrainingService;
import dawidkapica.pracadyplomowa.sportapp.specification.TrainingSpecificationCustom;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.TRAINING)
public class TrainingController extends AbstractCrudControllerCustomSpecification<TrainingDto, Integer, TrainingEntity, TrainingRequest> {

    TrainingService trainingService;
    TrainingSpecificationCustom trainingSpecificationCustom = new TrainingSpecificationCustom();

    public TrainingController(TrainingService trainingService) {
        super(trainingService);
        this.trainingService = trainingService;
    }

    @Override
    @GetMapping(RestMappings.SEARCH)

    public Page<TrainingDto> getAllWithGivenParametersAlt (@ModelAttribute TrainingRequest request, Pageable pageable) {
        Specification specification = Specification.where(null);

        specification = specification.and(trainingSpecificationCustom.minDate(request.getTrainingDateMin(), TrainingEntity_.TRAINING_DATE));
        specification = specification.and(trainingSpecificationCustom.maxDate(request.getTrainingDateMax(), TrainingEntity_.TRAINING_DATE));

        if (request.getName() != null) {
            specification = specification.and(trainingSpecificationCustom.stringEqual(request.getName(), TrainingEntity_.NAME));
        }
        if (request.getUserId() != null) {
            specification = specification.and(trainingSpecificationCustom.idEqual(request.getUserId(), TrainingEntity_.USER));
        }
        if (request.getExerciseId() != null) {
            specification = specification.and(trainingSpecificationCustom.idEqual(request.getExerciseId(), TrainingEntity_.EXERCISE));
        }

        return trainingService.findAll(specification, pageable);

    }

}
