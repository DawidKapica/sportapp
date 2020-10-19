package dawidkapica.pracadyplomowa.sportapp.mapper;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.MapperInterface;
import dawidkapica.pracadyplomowa.sportapp.dto.FacilitiesOpeningHoursDto;
import dawidkapica.pracadyplomowa.sportapp.entities.FacilitiesOpeningHoursEntity;
import dawidkapica.pracadyplomowa.sportapp.entities.OpeningHoursEntity;
import dawidkapica.pracadyplomowa.sportapp.entities.SportFacilitiesEntity;
import dawidkapica.pracadyplomowa.sportapp.repositories.OpeningHoursRepository;
import dawidkapica.pracadyplomowa.sportapp.repositories.SportFacilitiesRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityNotFoundException;

@Mapper
public abstract class FacilitiesOpeningHoursMapper implements MapperInterface<FacilitiesOpeningHoursDto, FacilitiesOpeningHoursEntity> {

    @Autowired
    private SportFacilitiesRepository sportFacilitiesRepository;

    @Autowired
    private OpeningHoursRepository openingHoursRepository;

    @Mapping(source = "sportFacilities.id", target = "sportsFacilitiesId")
    @Mapping(source = "openingHours.id", target = "openingHoursId")
    @Override
    public abstract FacilitiesOpeningHoursDto mapToDto(FacilitiesOpeningHoursEntity entity);

    @Mapping(source = "sportsFacilitiesId", target = "sportFacilities")
    @Mapping(source = "openingHoursId", target = "openingHours")
    @Override
    public abstract FacilitiesOpeningHoursEntity mapToEntity(FacilitiesOpeningHoursDto dto);


    protected SportFacilitiesEntity sportFacilitiesEntityFromId(Integer id) {
        return sportFacilitiesRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    protected OpeningHoursEntity openingHoursEntityFromId(Integer id) {
        return openingHoursRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }
}
