package dawidkapica.pracadyplomowa.sportapp.entities;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "Expert")
@Data
@NoArgsConstructor
public class ExpertEntity extends PersonEntity {

    private String education;
    private String description;

    private Integer phone;
    private String mail;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "login_id")
    private LoginEntity login;

    @OneToMany(mappedBy = "expert", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    private Collection<ExpertSpecialisationEntity> expertSpecialisation;

}
