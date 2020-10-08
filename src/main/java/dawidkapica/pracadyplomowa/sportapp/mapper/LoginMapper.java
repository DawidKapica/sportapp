package dawidkapica.pracadyplomowa.sportapp.mapper;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.BaseMapper;
import dawidkapica.pracadyplomowa.sportapp.dto.LoginDto;
import dawidkapica.pracadyplomowa.sportapp.entities.LoginEntity;
import org.mapstruct.Mapper;

@Mapper
public interface LoginMapper extends BaseMapper<LoginDto, LoginEntity> {
}
