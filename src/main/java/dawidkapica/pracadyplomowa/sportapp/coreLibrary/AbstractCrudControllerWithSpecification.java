package dawidkapica.pracadyplomowa.sportapp.coreLibrary;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Persistable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public abstract class AbstractCrudControllerWithSpecification <
        T extends PersistableDto<ID>,
        ID extends Serializable,
        E extends Persistable<ID>,
        S extends Specification<E>>
        extends AbstractCrudController<T, ID> {

    private final SpecificationCrudServiceInterface<T, E, ID> service;

    public AbstractCrudControllerWithSpecification (SpecificationCrudServiceInterface<T, E, ID> service) {
        super(service);
        this.service = service;
    }

    @GetMapping(RestMappings.SEARCH)
    public Page<T> getAllWithGivenParameters(S specification, Pageable pageable) {
        return service.findAll(specification, pageable);
    }
}
