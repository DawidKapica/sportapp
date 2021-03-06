package dawidkapica.pracadyplomowa.sportapp.mapper;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.MapperInterface;
import dawidkapica.pracadyplomowa.sportapp.dto.ExerciseDto;
import dawidkapica.pracadyplomowa.sportapp.entities.ExerciseEntity;
import org.mapstruct.Mapper;

@Mapper
public interface ExerciseMapper extends MapperInterface<ExerciseDto, ExerciseEntity> {

}
