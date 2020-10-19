package dawidkapica.pracadyplomowa.sportapp.mapper;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.MapperInterface;
import dawidkapica.pracadyplomowa.sportapp.dto.TrainingValuesDto;
import dawidkapica.pracadyplomowa.sportapp.entities.ParameterEntity;
import dawidkapica.pracadyplomowa.sportapp.entities.TrainingValuesEntity;
import dawidkapica.pracadyplomowa.sportapp.repositories.ParameterRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityNotFoundException;

@Mapper
public abstract class TrainingValuesMapper implements MapperInterface<TrainingValuesDto, TrainingValuesEntity> {

    @Autowired
    private ParameterRepository parameterRepository;

    @Mapping(source = "parameter.id", target = "parameterId")
    @Override
    public abstract TrainingValuesDto mapToDto(TrainingValuesEntity entity);

    @Mapping(source = "parameterId", target = "parameter")
    @Override
    public abstract TrainingValuesEntity mapToEntity(TrainingValuesDto dto);

    protected ParameterEntity loginEntityFromId(Integer id) {
        return parameterRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

}
