package dawidkapica.pracadyplomowa.sportapp.mapper;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.BaseMapper;
import dawidkapica.pracadyplomowa.sportapp.dto.OpinionDto;
import dawidkapica.pracadyplomowa.sportapp.entities.ExpertEntity;
import dawidkapica.pracadyplomowa.sportapp.entities.OpinionEntity;
import dawidkapica.pracadyplomowa.sportapp.entities.UserEntity;
import dawidkapica.pracadyplomowa.sportapp.repositories.ExpertRepository;
import dawidkapica.pracadyplomowa.sportapp.repositories.UserRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityNotFoundException;

@Mapper
public abstract class OpinionMapper implements BaseMapper<OpinionDto, OpinionEntity> {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ExpertRepository expertRepository;

    @Override
    @Mapping(source = "user.id", target = "userId")
    @Mapping(source = "expert.id", target = "expertId")
    public abstract OpinionDto mapToDto(OpinionEntity entity);

    @Override
    @Mapping(source = "userId", target = "user")
    @Mapping(source = "expertId", target = "expert")
    public abstract OpinionEntity mapToEntity(OpinionDto dto);

    protected UserEntity userEntityFromId(Integer id) {
        return userRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    protected ExpertEntity expertEntityFromId(Integer id) {
        return expertRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }


}
