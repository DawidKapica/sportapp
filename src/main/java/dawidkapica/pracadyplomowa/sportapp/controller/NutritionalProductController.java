package dawidkapica.pracadyplomowa.sportapp.controller;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractCrudControllerCustomSpecification;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.RestMappings;
import dawidkapica.pracadyplomowa.sportapp.dto.NutritionalProductDto;
import dawidkapica.pracadyplomowa.sportapp.dto.request.NutritionalProductRequest;
import dawidkapica.pracadyplomowa.sportapp.entities.NutritionalProductEntity;
import dawidkapica.pracadyplomowa.sportapp.entities.NutritionalProductEntity_;
import dawidkapica.pracadyplomowa.sportapp.service.NutritionalProductService;
import dawidkapica.pracadyplomowa.sportapp.specification.NutritionalProductSpecificationAlternative;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.NUTRITIONAL_PRODUCT)
public class NutritionalProductController
        extends AbstractCrudControllerCustomSpecification<NutritionalProductDto, Integer, NutritionalProductEntity, NutritionalProductRequest> {

    private NutritionalProductService nutritionalProductService;
    private NutritionalProductSpecificationAlternative nutProdSpecAlt = new NutritionalProductSpecificationAlternative();

    public NutritionalProductController(NutritionalProductService nutritionalProductService) {
        super(nutritionalProductService);
        this.nutritionalProductService = nutritionalProductService;
    }



    //alternative version of pecification ise
    @Override
    @GetMapping(RestMappings.SEARCH)
    public Page<NutritionalProductDto> getAllWithGivenParametersAlt(@ModelAttribute NutritionalProductRequest request, Pageable pageable) {

        Specification specification = Specification.where(null);

        specification= specification.and(nutProdSpecAlt.minVal(request.getMinCal(), NutritionalProductEntity_.CALORIFIC_VALUE));
        specification = specification.and(nutProdSpecAlt.maxVal(request.getMaxCal(), NutritionalProductEntity_.CALORIFIC_VALUE));

        if (request.getName() != null) {
            specification = specification.and(nutProdSpecAlt.stringEqual(request.getName(), NutritionalProductEntity_.NAME));
        }

        if (request.getCategory() != null) {
            specification = specification.and(nutProdSpecAlt.category(request.getCategory()));
        }

        return nutritionalProductService.findAll(specification, pageable);
    }
}

//https://github.com/mjodmj