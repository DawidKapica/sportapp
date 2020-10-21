package dawidkapica.pracadyplomowa.sportapp.coreLibrary;

import dawidkapica.pracadyplomowa.sportapp.dto.request.RequestInterface;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Persistable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
public abstract class AbstractCrudControllerCustomSpecification <
        T extends PersistableDto<ID>,
        ID extends Serializable,
        E extends Persistable<ID>,
        R extends RequestInterface>
        extends AbstractCrudController<T, ID> {

    private final SpecificationCrudServiceInterface<T, E, ID> service;

    public AbstractCrudControllerCustomSpecification (SpecificationCrudServiceInterface<T, E, ID> service) {
        super(service);
        this.service = service;
    }

    @GetMapping(RestMappings.SEARCH)
    public abstract Page<T> getAllWithGivenParametersAlt(@ModelAttribute R request, Pageable pageable);
}
