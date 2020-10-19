package dawidkapica.pracadyplomowa.sportapp.service.serviceImpl;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractCrudService;
import dawidkapica.pracadyplomowa.sportapp.dto.AdminDto;
import dawidkapica.pracadyplomowa.sportapp.entities.AdminEntity;
import dawidkapica.pracadyplomowa.sportapp.mapper.AdminMapper;
import dawidkapica.pracadyplomowa.sportapp.repositories.AdminRepository;
import dawidkapica.pracadyplomowa.sportapp.service.AdminService;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl extends AbstractCrudService<AdminDto, AdminEntity, Integer, AdminRepository>
        implements AdminService {

    public AdminServiceImpl(AdminRepository repository, AdminMapper mapper) {
        super(repository, mapper);
    }
    
}
