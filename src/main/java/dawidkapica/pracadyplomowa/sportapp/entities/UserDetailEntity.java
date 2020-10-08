package dawidkapica.pracadyplomowa.sportapp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "UserDetail")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDetailEntity extends AbstractPersistable<Integer> {

    @ManyToOne
    @JoinColumn(name = "user_detail_date_id")
    private  UserDetailDateEntity userDetailDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private  UserEntity user;

}
