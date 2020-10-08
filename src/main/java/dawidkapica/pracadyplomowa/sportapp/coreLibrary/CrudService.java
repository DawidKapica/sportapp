package dawidkapica.pracadyplomowa.sportapp.coreLibrary;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface CrudService<T, ID> {

    T save(T dto);

    void deleteById(ID id);

    Optional<T> updateById(T dto, ID id);

    void deleteAll();


    Page<T> findAll(Pageable pageable);

    List<T> findAll();

    boolean existsById(ID id);

    Optional<T> findById(ID id);

    long count();
}