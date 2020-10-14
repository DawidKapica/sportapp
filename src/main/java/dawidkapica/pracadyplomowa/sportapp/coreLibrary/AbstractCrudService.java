package dawidkapica.pracadyplomowa.sportapp.coreLibrary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Persistable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public abstract class AbstractCrudService <
        T extends PersistableDto<ID>,
        E extends Persistable<ID>,
        ID extends Serializable,
        R extends JpaRepository<E, ID>> implements CrudServiceInterface<T, ID> {

    @Autowired
    protected final R repository;

    @Autowired
    protected final MapperInterface<T, E> mapper;

    public AbstractCrudService (R repository, MapperInterface<T, E> mapper) {
//        super(repository, mapper);
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public T save(T dto) {
        E savedEntity = repository.save(mapper.mapToEntity(dto));

        return mapper.mapToDto(savedEntity);
    }

    @Override
    public void deleteById(ID id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<T> updateById(T dto, ID id) {
        Optional<E> entityOptional = repository.findById(id);

        return entityOptional.map(
                entity -> {
                    dto.setId(id);
                    repository.save(mapper.mapToEntity(dto));
                    return mapper.mapToDto(entity);
                });
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }

    @Override
    public Page<T> findAll(Pageable pageable) {
        Page<E> allEntities = repository.findAll(pageable);

        return allEntities.map(mapper::mapToDto);
    }

    @Override
    public List<T> findAll() {
        return repository.findAll().stream().map(mapper::mapToDto).collect(Collectors.toList());
    }

    @Override
    public boolean existsById(ID id) {
        return repository.existsById(id);
    }

    @Override
    public Optional<T> findById(ID id) {
        Optional<E> entityOptional = repository.findById(id);

        return entityOptional.map(mapper::mapToDto);
    }

    @Override
    public long count() {
        return repository.count();
    }

}
