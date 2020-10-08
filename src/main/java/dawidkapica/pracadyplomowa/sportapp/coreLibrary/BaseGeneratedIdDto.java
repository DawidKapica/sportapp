package dawidkapica.pracadyplomowa.sportapp.coreLibrary;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sun.istack.NotNull;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonPropertyOrder({"id"})
public abstract class BaseGeneratedIdDto<ID extends Serializable> implements PersistableDto<ID> {

    @NotNull
    private ID id;
}
