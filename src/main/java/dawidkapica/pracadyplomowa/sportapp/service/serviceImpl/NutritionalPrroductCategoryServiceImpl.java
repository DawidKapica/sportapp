package dawidkapica.pracadyplomowa.sportapp.service.serviceImpl;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractCrudService;
import dawidkapica.pracadyplomowa.sportapp.dto.NutritionalProductCategoryDto;
import dawidkapica.pracadyplomowa.sportapp.entities.NutritionalProductCategoryEntity;
import dawidkapica.pracadyplomowa.sportapp.mapper.NutritionalProductCategoryMapper;
import dawidkapica.pracadyplomowa.sportapp.repositories.NutritionalProductCategoryRepository;
import dawidkapica.pracadyplomowa.sportapp.service.NutritionalProductCategoryService;
import org.springframework.stereotype.Service;

@Service
public class NutritionalPrroductCategoryServiceImpl extends AbstractCrudService<NutritionalProductCategoryDto, NutritionalProductCategoryEntity, Integer, NutritionalProductCategoryRepository>
        implements NutritionalProductCategoryService {

    public NutritionalPrroductCategoryServiceImpl(NutritionalProductCategoryRepository repository, NutritionalProductCategoryMapper mapper) {
        super(repository, mapper);
    }
}
