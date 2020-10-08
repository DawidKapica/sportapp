package dawidkapica.pracadyplomowa.sportapp.mapper;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.BaseMapper;
import dawidkapica.pracadyplomowa.sportapp.dto.ExpertSpecialisationDto;
import dawidkapica.pracadyplomowa.sportapp.entities.ExpertEntity;
import dawidkapica.pracadyplomowa.sportapp.entities.ExpertSpecialisationEntity;
import dawidkapica.pracadyplomowa.sportapp.repositories.ExpertRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityNotFoundException;

@Mapper
public abstract class ExpertSpecialisationMapper implements BaseMapper<ExpertSpecialisationDto, ExpertSpecialisationEntity> {

    @Autowired
    private ExpertRepository expertRepository;

    @Override
    @Mapping(source = "expert.id", target = "expertId")
    public abstract ExpertSpecialisationDto mapToDto(ExpertSpecialisationEntity entity);

    @Override
    @Mapping(source = "expertId", target = "expert")
    public abstract ExpertSpecialisationEntity mapToEntity(ExpertSpecialisationDto dto);

    protected ExpertEntity expertEntityFromId(Integer id) {
        return expertRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }
}
