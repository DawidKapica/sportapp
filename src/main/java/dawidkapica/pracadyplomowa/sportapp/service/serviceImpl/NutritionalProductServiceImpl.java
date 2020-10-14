package dawidkapica.pracadyplomowa.sportapp.service.serviceImpl;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractSpecificationCrudService;
import dawidkapica.pracadyplomowa.sportapp.dto.NutritionalProductDto;
import dawidkapica.pracadyplomowa.sportapp.entities.NutritionalProductEntity;
import dawidkapica.pracadyplomowa.sportapp.mapper.NutritionalProductMapper;
import dawidkapica.pracadyplomowa.sportapp.repositories.NutritionalProductRepository;
import dawidkapica.pracadyplomowa.sportapp.service.NutritionalProductService;
import org.springframework.stereotype.Service;

@Service
public class NutritionalProductServiceImpl extends AbstractSpecificationCrudService<NutritionalProductDto, NutritionalProductEntity, Integer, NutritionalProductRepository>
        implements NutritionalProductService {

    public NutritionalProductServiceImpl(NutritionalProductRepository repository, NutritionalProductMapper mapper) {
        super(repository, mapper);
    }

}
