package dawidkapica.pracadyplomowa.sportapp.coreLibrary;

import lombok.Data;
import org.springframework.data.domain.Persistable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.persistence.Version;
import java.io.Serializable;

@Data
public abstract class AbstractGeneratedIdEntity <ID extends Serializable> implements Persistable<ID> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(unique = true, nullable = false)
    protected ID id;

    // enables JPA to recognize that entity is new despite having non-null id
    @Version
    private Integer version;

    @Transient
    @Override
    public boolean isNew() {
        return version == null;
    }
}
