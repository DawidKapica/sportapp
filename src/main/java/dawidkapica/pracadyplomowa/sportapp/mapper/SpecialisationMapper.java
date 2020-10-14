package dawidkapica.pracadyplomowa.sportapp.mapper;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.MapperInterface;
import dawidkapica.pracadyplomowa.sportapp.dto.SpecialisationDto;
import dawidkapica.pracadyplomowa.sportapp.entities.SpecialisationEntity;
import org.mapstruct.Mapper;

@Mapper
public interface SpecialisationMapper extends MapperInterface<SpecialisationDto, SpecialisationEntity> {
}
