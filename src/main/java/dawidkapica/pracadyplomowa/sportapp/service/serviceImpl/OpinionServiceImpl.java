package dawidkapica.pracadyplomowa.sportapp.service.serviceImpl;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.BaseCrudService;
import dawidkapica.pracadyplomowa.sportapp.dto.OpinionDto;
import dawidkapica.pracadyplomowa.sportapp.entities.OpinionEntity;
import dawidkapica.pracadyplomowa.sportapp.mapper.OpinionMapper;
import dawidkapica.pracadyplomowa.sportapp.repositories.OpinionRepository;
import dawidkapica.pracadyplomowa.sportapp.service.OpinionService;
import org.springframework.stereotype.Service;

@Service
public class OpinionServiceImpl extends BaseCrudService<OpinionDto, OpinionEntity, Integer, OpinionRepository>
        implements OpinionService {

    public OpinionServiceImpl(OpinionRepository repository, OpinionMapper mapper) {
        super(repository, mapper);
    }
}
