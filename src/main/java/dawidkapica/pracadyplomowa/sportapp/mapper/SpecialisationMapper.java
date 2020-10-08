package dawidkapica.pracadyplomowa.sportapp.mapper;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.BaseMapper;
import dawidkapica.pracadyplomowa.sportapp.dto.SpecialisationDto;
import dawidkapica.pracadyplomowa.sportapp.entities.SpecialisationEntity;
import org.mapstruct.Mapper;

@Mapper
public interface SpecialisationMapper extends BaseMapper<SpecialisationDto, SpecialisationEntity> {
}
