package dawidkapica.pracadyplomowa.sportapp.mapper;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.MapperInterface;
import dawidkapica.pracadyplomowa.sportapp.dto.NutritionalProductDto;
import dawidkapica.pracadyplomowa.sportapp.entities.NutritionalProductEntity;
import org.mapstruct.Mapper;

@Mapper
public interface NutritionalProductMapper extends MapperInterface<NutritionalProductDto, NutritionalProductEntity> {
}
