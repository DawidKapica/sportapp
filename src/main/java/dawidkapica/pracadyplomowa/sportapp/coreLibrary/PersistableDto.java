package dawidkapica.pracadyplomowa.sportapp.coreLibrary;

import java.io.Serializable;

public interface PersistableDto<ID extends Serializable> {

    ID getId();

    void setId(ID id);
}
