package dawidkapica.pracadyplomowa.sportapp.mapper;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.BaseMapper;
import dawidkapica.pracadyplomowa.sportapp.dto.UserDetailDto;
import dawidkapica.pracadyplomowa.sportapp.entities.UserDetailDateEntity;
import dawidkapica.pracadyplomowa.sportapp.entities.UserDetailEntity;
import dawidkapica.pracadyplomowa.sportapp.entities.UserEntity;
import dawidkapica.pracadyplomowa.sportapp.repositories.UserDetailDateRepository;
import dawidkapica.pracadyplomowa.sportapp.repositories.UserRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityNotFoundException;

@Mapper
public abstract class UserDetailMapper implements BaseMapper<UserDetailDto, UserDetailEntity> {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserDetailDateRepository userDetailDateRepository;

    @Override
    @Mapping(source = "user.id", target = "userId")
    @Mapping(source = "userDetailDate.id", target = "userDetailDateId")
    public abstract UserDetailDto mapToDto(UserDetailEntity entity);

    @Override
    @Mapping(source = "userId", target = "user")
    @Mapping(source = "userDetailDateId", target = "userDetailDate")
    public abstract UserDetailEntity mapToEntity(UserDetailDto dto);

    protected UserEntity userEntityFromId(Integer id) {
        return userRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    protected UserDetailDateEntity userDetailDateEntityFromId (Integer id) {
        return userDetailDateRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }


}
