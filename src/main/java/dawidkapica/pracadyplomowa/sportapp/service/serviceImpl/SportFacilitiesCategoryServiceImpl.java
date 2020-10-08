package dawidkapica.pracadyplomowa.sportapp.service.serviceImpl;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.BaseCrudService;
import dawidkapica.pracadyplomowa.sportapp.dto.SportFacilitiesCategoryDto;
import dawidkapica.pracadyplomowa.sportapp.entities.SportFacilitiesCategoryEntity;
import dawidkapica.pracadyplomowa.sportapp.mapper.SportFacilitiesCategoryMapper;
import dawidkapica.pracadyplomowa.sportapp.repositories.SportFacilitiesCategoryRepository;
import dawidkapica.pracadyplomowa.sportapp.service.SportFacilitiesCategoryService;
import org.springframework.stereotype.Service;

@Service
public class SportFacilitiesCategoryServiceImpl extends BaseCrudService<SportFacilitiesCategoryDto, SportFacilitiesCategoryEntity, Integer, SportFacilitiesCategoryRepository>
        implements SportFacilitiesCategoryService {

    public SportFacilitiesCategoryServiceImpl(SportFacilitiesCategoryRepository repository, SportFacilitiesCategoryMapper mapper) {
        super(repository, mapper);
    }
}
