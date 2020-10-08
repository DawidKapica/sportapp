package dawidkapica.pracadyplomowa.sportapp.service.serviceImpl;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.BaseCrudService;
import dawidkapica.pracadyplomowa.sportapp.dto.UserDto;
import dawidkapica.pracadyplomowa.sportapp.entities.UserEntity;
import dawidkapica.pracadyplomowa.sportapp.mapper.UserMapper;
import dawidkapica.pracadyplomowa.sportapp.repositories.UserRepository;
import dawidkapica.pracadyplomowa.sportapp.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseCrudService<UserDto, UserEntity, Integer, UserRepository>
        implements UserService {

    public UserServiceImpl(UserRepository repository, UserMapper mapper) {
        super(repository, mapper);
    }
}
