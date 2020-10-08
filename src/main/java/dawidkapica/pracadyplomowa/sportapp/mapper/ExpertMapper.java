package dawidkapica.pracadyplomowa.sportapp.mapper;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.BaseMapper;
import dawidkapica.pracadyplomowa.sportapp.dto.ExpertDto;
import dawidkapica.pracadyplomowa.sportapp.entities.ExpertEntity;
import dawidkapica.pracadyplomowa.sportapp.entities.LoginEntity;
import dawidkapica.pracadyplomowa.sportapp.repositories.LoginRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityNotFoundException;

@Mapper(uses = PersonMapper.class)
public abstract class ExpertMapper implements BaseMapper<ExpertDto, ExpertEntity> {

    @Autowired
    private LoginRepository loginRepository;


    @Mapping(source = "login.id", target = "loginId")
    @Override
    public abstract ExpertDto mapToDto(ExpertEntity entity);

    @Mapping(source = "loginId", target = "login")
    @Override
    public abstract ExpertEntity mapToEntity(ExpertDto dto);

    protected LoginEntity loginEntityFromId(Integer id) {
        return loginRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }
}
