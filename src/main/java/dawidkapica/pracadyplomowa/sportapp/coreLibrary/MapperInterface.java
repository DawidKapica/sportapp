package dawidkapica.pracadyplomowa.sportapp.coreLibrary;

import java.util.Collection;
import java.util.List;

public interface MapperInterface <D, E> {

    D mapToDto(E entity);

    E mapToEntity(D dto);

    List<D> mapToDtoList(Collection<E> entity);

    List<E> mapToEntityList(Collection<D> dto);

}
