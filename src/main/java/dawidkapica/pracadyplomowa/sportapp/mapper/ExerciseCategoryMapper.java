package dawidkapica.pracadyplomowa.sportapp.mapper;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.BaseMapper;
import dawidkapica.pracadyplomowa.sportapp.dto.ExerciseCategoryDto;
import dawidkapica.pracadyplomowa.sportapp.entities.ExerciseCategoryEntity;
import org.mapstruct.Mapper;

@Mapper
public interface ExerciseCategoryMapper extends BaseMapper<ExerciseCategoryDto, ExerciseCategoryEntity> {
}
