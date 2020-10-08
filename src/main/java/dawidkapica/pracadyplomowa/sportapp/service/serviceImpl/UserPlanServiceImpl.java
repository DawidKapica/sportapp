package dawidkapica.pracadyplomowa.sportapp.service.serviceImpl;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.BaseCrudService;
import dawidkapica.pracadyplomowa.sportapp.dto.UserPlanDto;
import dawidkapica.pracadyplomowa.sportapp.entities.UserPlanEntity;
import dawidkapica.pracadyplomowa.sportapp.mapper.UserPlanMapper;
import dawidkapica.pracadyplomowa.sportapp.repositories.UserPlanRepository;
import dawidkapica.pracadyplomowa.sportapp.service.UserPlanService;
import org.springframework.stereotype.Service;

@Service
public class UserPlanServiceImpl extends BaseCrudService<UserPlanDto, UserPlanEntity, Integer, UserPlanRepository>
        implements UserPlanService {

    public UserPlanServiceImpl(UserPlanRepository repository, UserPlanMapper mapper) {
        super(repository, mapper);
    }
}
