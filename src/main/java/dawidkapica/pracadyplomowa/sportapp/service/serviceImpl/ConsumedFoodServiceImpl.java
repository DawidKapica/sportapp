package dawidkapica.pracadyplomowa.sportapp.service.serviceImpl;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractSpecificationCrudService;
import dawidkapica.pracadyplomowa.sportapp.dto.ConsumedFoodDto;
import dawidkapica.pracadyplomowa.sportapp.entities.ConsumedFoodEntity;
import dawidkapica.pracadyplomowa.sportapp.mapper.ConsumedFoodMapper;
import dawidkapica.pracadyplomowa.sportapp.repositories.ConsumedFoodRepository;
import dawidkapica.pracadyplomowa.sportapp.service.ConsumedFoodService;
import org.springframework.stereotype.Service;

@Service
public class ConsumedFoodServiceImpl extends AbstractSpecificationCrudService<ConsumedFoodDto, ConsumedFoodEntity, Integer, ConsumedFoodRepository>
        implements ConsumedFoodService {

    public ConsumedFoodServiceImpl(ConsumedFoodRepository repository, ConsumedFoodMapper mapper) {
        super(repository, mapper);
    }

}
