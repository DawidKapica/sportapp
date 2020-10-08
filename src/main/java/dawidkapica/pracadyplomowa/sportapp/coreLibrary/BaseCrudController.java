package dawidkapica.pracadyplomowa.sportapp.coreLibrary;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityNotFoundException;
import java.io.Serializable;

@RestController
public abstract class BaseCrudController <T extends PersistableDto<ID>, ID extends Serializable> {


    protected static final String ENTITY_EXISTS_EXCEPTION_MSG = "Entity already exists with id=";
    protected static final String ENTITY_NOT_FOUND_EXCEPTION_MSG = "Entity not found with id=";

    private final CrudService<T, ID> service;

    public BaseCrudController(CrudService<T, ID> service) {
        this.service = service;
    }

    @GetMapping
    public Page<T> getAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping(RestMappings.ID)
    public T getById(@PathVariable ID id) {
        return service
                .findById(id)
                .orElseThrow(() -> new EntityNotFoundException(ENTITY_NOT_FOUND_EXCEPTION_MSG + id));
    }

    @DeleteMapping(RestMappings.ID)
    public void deleteById(@PathVariable ID id) {
        if (!service.existsById(id)) {
            throw new EntityNotFoundException(ENTITY_NOT_FOUND_EXCEPTION_MSG + id);
        }

        service.deleteById(id);
    }
}
