package dawidkapica.pracadyplomowa.sportapp.service.serviceImpl;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractSpecificationCrudService;
import dawidkapica.pracadyplomowa.sportapp.dto.UserDetailDto;
import dawidkapica.pracadyplomowa.sportapp.entities.UserDetailEntity;
import dawidkapica.pracadyplomowa.sportapp.mapper.UserDetailMapper;
import dawidkapica.pracadyplomowa.sportapp.repositories.UserDetailRepository;
import dawidkapica.pracadyplomowa.sportapp.service.UserDetailService;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl extends AbstractSpecificationCrudService<UserDetailDto, UserDetailEntity, Integer, UserDetailRepository>
        implements UserDetailService {

    public UserDetailServiceImpl(UserDetailRepository repository, UserDetailMapper mapper) {
        super(repository, mapper);
    }
}
