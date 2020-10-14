package dawidkapica.pracadyplomowa.sportapp.mapper;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.MapperInterface;
import dawidkapica.pracadyplomowa.sportapp.dto.PersonDto;
import dawidkapica.pracadyplomowa.sportapp.entities.PersonEntity;
import org.mapstruct.Mapper;

@Mapper
public interface PersonMapper extends MapperInterface<PersonDto, PersonEntity> {
}
