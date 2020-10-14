package dawidkapica.pracadyplomowa.sportapp.service.serviceImpl;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractCrudService;
import dawidkapica.pracadyplomowa.sportapp.dto.LoginDto;
import dawidkapica.pracadyplomowa.sportapp.entities.LoginEntity;
import dawidkapica.pracadyplomowa.sportapp.mapper.LoginMapper;
import dawidkapica.pracadyplomowa.sportapp.repositories.LoginRepository;
import dawidkapica.pracadyplomowa.sportapp.service.LoginService;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl extends AbstractCrudService<LoginDto, LoginEntity, Integer, LoginRepository>
        implements LoginService {

    public LoginServiceImpl(LoginRepository repository, LoginMapper mapper) {
        super(repository, mapper);
    }
}
