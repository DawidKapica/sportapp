package dawidkapica.pracadyplomowa.sportapp.mapper;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.MapperInterface;
import dawidkapica.pracadyplomowa.sportapp.dto.PossibleExerciseFacilitiesDto;
import dawidkapica.pracadyplomowa.sportapp.entities.ExerciseEntity;
import dawidkapica.pracadyplomowa.sportapp.entities.PossibleExerciseFacilitiesEntity;
import dawidkapica.pracadyplomowa.sportapp.entities.SportFacilitiesEntity;
import dawidkapica.pracadyplomowa.sportapp.repositories.ExerciseRepository;
import dawidkapica.pracadyplomowa.sportapp.repositories.SportFacilitiesRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityNotFoundException;

@Mapper
public abstract class PossibleExerciseFacilitiesMapper implements MapperInterface<PossibleExerciseFacilitiesDto, PossibleExerciseFacilitiesEntity> {

    @Autowired
    private SportFacilitiesRepository sportFacilitiesRepository;

    @Autowired
    private ExerciseRepository exerciseRepository;

    @Mapping(source = "sportFacilities.id", target = "sportFacilitiesId")
    @Mapping(source = "exercise.id", target = "exerciseId")
    @Override
    public abstract PossibleExerciseFacilitiesDto mapToDto(PossibleExerciseFacilitiesEntity entity);

    @Mapping(source = "sportFacilitiesId", target = "sportFacilities")
    @Mapping(source = "exerciseId", target = "exercise")
    @Override
    public abstract PossibleExerciseFacilitiesEntity mapToEntity(PossibleExerciseFacilitiesDto dto);


    protected SportFacilitiesEntity sportFacilitiesEntityFromId(Integer id) {
        return sportFacilitiesRepository.findById(id).orElseThrow(EntityNotFoundException::new);

    }

    protected ExerciseEntity exerciseEntityFromId(Integer id) {
        return exerciseRepository.findById(id).orElseThrow(EntityNotFoundException::new);

    }

}
