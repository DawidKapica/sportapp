package dawidkapica.pracadyplomowa.sportapp.mapper;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.BaseMapper;
import dawidkapica.pracadyplomowa.sportapp.dto.UserPlanDto;
import dawidkapica.pracadyplomowa.sportapp.entities.UserEntity;
import dawidkapica.pracadyplomowa.sportapp.entities.UserPlanEntity;
import dawidkapica.pracadyplomowa.sportapp.repositories.UserRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityNotFoundException;

@Mapper
public abstract class UserPlanMapper implements BaseMapper<UserPlanDto, UserPlanEntity> {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Mapping(source = "user.id", target = "userId")
    public abstract UserPlanDto mapToDto(UserPlanEntity entity);

    @Override
    @Mapping(source = "userId", target = "user")
    public abstract UserPlanEntity mapToEntity(UserPlanDto dto);

    protected UserEntity userEntityFromId(Integer id) {
        return userRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

}
