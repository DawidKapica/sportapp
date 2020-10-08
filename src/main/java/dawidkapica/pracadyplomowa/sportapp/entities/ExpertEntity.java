package dawidkapica.pracadyplomowa.sportapp.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Expert")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExpertEntity extends PersonEntity {

    private String education;
    private String description;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "login_id")
    private LoginEntity login;

}
