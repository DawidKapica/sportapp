package dawidkapica.pracadyplomowa.sportapp.mapper;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.MapperInterface;
import dawidkapica.pracadyplomowa.sportapp.dto.UserDto;
import dawidkapica.pracadyplomowa.sportapp.entities.LoginEntity;
import dawidkapica.pracadyplomowa.sportapp.entities.UserEntity;
import dawidkapica.pracadyplomowa.sportapp.repositories.LoginRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityNotFoundException;

@Mapper
public abstract class UserMapper implements MapperInterface<UserDto, UserEntity> {

    @Autowired
    private LoginRepository loginRepository;

    @Mapping(source = "login.id", target = "loginId")
    @Override
    public abstract UserDto mapToDto(UserEntity entity);

    @Mapping(source = "loginId", target = "login")
    @Override
    public abstract UserEntity mapToEntity(UserDto dto);

    protected LoginEntity loginEntityFromId(Integer id) {
        return loginRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

}
