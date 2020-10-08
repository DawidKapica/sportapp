package dawidkapica.pracadyplomowa.sportapp.mapper;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.BaseMapper;
import dawidkapica.pracadyplomowa.sportapp.dto.SportFacilitiesCategoryDto;
import dawidkapica.pracadyplomowa.sportapp.entities.SportFacilitiesCategoryEntity;
import org.mapstruct.Mapper;

@Mapper
public interface SportFacilitiesCategoryMapper extends BaseMapper<SportFacilitiesCategoryDto, SportFacilitiesCategoryEntity> {
}
