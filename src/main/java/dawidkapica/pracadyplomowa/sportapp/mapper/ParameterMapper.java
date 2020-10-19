package dawidkapica.pracadyplomowa.sportapp.mapper;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.MapperInterface;
import dawidkapica.pracadyplomowa.sportapp.dto.ParameterDto;
import dawidkapica.pracadyplomowa.sportapp.entities.ParameterEntity;
import org.mapstruct.Mapper;

@Mapper
public interface ParameterMapper extends MapperInterface<ParameterDto, ParameterEntity> {
}
