package dawidkapica.pracadyplomowa.sportapp.service.serviceImpl;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractCrudService;
import dawidkapica.pracadyplomowa.sportapp.dto.FacilitiesOpeningHoursDto;
import dawidkapica.pracadyplomowa.sportapp.entities.FacilitiesOpeningHoursEntity;
import dawidkapica.pracadyplomowa.sportapp.mapper.FacilitiesOpeningHoursMapper;
import dawidkapica.pracadyplomowa.sportapp.repositories.FacilitiesOpeningHoursRepository;
import dawidkapica.pracadyplomowa.sportapp.service.FacilitiesOpeningHoursService;
import org.springframework.stereotype.Service;

@Service
public class FacilitiesOpeningHoursServiceImpl extends AbstractCrudService<FacilitiesOpeningHoursDto, FacilitiesOpeningHoursEntity, Integer, FacilitiesOpeningHoursRepository>
        implements FacilitiesOpeningHoursService {

    public FacilitiesOpeningHoursServiceImpl(FacilitiesOpeningHoursRepository repository, FacilitiesOpeningHoursMapper mapper) {
        super(repository, mapper);
    }
    
}
