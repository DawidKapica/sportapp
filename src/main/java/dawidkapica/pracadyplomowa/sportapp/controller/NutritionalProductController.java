package dawidkapica.pracadyplomowa.sportapp.controller;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.BaseCrudControllerWithSpecification;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.RestMappings;
import dawidkapica.pracadyplomowa.sportapp.dto.NutritionalProductDto;
import dawidkapica.pracadyplomowa.sportapp.dto.request.NutritionalProductListRequest;
import dawidkapica.pracadyplomowa.sportapp.entities.NutritionalProductEntity;
import dawidkapica.pracadyplomowa.sportapp.service.NutritionalProductService;
import dawidkapica.pracadyplomowa.sportapp.specification.NutritionalProductSpecification;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(RestMappings.NUTRITIONAL_PRODUCT)
public class NutritionalProductController
        extends BaseCrudControllerWithSpecification<NutritionalProductDto, Integer, NutritionalProductEntity, NutritionalProductSpecification> {

    private NutritionalProductService nutritionalProductService;

    public NutritionalProductController(NutritionalProductService nutritionalProductService) {
        super(nutritionalProductService);
        this.nutritionalProductService = nutritionalProductService;
    }


    @PostMapping(RestMappings.SEARCH)
    public Page<NutritionalProductDto> getAllWithGivenParameters(@RequestBody(required = false) @Valid NutritionalProductListRequest request, Pageable pageable) {

        Specification<NutritionalProductEntity> nutritionalProductEntitySpecification = Specification.where(null);
        nutritionalProductEntitySpecification = new NutritionalProductSpecification(request.getMinCal(), request.getMaxCal());


        List<NutritionalProductDto> collect = nutritionalProductService.findAll(nutritionalProductEntitySpecification, pageable)
                .get()
                .collect(Collectors.toList());

        return new PageImpl<>(collect, pageable, collect.size());

//        return nutritionalProductService.findAll(request, pageable)
    }

}
