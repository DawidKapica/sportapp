package dawidkapica.pracadyplomowa.sportapp.controller;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractCrudControllerWithSpecification;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.RestMappings;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.SpecificationCrudServiceInterface;
import dawidkapica.pracadyplomowa.sportapp.dto.ExpertDto;
import dawidkapica.pracadyplomowa.sportapp.dto.search.ExpertSearchList;
import dawidkapica.pracadyplomowa.sportapp.entities.ExpertEntity;
import dawidkapica.pracadyplomowa.sportapp.service.ExpertService;
import dawidkapica.pracadyplomowa.sportapp.specification.ExpertSpecification;
import dawidkapica.pracadyplomowa.sportapp.specification.ExpertWithRequiredSpecialisationSpecification;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(RestMappings.EXPERT)
public class ExpertController extends AbstractCrudControllerWithSpecification<ExpertDto, Integer, ExpertEntity, ExpertSpecification> {

    private final SpecificationCrudServiceInterface<ExpertDto, ExpertEntity, Integer> service;

    public ExpertController(ExpertService expertService) {
        super(expertService);
        this.service = expertService;
    }

    @PostMapping(RestMappings.SEARCH)
    public Page<ExpertDto> getAllWithGivenParameters(
            @RequestBody(required = false) @Valid ExpertSearchList expertSearchList,
            ExpertSpecification specification,
            Pageable pageable) {

        Specification<ExpertEntity> requiredSpecialisationSpecification = Specification.where(null);

        if (expertSearchList != null) {

            if (!expertSearchList.getSearchSpecialisations().isEmpty()) {
                requiredSpecialisationSpecification =
                        new ExpertWithRequiredSpecialisationSpecification(
                                expertSearchList.getSearchSpecialisations());
            }
        }

//        Specification<ExpertEntity> finalRequiredLanguageKnowledgesSpecification = requiredSpecialisationSpecification;
//        Page<ExpertDto> collect =
//                service
//                        .findAll(finalRequiredLanguageKnowledgesSpecification, pageable);


        return service.findAll(requiredSpecialisationSpecification, pageable);
//        return new PageImpl<>(collect, pageable, collect.size());
    }
}
