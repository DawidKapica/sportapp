package dawidkapica.pracadyplomowa.sportapp.mapper;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.BaseMapper;
import dawidkapica.pracadyplomowa.sportapp.dto.NutritionalProductCategoryDto;
import dawidkapica.pracadyplomowa.sportapp.entities.NutritionalProductCategoryEntity;
import org.mapstruct.Mapper;

@Mapper
public interface NutritionalProductCategoryMapper extends BaseMapper<NutritionalProductCategoryDto, NutritionalProductCategoryEntity> {
}
