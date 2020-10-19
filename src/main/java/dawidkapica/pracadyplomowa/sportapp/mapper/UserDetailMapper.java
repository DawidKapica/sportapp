package dawidkapica.pracadyplomowa.sportapp.mapper;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.MapperInterface;
import dawidkapica.pracadyplomowa.sportapp.dto.UserDetailDto;
import dawidkapica.pracadyplomowa.sportapp.entities.UserDetailEntity;
import dawidkapica.pracadyplomowa.sportapp.entities.UserEntity;
import dawidkapica.pracadyplomowa.sportapp.repositories.UserRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityNotFoundException;

@Mapper
public abstract class UserDetailMapper implements MapperInterface<UserDetailDto, UserDetailEntity> {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Mapping(source = "user.id", target = "userId")

    public abstract UserDetailDto mapToDto(UserDetailEntity entity);

    @Override
    @Mapping(source = "userId", target = "user")
    public abstract UserDetailEntity mapToEntity(UserDetailDto dto);

    protected UserEntity userEntityFromId(Integer id) {
        return userRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

}
