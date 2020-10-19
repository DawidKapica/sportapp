package dawidkapica.pracadyplomowa.sportapp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;

@Entity
@Table(name = "Admin")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminEntity extends AbstractPersistable<Integer> {

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "login_id")
    private LoginEntity login;

}
