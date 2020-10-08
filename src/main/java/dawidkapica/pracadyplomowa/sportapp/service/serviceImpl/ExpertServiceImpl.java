package dawidkapica.pracadyplomowa.sportapp.service.serviceImpl;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.BaseCrudService;
import dawidkapica.pracadyplomowa.sportapp.dto.ExpertDto;
import dawidkapica.pracadyplomowa.sportapp.entities.ExpertEntity;
import dawidkapica.pracadyplomowa.sportapp.mapper.ExpertMapper;
import dawidkapica.pracadyplomowa.sportapp.repositories.ExpertRepository;
import dawidkapica.pracadyplomowa.sportapp.service.ExpertService;
import org.springframework.stereotype.Service;

@Service
public class ExpertServiceImpl extends BaseCrudService<ExpertDto, ExpertEntity, Integer, ExpertRepository>
        implements ExpertService {

    public ExpertServiceImpl(ExpertRepository repository, ExpertMapper mapper) {
        super(repository, mapper);
    }
}


