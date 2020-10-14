package dawidkapica.pracadyplomowa.sportapp.mapper;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.MapperInterface;
import dawidkapica.pracadyplomowa.sportapp.dto.TrainingDto;
import dawidkapica.pracadyplomowa.sportapp.entities.ExerciseEntity;
import dawidkapica.pracadyplomowa.sportapp.entities.TrainingEntity;
import dawidkapica.pracadyplomowa.sportapp.entities.UserEntity;
import dawidkapica.pracadyplomowa.sportapp.repositories.ExerciseRepository;
import dawidkapica.pracadyplomowa.sportapp.repositories.UserRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityNotFoundException;

@Mapper
public abstract class TrainingMapper implements MapperInterface<TrainingDto, TrainingEntity> {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ExerciseRepository exerciseRepository;

    @Override
    @Mapping(source = "user.id", target = "userId")
    @Mapping(source = "exercise.id", target = "exerciseId")
    public abstract TrainingDto mapToDto(TrainingEntity entity);

    @Override
    @Mapping(source = "userId", target = "user")
    @Mapping(source = "exerciseId", target = "exercise")
    public abstract TrainingEntity mapToEntity(TrainingDto dto);

    protected UserEntity userEntityFromId(Integer id) {
        return userRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    protected ExerciseEntity exerciseEntityFromId(Integer id) {
        return exerciseRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

}
