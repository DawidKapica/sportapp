package dawidkapica.pracadyplomowa.sportapp.mapper;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.MapperInterface;
import dawidkapica.pracadyplomowa.sportapp.dto.ExerciseCategoryDto;
import dawidkapica.pracadyplomowa.sportapp.entities.ExerciseCategoryEntity;
import org.mapstruct.Mapper;

@Mapper
public interface ExerciseCategoryMapper extends MapperInterface<ExerciseCategoryDto, ExerciseCategoryEntity> {
}
