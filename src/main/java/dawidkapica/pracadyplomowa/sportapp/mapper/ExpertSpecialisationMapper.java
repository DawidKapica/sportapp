package dawidkapica.pracadyplomowa.sportapp.mapper;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.MapperInterface;
import dawidkapica.pracadyplomowa.sportapp.dto.ExpertSpecialisationDto;
import dawidkapica.pracadyplomowa.sportapp.entities.ExpertEntity;
import dawidkapica.pracadyplomowa.sportapp.entities.ExpertSpecialisationEntity;
import dawidkapica.pracadyplomowa.sportapp.entities.SpecialisationEntity;
import dawidkapica.pracadyplomowa.sportapp.repositories.ExpertRepository;
import dawidkapica.pracadyplomowa.sportapp.repositories.SpecialisationRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityNotFoundException;

@Mapper
public abstract class ExpertSpecialisationMapper implements MapperInterface<ExpertSpecialisationDto, ExpertSpecialisationEntity> {

    @Autowired
    private ExpertRepository expertRepository;

    @Autowired
    private SpecialisationRepository specialisationRepository;

    @Override
    @Mapping(source = "expert.id", target = "expertId")
    @Mapping(source = "specialisation.id", target = "specialisationId")
    public abstract ExpertSpecialisationDto mapToDto(ExpertSpecialisationEntity entity);

    @Override
    @Mapping(source = "expertId", target = "expert")
    @Mapping(source = "specialisationId", target = "specialisation")
    public abstract ExpertSpecialisationEntity mapToEntity(ExpertSpecialisationDto dto);

    protected ExpertEntity expertEntityFromId(Integer id) {
        return expertRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    protected SpecialisationEntity specialisationEntityFromId(Integer id) {
        return specialisationRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }
}
