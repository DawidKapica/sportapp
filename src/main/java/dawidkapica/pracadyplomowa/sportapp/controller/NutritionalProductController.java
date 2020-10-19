package dawidkapica.pracadyplomowa.sportapp.controller;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractCrudControllerWithSpecification;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.RestMappings;
import dawidkapica.pracadyplomowa.sportapp.dto.NutritionalProductDto;
import dawidkapica.pracadyplomowa.sportapp.dto.request.NutritionalProductRequest;
import dawidkapica.pracadyplomowa.sportapp.entities.NutritionalProductEntity;
import dawidkapica.pracadyplomowa.sportapp.service.NutritionalProductService;
import dawidkapica.pracadyplomowa.sportapp.specification.NutritionalProductSpecification;
import dawidkapica.pracadyplomowa.sportapp.specification.NutritionalProductSpecificationAlternative;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(RestMappings.NUTRITIONAL_PRODUCT)
public class NutritionalProductController
        extends AbstractCrudControllerWithSpecification<NutritionalProductDto, Integer, NutritionalProductEntity, NutritionalProductSpecification> {

    private NutritionalProductService nutritionalProductService;

    private NutritionalProductSpecificationAlternative nutProdSpecAlt = new NutritionalProductSpecificationAlternative();

    public NutritionalProductController(NutritionalProductService nutritionalProductService) {
        super(nutritionalProductService);
        this.nutritionalProductService = nutritionalProductService;
    }


    //alternative version of pecification ise
    @GetMapping(RestMappings.SEARCH + "alt")
    public Page<NutritionalProductDto> getAllWithGivenParametersAlt(@ModelAttribute NutritionalProductRequest request, Pageable pageable) {
        return nutritionalProductService.findAll(
                Specification.where(
                        nutProdSpecAlt.minCal(request.minCal)).and(
                                nutProdSpecAlt.maxCal(request.maxCal)), pageable);
    }

}


//https://github.com/mjodmj