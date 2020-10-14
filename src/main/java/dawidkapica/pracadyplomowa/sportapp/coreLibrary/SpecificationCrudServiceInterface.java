package dawidkapica.pracadyplomowa.sportapp.coreLibrary;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Persistable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import java.io.Serializable;
import java.util.List;

public interface SpecificationCrudServiceInterface <T extends PersistableDto<ID>, U extends Persistable<ID>, ID extends Serializable> extends CrudServiceInterface<T, ID> {

    List<T> findAll(Specification<U> specification);

    Page<T> findAll(Specification<U> specification, Pageable pageable);

    List<T> findAll(Specification<U> specification, Sort sort);
}
