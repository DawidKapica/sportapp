package dawidkapica.pracadyplomowa.sportapp.service.serviceImpl;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractSpecificationCrudService;
import dawidkapica.pracadyplomowa.sportapp.dto.ParameterDto;
import dawidkapica.pracadyplomowa.sportapp.entities.ParameterEntity;
import dawidkapica.pracadyplomowa.sportapp.mapper.ParameterMapper;
import dawidkapica.pracadyplomowa.sportapp.repositories.ParameterRepository;
import dawidkapica.pracadyplomowa.sportapp.repositories.ParameterRepository;
import dawidkapica.pracadyplomowa.sportapp.service.ParameterService;
import org.springframework.stereotype.Service;

@Service
public class ParameterServiceImpl extends AbstractSpecificationCrudService<ParameterDto, ParameterEntity, Integer, ParameterRepository>
        implements ParameterService {

    public ParameterServiceImpl(ParameterRepository repository, ParameterMapper mapper) {
        super(repository, mapper);
    }
    
}
