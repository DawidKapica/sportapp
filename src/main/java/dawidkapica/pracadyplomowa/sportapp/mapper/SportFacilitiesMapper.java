package dawidkapica.pracadyplomowa.sportapp.mapper;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.MapperInterface;
import dawidkapica.pracadyplomowa.sportapp.dto.SportFacilitieDto;
import dawidkapica.pracadyplomowa.sportapp.entities.SportFacilitiesEntity;
import org.mapstruct.Mapper;

@Mapper
public interface SportFacilitiesMapper extends MapperInterface<SportFacilitieDto, SportFacilitiesEntity> {
}
