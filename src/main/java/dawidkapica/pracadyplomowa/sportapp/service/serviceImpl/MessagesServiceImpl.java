package dawidkapica.pracadyplomowa.sportapp.service.serviceImpl;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractSpecificationCrudService;
import dawidkapica.pracadyplomowa.sportapp.dto.MessagesDto;
import dawidkapica.pracadyplomowa.sportapp.entities.MessagesEntity;
import dawidkapica.pracadyplomowa.sportapp.mapper.MessagesMapper;
import dawidkapica.pracadyplomowa.sportapp.repositories.MessagesRepository;
import dawidkapica.pracadyplomowa.sportapp.repositories.MessagesRepository;
import dawidkapica.pracadyplomowa.sportapp.service.MessagesService;
import org.springframework.stereotype.Service;

@Service
public class MessagesServiceImpl extends AbstractSpecificationCrudService<MessagesDto, MessagesEntity, Integer, MessagesRepository>
        implements MessagesService {

    public MessagesServiceImpl(MessagesRepository repository, MessagesMapper mapper) {
        super(repository, mapper);
    }
    
}
