package dawidkapica.pracadyplomowa.sportapp.mapper;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.MapperInterface;
import dawidkapica.pracadyplomowa.sportapp.dto.MessagesDto;
import dawidkapica.pracadyplomowa.sportapp.entities.ExpertEntity;
import dawidkapica.pracadyplomowa.sportapp.entities.MessagesEntity;
import dawidkapica.pracadyplomowa.sportapp.entities.UserEntity;
import dawidkapica.pracadyplomowa.sportapp.repositories.ExpertRepository;
import dawidkapica.pracadyplomowa.sportapp.repositories.UserRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityNotFoundException;

@Mapper
public abstract class MessagesMapper implements MapperInterface<MessagesDto, MessagesEntity> {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ExpertRepository expertRepository;

    @Override
    @Mapping(source = "user.id", target = "userId")
    @Mapping(source = "expert.id", target = "expertId")
    public abstract MessagesDto mapToDto(MessagesEntity entity);

    @Override
    @Mapping(source = "userId", target = "user")
    @Mapping(source = "expertId", target = "expert")
    public abstract MessagesEntity mapToEntity(MessagesDto dto);

    protected UserEntity userEntityFromId(Integer id) {
        return userRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    protected ExpertEntity expertEntityFromId(Integer id) {
        return expertRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }


}
