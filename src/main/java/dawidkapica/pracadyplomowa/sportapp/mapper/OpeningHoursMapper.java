package dawidkapica.pracadyplomowa.sportapp.mapper;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.MapperInterface;
import dawidkapica.pracadyplomowa.sportapp.dto.OpeningHoursDto;
import dawidkapica.pracadyplomowa.sportapp.entities.OpeningHoursEntity;
import org.mapstruct.Mapper;

@Mapper
public interface OpeningHoursMapper extends MapperInterface<OpeningHoursDto, OpeningHoursEntity> {
}
