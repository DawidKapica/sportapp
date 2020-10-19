package dawidkapica.pracadyplomowa.sportapp.mapper;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.MapperInterface;
import dawidkapica.pracadyplomowa.sportapp.dto.AdminDto;
import dawidkapica.pracadyplomowa.sportapp.entities.AdminEntity;
import dawidkapica.pracadyplomowa.sportapp.entities.LoginEntity;
import dawidkapica.pracadyplomowa.sportapp.repositories.LoginRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityNotFoundException;

@Mapper
public abstract class AdminMapper implements MapperInterface<AdminDto, AdminEntity> {

    @Autowired
    private LoginRepository loginRepository;

    @Mapping(source = "login.id", target = "loginId")
    @Override
    public abstract AdminDto mapToDto(AdminEntity entity);

    @Mapping(source = "loginId", target = "login")
    @Override
    public abstract AdminEntity mapToEntity(AdminDto dto);

    protected LoginEntity loginEntityFromId(Integer id) {
        return loginRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

}
