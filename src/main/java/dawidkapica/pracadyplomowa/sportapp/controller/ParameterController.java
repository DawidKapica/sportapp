package dawidkapica.pracadyplomowa.sportapp.controller;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractCrudControllerWithSpecification;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.RestMappings;
import dawidkapica.pracadyplomowa.sportapp.dto.ParameterDto;
import dawidkapica.pracadyplomowa.sportapp.entities.ParameterEntity;
import dawidkapica.pracadyplomowa.sportapp.service.ParameterService;
import dawidkapica.pracadyplomowa.sportapp.specification.ParameterSpecification;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.PARAMETER)
public class ParameterController extends AbstractCrudControllerWithSpecification<ParameterDto, Integer, ParameterEntity, ParameterSpecification> {

    public ParameterController(ParameterService parameterService) {
        super(parameterService);
    }
    
}
