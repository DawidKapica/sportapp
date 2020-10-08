package dawidkapica.pracadyplomowa.sportapp.mapper;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.BaseMapper;
import dawidkapica.pracadyplomowa.sportapp.dto.NutritionalProductDto;
import dawidkapica.pracadyplomowa.sportapp.entities.NutritionalProductEntity;
import org.mapstruct.Mapper;

@Mapper
public interface NutritionalProductMapper extends BaseMapper<NutritionalProductDto, NutritionalProductEntity> {
}
